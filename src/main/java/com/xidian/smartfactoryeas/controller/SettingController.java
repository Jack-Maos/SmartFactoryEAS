package com.xidian.smartfactoryeas.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xidian.smartfactoryeas.entity.Setting;
import com.xidian.smartfactoryeas.service.SettingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/setting")
public class SettingController {

    @Resource
    private SettingService settingService;

    @PostMapping("/query")
    @ResponseBody
    public Setting query(){
        return settingService.settingQuery();
    }

    @PostMapping("/update")
    @ResponseBody
    public Setting update(@RequestBody String json){
        JSONObject jsonObject = JSON.parseObject(json);
        String newthreshold = jsonObject.getString("newthreshold");
        return settingService.settingUpdate(newthreshold);
    }

}
