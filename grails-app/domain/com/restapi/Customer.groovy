package com.restapi

import grails.rest.Resource


//@Resource(uri = "/customers", formats = ["json"])
class Customer {

    String name
    Integer age
    static constraints = {
    }
}
