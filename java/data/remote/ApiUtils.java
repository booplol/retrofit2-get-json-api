package com.example.android.justspell.data.remote;

public class ApiUtils {
    public static final String BASE_URL = "http://www.dnd5eapi.co/";

    public static APIService getAPIService(){
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}