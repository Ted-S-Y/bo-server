package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqPackageSearchVo;
import com.bo.main.api.controller.vo.req.ReqProductVo;
import com.bo.main.api.controller.vo.req.ReqProductSearchVo;
import com.bo.main.api.controller.vo.req.ReqProductVo;
import com.bo.main.api.controller.vo.res.ResProductVo;
import com.bo.main.api.controller.vo.res.ResProductVo;
import com.bo.main.api.service.PackageService;
import com.bo.main.api.service.ProductService;
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
 * packageName : com.bo.main.api.controller
 * fileName : BoProductController
 * author : sbyoon
 * date : 2022-06-03
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-06-03  sbyoon 최초 생성
 */
@RestController
@RequestMapping("/bo/product")
@RequiredArgsConstructor
public class BoProductController {

    private final ProductService productService;

    @GetMapping("/{slsPrdtSeq}")
    public ResultResponse<?> searchPackage(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "slsPrdtSeq is required") @PathVariable(name = "slsPrdtSeq") long slsPrdtSeq
    ) throws Exception {
        ResProductVo resProductVo = productService.findProductOneRetError(slsPrdtSeq);

        return new ResultResponse<>(resProductVo);
    }

    @GetMapping("/management/list")
    public ResultResponse<?> searchAdmins(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestParam Map<String, String> parameterMap,
            @PageableDefault(page = 0, size = 10) Pageable pageable
    ) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        ReqProductSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqProductSearchVo.class);
        return new ResultResponse<>(productService.search(searchVo, pageable));
    }

    @PostMapping("/management")
    public ResultResponse<?> register(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqProductVo reqProductVo
    ) throws Exception {
        productService.add(reqProductVo);
        return new ResultResponse<>(HttpStatus.CREATED);
    }

    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqProductVo reqProductVo
    ) throws Exception {
        productService.update(reqProductVo);
        return new ResultResponse<>(HttpStatus.CREATED);

    }

    @DeleteMapping("/{slsPrdtSeq}")
    public ResultResponse<?> delete(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "slsPrdtSeq is required") @PathVariable(name = "slsPrdtSeq") long slsPrdtSeq
    ) throws Exception {
        productService.delete(slsPrdtSeq);
        return new ResultResponse<>(HttpStatus.OK);
    }
}
