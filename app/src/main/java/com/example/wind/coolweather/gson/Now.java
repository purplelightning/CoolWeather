package com.example.wind.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wind on 17-7-26.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}
