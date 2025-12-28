package com.example.emojis.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.emojis.model.Emoji;
import com.example.emojis.service.EmojiService;

@RestController
@RequestMapping("/emojis")
public class EmojiController {
    @Autowired
    private EmojiService emojiService;
    
    @GetMapping
    public List<Emoji> getAllEmojis(@RequestParam(defaultValue = "12") int limit) {
        return emojiService.getAllEmojis(limit);
    }
}
