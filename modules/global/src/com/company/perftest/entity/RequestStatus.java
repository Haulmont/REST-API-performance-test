/*
 * Copyright (c) 2015 perftest
 */
package com.company.perftest.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

/**
 * @author degtyarjov
 */
public enum RequestStatus implements EnumClass<Integer>{

    NEW(100),
    IN_PROGRESS(200),
    CANCELLED(300),
    FINISHED(400);

    private Integer id;

    RequestStatus (Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    public static RequestStatus fromId(Integer id) {
        for (RequestStatus at : RequestStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}