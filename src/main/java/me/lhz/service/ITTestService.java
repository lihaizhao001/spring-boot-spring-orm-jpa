package me.lhz.service;

import me.lhz.bo.TTest;

import java.util.List;

public interface ITTestService {
    List<TTest> list();

    void save(TTest tTest);
}
