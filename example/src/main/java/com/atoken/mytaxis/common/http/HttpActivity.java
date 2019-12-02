package com.atoken.mytaxis.common.http;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.atoken.mytaxis.R;
import com.atoken.mytaxis.common.http.api.API;
import com.atoken.mytaxis.common.http.impl.BaseRequest;
import com.atoken.mytaxis.common.http.impl.BaseResponse;
import com.atoken.mytaxis.common.http.impl.OkHttpClientImpl;

import java.sql.ClientInfoStatus;

//测试网络封装是否成功
public class HttpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http);
        new Thread() {
            @Override
            public void run() {
                String url = API.Config.getBaseUrl() + "info.json";
                OkHttpClientImpl httpClient = new OkHttpClientImpl();
                IRequest request = new BaseRequest(url);
                IResponse response = httpClient.get(request, false);

                System.out.println("statecode=" + response.getCode());
                System.out.println("body=" + response.getData());
            }
        }.start();

    }


}
