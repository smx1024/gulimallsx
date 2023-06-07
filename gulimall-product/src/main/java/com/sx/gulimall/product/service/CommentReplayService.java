package com.sx.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sx.common.utils.PageUtils;
import com.sx.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author sx
 * @email HeJieLin@gulimall.com
 * @date 2020-05-22 19:00:18
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

