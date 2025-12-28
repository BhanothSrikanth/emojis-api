package com.example.emojis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.emojis.model.Emoji;

@Repository
public interface EmojiJpaRepository extends JpaRepository<Emoji, Long> {
    
}
