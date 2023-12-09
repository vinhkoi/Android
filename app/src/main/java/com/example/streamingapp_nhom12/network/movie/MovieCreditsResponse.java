package com.example.streamingapp_nhom12.network.movie;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieCreditsResponse {
    @SerializedName("id")
    private Integer id;
    @SerializedName("crew")
    private List<MovieCrewBrief> crews;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public List<MovieCrewBrief> getCrews() {
        return crews;
    }

    public void setCrews(List<MovieCrewBrief> crews) {
        this.crews = crews;
    }
}
