package lostfinder.sobsch.lostfinder.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

fun api(): RetrofitService = Retrofit.Builder()
        .baseUrl("")
        .client(OkHttpClient(provideLoggingInterceptor()))
        .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(RetrofitService::class.java)


private fun OkHttpClient(
        interceptor: HttpLoggingInterceptor): OkHttpClient = OkHttpClient.Builder()
        .run {
            addInterceptor(interceptor)
            build()
        }

private fun provideLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }