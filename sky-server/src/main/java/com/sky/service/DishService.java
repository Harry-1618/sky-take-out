package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

/**
 * ClassName: DishService
 * Package: com.sky.service
 * Description:
 *
 * @Author: 黄瑞天
 * @Create: 2024/8/15 - 17:06
 * @Version: v1.0
 */
public interface DishService {
    /**
     * 新增菜品和对应口味
     * @param dishDTO
     */

    public void saveWithFlavor(DishDTO dishDTO);
}
