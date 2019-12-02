package com.atoken.mytaxis.common.http;

/**
 * Author Aatoken
 * Date 2019/12/2 13:11
 * Description
 */
public interface IHttpClient {
    IResponse get(IRequest request, boolean forceCache);
    IResponse post(IRequest request, boolean forceCache);
}
