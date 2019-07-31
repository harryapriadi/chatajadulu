package com.harinamaku.inchat.Fragments;

import com.harinamaku.inchat.Notifications.MyResponse;
import com.harinamaku.inchat.Notifications.Sender;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAARFgV8rw:APA91bEwOvhqTgnA4RkT62Cj9Yp-BgHrcahDzJoWhvEivEpezvsHxxg9xEUFRb8h0-nkIg1hrTYrFriJJ3MN0mu_2jBAnSXP-AMtW6pJLf8cODdSkjE-bLlLzNU46parwqTH98filfDx"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
