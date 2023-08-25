package com.example.unicodeconverter_1.config;


import com.example.unicodeconverter_1.model.Unicode;
import com.example.unicodeconverter_1.repositories.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    private UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {
        // Opretter et sæt med almindelige ASCII-karakterer
        Set<Character> characters = createCharacterSet();
        for (Character c : characters) {
            unicodeRepository.save(new Unicode((int) c, c, "Almindelige ASCII-karakterer og tal"));
        }

        // Opretter et sæt med emojis
        Set<Character> emojis = createEmojiSet();
        for (Character c : emojis) {
            unicodeRepository.save(new Unicode((int) c, c, "Mine yndlings emojis"));
        }
    }

    // Metode til at oprette et sæt af almindelige ASCII-karakterer og tal
    private Set<Character> createCharacterSet() {
        Set<Character> characters = new HashSet<>();
        for (char c = 32; c <= 126; c++) {
            characters.add(c);
        }
        return characters;
    }

    // Metode til at oprette et sæt af emojis
    private Set<Character> createEmojiSet() {
        Set<Character> emoji = new HashSet<>();

        // Tilføjer specifikke emoji ved hjælp af deres Unicode-koder
        emoji.add('\u263A'); // Smiley Face
        emoji.add('\u2764'); // Heart

        return emoji;
    }
}





