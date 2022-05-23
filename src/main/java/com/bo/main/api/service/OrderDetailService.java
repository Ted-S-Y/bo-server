package com.bo.main.api.service;

import com.bo.main.api.entities.OrderDetailEntity;
import com.bo.main.api.entities.converts.OrderDetailMapper;
import com.bo.main.api.entities.vo.OrderDetailVo;
import com.bo.main.api.entities.vo.OrderInfoVo;
import com.bo.main.api.repositories.jpa.OrderDetailRepository;
import com.bo.main.api.repositories.querydsl.QOrderDetailRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * packageName : com.bo.main.api.service
 * fileName : OrderDetailService
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
public class OrderDetailService {
    private final QOrderDetailRepository qOrderDetailRepository;
    private final OrderDetailRepository orderDetailRepository;
    private final OrderDetailMapper orderDetailMapper;


    public Optional<OrderDetailEntity> findOrderDetailById(long ordrNo) {
        return orderDetailRepository.findById(ordrNo);
    }

    public OrderDetailVo findClassBaseByIdRetError(long ordrNo) throws Exception{
        Optional<OrderDetailEntity> opt = findOrderDetailById(ordrNo);
        return orderDetailMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 ordrNo 정보({})가 없습니다.", ordrNo+""))));
    }

    public OrderDetailVo update(OrderDetailVo orderDetailVo) throws Exception {

        Optional<OrderDetailEntity> opt = findOrderDetailById(orderDetailVo.getOrdrNo());

        OrderDetailEntity loadOrderDetail = opt.orElseGet(OrderDetailEntity::new);
        orderDetailMapper.updateFromVo(orderDetailVo, loadOrderDetail);

        return orderDetailMapper.toVo(orderDetailRepository.save(loadOrderDetail));
    }

    public OrderDetailVo add(OrderDetailVo orderDetailVo) throws Exception {

        OrderDetailEntity loadOrderDetail = new OrderDetailEntity();
        orderDetailMapper.updateFromVo(orderDetailVo, loadOrderDetail);

        return orderDetailMapper.toVo(orderDetailRepository.save(loadOrderDetail));
    }

    @Transactional
    public List<OrderDetailVo> bulkAdds(OrderInfoVo orderInfoVo, List<OrderDetailVo> orderDetails) throws Exception {
        List<OrderDetailVo> results = new ArrayList<>();

        for (OrderDetailVo orderDetailVo: orderDetails) {
            orderDetailVo.setOrdrNo(orderInfoVo.getOrdrNo());
            results.add(add(orderDetailVo));
        }

        return results;
    }

    @Transactional
    public List<OrderDetailVo> bulkUpdates(OrderInfoVo orderInfoVo, List<OrderDetailVo> orderDetails) throws Exception {
        List<OrderDetailVo> results = new ArrayList<>();

        for (OrderDetailVo orderDetailVo: orderDetails) {
            orderDetailVo.setOrdrNo(orderInfoVo.getOrdrNo());

            if (orderDetailVo.getOrdrNo() != null) {
                results.add(update(orderDetailVo));
            } else {
                results.add(add(orderDetailVo));
            }
        }

        return results;
    }
}
