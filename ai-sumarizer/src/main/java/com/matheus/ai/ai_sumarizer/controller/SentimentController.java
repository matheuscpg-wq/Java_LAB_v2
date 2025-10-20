package com.matheus.ai.ai_sumarizer.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/analyze")
public class SentimentController {

    @PostMapping
    public Map<String, String> analyzeText(@RequestBody Map<String, String> payload) {
        String text = payload.get("text");

        // Dummy logic
        String sentiment = "neutral";
        if (text != null) {
            text = text.toLowerCase();
            if (text.contains("love") || text.contains("great")) sentiment = "positive";
            if (text.contains("hate") || text.contains("bad")) sentiment = "negative";
        }

        Map<String, String> response = new HashMap<>();
        response.put("text", text);
        response.put("sentiment", sentiment);
        return response;
    }
}