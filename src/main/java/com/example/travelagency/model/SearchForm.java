package com.example.travelagency.model;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class SearchForm {

    @Enumerated(EnumType.STRING)
    private String foodOption;
    private String continent;
    private String country;
    private Integer standard;

}
