package com.extazy.backend.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Schedule {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @JsonProperty("Time")
    private String time;

    @JsonProperty("UtcDateTime")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date utcDateTime;

    @JsonProperty("Day")
    private int day;

    @JsonProperty("UtcDay")
    private int utcDay;

    @JsonProperty("DisciplineName")
    private String disciplineName;

    @JsonProperty("PhaseName")
    private String phaseName;

    @JsonProperty("HeatUnit")
    private String heatUnit;

    @JsonProperty("ResultStatus")
    private String resultStatus;

    @JsonProperty("SportId")
    private String sportId;

    @JsonProperty("DisciplineId")
    private String disciplineId;

    @JsonProperty("SportCode")
    private String sportCode;

    @JsonProperty("TimeZone")
    private String timeZone;

    @JsonProperty("TimeZoneDisplayName")
    private String timeZoneDisplayName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getUtcDateTime() {
        return utcDateTime;
    }

    public void setUtcDateTime(Date utcDateTime) {
        this.utcDateTime = utcDateTime;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getUtcDay() {
        return utcDay;
    }

    public void setUtcDay(int utcDay) {
        this.utcDay = utcDay;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public String getPhaseName() {
        return phaseName;
    }

    public void setPhaseName(String phaseName) {
        this.phaseName = phaseName;
    }

    public String getHeatUnit() {
        return heatUnit;
    }

    public void setHeatUnit(String heatUnit) {
        this.heatUnit = heatUnit;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public String getDisciplineId() {
        return disciplineId;
    }

    public void setDisciplineId(String disciplineId) {
        this.disciplineId = disciplineId;
    }

    public String getSportCode() {
        return sportCode;
    }

    public void setSportCode(String sportCode) {
        this.sportCode = sportCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTimeZoneDisplayName() {
        return timeZoneDisplayName;
    }

    public void setTimeZoneDisplayName(String timeZoneDisplayName) {
        this.timeZoneDisplayName = timeZoneDisplayName;
    }
}
