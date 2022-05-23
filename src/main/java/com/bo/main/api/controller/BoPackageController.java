package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqClassPackageSearchVo;
import com.bo.main.api.controller.vo.req.ReqClassPackageVo;
import com.bo.main.api.entities.converts.ClassPackageMapper;
import com.bo.main.api.entities.vo.ClassPackageVo;
import com.bo.main.api.service.ClassPackageService;
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
 * 강의 패키지 Controller
 */
@RestController
@RequestMapping("/bo/package")
@RequiredArgsConstructor
public class BoPackageController {

    private final ClassPackageService classPackageService;

    private final ClassPackageMapper classPackageMapper;

    /**
     * 강의 패키지 상세 조회
     *
     * @param req    the req
     * @param resp   the resp
     * @param packSeq the pack seq
     * @return the result response
     * @throws Exception the exception
     */
    @GetMapping("/management/{packSeq}")
    public ResultResponse<?> searchPackage(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "packSeq is required") @PathVariable(name = "packSeq") long packSeq
    ) throws Exception {

        ClassPackageVo classPackageVo = classPackageService.findClassBaseByIdRetError(packSeq);

        return new ResultResponse<>(classPackageVo);
    }

    /**
     * 강의 패키지 리스트 조회
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
        ReqClassPackageSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqClassPackageSearchVo.class);
        return new ResultResponse<>(classPackageService.search(searchVo, pageable));
    }

    /**
     * 강의 패키지 등록
     *
     * @param req            the req
     * @param resp           the resp
     * @param reqClassPackageVo the req class package vo
     * @return the result response
     * @throws Exception the exception
     */
    @PostMapping("/management")
    public ResultResponse<?> register(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqClassPackageVo reqClassPackageVo
    ) throws Exception {

        ClassPackageVo classPackageVo = classPackageMapper.toVo(reqClassPackageVo);
        classPackageService.add(classPackageVo);

        return new ResultResponse<>(HttpStatus.CREATED);
    }

    /**
     * 강의 패키지 수정
     *
     * @param req            the req
     * @param resp           the resp
     * @param reqClassPackageVo the req class package vo
     * @return the result response
     * @throws Exception the exception
     */
    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqClassPackageVo reqClassPackageVo
    ) throws Exception {

        ClassPackageVo classPackageVo = classPackageMapper.toVo(reqClassPackageVo);
        classPackageService.update(classPackageVo);

        return new ResultResponse<>(HttpStatus.CREATED);

    }
}


