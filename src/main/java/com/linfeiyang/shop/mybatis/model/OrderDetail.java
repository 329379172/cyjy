package com.linfeiyang.shop.mybatis.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderDetail implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.orderId
     *
     * @mbggenerated
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.productId
     *
     * @mbggenerated
     */
    private Integer productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.standard
     *
     * @mbggenerated
     */
    private String standard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.price
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.totalPrice
     *
     * @mbggenerated
     */
    private BigDecimal totalPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.sum
     *
     * @mbggenerated
     */
    private Integer sum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.unit
     *
     * @mbggenerated
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.barCode
     *
     * @mbggenerated
     */
    private String barCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.discount
     *
     * @mbggenerated
     */
    private BigDecimal discount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.shortDescribe
     *
     * @mbggenerated
     */
    private String shortDescribe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_order_detail.describe
     *
     * @mbggenerated
     */
    private String describe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_order_detail
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.id
     *
     * @return the value of t_order_detail.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.id
     *
     * @param id the value for t_order_detail.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.orderId
     *
     * @return the value of t_order_detail.orderId
     *
     * @mbggenerated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.orderId
     *
     * @param orderId the value for t_order_detail.orderId
     *
     * @mbggenerated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.productId
     *
     * @return the value of t_order_detail.productId
     *
     * @mbggenerated
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.productId
     *
     * @param productId the value for t_order_detail.productId
     *
     * @mbggenerated
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.standard
     *
     * @return the value of t_order_detail.standard
     *
     * @mbggenerated
     */
    public String getStandard() {
        return standard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.standard
     *
     * @param standard the value for t_order_detail.standard
     *
     * @mbggenerated
     */
    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.price
     *
     * @return the value of t_order_detail.price
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.price
     *
     * @param price the value for t_order_detail.price
     *
     * @mbggenerated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.totalPrice
     *
     * @return the value of t_order_detail.totalPrice
     *
     * @mbggenerated
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.totalPrice
     *
     * @param totalPrice the value for t_order_detail.totalPrice
     *
     * @mbggenerated
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.sum
     *
     * @return the value of t_order_detail.sum
     *
     * @mbggenerated
     */
    public Integer getSum() {
        return sum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.sum
     *
     * @param sum the value for t_order_detail.sum
     *
     * @mbggenerated
     */
    public void setSum(Integer sum) {
        this.sum = sum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.unit
     *
     * @return the value of t_order_detail.unit
     *
     * @mbggenerated
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.unit
     *
     * @param unit the value for t_order_detail.unit
     *
     * @mbggenerated
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.barCode
     *
     * @return the value of t_order_detail.barCode
     *
     * @mbggenerated
     */
    public String getBarCode() {
        return barCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.barCode
     *
     * @param barCode the value for t_order_detail.barCode
     *
     * @mbggenerated
     */
    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.discount
     *
     * @return the value of t_order_detail.discount
     *
     * @mbggenerated
     */
    public BigDecimal getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.discount
     *
     * @param discount the value for t_order_detail.discount
     *
     * @mbggenerated
     */
    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.name
     *
     * @return the value of t_order_detail.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.name
     *
     * @param name the value for t_order_detail.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.shortDescribe
     *
     * @return the value of t_order_detail.shortDescribe
     *
     * @mbggenerated
     */
    public String getShortDescribe() {
        return shortDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.shortDescribe
     *
     * @param shortDescribe the value for t_order_detail.shortDescribe
     *
     * @mbggenerated
     */
    public void setShortDescribe(String shortDescribe) {
        this.shortDescribe = shortDescribe == null ? null : shortDescribe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.remark
     *
     * @return the value of t_order_detail.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.remark
     *
     * @param remark the value for t_order_detail.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_order_detail.describe
     *
     * @return the value of t_order_detail.describe
     *
     * @mbggenerated
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_order_detail.describe
     *
     * @param describe the value for t_order_detail.describe
     *
     * @mbggenerated
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }
}