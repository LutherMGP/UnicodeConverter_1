package com.example.unicodeconverter_1.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Annotation der angiver, at denne klasse er en JPA-entitet
public class Unicode {

    @Id // Markerer dette felt som den primære nøgle
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Definerer, at værdien genereres automatisk af databasen
    private Long id; // Unik identifikator for hver indtastning

    private int unicode; // Unicode-værdien
    private char bogstav; // Karakterrepræsentationen
    private String description; // Valgfri beskrivelse

    // Standard konstruktør kræves af JPA
    public Unicode() {}

    public Unicode(int unicode, char bogstav, String description) {
        this.unicode = unicode;
        this.bogstav = bogstav;
        this.description = description;
    }

    // Getters og setters
    public Long getId() { return id; }
    public int getUnicode() { return unicode; }
    public char getBogstav() { return bogstav; }
    public String getDescription() { return description; }
    public void setId(Long id) { this.id = id; }
    public void setUnicode(int unicode) { this.unicode = unicode; }
    public void setBogstav(char bogstav) { this.bogstav = bogstav; }
    public void setDescription(String description) { this.description = description; }
}
