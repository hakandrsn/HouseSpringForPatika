package com.hakandursun.dto;

import com.hakandursun.entities.Build;
import org.springframework.stereotype.Repository;

import java.util.List;




public interface BuildRepository {
    String getPriceWithType(String type);
    String getTotalPrice();
    String getAverageM2WithType(String type);
    String getAverageM2();
    List<Build> getBuildsWithCount(int roomCount, int saloonCount);

}
