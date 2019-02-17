package com.example.demo.service.impl;

import com.example.demo.mapper.GoodsMapper;
import com.example.demo.pojo.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DK on 2018/12/3.
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveGoods(Goods goods) throws Exception {
        goodsMapper.insert(goods);
        int a = 1 / 0;
    }

    @Override
    public Goods queryGoodsByUseId(int id) {
        return goodsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Goods> selecAllGoods() {
        return goodsMapper.selectAll();
    }
}
