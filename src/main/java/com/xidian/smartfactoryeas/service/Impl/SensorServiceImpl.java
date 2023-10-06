package com.xidian.smartfactoryeas.service.Impl;


import com.xidian.smartfactoryeas.dao.SensorDao;
import com.xidian.smartfactoryeas.entity.Sensor;
import com.xidian.smartfactoryeas.service.SensorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SensorServiceImpl implements SensorService{

    @Resource
    private SensorDao sensorDao;

    @Override
    public Sensor sensorQuery() {
        return sensorDao.querySensor();
    }

    @Override
    public List<Sensor> sensorQuery10(){
        return sensorDao.query10Sensor();
    }

}
