package com.neusoft.bsp.common.base;

import org.springframework.stereotype.Component;

import java.io.Serializable;

public interface BaseEntity<E extends Serializable> extends Serializable {
    E getId();
}
