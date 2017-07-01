package com.fortressgain.masterdetail_igt.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PlayerInfo {

    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("balance")
    @Expose
    public Integer balance;
    @SerializedName("avatarLink")
    @Expose
    public String avatarLink;
    @SerializedName("lastLogindate")
    @Expose
    public String lastLogindate;

}