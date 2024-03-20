package com.extazy.backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class HighDivingResult extends Result {
    @JsonProperty("Dives")
    private List<Dive> dives;

    public List<Dive> getDives() {
        return dives;
    }

    public void setDives(List<Dive> dives) {
        this.dives = dives;
    }

    public class Dive {
        @JsonProperty("DiveNumber")
        private Integer diveNumber;

        @JsonProperty("DiveScore")
        private Double diveScore;

        @JsonProperty("Difficulty")
        private Double difficulty;

        public Integer getDiveNumber() {
            return diveNumber;
        }

        public void setDiveNumber(Integer diveNumber) {
            this.diveNumber = diveNumber;
        }

        public Double getDiveScore() {
            return diveScore;
        }

        public void setDiveScore(Double diveScore) {
            this.diveScore = diveScore;
        }

        public Double getDifficulty() {
            return difficulty;
        }

        public void setDifficulty(Double difficulty) {
            this.difficulty = difficulty;
        }
    }
}


