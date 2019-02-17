package com.example.demo;

import com.example.demo.pojo.Goods;
import com.example.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by DK on 2018/11/27.
 */
@RestController
public class HelloController {
    @Autowired
    private GoodsService goodsService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping("/hello")
    public String hello(){
        return redisTemplate.opsForValue().get("DB_PROMOTION_INFO_WITH_PROMOTION_ITEM_CACHE_BY_PROMOTION_ID_1007");
    }

    @RequestMapping("/selecAllGoods")
    public List<Goods> selecAllGoods(){
        return goodsService.selecAllGoods();
    }

    @RequestMapping("/queryGoodsByUseId")
    public Goods getGoods (String id) throws Exception {
        Goods goods = goodsService.queryGoodsByUseId(1);
        Goods goods1 = new Goods();
//        goods1.setId(Integer.valueOf(""));
        goods1.setImage("/wx49963b7179026ccc.o6zAJs3Rwyil8fIHiA0-jK2EBBPE.CbKgYuLsJ4WPf788e1c7f5f225d2c2e1a2396267b95e.jpg");
        goods1.setAddress("没说啥的");
        goods1.setCoordinate("39.961497496948,116.29146350713");
        goods1.setCreateTime(new Date());
        goods1.setModifyTime(new Date());
        goods1.setPrice(BigDecimal.valueOf(3.00));
        goods1.setDeleted(false);
        goods1.setGoodsType((byte) 0);
        goods1.setStatus((byte) 0);
        goods1.setTitle("不呵呵");
        goods1.setUserId(134);

        goodsService.saveGoods(goods1);

        return goods;
    }
}
