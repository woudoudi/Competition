package com.yidao.module_lib.base.http;


/**
 * Created by xiaochan on 2017/6/26.
 */

public class ResponseBean {
    private Integer code;

    private String msg;

    private String data;

    private Class mClass;

    private Object carry;

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public String getData() {
        return data;
    }

    public Class getRequestClass() {
        return mClass;
    }

    public void setRequestClass(Class aClass) {
        mClass = aClass;
    }

    public Object getCarry() {
        return carry;
    }

    public void setCarry(Object carry) {
        this.carry = carry;
    }

    @Override
    public String toString() {
        return "ResponseBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", mClass='" + mClass + '\'' +
                ", data='" + data + '\'' +
                ", carry='" + carry + '\'' +
                '}';
    }
}
