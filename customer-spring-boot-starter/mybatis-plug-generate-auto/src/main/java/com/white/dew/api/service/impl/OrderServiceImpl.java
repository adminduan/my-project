package com.white.dew.api.service.impl;

import com.white.dew.api.bean.model.OrderModel;
import com.white.dew.api.mapper.OrderMapper;
import com.white.dew.api.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单信息 服务实现类
 * </p>
 *
 * @author duanlsh
 * @since 2019-07-23
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, OrderModel> implements OrderService {

}
