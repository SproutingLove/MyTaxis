package com.atoken.mytaxis.common.http.impl;

import com.atoken.mytaxis.common.http.IRequest;
import com.atoken.mytaxis.common.http.api.API;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Author Aatoken
 * Date 2019/12/2 13:22
 * Description
 */
public class BaseRequest implements IRequest {

    private String method = POST;
    private Map<String, String> header;
    private Map<String, Object> body;
    private String url;

    public BaseRequest(String url) {
        /**
         *  公共参数及头部信息
         */
        this.url = url;
        header = new HashMap();
        body = new HashMap<>();
        header.put("X-Bmob-Application-Id", API.Config.getAppId());
        header.put("X-Bmob-REST-API-Key", API.Config.getAppKey());
    }

    @Override
    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public void setHeader(String key, String value) {
        header.put(key, value);
    }

    @Override
    public void setBody(String key, String value) {
        body.put(key, value);
    }

    @Override
    public String getUrl() {
        if (GET.equals(method)) {
            // 组装 Get 请求参数
            for (String key : body.keySet()) {

                url = url.replace("${" + key + "}", body.get(key).toString());

            }
        }

        return url;
    }

    @Override
    public Map<String, String> getHeader() {
        return header;
    }

    @Override
    public Object getBody() {
        if (body != null) {
            // 组装 POST 方法请求参数
            return new Gson().toJson(this.body, HashMap.class);
        } else {
            return  "{}";
        }
    }
}
