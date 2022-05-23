package com.bo.main.api.service;

import com.bo.main.api.controller.vo.req.ReqOrderInfoSearchVo;
import com.bo.main.api.entities.OrderInfoEntity;
import com.bo.main.api.entities.converts.OrderInfoMapper;
import com.bo.main.api.entities.vo.OrderInfoVo;
import com.bo.main.api.repositories.jpa.OrderInfoRepository;
import com.bo.main.api.repositories.querydsl.QOrderInfoRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


/**
 * packageName : com.bo.main.api.service
 * fileName : OrderInfoService
 * author : sbyoon
 * date : 2022-05-16
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-05-16  sbyoon 최초 생성
 */
@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class OrderInfoService {
    private final QOrderInfoRepository qOrderInfoRepository;
    private final OrderInfoRepository orderInfoRepository;

    private final OrderInfoMapper orderInfoMapper;

    private final OrderDetailService orderDetailService;

    public Optional<OrderInfoEntity> findByOrdrNo(long ordrNo) {
        return orderInfoRepository.findById(ordrNo);
    }

    
    public OrderInfoVo findByOrdrNoRetError(long ordrNo) throws Exception{
        Optional<OrderInfoEntity> opt = findByOrdrNo(ordrNo);
        return orderInfoMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ordrNo 정보({})가 없습니다.", ordrNo+""))));
    }
    
    public Page<OrderInfoVo> search(ReqOrderInfoSearchVo searchVo, Pageable pageable) throws Exception {
        Page<OrderInfoEntity> orderInfoEntityPage = qOrderInfoRepository.findList(searchVo, pageable);
        return new PageImpl<>(orderInfoMapper.toVos(orderInfoEntityPage.getContent()), pageable, orderInfoEntityPage.getTotalElements());
    }
    
    public OrderInfoVo update(OrderInfoVo updateOrderInfoVo) throws Exception {

        Optional<OrderInfoEntity> opt = findByOrdrNo(updateOrderInfoVo.getOrdrNo());

        OrderInfoEntity loadOrderInfo = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ordrNo 정보({})가 없습니다.", updateOrderInfoVo.getOrdrNo()+"")));
        orderInfoMapper.updateFromVo(updateOrderInfoVo, loadOrderInfo);

        OrderInfoVo orderInfoVo = orderInfoMapper.toVo(orderInfoRepository.save(loadOrderInfo));
        orderInfoVo.setDetails(orderDetailService.bulkUpdates(orderInfoVo, updateOrderInfoVo.getDetails()));

        return orderInfoVo;
    }
    
//    public OrderInfoVo add(OrderInfoVo orderInfoVo) throws Exception {
//        Optional<OrderInfoEntity> opt = findByOrdrNo(orderInfoVo.getOrdrNo());
//
//        if (opt.isPresent()) {
//            throw new Exception(StringUtils.message("이미등록된 Admin({}) 입니다.", orderInfoVo.getOrdrNo()));
//        }
//
//        OrderInfoEntity newOrderInfo = new OrderInfoEntity();
//
//        orderInfoMapper.updateFromVo(orderInfoVo, newOrderInfo);
//        return orderInfoMapper.toVo(orderInfoRepository.save(newOrderInfo));
//    }

}
