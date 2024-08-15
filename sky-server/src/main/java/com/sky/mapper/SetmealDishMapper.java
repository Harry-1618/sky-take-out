package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: SetmealDishMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author: 黄瑞天
 * @Create: 2024/8/15 - 20:15
 * @Version: v1.0
 */
@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询相应的套餐id
     * @param dishIds
     * @return
     */
    public List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
