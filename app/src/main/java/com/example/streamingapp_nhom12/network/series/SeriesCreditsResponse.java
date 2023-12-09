package com.example.streamingapp_nhom12.network.series;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SeriesCreditsResponse {

    @SerializedName("crew")
    private List<SeriesCrewBrief> crews;
    @SerializedName("id")
    private Integer id;






    public List<SeriesCrewBrief> getCrews() {
        return crews;
    }

    public void setCrews(List<SeriesCrewBrief> crews) {
        this.crews = crews;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
