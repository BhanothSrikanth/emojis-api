package com.example.emojis.model;

import jakarta.persistence.*;


@Entity
@Table(name = "emojis")
public class Emoji {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "symbol", nullable = false)
    private String symbol;

    @Column(name = "description")
    private String description;

    public Emoji() {
    }

    public Emoji(Long id, String symbol, String description) {
        this.id = id;
        this.symbol = symbol;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
