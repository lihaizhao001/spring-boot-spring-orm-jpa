package me.lhz.service.impl;

import me.lhz.bo.TTest;
import me.lhz.dao.TTestDao;
import me.lhz.service.ITTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TTestServiceImpl implements ITTestService {

    @Autowired
    private TTestDao tTestDao;

    @Override
    public List<TTest> list() {
        return tTestDao.findAll();
    }

    @Override
    public void save(TTest tTest) {
        tTestDao.save(tTest);
    }
}
