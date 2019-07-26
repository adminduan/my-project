package com.white.dew.api.bean.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单信息
 * </p>
 *
 * @author duanlsh
 * @since 2019-07-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tbl_order")
public class OrderModel implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 总价格
     */
    private BigDecimal price;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 订单流水号
     */
    private String orderNo;

    /**
     * 优惠券Id
     */
    private Integer couponId;

    /**
     * 支付状态 0 未支付 1 支付成功 2支付失败
     */
    private Integer payStatus;

    /**
     * 订单状态 0 下单 1 商品出库 2 待收货 3 完成 4 取消订单
     */
    private Integer orderStatus;

    /**
     * 0 无效 1有效
     */
    private Boolean status;

    private LocalDateTime updateTime;

    private LocalDateTime createTime;


}
