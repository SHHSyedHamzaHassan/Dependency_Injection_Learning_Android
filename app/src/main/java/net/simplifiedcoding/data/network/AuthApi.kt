package net.simplifiedcoding.data.network

import net.simplifiedcoding.data.responses.LoginResponse
import net.simplifiedcoding.data.responses.TokenResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AuthApi : BaseApi {

    @FormUrlEncoded
    @POST("auth/login")
    suspend fun login(
        @Field("email") email: String,
        @Field("password") password: String
    ): LoginResponse
    //14JAN2022
    //Suspending functions are at the center of everything coroutines.
    // A suspending function is simply a function that can be paused and resumed at a later time.
    // They can execute a long running operation and wait for it to complete without blocking.
    //The syntax of a suspending function is similar to that of a regular function except for
    // the addition of the suspend keyword.
}