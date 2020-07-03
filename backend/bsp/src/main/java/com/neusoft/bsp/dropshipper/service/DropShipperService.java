package com.neusoft.bsp.dropshipper.service;

import org.springframework.stereotype.Service;

//@Service
public interface DropShipperService {
    String getDropShipperName(String DSR_ID);
    String getDropShipperRemark(String DSR_ID);
    void updateDropShipperName(String DSR_ID, String newName);
    void updateRemark(String DSR_ID, String newRemark);
}
