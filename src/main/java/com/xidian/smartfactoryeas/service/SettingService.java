package com.xidian.smartfactoryeas.service;


import com.xidian.smartfactoryeas.entity.Setting;


public interface SettingService {

    public Setting settingQuery();

    public Setting settingUpdate(String newthreshold);

}
