package com.hakandursun.webApi;


import com.hakandursun.business.BuildService;
import com.hakandursun.entities.Build;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class BuildController {


    @Autowired
    private BuildService buildService;

    @GetMapping("/buildPrice/{type}")
    @ResponseBody
    public String getPriceWithType(@PathVariable String type) {
        if (Objects.equals(type, "all")) {
            return buildService.getTotalPrice();
        } else {
            return buildService.getPriceWithType(type);
        }
    }

    @GetMapping("/buildm2/{type}")
    @ResponseBody
    public String getAverageM2WithType(@PathVariable String type) {
        if (Objects.equals(type, "all")) {
            return buildService.getAverageM2();
        } else {
            return buildService.getAverageM2WithType(type);
        }
    }

    @GetMapping("/buildCount/{roomCount}/{saloonCount}")
    @ResponseBody
    public List<Build> getBuildsWithCount(@PathVariable int roomCount, @PathVariable int saloonCount) {
        return buildService.getBuildsWithCount(roomCount, saloonCount);
    }
}
