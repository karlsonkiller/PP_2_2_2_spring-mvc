package web.dao;

import web.controller.Cars;

import java.util.List;

public interface Dao {
    List<Cars> getCars();
    List<Cars> getCars(Integer count);
}
