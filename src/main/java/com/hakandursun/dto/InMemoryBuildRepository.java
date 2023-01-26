package com.hakandursun.dto;


import com.hakandursun.entities.Build;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBuildRepository implements BuildRepository {
    List<Build> builds;

    public InMemoryBuildRepository() {
        builds = new ArrayList<>();
        builds.add(new Build(1, "Güzel Ev", 1000000, "house", 100, 3, 1));
        builds.add(new Build(2, "Taşra Ev", 550000, "house", 70, 2, 1));
        builds.add(new Build(3, "Eski Ev", 400200, "house", 120, 4, 1));
        builds.add(new Build(4, "başlangıç villası", 3500000, "villa", 190, 4, 2));
        builds.add(new Build(5, "orta villası", 5500000, "villa", 250, 5, 2));
        builds.add(new Build(6, "lüks villası", 7500000, "villa", 300, 6, 2));
        builds.add(new Build(7, "birinci sınıf yazlık", 14000400, "resort", 240, 6, 2));
        builds.add(new Build(8, "orta sınıf yazlık", 1000000, "resort", 200, 5, 2));
        builds.add(new Build(9, "orta sınıf yazlık", 800000, "resort", 180, 4, 2));
        builds.add(new Build(10, "lüks sınıf yazlık", 60000000, "resort", 460, 10, 2));
    }

    @Override
    public String getPriceWithType(String type) {
       int totalPrice = 0;
        for (Build build : builds) {
            if (build.getType().equals(type)) {
                totalPrice += build.getPrice();
            }
        }

        return type+" tipindeki konutların toplam fiyatı : " +totalPrice;

    }

    @Override
    public String getTotalPrice() {
        int totalPrice = 0;
        for (Build build : builds) {
            totalPrice += build.getPrice();
        }
        return "Toplam fiyat : " +totalPrice;
    }

    @Override
    public String getAverageM2WithType(String type) {
        int totalM2 = 0;
        int count = 0;
        for (Build build : builds) {
            if (build.getType().equals(type)) {
                totalM2 += build.getM2();
                count++;
            }
        }
        return type+" tipindeki konutların ortalama m2'si : " +totalM2/count;
    }

    @Override
    public String getAverageM2() {
        int totalM2 = 0;
        int count = 0;
        for (Build build : builds) {
            totalM2 += build.getM2();
            count++;
        }
        return "Bütün konutların artalama metre karesi : " +totalM2/count;
    }

    @Override
    public List<Build> getBuildsWithCount(int roomCount, int saloonCount) {
        List<Build> buildList = new ArrayList<>();
        for (Build build : builds) {
            if (build.getRoomCount() == roomCount && build.getSaloonCount() == saloonCount) {
                buildList.add(build);
            }
        }
        return buildList;
    }
}
