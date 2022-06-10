package com.bo.main.api.controller;

import com.bo.main.api.controller.vo.req.ReqOrderInfoSearchVo;
import com.bo.main.api.controller.vo.req.ReqOrderInfoVo;
import com.bo.main.api.entities.converts.OrderInfoMapper;
import com.bo.main.api.entities.vo.OrderInfoVo;
import com.bo.main.api.service.OrderInfoService;
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
@RequestMapping("/bo/admin/order")
@RequiredArgsConstructor
public class BoOrderController {

    private final OrderInfoService orderInfoService;

    private final OrderInfoMapper orderInfoMapper;

    @GetMapping("/{ordrNo}")
    public ResultResponse<?> searchOrder(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @NotNull(message = "ordrNo is required") @PathVariable(name = "ordrNo") long ordrNo
    ) throws Exception {
        OrderInfoVo orderInfoVo = orderInfoService.findByOrdrNoRetError(ordrNo);
        return new ResultResponse<>(orderInfoMapper.toVo(orderInfoVo));
    }

    @GetMapping("/list")
    public ResultResponse<?> searchOrders(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestParam Map<String, String> parameterMap,
            @PageableDefault(page = 0, size = 10) Pageable pageable
    ) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        ReqOrderInfoSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqOrderInfoSearchVo.class);
        return new ResultResponse<>(orderInfoService.search(searchVo, pageable));
    }

    @GetMapping("/cancel/list")
    public ResultResponse<?> searchCancelOrders(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestParam Map<String, String> parameterMap,
            @PageableDefault(page = 0, size = 10) Pageable pageable
    ) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        ReqOrderInfoSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqOrderInfoSearchVo.class);
        return new ResultResponse<>(orderInfoService.search(searchVo, pageable));
    }

    @GetMapping("/return/list")
    public ResultResponse<?> searchReturnOrders(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestParam Map<String, String> parameterMap,
            @PageableDefault(page = 0, size = 10) Pageable pageable
    ) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        ReqOrderInfoSearchVo searchVo = objectMapper.convertValue(parameterMap, ReqOrderInfoSearchVo.class);
        return new ResultResponse<>(orderInfoService.search(searchVo, pageable));
    }
//    @PostMapping("/management")
//    public ResultResponse<?> register(
//            HttpServletRequest req, HttpServletResponse resp,
//            @Valid @RequestBody ReqOrderInfoVo reqOrderInfoVo
//    ) throws Exception {
//        OrderInfoVo orderInfoVo = orderInfoMapper.toVo(reqOrderInfoVo);
//        orderInfoService.add(orderInfoVo);
//
//        return new ResultResponse<>(HttpStatus.CREATED);
//    }

    @PutMapping("/management")
    public ResultResponse<?> modify(
            HttpServletRequest req, HttpServletResponse resp,
            @Valid @RequestBody ReqOrderInfoVo reqOrderInfoVo
    ) throws Exception {
        OrderInfoVo orderInfoVo = orderInfoMapper.toVo(reqOrderInfoVo);
        orderInfoService.update(orderInfoVo);

        return new ResultResponse<>(HttpStatus.CREATED);
    }
}


