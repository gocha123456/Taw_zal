package com.example.subjectsApp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@JsonSerialize
@Data
public class SubjcetEntry {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("nazwa")
    private String name;

    @JsonProperty("ECTS")
    private Integer ects;

    @JsonProperty("Sala")
    private Integer calssroom;

    @JsonProperty("Finals")
    private Boolean finals;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEcts() {
        return ects;
    }

    public void setEcts(Integer ects) {
        this.ects = ects;
    }

    public Integer getCalssroom() {
        return calssroom;
    }

    public void setCalssroom(Integer calssroom) {
        this.calssroom = calssroom;
    }

    public Boolean getFinals() {
        return finals;
    }

    public void setFinals(Boolean finals) {
        this.finals = finals;
    }
}
