package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqLecturerSearchVo;
import com.bo.main.api.controller.vo.req.ReqLecturerVo;
import com.bo.main.api.entities.converts.LecturerClassMapper;
import com.bo.main.api.entities.converts.LecturerMapper;
import com.bo.main.api.entities.vo.LecturerVo;
import com.bo.main.api.service.LecturerClassMappingService;
import com.bo.main.api.service.LecturerService;
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

@RestController
@RequestMapping("/bo/lecturer")
@RequiredArgsConstructor
public class BoLecturerController {

    private final LecturerService lecturerService;
    private final LecturerMapper lecturerMapper;

    private final LecturerClassMappingService lecturerClassMappingService;
    private final LecturerClassMapper lecturerClassMapper;

    @GetMapping("/{lctrCd}")
    public ResultResponse<?> searchLecturer(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "lctrSeq is required") @PathVariable(name = "lctrCd") String lctrCd
    ) throws Exception {
        return new ResultResponse<>(lecturerService.findLecturerRetError(lctrCd));
    }

    @GetMapping("/management/list")
    public ResultResponse<?> searchLecturers(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestParam Map<String, String> parameterMap,
            @PageableDefault(page = 0, size = 10) Pageable pageable
    ) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        ReqLecturerSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqLecturerSearchVo.class);
        return new ResultResponse<>(lecturerService.search(searchVo, pageable));
    }

    @PostMapping("/management")
    public ResultResponse<?> register(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqLecturerVo reqLecturerVo
    ) throws Exception {
        lecturerService.add(reqLecturerVo);
        return new ResultResponse<>(HttpStatus.CREATED);
    }

    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqLecturerVo reqLecturerVo
    ) throws Exception {
        lecturerService.update(reqLecturerVo);
        return new ResultResponse<>(HttpStatus.CREATED);

    }

    @DeleteMapping("/{lctrCd}")
    public ResultResponse<?> delete(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "lctrSeq is required") @PathVariable(name = "lctrCd") String lctrCd
    ) throws Exception {
        lecturerService.delete(lctrCd);
        return new ResultResponse<>(HttpStatus.OK);
    }
}


