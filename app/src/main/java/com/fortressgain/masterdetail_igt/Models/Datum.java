package com.fortressgain.masterdetail_igt.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Datum {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("jackpot")
    @Expose
    public Integer jackpot;
    @SerializedName("date")
    @Expose
    public String date;

}