package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqCategoryVo;
import com.bo.main.api.entities.AdminEntity;
import com.bo.main.api.entities.CategoryEntity;
import com.bo.main.api.entities.converts.CategoryMapper;
import com.bo.main.api.entities.vo.AdminVo;
import com.bo.main.api.entities.vo.CategoryVo;
import com.bo.main.api.repositories.jpa.CategoryRepository;
import com.bo.main.api.repositories.querydsl.QCategoryRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.bo.main.api.service
 * fileName : CategoryService
 * author : sbyoon
 * date : 2022-05-30
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-30  sbyoon 최초 생성
 */
@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class CategoryService {

    private final QCategoryRepository qCategoryRepository;
    private final CategoryRepository categoryRepository;

    private final CategoryMapper categoryMapper;

    public Optional<CategoryEntity> findCategoryById(long ctgrId) {
        return categoryRepository.findById(ctgrId);
    }

    public CategoryVo findCategoryByIdRetError(long ctgrId) throws Exception{
        Optional<CategoryEntity> opt = findCategoryById(ctgrId);
        return categoryMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Category 정보({})가 없습니다.", ctgrId+""))));
    }

    public void deleteCategoryById(long ctgrId) {
        categoryRepository.deleteById(ctgrId);
    }

    public List<CategoryVo> search(ReqCategoryVo reqCategoryVo) throws Exception {
        List<CategoryEntity> categoryEntityList = qCategoryRepository.findList(reqCategoryVo);

        return categoryMapper.toVos(categoryEntityList);
    }

    public CategoryVo update(CategoryVo categoryVo) throws Exception {

        Optional<CategoryEntity> opt = findCategoryById(categoryVo.getCtgrId());

        CategoryEntity loadCategory = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Category 정보({})가 없습니다.", categoryVo.getCtgrId()+"")));
        categoryMapper.updateFromVo(categoryVo, loadCategory);
        return categoryMapper.toVo(categoryRepository.save(loadCategory));
    }

    public CategoryVo add(CategoryVo categoryVo) throws Exception {

        Optional<CategoryEntity> opt = findCategoryById(categoryVo.getCtgrId());

        if (opt.isPresent()) {
            throw new Exception(StringUtils.message("이미등록된 Category 정보({}) 입니다.", categoryVo.getCtgrId()+""));
        }

        CategoryEntity newCategory = new CategoryEntity();

        categoryMapper.updateFromVo(categoryVo, newCategory);
        return categoryMapper.toVo(categoryRepository.save(newCategory));
    }
}
