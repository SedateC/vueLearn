package mina.vuelearn.service;

import mina.vuelearn.domain.Car;

import java.util.List;

/**
 * Book 业务接口层
 *
 * Created by bysocket on 27/09/2017.
 */
public interface CarService {
    /**
     * 获取所有 Book
     */
    List<Car> findAll();

    /**
     * 新增 Car
     *
     * @param car {@link Car}
     */
    Car insertByCar(Car car);

    /**
     * 更新 Book
     *
     * @param car {@link Car}
     */
    Car update(Car car);

    /**
     * 删除 Book
     *
     * @param id 编号
     */
    Car delete(Long id);

    /**
     * 获取 Book
     *
     * @param id 编号
     */
    Car findById(Long id);
}
