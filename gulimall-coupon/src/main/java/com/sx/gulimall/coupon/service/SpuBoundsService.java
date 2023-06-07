package com.sx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sx.common.utils.PageUtils;
import com.sx.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author sx
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:35:30
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

