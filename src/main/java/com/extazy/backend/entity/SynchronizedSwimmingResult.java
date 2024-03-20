package com.extazy.backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SynchronizedSwimmingResult extends Result {
    @JsonProperty("RoutineScore")
    private Double routineScore;

    @JsonProperty("ExecutionScore")
    private Double executionScore;

    @JsonProperty("ImpressionScore")
    private Double impressionScore;

    public Double getRoutineScore() {
        return routineScore;
    }

    public void setRoutineScore(Double routineScore) {
        this.routineScore = routineScore;
    }

    public Double getExecutionScore() {
        return executionScore;
    }

    public void setExecutionScore(Double executionScore) {
        this.executionScore = executionScore;
    }

    public Double getImpressionScore() {
        return impressionScore;
    }

    public void setImpressionScore(Double impressionScore) {
        this.impressionScore = impressionScore;
    }
}
