package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqCategoryVo;
import com.bo.main.api.controller.vo.req.ReqClassBaseSearchVo;
import com.bo.main.api.controller.vo.req.ReqClassPackageSearchVo;
import com.bo.main.api.controller.vo.req.ReqClassPackageVo;
import com.bo.main.api.entities.converts.CategoryMapper;
import com.bo.main.api.entities.converts.ClassBaseMapper;
import com.bo.main.api.entities.converts.ClassVideoMapper;
import com.bo.main.api.entities.vo.CategoryVo;
import com.bo.main.api.entities.vo.ClassPackageVo;
import com.bo.main.api.service.CategoryService;
import com.bo.main.api.service.ClassBaseService;
import com.bo.main.api.service.ClassVideoService;
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
 * packageName : com.bo.main.api.controller.vo
 * fileName : BoCategoryController
 * author : sbyoon
 * date : 2022-05-30
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-30  sbyoon 최초 생성
 */
@RestController
@RequestMapping("/bo/admin/category")
@RequiredArgsConstructor
public class BoCategoryController {

    private final CategoryService categoryService;

    private final CategoryMapper categoryMapper;

    @GetMapping("/management/{ctgrId}")
    public ResultResponse<?> searchCategory(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "ctgrId is required") @PathVariable(name = "ctgrId") long ctgrId
    ) throws Exception {

        CategoryVo categoryVo = categoryService.findCategoryByIdRetError(ctgrId);

        return new ResultResponse<>(categoryVo);
    }

    @GetMapping("/management/list")
    public ResultResponse<?> searchCategories(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestParam Map<String, String> parameterMap
    ) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        ReqCategoryVo searchVo = objectMapper.convertValue(parameterMap, ReqCategoryVo.class);

        return new ResultResponse<>(categoryService.search(searchVo));
    }

    @PostMapping("/management")
    public ResultResponse<?> register(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqCategoryVo reqCategoryVo
    ) throws Exception {

        CategoryVo categoryVo = categoryMapper.toVo(reqCategoryVo);
        categoryService.add(categoryVo);

        return new ResultResponse<>(HttpStatus.CREATED);
    }

    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqCategoryVo reqCategoryVo
    ) throws Exception {

        CategoryVo categoryVo = categoryMapper.toVo(reqCategoryVo);
        categoryService.update(categoryVo);

        return new ResultResponse<>(HttpStatus.CREATED);

    }

    @DeleteMapping("/management/{ctgrId}")
    public ResultResponse<?> delete(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "ctgrId is required") @PathVariable(name = "ctgrId") long ctgrId
    ) throws Exception {
        categoryService.deleteCategoryById(ctgrId);

        return new ResultResponse<>(HttpStatus.OK);

    }
}
