package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More moe;
    public class Temperature {
        public String Max;
        public String min;
    }
    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
