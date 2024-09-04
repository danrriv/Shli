package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "url")
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String originalUrl;

    @Column(nullable = false)
    private String shortUrl;

    @Column
    private Long timesUsed = 0L;

    @Column(nullable = false)
    private Boolean willExpire; //Determina si va expirar o no

    @Column(nullable = false)
    private Boolean isLimitedUse; //Si será de usos limitados
   
    @Column(nullable = false)
    private Integer maxUses; //Usos máximos

    @Column
    private Integer currentUses = 0;
    
}
