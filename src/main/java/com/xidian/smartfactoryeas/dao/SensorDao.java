package com.xidian.smartfactoryeas.dao;

import com.xidian.smartfactoryeas.entity.Sensor;

import java.util.List;

public interface SensorDao {

    public Sensor querySensor();//查询最新1条数据

    public List<Sensor> query10Sensor();//查询最新10条数据

}
