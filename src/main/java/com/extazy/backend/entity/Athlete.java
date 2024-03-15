package com.extazy.backend.entity;

import java.util.List;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class Athlete {
    @JsonProperty("CountryName")
    private String countryName;

    @JsonProperty("CountryCode")
    private String countryCode;

    @JsonProperty("Participations")
    private List<Participation> participations;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public List<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(List<Participation> participations) {
        this.participations = participations;
    }

    public static class Participation {
        @JsonProperty("ResultId")
        private long resultId;

        @JsonProperty("Gender")
        private int gender;

        @JsonProperty("PreferredLastName")
        private String preferredLastName;

        @JsonProperty("PreferredFirstName")
        private String preferredFirstName;

        @JsonProperty("ScoreboardPhotoId")
        private String scoreboardPhotoId;

        @JsonProperty("Sports")
        private String sports;

        @JsonProperty("DOB")
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
        private Date dob;

        @JsonProperty("NAT")
        private String nat;

        @JsonProperty("Disciplines")
        private List<Discipline> disciplines;

        public long getResultId() {
            return resultId;
        }

        public void setResultId(long resultId) {
            this.resultId = resultId;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        public String getPreferredLastName() {
            return preferredLastName;
        }

        public void setPreferredLastName(String preferredLastName) {
            this.preferredLastName = preferredLastName;
        }

        public String getPreferredFirstName() {
            return preferredFirstName;
        }

        public void setPreferredFirstName(String preferredFirstName) {
            this.preferredFirstName = preferredFirstName;
        }

        public String getScoreboardPhotoId() {
            return scoreboardPhotoId;
        }

        public void setScoreboardPhotoId(String scoreboardPhotoId) {
            this.scoreboardPhotoId = scoreboardPhotoId;
        }

        public String getSports() {
            return sports;
        }

        public void setSports(String sports) {
            this.sports = sports;
        }

        public Date getDob() {
            return dob;
        }

        public void setDob(Date dob) {
            this.dob = dob;
        }

        public String getNat() {
            return nat;
        }

        public void setNat(String nat) {
            this.nat = nat;
        }

        public List<Discipline> getDisciplines() {
            return disciplines;
        }

        public void setDisciplines(List<Discipline> disciplines) {
            this.disciplines = disciplines;
        }

    }

    public static class Discipline {
        @JsonProperty("DisciplineId")
        private String disciplineId;

        @JsonProperty("DisciplineCode")
        private String disciplineCode;

        @JsonProperty("DisciplineName")
        private String disciplineName;

        @JsonProperty("PhaseId")
        private String phaseId;

        @JsonProperty("PhaseCode")
        private String phaseCode;

        @JsonProperty("PhaseName")
        private String phaseName;

        @JsonProperty("HeatName")
        private String heatName;

        public String getDisciplineId() {
            return disciplineId;
        }

        public void setDisciplineId(String disciplineId) {
            this.disciplineId = disciplineId;
        }

        public String getDisciplineCode() {
            return disciplineCode;
        }

        public void setDisciplineCode(String disciplineCode) {
            this.disciplineCode = disciplineCode;
        }

        public String getDisciplineName() {
            return disciplineName;
        }

        public void setDisciplineName(String disciplineName) {
            this.disciplineName = disciplineName;
        }

        public String getPhaseId() {
            return phaseId;
        }

        public void setPhaseId(String phaseId) {
            this.phaseId = phaseId;
        }

        public String getPhaseCode() {
            return phaseCode;
        }

        public void setPhaseCode(String phaseCode) {
            this.phaseCode = phaseCode;
        }

        public String getPhaseName() {
            return phaseName;
        }

        public void setPhaseName(String phaseName) {
            this.phaseName = phaseName;
        }

        public String getHeatName() {
            return heatName;
        }

        public void setHeatName(String heatName) {
            this.heatName = heatName;
        }
    }
}
