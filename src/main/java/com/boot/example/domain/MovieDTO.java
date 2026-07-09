package com.boot.example.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MovieDTO {
    private int movieId;
    private String title;
    private String director;
    private String genre;
    private int gallery;
}
