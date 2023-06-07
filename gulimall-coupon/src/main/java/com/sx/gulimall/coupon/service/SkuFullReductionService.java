package com.sx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sx.common.to.SkuReductionTo;
import com.sx.common.utils.PageUtils;
import com.sx.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author sx
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:35:30
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);
}

