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

    //tipe göre fiyat döndürür
    @Override
    public String getPriceWithType(String type) {
        return buildRepository.getPriceWithType(type);
    }

    //tüm fiyatları döndürür
    @Override
    public String getTotalPrice() {
        return buildRepository.getTotalPrice();
    }

    //tipe göre m2 ortalaması döndürür
    @Override
    public String getAverageM2WithType(String type) {
        return buildRepository.getAverageM2WithType(type);
    }

    //tüm m2 ortalamalarını döndürür
    @Override
    public String getAverageM2() {
        return buildRepository.getAverageM2();
    }

    //oda ve salon sayısına göre binaların listesini döndürür
    @Override
    public List<Build> getBuildsWithCount(int roomCount, int saloonCount) {
        return buildRepository.getBuildsWithCount(roomCount, saloonCount);
    }
}
