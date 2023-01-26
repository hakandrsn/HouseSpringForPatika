package com.hakandursun.business;


import com.hakandursun.dto.BuildRepository;
import com.hakandursun.entities.Build;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildManager implements BuildService {

    private BuildRepository buildRepository;

    public BuildManager(BuildRepository buildRepository){
        this.buildRepository = buildRepository;
    }
    @Override
    public String getPriceWithType(String type) {
        return buildRepository.getPriceWithType(type);
    }

    @Override
    public String getTotalPrice() {
        return buildRepository.getTotalPrice();
    }

    @Override
    public String getAverageM2WithType(String type) {
        return buildRepository.getAverageM2WithType(type);
    }

    @Override
    public String getAverageM2() {
        return buildRepository.getAverageM2();
    }

    @Override
    public List<Build> getBuildsWithCount(int roomCount, int saloonCount) {
        return buildRepository.getBuildsWithCount(roomCount, saloonCount);
    }
}
