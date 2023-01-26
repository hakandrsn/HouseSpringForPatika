package com.hakandursun.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Log4j2
public class Build {
    private int id;
    private String name;
    private int price;
    private String type;
    private int m2;
    private int roomCount;
    private int saloonCount;

}
