package com.example.demo.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Goods {
    /**
     * id
     */
    private Integer id;

    /**
     * user_id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 商品名称
     */
    private String title;

    /**
     * 商品主图
     */
    private String image;

    /**
     * 商品价格
     */
    private BigDecimal price;

    /**
     * 商品类型
     */
    @Column(name = "goods_type")
    private Byte goodsType;

    /**
     * 商品地址
     */
    private String address;

    /**
     * 商品坐标
     */
    private String coordinate;

    /**
     * 0=下架，1=上架，2=售出
     */
    private Byte status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 是否删除1=是，0=否
     */
    private Boolean deleted;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取user_id
     *
     * @return user_id - user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置user_id
     *
     * @param userId user_id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取商品名称
     *
     * @return title - 商品名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置商品名称
     *
     * @param title 商品名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取商品主图
     *
     * @return image - 商品主图
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置商品主图
     *
     * @param image 商品主图
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取商品价格
     *
     * @return price - 商品价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置商品价格
     *
     * @param price 商品价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取商品类型
     *
     * @return goods_type - 商品类型
     */
    public Byte getGoodsType() {
        return goodsType;
    }

    /**
     * 设置商品类型
     *
     * @param goodsType 商品类型
     */
    public void setGoodsType(Byte goodsType) {
        this.goodsType = goodsType;
    }

    /**
     * 获取商品地址
     *
     * @return address - 商品地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置商品地址
     *
     * @param address 商品地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取商品坐标
     *
     * @return coordinate - 商品坐标
     */
    public String getCoordinate() {
        return coordinate;
    }

    /**
     * 设置商品坐标
     *
     * @param coordinate 商品坐标
     */
    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    /**
     * 获取0=下架，1=上架，2=售出
     *
     * @return status - 0=下架，1=上架，2=售出
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0=下架，1=上架，2=售出
     *
     * @param status 0=下架，1=上架，2=售出
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取是否删除1=是，0=否
     *
     * @return deleted - 是否删除1=是，0=否
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除1=是，0=否
     *
     * @param deleted 是否删除1=是，0=否
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}