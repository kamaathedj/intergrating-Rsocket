package com.example.CustomerProfile.model;


import org.springframework.data.annotation.Id;

public record Profile(@Id Integer id ,int amount ,String hobby,String gender){}
