package com.example.android.justspell.data.remote;

import com.example.android.justspell.data.model.Spell;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("api/spells/7")
    Call<Spell> getData();
}