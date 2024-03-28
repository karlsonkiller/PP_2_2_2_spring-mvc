package web.service;

import web.controller.Cars;
import java.util.List;

public interface Service {
    List<Cars> getCars(Integer count);
    List<Cars> getCars();
}
