package com.extazy.backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WaterPoloResult extends Result {
    @JsonProperty("MatchResult")
    private String matchResult;

    @JsonProperty("HomeTeamScore")
    private Integer homeTeamScore;

    @JsonProperty("AwayTeamScore")
    private Integer awayTeamScore;

    public String getMatchResult() {
        return matchResult;
    }

    public void setMatchResult(String matchResult) {
        this.matchResult = matchResult;
    }

    public Integer getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(Integer homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public Integer getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(Integer awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }
}
