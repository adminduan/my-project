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
 * 订单产品信息
 * </p>
 *
 * @author duanlsh
 * @since 2019-07-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tbl_order_product")
public class OrderProductModel implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 产品id
     */
    private Integer productId;

    /**
     * 购买价格
     */
    private BigDecimal buyPrice;

    /**
     * 0 无效 1有效
     */
    private Boolean status;

    private LocalDateTime updateTime;

    private LocalDateTime createTime;


}
