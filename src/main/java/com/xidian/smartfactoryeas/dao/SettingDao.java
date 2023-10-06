package com.xidian.smartfactoryeas.dao;

import com.xidian.smartfactoryeas.entity.Setting;

public interface SettingDao {

    public Setting querySetting();//查询阈值

    public int updateSetting(String newthreshold);//修改阈值

}
