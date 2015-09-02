package com.restapi.v2

import com.restapi.Customer
import grails.converters.JSON
import grails.rest.RestfulController

class CustomerController extends RestfulController<Customer> {
    static namespace = "v2"
    static responseFormats = ["json", "xml"]
    CustomerController() {
        super(Customer)
    }

    def index() {
        println "-----------version v2--------"
        respond Customer.list()
    }
}
