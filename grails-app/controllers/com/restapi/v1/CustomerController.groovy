package com.restapi.v1

import com.restapi.Customer
import grails.rest.RestfulController

class CustomerController extends RestfulController<Customer> {
    static namespace = "v1"

    static responseFormats = ["json", "xml"]

    CustomerController() {
        super(Customer)
    }

    def index() {
        println "--------version 1--------"
        respond(Customer.list())
    }

}
