package com.example.test_task.controller;

import com.example.test_task.model.Word;
import com.example.test_task.service.WordService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/words")
public class WordController {

    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @GetMapping
    public Collection<Word> getAllWords() {
        return this.wordService.getAllWords();
    }

    @PostMapping
    public Word createWord(@RequestBody Word word) {
        return this.wordService.createWord(word);
    }

    /**
     * Самая простая реализация получить запись на страничке браузера */
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

}