package com.example.url_shortener.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class UrlMapping  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String originalUrl;
    private String shortUrl;
    private int clickcount=0;
    private LocalDateTime createdDate;
    @ManyToOne //Many URL mappings can belong to a single user
    @JoinColumn(name="user_id")
    private User user;
    @OneToMany(mappedBy = "urlMapping")
    private List<ClickEvent> clickEvents;
}
