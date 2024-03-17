package com.extazy.backend.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Medal {
    @JsonProperty("Medals")
    private Medals medals;

    public Medals getMedals() {
        return medals;
    }

    public void setMedals(Medals medals) {
        this.medals = medals;
    }

    public static class Medals {
        @JsonProperty("SportMedals")
        private List<SportMedal> sportMedals;

        public List<SportMedal> getSportMedals() {
            return sportMedals;
        }

        public void setSportMedals(List<SportMedal> sportMedals) {
            this.sportMedals = sportMedals;
        }
    }

    public static class SportMedal {
        @JsonProperty("SportCode")
        private String sportCode;

        @JsonProperty("Countries")
        private List<Country> countries;

        public String getSportCode() {
            return sportCode;
        }

        public void setSportCode(String sportCode) {
            this.sportCode = sportCode;
        }
    }

    public static class Country {
        @JsonProperty("CountryName")
        private String countryName;

        @JsonProperty("Gold")
        private MedalCount gold;

        @JsonProperty("Silver")
        private MedalCount silver;

        @JsonProperty("Bronze")
        private MedalCount bronze;

        public String getCountryName() {
            return countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }

        public MedalCount getGold() {
            return gold;
        }

        public void setGold(MedalCount gold) {
            this.gold = gold;
        }

        public MedalCount getSilver() {
            return silver;
        }

        public void setSilver(MedalCount silver) {
            this.silver = silver;
        }

        public MedalCount getBronze() {
            return bronze;
        }

        public void setBronze(MedalCount bronze) {
            this.bronze = bronze;
        }
    }

    public static class MedalCount {
        @JsonProperty("Count")
        private int count;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

}
