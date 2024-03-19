package com.extazy.backend.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event {
    @JsonProperty("Sports")
    private List<Sport> sports;

    public List<Sport> getSports() {
        return sports;
    }

    public void setSports(List<Sport> Sports) {
        this.sports = Sports;
    }

    public static class Sport {
        @JsonProperty("DisciplineList")
        private List<Discipline> disciplineList;

        public List<Discipline> getDisciplineList() {
            return disciplineList;
        }

        public void setDisciplineList(List<Discipline> DisciplineList) {
            this.disciplineList = DisciplineList;
        }
    }

    public static class Discipline {
        @JsonProperty("Id")
        private String id;
        @JsonProperty("DisciplineName")
        private String disciplineName;

        public String getId() {
            return id;
        }

        public void setId(String Id) {
            this.id = Id;
        }

        public String getDisciplineName() {
            return disciplineName;
        }

        public void setDisciplineName(String DisciplineName) {
            this.disciplineName = DisciplineName;
        }
    }
}
