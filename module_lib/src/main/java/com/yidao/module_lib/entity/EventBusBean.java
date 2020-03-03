package com.yidao.module_lib.entity;

public class EventBusBean {

    public static int Event_Home_Type = 10000;
    public static int Event_Search_Type = 10001;
    public static int Event_Home_Update_Type = 10002;
    public static int Event_Dialog_Call = 10003;
    public static int Event_Update_Apply = 10004;
    public static int Event_Vote_Update = 10005;
    public static int Event_ALIPAY = 10006;
    public static int Event_WXPAY = 10007;

    public int type;
    public String content;

    public EventBusBean(int type) {
        this.type = type;
    }

    public EventBusBean setContent(String content) {
        this.content = content;
        return this;
    }
}
