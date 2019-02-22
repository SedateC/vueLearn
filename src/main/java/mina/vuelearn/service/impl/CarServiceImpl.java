package mina.vuelearn.service.impl;

import mina.vuelearn.domain.Car;
import mina.vuelearn.service.CarService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Book 业务层实现
 *
 * Created by bysocket on 27/09/2017.
 */
@Service
public class CarServiceImpl implements CarService {

    // 模拟数据库，存储 Book 信息
    // 第五章《﻿数据存储》会替换成 MySQL 存储
    private static Map<Long, Car> CAR_DB = new HashMap<>();
    public CarServiceImpl(){
        CAR_DB.put(1l,new Car(1l,"宝马",new Date().toString()));
        CAR_DB.put(2l,new Car(1l,"奔驰",new Date().toString()));
        CAR_DB.put(3l,new Car(1l,"奥迪",new Date().toString()));
    }
    @Override
    public List<Car> findAll() {
        return new ArrayList<>(CAR_DB.values());
    }

    @Override
    public Car insertByCar(Car car) {
        car.setId(CAR_DB.size() + 1L);
        CAR_DB.put(car.getId(), car);
        return car;
    }

    @Override
    public Car update(Car car) {
        CAR_DB.put(car.getId(), car);
        return car;
    }

    @Override
    public Car delete(Long id) {
        return CAR_DB.remove(id);
    }

    @Override
    public Car findById(Long id) {
        return CAR_DB.get(id);
    }
}
