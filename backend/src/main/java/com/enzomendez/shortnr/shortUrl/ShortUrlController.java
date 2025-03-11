package com.enzomendez.shortnr.shortUrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/short-urls")
public class ShortUrlController {

    @GetMapping
    public String getShortUrls() {
        return "This is where all the short urls are!";
    }
}