package mina.vuelearn.web;


import mina.vuelearn.domain.Car;
import mina.vuelearn.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Book 控制层
 *
 * Created by bysocket on 27/09/2017.
 */
@RestController
@RequestMapping(value = "/car")
public class CarController {

    @Autowired
    CarService carService;

    /**
     * 获取 Book 列表
     * 处理 "/book" 的 GET 请求，用来获取 Book 列表
     */
    @RequestMapping(method = RequestMethod.GET)
    public List<Car> getBookList() {
        return carService.findAll();
    }

    /**
     * 获取 Book
     * 处理 "/book/{id}" 的 GET 请求，用来获取 Book 信息
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Car getCar(@PathVariable Long id) {
        return carService.findById(id);
    }

    /**
     * 创建 Book
     * 处理 "/book/create" 的 POST 请求，用来新建 Book 信息
     * 通过 @RequestBody 绑定实体参数，也通过 @RequestParam 传递参数
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Car postCar(@RequestBody Car car) {
        return carService.insertByCar(car);
    }

    /**
     * 更新 Book
     * 处理 "/update" 的 PUT 请求，用来更新 Book 信息
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Car putBook(@RequestBody Car car) {
        return carService.update(car);
    }

    /**
     * 删除 Book
     * 处理 "/book/{id}" 的 GET 请求，用来删除 Book 信息
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public Car deleteBook(@PathVariable Long id) {
        return carService.delete(id);
    }

}
