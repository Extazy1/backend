package com.extazy.backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class OpenWaterResult extends Result {
    @JsonProperty("Splits")
    private List<Split> splits;

    public class Split {
        @JsonProperty("Time")
        private String time;

        @JsonProperty("DifferentialTime")
        private String differentialTime;

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getDifferentialTime() {
            return differentialTime;
        }

        public void setDifferentialTime(String differentialTime) {
            this.differentialTime = differentialTime;
        }
    }
}


