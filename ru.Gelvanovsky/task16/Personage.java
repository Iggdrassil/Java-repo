package ru.Gelvanovsky.task16;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Personage {
    private int id;
    private String name;
    private String status;
    private String species;
    private String gender;

    public Personage(int id, String name, String status, String species, String gender) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.gender = gender;
    }
    public Personage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Personage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", species='" + species + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
