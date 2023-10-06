package com.xidian.smartfactoryeas.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sensor {

    private int sensorid;
    private double wendu;
    private double shidu;
    private int qiwei;
    private LocalDateTime redate;

}
