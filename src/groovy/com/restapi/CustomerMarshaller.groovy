package com.restapi

import grails.converters.JSON

import javax.annotation.PostConstruct

/**
 * Created by intelligrape on 25/7/15.
 */
class CustomerMarshaller {
    @PostConstruct
    void registerMarshallers() {
        JSON.registerObjectMarshaller(Customer) {
            def map = [:]
//            Map map1 = [:]
            map['fullname'] = it.age
            map['age'] = it.name
            return map
        }
    }
}
