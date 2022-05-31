package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqClassBaseSearchVo;
import com.bo.main.api.controller.vo.req.ReqClassBaseVo;
import com.bo.main.api.controller.vo.req.ReqClassVideoVo;
import com.bo.main.api.entities.converts.ClassBaseMapper;
import com.bo.main.api.entities.converts.ClassVideoMapper;
import com.bo.main.api.entities.vo.ClassBaseVo;
import com.bo.main.api.entities.vo.ClassVideoVo;
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
 * The type Bo class controller.
 */
@RestController
@RequestMapping("/bo/admin/classbase")
@RequiredArgsConstructor
public class BoClassController {

    private final ClassBaseService classBaseService;
    private final ClassVideoService classVideoService;

    private final ClassBaseMapper classBaseMapper;
    private final ClassVideoMapper classVideoMapper;

    /**
     * 강의 상세조회
     *
     * @param req     the req
     * @param resp    the resp
     * @param clssSeq the clss seq
     * @return the result response
     * @throws Exception the exception
     */
    @GetMapping("/{clssSeq}")
    public ResultResponse<?> searchClass(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "clssSeq is required") @PathVariable(name = "clssSeq") long clssSeq
    ) throws Exception {
        ClassBaseVo classBaseVo = classBaseService.findClassBaseByIdRetError(clssSeq);
        return new ResultResponse<>(classBaseMapper.toVo(classBaseVo));
    }


    /**
     * 강의 목록 조회
     *
     * @param req          the req
     * @param resp         the resp
     * @param parameterMap the parameter map
     * @param pageable     the pageable
     * @return the result response
     * @throws Exception the exception
     */
    @GetMapping("/management/list")
    public ResultResponse<?> searchClasses(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestParam Map<String, String> parameterMap,
            @PageableDefault(page = 0, size = 10) Pageable pageable
    ) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        ReqClassBaseSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqClassBaseSearchVo.class);

        return new ResultResponse<>(classBaseService.search(searchVo, pageable));
    }


    /**
     * 강의 등록
     *
     * @param req            the req
     * @param resp           the resp
     * @param reqClassBaseVo the req class base vo
     * @return the result response
     * @throws Exception the exception
     */
    @PostMapping("/management")
    public ResultResponse<?> register(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqClassBaseVo reqClassBaseVo
    ) throws Exception {
        classBaseService.add(reqClassBaseVo);
        return new ResultResponse<>(HttpStatus.CREATED);
    }

    /**
     * 강의 수정
     *
     * @param req            the req
     * @param resp           the resp
     * @param reqClassBaseVo the req class base vo
     * @return the result response
     * @throws Exception the exception
     */
    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqClassBaseVo reqClassBaseVo
    ) throws Exception {
        classBaseService.update(reqClassBaseVo);
        return new ResultResponse<>(HttpStatus.CREATED);
    }

    /**
     * 비디오 상세조회
     *
     * @param req     the req
     * @param resp    the resp
     * @param vdSeq the vdSeq
     * @return the result response
     * @throws Exception the exception
     */
    @GetMapping("/video/{vdSeq}")
    public ResultResponse<?> searchVideo(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "clssSeq is required") @PathVariable(name = "vdSeq") long vdSeq
    ) throws Exception {
        ClassVideoVo classVideoVo = classVideoService.findClassBaseByIdRetError(vdSeq);
        return new ResultResponse<>(classVideoMapper.toVo(classVideoVo));
    }
}


