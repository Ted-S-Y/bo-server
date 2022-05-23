package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqAdminSearchVo;
import com.bo.main.api.controller.vo.req.ReqAdminVo;
import com.bo.main.api.entities.converts.AdminMapper;
import com.bo.main.api.entities.vo.AdminVo;
import com.bo.main.api.service.AdminService;
import com.bo.main.core.wapper.ResultResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * 관리자 Controller
 */
@RestController
@RequestMapping("/bo/admin")
@RequiredArgsConstructor
public class BoAdminController {

    private final AdminService adminService;

    private final AdminMapper adminMapper;

    /**
     * 관리자 상세보기
     *
     * @param req     the req
     * @param resp    the resp
     * @param adminId the admin id
     * @return the result response
     * @throws Exception the exception
     */
    @GetMapping("/management/{adminId}")
    public ResultResponse<?> searchAdmin(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "adminId is required") @PathVariable(name = "adminId") String adminId
    ) throws Exception {
        AdminVo adminVo = adminService.findAdminByIdRetError(adminId);
        return new ResultResponse<>(adminMapper.toVo(adminVo));
    }

    /**
     * 관리자 리스트 조회
     *
     * @param req          the req
     * @param resp         the resp
     * @param parameterMap the parameter map
     * @param pageable     the pageable
     * @return the result response
     * @throws Exception the exception
     */
    @GetMapping("/management/list")
    public ResultResponse<?> searchAdmins(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestParam Map<String, String> parameterMap,
            @PageableDefault(page = 0, size = 10) Pageable pageable
    ) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        ReqAdminSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqAdminSearchVo.class);
        return new ResultResponse<>(adminService.search(searchVo, pageable));
    }

    /**
     * 관리자 등록
     *
     * @param req        the req
     * @param resp       the resp
     * @param reqAdminVo the req admin vo
     * @return the result response
     * @throws Exception the exception
     */
    @PostMapping("/management")
    public ResultResponse<?> register(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqAdminVo reqAdminVo
    ) throws Exception {

        AdminVo adminVo = adminMapper.toVo(reqAdminVo);
        adminService.add(adminVo);

        return new ResultResponse<>(HttpStatus.CREATED);
    }

    /**
     * 관리자 수정
     *
     * @param req        the req
     * @param resp       the resp
     * @param reqAdminVo the req admin vo
     * @return the result response
     * @throws Exception the exception
     */
    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqAdminVo reqAdminVo
    ) throws Exception {

        AdminVo adminVo = adminMapper.toVo(reqAdminVo);
        adminService.update(adminVo);

        return new ResultResponse<>(HttpStatus.CREATED);

    }
}


