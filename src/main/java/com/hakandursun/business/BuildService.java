package com.hakandursun.business;

import com.hakandursun.entities.Build;

import java.util.List;

public interface BuildService {
    String getPriceWithType(String type);
    String getTotalPrice();
    String getAverageM2WithType(String type);
    String getAverageM2();
    List<Build> getBuildsWithCount(int roomCount, int saloonCount);
}
