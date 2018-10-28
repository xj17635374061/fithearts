package com.ziqing.fithearts.pojo;

import java.util.Date;

public class Dictionaries {
    private Integer id;

    private String typecode;

    private String typename;

    private Integer value_id;

    private String value_content1;

    private String value_content2;

    private String value_content3;

    private String value_content4;

    private String value_content5;

    private Date create_time;

    private Date modify_time;

    private String is_del;

    private String value_one;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getValue_id() {
        return value_id;
    }

    public void setValue_id(Integer value_id) {
        this.value_id = value_id;
    }

    public String getValue_content1() {
        return value_content1;
    }

    public void setValue_content1(String value_content1) {
        this.value_content1 = value_content1 == null ? null : value_content1.trim();
    }

    public String getValue_content2() {
        return value_content2;
    }

    public void setValue_content2(String value_content2) {
        this.value_content2 = value_content2 == null ? null : value_content2.trim();
    }

    public String getValue_content3() {
        return value_content3;
    }

    public void setValue_content3(String value_content3) {
        this.value_content3 = value_content3 == null ? null : value_content3.trim();
    }

    public String getValue_content4() {
        return value_content4;
    }

    public void setValue_content4(String value_content4) {
        this.value_content4 = value_content4 == null ? null : value_content4.trim();
    }

    public String getValue_content5() {
        return value_content5;
    }

    public void setValue_content5(String value_content5) {
        this.value_content5 = value_content5 == null ? null : value_content5.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public String getIs_del() {
        return is_del;
    }

    public void setIs_del(String is_del) {
        this.is_del = is_del == null ? null : is_del.trim();
    }

    public String getValue_one() {
        return value_one;
    }

    public void setValue_one(String value_one) {
        this.value_one = value_one == null ? null : value_one.trim();
    }
}