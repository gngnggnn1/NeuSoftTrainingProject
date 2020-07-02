package com.neusoft.bsp.controller;

import com.neusoft.bsp.common.base.BaseController;
import com.neusoft.bsp.common.base.BaseModelJson;
import com.neusoft.bsp.mvoinfor.entity.ManManufacturer;
import com.neusoft.bsp.mvoinfor.service.ManManufacturerService;
import com.neusoft.bsp.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/manManufacturer")
public class ManManufacturerController extends BaseController {

    @Autowired
    ManManufacturerService manManufacturerService;

    @RequestMapping("/getMVOReturnInfo")//获得当前登陆用户(MVO)的ID并且查询对应的(man_manufacturer)公司信息
    public BaseModelJson<ManManufacturer> getMVOReturnInfo(@RequestBody User user){//前端传来的当前User信息
        int man_id = user.getMan_buyer_id();
        BaseModelJson<ManManufacturer> result = new BaseModelJson();

        result.data = manManufacturerService.findInfoByMVO(man_id);
        result.code = 200;

        System.out.println(result.data.toString());

        return result;//前端去判断result.data是不是为null

    }





}
