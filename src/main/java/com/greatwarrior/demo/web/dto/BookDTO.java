package com.greatwarrior.demo.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class BookDTO {
    private final String title;
    private final String author;
}
