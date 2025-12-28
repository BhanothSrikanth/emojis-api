package com.example.emojis.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.emojis.model.Emoji;
import com.example.emojis.repository.*;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Service
public class EmojiService {
    @Autowired
    private EmojiJpaRepository emojiJpaRepository;

   
    public List<Emoji> getAllEmojis(int limit) {
        Pageable pageable = PageRequest.of(0, limit);
        return emojiJpaRepository.findAll(pageable).getContent();
    }
}
