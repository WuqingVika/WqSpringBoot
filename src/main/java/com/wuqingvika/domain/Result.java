package com.wuqingvika.domain;

/**
 * Created by wuqingvika on 2017/7/27.
 */
public class Result<T> {
    private Integer code;//错误码
    private String message;//提示信息
    private T data;//具体的内容

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
