package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

/**
 * ClassName: ShoppingCartService
 * Package: com.sky.service
 * Description:
 *
 * @Author: 黄瑞天
 * @Create: 2024/8/19 - 21:11
 * @Version: v1.0
 */
public interface ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
