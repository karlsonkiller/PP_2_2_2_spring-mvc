package web.service;

import web.controller.Cars;
import web.dao.CarsDao;

import java.util.List;

public class CarsServiseImpl implements Service {
    CarsDao carsDao = new CarsDao();

    @Override
    public List<Cars> getCars(Integer count) {
        return carsDao.getCars(count);
    }

    @Override
    public List<Cars> getCars() {
       return carsDao.getCars();
    }
}
