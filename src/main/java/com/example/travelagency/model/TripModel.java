package com.example.travelagency.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
@Getter
@Setter
@ToString
public class TripModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private Long duration;
    private Integer numberOfPlaces;
    private boolean isPromoted;
    private Double priceForAdult;
    private Double priceForChild;

    @Enumerated(EnumType.STRING)
    private FoodOption foodOption;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private AirportModel airportFrom;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private AirportModel airportTo;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private HotelModel hotel;


}
