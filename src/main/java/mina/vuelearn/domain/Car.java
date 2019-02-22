package mina.vuelearn.domain;

import java.io.Serializable;

/**
 * Book 实体类
 *
 * Created by bysocket on 27/09/2017.
 */
public class Car implements Serializable {

    private Long id;
    private String name;
    private String date;

    public Car(Long id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



}
