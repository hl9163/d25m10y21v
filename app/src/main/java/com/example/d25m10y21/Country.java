package com.example.d25m10y21;

public class Country {
    public Country(String name, String capital, String mainSong, int population, String lang) {
        this.name = name;
        this.capital = capital;
        this.mainSong = mainSong;
        this.population = population;
        this.lang = lang;
    }

    private String name;
    private String capital;
    private String mainSong;
    private int population;
    private String lang;

    public String getName() {
        return name;
    }

    public String getCupital() {
        return capital;
    }

    public String getMainSong() {
        return mainSong;
    }

    public int getPopulation() {
        return population;
    }

    public String getLang() {
        return lang;
    }

    public String[] getInfo() {
        String [] info = {name,capital,mainSong,String.valueOf(population),lang};
        return info;
    }
}
