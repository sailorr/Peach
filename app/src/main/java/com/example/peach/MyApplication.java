package com.example.peach;

import android.app.Application;
import android.util.Log;

import com.sailor.net.retrofit.RetrofitManager;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * -description:
 * -author: created by tang on 2020/5/11 17:10
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MyApplication", "onCreate:---> ");
        RetrofitManager.getInstance().init("http://121.89.199.222:8080/");
        handleSSLHandshake();
    }

    public static void handleSSLHandshake() {

        try {
            TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }

                @Override
                public void checkClientTrusted(X509Certificate[] certs, String authType) {

                }

                @Override
                public void checkServerTrusted(X509Certificate[] certs, String authType) {

                }
            }};


            SSLContext sc = SSLContext.getInstance("TLS");
            // trustAllCerts信任所有的证书

            sc.init(null, trustAllCerts, new SecureRandom());

            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

        } catch (Exception e) {

        }
    }
}
