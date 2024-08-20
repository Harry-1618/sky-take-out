package com.sky.mapper;

import com.sky.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: OrderDetailMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author: 黄瑞天
 * @Create: 2024/8/20 - 22:35
 * @Version: v1.0
 */
@Mapper
public interface OrderDetailMapper {
    /**
     * 品两插入订单明细数据
     * @param orderDetailList
     */
    void insertBatch(List<OrderDetail> orderDetailList);

}
