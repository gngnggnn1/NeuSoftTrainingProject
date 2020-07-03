package com.neusoft.bsp.controller;

import com.neusoft.bsp.common.base.BaseModelJson;
import com.neusoft.bsp.dropshipper.service.DropShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;

import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController

public class DropShipperController {

    @Autowired
    DropShipperService dropShipperService;

    @PostMapping("/getDropShipperName")
    public String getDropShipperName(@RequestBody Map<String,String> param){
        int code = 20000;
        String DSR_ID = param.get("dsrID");
        //System.out.println("DSRID: " + DSR_ID);
        List<HashMap> response = new LinkedList<>();
        HashMap<String, Object> responseMap = new HashMap<>();
        responseMap.put("dropShipperName", dropShipperService.getDropShipperName(DSR_ID));
        /*System.out.println("Name: " +  dropShipperService.getDropShipperName(DSR_ID));
        System.out.println("RESPONSEMAP: " + responseMap);*/
        response.add(responseMap);
        return JSON.toJSONString(new BaseModelJson<>(code,response));
    }

    @PostMapping("/getDropShipperRemark")
    public String getDropShipperRemark(@RequestBody Map<String,String> param){
        int code = 20000;
        String DSR_ID = param.get("dsrID");
        //System.out.println("DSRID: " + DSR_ID);
        List<HashMap> response = new LinkedList<>();
        HashMap<String, Object> responseMap = new HashMap<>();
        responseMap.put("dropShipperRemark", dropShipperService.getDropShipperRemark(DSR_ID));
        /*System.out.println("Name: " +  dropShipperService.getDropShipperName(DSR_ID));
        System.out.println("RESPONSEMAP: " + responseMap);*/
        response.add(responseMap);
        return JSON.toJSONString(new BaseModelJson<>(code,response));
    }

}
