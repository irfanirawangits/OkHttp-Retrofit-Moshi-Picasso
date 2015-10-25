package com.sottocorp.okhttpretrofitmoshipicasso.network;

import com.sottocorp.okhttpretrofitmoshipicasso.BuildConfig;

import retrofit.MoshiConverterFactory;
import retrofit.Retrofit;

public class ApiClients
{
    private static Retrofit mClient;

    public static Retrofit getApiClient()
    {
        if (mClient == null)
        {
            mClient = new Retrofit
                    .Builder()
                    .baseUrl(BuildConfig.apiDomainName)
                    .addConverterFactory(MoshiConverterFactory.create())
                    .build();
        }

        return mClient;
    }
}