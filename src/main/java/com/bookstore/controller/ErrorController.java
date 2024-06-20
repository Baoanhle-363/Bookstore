package com.bookstore.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ErrorController {
    @GetMapping("/403")
    public String accessDenied () {
        return "error/403";
    }
}
