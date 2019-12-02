package com.atoken.mytaxis.common.http;

/**
 * Author Aatoken
 * Date 2019/12/2 13:15
 * Description
 */
public interface IResponse {

    // 状态码
    int getCode();
    // 数据体
    String getData();

}
