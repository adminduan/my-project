package com.white.dew.api.service.impl;

import com.white.dew.api.bean.model.OrderProductModel;
import com.white.dew.api.mapper.OrderProductMapper;
import com.white.dew.api.service.OrderProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单产品信息 服务实现类
 * </p>
 *
 * @author duanlsh
 * @since 2019-07-23
 */
@Service
public class OrderProductServiceImpl extends ServiceImpl<OrderProductMapper, OrderProductModel> implements OrderProductService {

}
