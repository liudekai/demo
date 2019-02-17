package com.example.demo.service;

import com.example.demo.pojo.Goods;

import java.util.List;

/**
 * Created by DK on 2018/12/3.
 */
public interface GoodsService {
    public void saveGoods(Goods goods) throws Exception;
    public Goods queryGoodsByUseId(int userId);
    public List<Goods> selecAllGoods();
}
