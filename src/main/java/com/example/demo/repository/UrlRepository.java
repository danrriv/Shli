package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Url;

public interface UrlRepository extends JpaRepository <Url, Long> {

}
