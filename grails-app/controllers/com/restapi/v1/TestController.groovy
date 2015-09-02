package com.restapi.v1

class TestController {
    static namespace = "v1"

    static responseFormats = ["json", "xml"]

    def index() {
        println "------inside test index------"
        respond([success: true])
    }

    def signUp() {
        println "--------inside signup------"
        respond([name: "vishal"])
    }
}
