package lostfinder.sobsch.lostfinder.network

import com.google.gson.annotations.SerializedName
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

interface RetrofitService {


    // Register
    @FormUrlEncoded
    @POST("/Register.php")
    fun register(@Field("userid") userid: String,
                 @Field("userpw") userpw: String,
                 @Field("name") name: String,
                 @Field("addr") addr: String,
                 @Field("nic") nic: String,
                 @Field("tel") tel: String,
                 @Field("other_num") other_num: String): Single<ServerResult>

    data class ServerResult(@SerializedName("result") val result: Boolean)


    companion object {

        const val BASE_URL = "http://koin0204.cafe24.com"

        fun create(): RetrofitService {

            val restAdapter = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(okHttpClient(provideLoggingInterceptor()))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()


            return restAdapter.create(RetrofitService::class.java)
        }

        private fun okHttpClient(
                interceptor: HttpLoggingInterceptor): OkHttpClient = OkHttpClient.Builder()
                .run {
                    addInterceptor(interceptor)
                    build()
                }

        private fun provideLoggingInterceptor(): HttpLoggingInterceptor = HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
    }
}