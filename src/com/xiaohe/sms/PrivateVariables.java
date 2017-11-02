package com.xiaohe.sms;

import java.util.Random;

public class PrivateVariables {
    private String YourSMSTemplateCode = "SMS_106895135";//必填:短信模板-可在短信控制台中找到
    private String YourSignName = "孝和";//必填:短信签名-可在短信控制台中找到
    private String phone1 = "15772438300";//必填:待发送手机号。支持以逗号分隔的形式进行批量调用，批量上限为1000个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式
    private String YourAccessId = "LTAIi0nt7WWMoO9U";//你的accessKeyId
    private String YourAccessKeySecret = "czhgqIVFKO2TCJgepx95ZVLDy1mVnZ";//你的accessKeySecret
    private String product = "Dysmsapi";//短信API产品名称（短信产品名固定，无需修改）
    private String domain = "dysmsapi.aliyuncs.com";//短信API产品域名（接口地址固定，无需修改）
    private String TemplateParamSMS;//随机短信验证码

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getYourAccessKeySecret() {
        return YourAccessKeySecret;
    }

    public void setYourAccessKeySecret(String yourAccessKeySecret) {
        YourAccessKeySecret = yourAccessKeySecret;
    }

    public String getYourAccessId() {
        return YourAccessId;
    }

    public void setYourAccessId(String yourAccessId) {
        YourAccessId = yourAccessId;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getYourSignName() {
        return YourSignName;
    }

    public void setYourSignName(String yourSignName) {
        YourSignName = yourSignName;
    }

    public String getYourSMSTemplateCode() {
        return YourSMSTemplateCode;
    }

    public void setYourSMSTemplateCode(String yourSMSTemplateCode) {
        YourSMSTemplateCode = yourSMSTemplateCode;
    }

    public String getTemplateParamSMS() {
        Random rad = new Random();
        TemplateParamSMS = rad.nextInt(1000000) + "";
        return TemplateParamSMS;
    }
}
