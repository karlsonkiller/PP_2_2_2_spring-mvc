package web.dao;

import web.controller.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarsDao implements Dao {

    private final List<Cars> carList = new ArrayList<>();

    public CarsDao() {
        carList.add(new Cars("Volvo", 2, 2011));
        carList.add(new Cars("Bmw", 5, 2010));
        carList.add(new Cars("Opel", 3, 2015));
        carList.add(new Cars("Doge", 7, 2001));
        carList.add(new Cars("Lada", 9, 1996));
    }


    @Override
    public List<Cars> getCars() {
        return carList;
    }

    @Override
    public List<Cars> getCars(Integer count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
