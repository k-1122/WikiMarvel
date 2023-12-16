package com.example.wikimarvel.api;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.wikimarvel.adapters.GridCharactersAdapter;
import com.example.wikimarvel.config.Config;
import com.example.wikimarvel.data.characters.Character_;
import com.example.wikimarvel.fragments.FirstFragment;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ApiRequestManager {
    public static ApiRequestManager API_REQUEST_MANAGER_INSTANCE = new ApiRequestManager();
    private final OkHttpClient client = new OkHttpClient();

    private final ExecutorService executorService = Executors.newSingleThreadExecutor();

    private ApiRequestManager() {
    }

   /*// private void get(String url, Callback callback) {
        get(url, null, callback);
    }*/

    public void get() {
        //Se crea un objeto para construir la solicitud get
        Request.Builder builder = new Request.Builder().get();

        String url = Config.CHARACTERS + Config.MD5;
        //Se establece la url de la solicitud
        builder.url(url);
        //Se construye la solicitud final
        Request request = builder.build();

        executorService.execute(() -> {
            client.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(@NonNull Call call, @NonNull IOException e) {
                }

                @Override
                public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                    if(response.isSuccessful()){

                        JsonObject parsedCharacter = CharactersParser.parseResponseBody(response);

                        JsonArray charactersJsonArray = parsedCharacter.getAsJsonArray("results");
                        Log.d("DEBUG", "onResponse: " + charactersJsonArray);
                        FirstFragment.setResponseFragment(charactersJsonArray);

                    }
                }
            });
        });


    }




}
