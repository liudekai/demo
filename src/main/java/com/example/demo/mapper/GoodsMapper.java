package com.example.demo.mapper;

import com.example.demo.pojo.Goods;
import com.example.demo.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public interface GoodsMapper extends MyMapper<Goods> {
}