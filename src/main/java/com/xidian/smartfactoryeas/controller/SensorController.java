package com.xidian.smartfactoryeas.controller;

import com.xidian.smartfactoryeas.entity.Sensor;
import com.xidian.smartfactoryeas.service.SensorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/sensor")
public class SensorController {

    @Resource
    private SensorService sensorService;

    @PostMapping("/query")
    @ResponseBody
    public Sensor query(){
        return sensorService.sensorQuery();
    }

    @PostMapping("/query10")
    @ResponseBody
    public List<Sensor> query10(){
        return sensorService.sensorQuery10();
    }

}
