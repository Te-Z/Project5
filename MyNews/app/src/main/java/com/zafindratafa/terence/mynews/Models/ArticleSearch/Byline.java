package com.zafindratafa.terence.mynews.Models.ArticleSearch;

/**
 * Created by maverick on 17/02/18.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Byline {

    @SerializedName("person")
    @Expose
    private List<Person> person = null;
    @SerializedName("original")
    @Expose
    private String original;

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

}