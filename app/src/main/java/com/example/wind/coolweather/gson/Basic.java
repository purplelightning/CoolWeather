package com.example.wind.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wind on 17-7-26.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
