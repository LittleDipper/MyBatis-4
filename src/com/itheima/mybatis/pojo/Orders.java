package com.itheima.mybatis.pojo;

import java.util.Date;

public class Orders {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.id
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.user_id
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.number
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    private String number;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.createtime
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column orders.note
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.id
     *
     * @return the value of orders.id
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.id
     *
     * @param id the value for orders.id
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.user_id
     *
     * @return the value of orders.user_id
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.user_id
     *
     * @param userId the value for orders.user_id
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.number
     *
     * @return the value of orders.number
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.number
     *
     * @param number the value for orders.number
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.createtime
     *
     * @return the value of orders.createtime
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.createtime
     *
     * @param createtime the value for orders.createtime
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column orders.note
     *
     * @return the value of orders.note
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column orders.note
     *
     * @param note the value for orders.note
     *
     * @mbggenerated Thu Dec 19 17:36:51 CST 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}