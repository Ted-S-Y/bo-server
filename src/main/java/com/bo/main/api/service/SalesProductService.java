package com.bo.main.api.service;

import com.bo.main.api.entities.SalesProductEntity;
import com.bo.main.api.entities.converts.SalesProductMapper;
import com.bo.main.api.entities.vo.SalesProductVo;
import com.bo.main.api.repositories.jpa.SalesProductRepository;
import com.bo.main.core.util.StringUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * packageName : com.bo.main.api.service
 * fileName : SaleProductService
 * author : sbyoon
 * date : 2022-06-03
 * description :
 * ===========================================================
 * DATE AUTHOR  NOTE
 * -----------------------------------------------------------
 * 2022-06-03  sbyoon 최초 생성
 */
@Service
@Transactional
@Slf4j
@RequiredArgsConstructor
public class SalesProductService {
    private final SalesProductRepository salesProductRepository;
    private final SalesProductMapper salesProductMapper;


    public Optional<SalesProductEntity> findBySlsPrdtSeq(long slsPrdtSeq) {
        return salesProductRepository.findById(slsPrdtSeq);
    }

    public SalesProductVo findSalesProductByIdRetError(long slsPrdtSeq) throws Exception{
        Optional<SalesProductEntity> opt = findBySlsPrdtSeq(slsPrdtSeq);
        return salesProductMapper.toVo(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Sales Product 정보({})가 없습니다.", slsPrdtSeq+""))));
    }


    public SalesProductVo update(SalesProductVo updateSalesProductVo) throws Exception {

        Optional<SalesProductEntity> opt = findBySlsPrdtSeq(updateSalesProductVo.getSlsPrdtSeq());

        SalesProductEntity loadSalesProduct = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Sales Product 정보({})가 없습니다.", updateSalesProductVo.getSlsPrdtSeq()+ "")));
        salesProductMapper.updateFromVo(updateSalesProductVo, loadSalesProduct);

        SalesProductVo salesProductVo = salesProductMapper.toVo(salesProductRepository.save(loadSalesProduct));

        return salesProductVo;
    }

    public SalesProductVo add(SalesProductVo newSalesProductVo) throws Exception {

        Optional<SalesProductEntity> opt = findBySlsPrdtSeq(newSalesProductVo.getSlsPrdtSeq());

        if (opt.isPresent()) {
            throw new Exception(StringUtils.message("이미등록된 Sales Product({}) 입니다.",newSalesProductVo.getSlsPrdtSeq() + ""));
        }

        SalesProductEntity loadSalesProduct = new SalesProductEntity();
        salesProductMapper.updateFromVo(newSalesProductVo, loadSalesProduct);

        SalesProductVo SalesProductVo = salesProductMapper.toVo(salesProductRepository.save(loadSalesProduct));

        return SalesProductVo;

    }

    public void delete(SalesProductVo salesProductVo) throws Exception {
        Optional<SalesProductEntity> opt = findBySlsPrdtSeq(salesProductVo.getSlsPrdtSeq());
        SalesProductEntity loadSalesProduct = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Sales Product 정보({})가 없습니다.", salesProductVo.getSlsPrdtSeq() + "")));
        salesProductMapper.updateFromVo(salesProductVo, loadSalesProduct);

        salesProductRepository.delete(loadSalesProduct);
    }
}
