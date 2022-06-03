package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqClassManageSearchVo;
import com.bo.main.api.controller.vo.req.ReqClassManageVo;
import com.bo.main.api.controller.vo.res.ResClassManageVo;
import com.bo.main.api.service.ClassManageService;
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

    private final ClassManageService classManageService;

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
        ResClassManageVo resClassManageVo = classManageService.findClassOneRetError(clssSeq);
        return new ResultResponse<>(resClassManageVo);
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
        ReqClassManageSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqClassManageSearchVo.class);

        return new ResultResponse<>(classManageService.search(searchVo, pageable));
    }


    /**
     * 강의 등록
     *
     * @param req            the req
     * @param resp           the resp
     * @param reqClassManageVo the req class base vo
     * @return the result response
     * @throws Exception the exception
     */
    @PostMapping("/management")
    public ResultResponse<?> register(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqClassManageVo reqClassManageVo
    ) throws Exception {
        classManageService.add(reqClassManageVo);
        return new ResultResponse<>(HttpStatus.CREATED);
    }

    /**
     * 강의 수정
     *
     * @param req            the req
     * @param resp           the resp
     * @param reqClassManageVo the req class base vo
     * @return the result response
     * @throws Exception the exception
     */
    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqClassManageVo reqClassManageVo
    ) throws Exception {
        classManageService.update(reqClassManageVo);
        return new ResultResponse<>(HttpStatus.CREATED);
    }

    /**
     * 강의 삭제
     *
     * @param req            the req
     * @param resp           the resp
     * @param clssSeq the clss seq
     * @return the result response
     * @throws Exception the exception
     */
    @DeleteMapping("/{clssSeq}")
    public ResultResponse<?> delete(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "clssSeq is required") @PathVariable(name = "clssSeq") long clssSeq
    ) throws Exception {
        classManageService.delete(clssSeq);
        return new ResultResponse<>(HttpStatus.OK);
    }
}


