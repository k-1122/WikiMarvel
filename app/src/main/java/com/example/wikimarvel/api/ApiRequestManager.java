package com.example.wikimarvel.api;

import com.example.wikimarvel.config.Config;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class ApiRequestManager {
    public static ApiRequestManager API_REQUEST_MANAGER_INSTANCE = new ApiRequestManager();
    private final OkHttpClient client = new OkHttpClient();
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private ApiRequestManager(){}

    private void get(String url, Headers headers, Callback callback) {
        Request.Builder builder = new Request.Builder().get();

        builder.url(url);
        if (headers != null) builder.headers(headers);

        Request request = builder.build();

        client.newCall(request).enqueue(callback);
    }
    public void getCharacters(Callback callback){
        String url = Config.CHARACTERS;
        Headers headers = new Headers.Builder()
                .add(Config.MD5)
                .build();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                get(url, headers, callback);
            }
        });
    }
    //falta el callback



}
