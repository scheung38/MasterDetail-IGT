package com.fortressgain.masterdetail_igt.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class GameData {

    @SerializedName("response")
    @Expose
    public String response;
    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("data")
    @Expose
    public List<Datum> data = null;

}