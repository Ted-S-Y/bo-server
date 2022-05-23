package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqAdminSearchVo;
import com.bo.main.api.entities.AdminEntity;
import com.bo.main.api.entities.converts.AdminMapper;
import com.bo.main.api.entities.vo.AdminVo;
import com.bo.main.api.repositories.jpa.AdminRepository;
import com.bo.main.api.repositories.querydsl.QAdminRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * The type Admin service.
 */
@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class AdminService {

    private final QAdminRepository qAdminRepository;
    private final AdminRepository adminRepository;

    private final AdminMapper adminMapper;

    /**
     * Find admin by id optional.
     *
     * @param adminId the admin id
     * @return the optional
     */
    public Optional<AdminEntity> findAdminById(String adminId) {
        return adminRepository.findByAdmId(adminId);
    }


    /**
     * Find admin by id ret error admin vo.
     *
     * @param adminId the admin id
     * @return the admin vo
     * @throws Exception the exception
     */
    public AdminVo findAdminByIdRetError(String adminId) throws Exception{
        Optional<AdminEntity> opt = findAdminById(adminId);
        return adminMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Admin 정보({})가 없습니다.", adminId))));
    }

    /**
     * Search page.
     *
     * @param searchVo the search vo
     * @param pageable the pageable
     * @return the page
     * @throws Exception the exception
     */
    public Page<AdminVo> search(ReqAdminSearchVo searchVo, Pageable pageable) throws Exception {
        Page<AdminEntity> adminEntityPage = qAdminRepository.findList(searchVo, pageable);
        return new PageImpl<>(adminMapper.toVos(adminEntityPage.getContent()), pageable, adminEntityPage.getTotalElements());
    }

    /**
     * Update admin vo.
     *
     * @param adminVo the admin vo
     * @return the admin vo
     * @throws Exception the exception
     */
    public AdminVo update(AdminVo adminVo) throws Exception {

        Optional<AdminEntity> opt = findAdminById(adminVo.getAdmId());

        AdminEntity loadAdmin = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Admin 정보({})가 없습니다.", adminVo.getAdmId())));
        adminMapper.updateFromVo(adminVo, loadAdmin);
        return adminMapper.toVo(adminRepository.save(loadAdmin));
    }

    /**
     * Add admin vo.
     *
     * @param adminVo the admin vo
     * @return the admin vo
     * @throws Exception the exception
     */
    public AdminVo add(AdminVo adminVo) throws Exception {


        Optional<AdminEntity> opt = findAdminById(adminVo.getAdmId());

        if (opt.isPresent()) {
            throw new Exception(StringUtils.message("이미등록된 Admin({}) 입니다.", adminVo.getAdmId()));
        }

        AdminEntity newAdmin = new AdminEntity();

        adminMapper.updateFromVo(adminVo, newAdmin);
        return adminMapper.toVo(adminRepository.save(newAdmin));
    }
}
