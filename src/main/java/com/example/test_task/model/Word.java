package com.example.test_task.model;

public class Word {
    private final String hello;
    private final String world;
    private int id;

    public Word(String hello, String world) {
        this.hello = hello;
        this.world = world;
    }

    public String getHello() {
        return hello;
    }

    public String getWorld() {
        return world;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Word{" +
                "hello='" + hello + '\'' +
                ", world='" + world + '\'' +
                ", id=" + id +
                '}';
    }
}
