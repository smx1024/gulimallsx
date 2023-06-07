package com.sx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sx.common.utils.PageUtils;
import com.sx.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author sx
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:35:30
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

