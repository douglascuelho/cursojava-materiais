package com.sankhya.soulcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {
    @GetMapping("/")
    public String mensagem(){
        return "Bora Codar!";
    }
}