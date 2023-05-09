package com.explme.controller;

import com.explme.util.I18nUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class FirstUserController {

    private final HttpServletRequest request;

    @GetMapping("/i18n")
    public String i18n() {
        String lang = request.getHeader("lang");
        System.out.println(lang);
        String message1 = I18nUtil.getMessage("A00001", request.getHeader("lang"));
        String message2 = I18nUtil.getMessage("A00002", request.getHeader("lang"));
        return message1 + message2;
    }
}
