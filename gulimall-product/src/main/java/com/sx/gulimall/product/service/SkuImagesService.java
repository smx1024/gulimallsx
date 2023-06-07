package com.sx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sx.common.utils.PageUtils;
import com.sx.gulimall.product.entity.SkuImagesEntity;

import java.util.List;
import java.util.Map;

/**
 * sku图片
 *
 * @author sx
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:00:18
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<SkuImagesEntity> getImagesBySkuId(Long skuId);
}

