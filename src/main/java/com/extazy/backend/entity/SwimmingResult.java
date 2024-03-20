package com.extazy.backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class SwimmingResult extends Result {
    @JsonProperty("TotalTime")
    private String totalTime;

    @JsonProperty("Laps")
    private List<Lap> laps;

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public List<Lap> getLaps() {
        return laps;
    }

    public void setLaps(List<Lap> laps) {
        this.laps = laps;
    }

    public static class Lap {
        @JsonProperty("Time")
        private String time;

        @JsonProperty("LapNumber")
        private Integer lapNumber;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Integer getLapNumber() {
            return lapNumber;
        }

        public void setLapNumber(Integer lapNumber) {
            this.lapNumber = lapNumber;
        }
    }
}


