package com.company.web.springdemo.repositories;

import com.company.web.springdemo.models.Beer;

import java.util.List;

public interface BeerRepository {

    List<Beer> getBeer(String name, Double minAbv, Double maxAbv, Integer styleId, String sortBy, String sortOrder);

    Beer getBeer(int id);

    Beer getBeer(String name);

    void create(Beer beer);

    void update(Beer beer);

    void delete(int id);

}
