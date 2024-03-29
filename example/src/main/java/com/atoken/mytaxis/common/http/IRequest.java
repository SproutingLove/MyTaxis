package com.atoken.mytaxis.common.http;

import java.util.Map;

/**
 * Author Aatoken
 * Date 2019/12/2 13:15
 * Description 定义请求数据的封装方式
 */
public interface IRequest {

    String POST = "POST";
    String GET = "GET";

    /**
     * 指定请求方式
     */
    void setMethod(String method);

    /**
     * 指定请求头部
     *
     * @param key
     * @param value
     */
    void setHeader(String key, String value);

    /**
     * 指定请求参数
     *
     * @param key
     * @param value
     */
    void setBody(String key, String value);

    /**
     * 提供给执行库请求行URL
     *
     * @return
     */
    String getUrl();

    /**
     * 提供给执行库请求头部
     *
     * @return
     */
    Map<String, String> getHeader();

    /**
     * 提供给执行库请求参数
     *
     * @return
     */
    Object getBody();

}
