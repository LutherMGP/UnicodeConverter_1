package com.example.unicodeconverter_1.repositories;

import com.example.unicodeconverter_1.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;

//Step 5: Oprettelse af et repository for Unicode klassen.
public interface UnicodeRepository extends JpaRepository<Unicode, Long> {

}






