package com.wuqingvika.enums;

/**
 * Created by wuqingvika on 2017/7/30.
 */
public enum ResultEnum {
    PRIMARY_SCHOOL(100,"你还在上小学吧"),
    MIDDLE_SCHOOL(101,"你还在上初中吧"),
    UNKNOWN_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
