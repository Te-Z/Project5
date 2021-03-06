package com.zafindratafa.terence.mynews.Models.ArticleSearch;

/**
 * Created by maverick on 17/02/18.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Facets {

    @SerializedName("day_of_week")
    @Expose
    private DayOfWeek dayOfWeek;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

}