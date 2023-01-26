package com.hakandursun;

import com.hakandursun.dto.BuildRepository;
import com.hakandursun.entities.Build;
import com.hakandursun.webApi.BuildController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
})
public class HouseApplication {
    BuildRepository buildRepository;
    public HouseApplication(BuildRepository buildRepository) {
        this.buildRepository = buildRepository;
        System.out.println("Tüm konutların toplam fiyatını dönen fonksiyon"+"\n"+ buildRepository.getTotalPrice());
        System.out.println("Belirli tipdeki konutların toplam fiyatını dönen fonksiyon"+"\n"+ buildRepository.getPriceWithType("house"));
        System.out.println("Belirli konutların ortalama metre karesini dönen fonksiyon"+"\n"+ buildRepository.getAverageM2WithType("villa"));
        System.out.println("Tüm konutların ortalama metre karesini dönen fonksiyon"+"\n"+ buildRepository.getAverageM2());
        System.out.println("4 oda 2 salona sahip konutlar : " +"\n"+ buildRepository.getBuildsWithCount(4,2));
    }


    public static void main(String[] args) {
        SpringApplication.run(HouseApplication.class, args);


    }

}
