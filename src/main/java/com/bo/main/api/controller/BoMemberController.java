package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqMemberSearchVo;
import com.bo.main.api.controller.vo.req.ReqMemberVo;
import com.bo.main.api.entities.converts.MemberMapper;
import com.bo.main.api.entities.vo.MemberVo;
import com.bo.main.api.service.MemberService;
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
 * fileName : BoMemberController
 * author : sbyoon
 * date : 2022-05-12
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-12  sbyoon 최초 생성
 */
@RestController
@RequestMapping("/bo/member")
@RequiredArgsConstructor
public class BoMemberController {
    private final MemberService memberService;

    private final MemberMapper memberMapper;

    @GetMapping("/management/{memberId}")
    public ResultResponse<?> searchMember(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "memberId is required") @PathVariable(name = "memberId") String memberId
    ) throws Exception {
        MemberVo memberVo = memberService.findByMbrIdRetError(memberId);
        return new ResultResponse<>(memberMapper.toVo(memberVo));
    }

    @GetMapping("/management/list")
    public ResultResponse<?> searchMembers(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestParam Map<String, String> parameterMap,
            @PageableDefault(page = 0, size = 10) Pageable pageable
    ) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        ReqMemberSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqMemberSearchVo.class);
        return new ResultResponse<>(memberService.search(searchVo, pageable));
    }

//    @PostMapping("/management")
//    public ResultResponse<?> register(
//            HttpServletRequest req, HttpServletResponse resp,
//            @Valid @RequestBody ReqMemberVo reqMemberVo
//    ) throws Exception {
//
//        MemberVo memberVo = memberMapper.toVo(reqMemberVo);
//        memberService.add(memberVo);
//
//        return new ResultResponse<>(HttpStatus.CREATED);
//    }

    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqMemberVo reqMemberVo
    ) throws Exception {

        MemberVo memberVo = memberMapper.toVo(reqMemberVo);
        memberService.update(memberVo);

        return new ResultResponse<>(HttpStatus.CREATED);

    }
}