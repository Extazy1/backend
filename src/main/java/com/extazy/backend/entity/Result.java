package com.extazy.backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Result {
    @JsonProperty("DisciplineName")
    private String disciplineName;

    @JsonProperty("EventName")
    private String eventName;

    @JsonProperty("EventResultDate")
    private String eventResultDate;

    @JsonProperty("Heats")
    private List<Heat> heats;

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventResultDate() {
        return eventResultDate;
    }

    public void setEventResultDate(String eventResultDate) {
        this.eventResultDate = eventResultDate;
    }

    public List<Heat> getHeats() {
        return heats;
    }

    public void setHeats(List<Heat> heats) {
        this.heats = heats;
    }

    public static class Heat {
        @JsonProperty("Name")
        private String name;

        @JsonProperty("Results")
        private List<ResultDetail> results;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<ResultDetail> getResults() {
            return results;
        }

        public void setResults(List<ResultDetail> results) {
            this.results = results;
        }
    }

    public static class ResultDetail {
        @JsonProperty("FullName")
        private String fullName;

        @JsonProperty("NAT")
        private String nat;

        @JsonProperty("Rank")
        private Integer rank;

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getNat() {
            return nat;
        }

        public void setNat(String nat) {
            this.nat = nat;
        }

        public Integer getRank() {
            return rank;
        }

        public void setRank(Integer rank) {
            this.rank = rank;
        }
    }
}

