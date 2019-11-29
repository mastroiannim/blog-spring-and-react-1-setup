package com.andrew_flower.demo.springandreact.controller;

import com.andrew_flower.demo.springandreact.model.Me;

import org.springframework.web.bind.MissingRequestCookieException;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/me")
public class MeController {

    @GetMapping
    public Me readCookie(@CookieValue(value = "username") final String username) {
        Me m = new Me();
        m.setName(username);
        return m;
    }

    @ExceptionHandler(MissingRequestCookieException.class)
    public Me noCookie() {
        Me m = new Me();
        return m;
    }
}

