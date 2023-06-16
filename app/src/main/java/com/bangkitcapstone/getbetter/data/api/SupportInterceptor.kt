package com.bangkitcapstone.getbetter.data.api

import android.content.Context
import android.util.Log
import com.bangkitcapstone.getbetter.helper.GlobalVar
import okhttp3.Authenticator
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route

class SupportInterceptor : Interceptor, Authenticator {

    lateinit var context: Context

    /**
     * Interceptor class for setting of the headers for every request
     */
    override fun intercept(chain: Interceptor.Chain): Response {

        var request = chain.request()

        request = request.newBuilder()
            .addHeader("Authorization", "Bearer " + GlobalVar.TOKEN_KEY)
            .build()

        return chain.proceed(request)
    }

    /**
     * Authenticator for when the authToken need to be refresh and updated
     * everytime we get a 401 error code
     */
    override fun authenticate(route: Route?, response: Response): Request? {
        var requestAvailable: Request? = null

//        context = MyApplication.getContext()!!

        Log.d("ResponseCode", response.code.toString())

//        if (response.code == 401 || response.code == 400) {
//            val i = Intent(context, LoginActivity::class.java)
//            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
//            i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
//
//            i.putExtra("session_code", response.code.toString())
//            context.startActivity(i)
//        } else try {
//            requestAvailable = response.request.newBuilder()
//                .build()
//            return requestAvailable
//        } catch (ex: Exception) {
//        }
        return requestAvailable
    }

}
