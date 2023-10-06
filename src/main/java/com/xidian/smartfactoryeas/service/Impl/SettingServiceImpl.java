package com.xidian.smartfactoryeas.service.Impl;

import com.xidian.smartfactoryeas.dao.SettingDao;
import com.xidian.smartfactoryeas.entity.Setting;
import com.xidian.smartfactoryeas.service.SettingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SettingServiceImpl implements SettingService{

    @Resource
    private SettingDao settingDao;

    @Override
    public Setting settingQuery(){
        return settingDao.querySetting();
    }

    @Override
    public Setting settingUpdate(String newthreshold){
        int i = settingDao.updateSetting(newthreshold);
        if(i>0){
            return settingDao.querySetting();
        }else{
            return null;
        }
    }

}
