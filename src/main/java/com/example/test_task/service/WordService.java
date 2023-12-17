package com.example.test_task.service;

import com.example.test_task.model.Word;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class WordService {
    private final Map<Integer, Word> words = new HashMap<>();
    private int id = 1;

    public Collection<Word> getAllWords() {
        return this.words.values();
    }

    public Word createWord(Word word) {
        Word newWord = new Word(word.getHello(), word.getWorld());
        int id = getNextId();
        newWord.setId(id);
        words.put(id, newWord);
        return newWord;
    }

    private int getNextId() {
        return id++;
    }
}
