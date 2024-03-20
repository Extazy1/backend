package com.extazy.backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DivingResult extends Result {
    @JsonProperty("TotalPoints")
    private String totalPoints;

    @JsonProperty("DiveDifficulty")
    private String diveDifficulty;

    public String getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(String totalPoints) {
        this.totalPoints = totalPoints;
    }

    public String getDiveDifficulty() {
        return diveDifficulty;
    }

    public void setDiveDifficulty(String diveDifficulty) {
        this.diveDifficulty = diveDifficulty;
    }
}
