package com.firstApp.mavenApp.repositories;

import com.firstApp.mavenApp.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker,Long>{
    
}
