package com.bo.main.api.service;

import com.bo.main.api.entities.SalesProductDetailEntity;
import com.bo.main.api.entities.converts.SalesProductDetailMapper;
import com.bo.main.api.entities.vo.SalesProductDetailVo;
import com.bo.main.api.repositories.jpa.SalesProductDetailRepository;
import com.bo.main.api.repositories.querydsl.QSalesProductDetailRepository;
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
 * fileName : SaleProductDetailService
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
public class SalesProductDetailService {

    private final QSalesProductDetailRepository qSalesProductDetailRepository;
    private final SalesProductDetailMapper salesProductDetailMapper;
    private final SalesProductDetailRepository salesProductDetailRepository;


    public Optional<SalesProductDetailEntity> findSalesProductDetailById(long slsPrdtDtlSeq) {
        return salesProductDetailRepository.findById(slsPrdtDtlSeq);
    }

    public List<SalesProductDetailVo> findList(SalesProductDetailVo salesProductDetailVo) throws Exception {

        Optional<List<SalesProductDetailEntity>> opt = qSalesProductDetailRepository.findList(salesProductDetailVo);

        return salesProductDetailMapper.toVos(opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Sales Product 정보({})가 없습니다.", salesProductDetailVo.getSlsPrdtDtlSeq()+""))));
    }


    public SalesProductDetailVo merge(SalesProductDetailVo salesProductDetailVo) throws Exception {

        Optional<SalesProductDetailEntity> opt = findSalesProductDetailById(salesProductDetailVo.getSlsPrdtDtlSeq());

        SalesProductDetailEntity loadClassPackageDetail = opt.orElseGet(SalesProductDetailEntity::new);
        salesProductDetailMapper.updateFromVo(salesProductDetailVo, loadClassPackageDetail);

        delete(salesProductDetailVo);

        return salesProductDetailMapper.toVo(salesProductDetailRepository.save(loadClassPackageDetail));
    }

    public void delete(SalesProductDetailVo salesProductDetailVo) throws Exception {
        Optional<List<SalesProductDetailEntity>> opt = qSalesProductDetailRepository.findList(salesProductDetailVo);

        List<SalesProductDetailEntity> loadSalesProductDetailEntityList = opt.orElseThrow(() -> new Exception(StringUtils.message("등록된 Sales Product 정보({})가 없습니다.", salesProductDetailVo.getSlsPrdtDtlSeq()+"")));

        for (SalesProductDetailEntity tempEntity : loadSalesProductDetailEntityList) {
            salesProductDetailMapper.updateFromVo(salesProductDetailVo, tempEntity);
            salesProductDetailRepository.delete(tempEntity);
        }
    }


    @Transactional
    public List<SalesProductDetailVo> bulkMerges(List<SalesProductDetailVo> salesProductDetailVoList) throws Exception {
        List<SalesProductDetailVo> results = new ArrayList<>();

        for (SalesProductDetailVo tempVo: salesProductDetailVoList) {
            delete(tempVo);
            results.add(merge(tempVo));
        }

        return results;
    }
}
