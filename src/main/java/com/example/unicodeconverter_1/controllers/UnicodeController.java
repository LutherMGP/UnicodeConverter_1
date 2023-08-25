package com.example.unicodeconverter_1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Step 1: Tilføjelse af en RestController klasse til et nyt JPA projekt kaldet: UnicodeConverter
@RestController // Annotation der angiver, at denne klasse er en Rest Controller
@RequestMapping("/unicode") // Basisstien for alle endpoints i denne klasse
public class UnicodeController {

    // Step 2: En GET-metode til at konvertere en Unicode værdi til et karakter
    @GetMapping("/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char)i; // Konverterer den givne integer til et char ved hjælp af en typecasting

        // Returnerer en streng, der repræsenterer den givne Unicode værdi og dens tilsvarende char
        return "unicode=" + i + " char=" + c;
    }

    // Step 3: En GET-metode til at konvertere en char til en Unicode værdi
    @GetMapping("/char/{c}")
    public String charToUnicode(@PathVariable char c) {
        int unicodeValue = (int) c; // Konverterer den givne char til dens tilsvarende Unicode værdi
        return "char=" + c + " unicode=" + unicodeValue;
    }
}



