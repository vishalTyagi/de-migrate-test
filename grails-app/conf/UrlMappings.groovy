class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?" {
            constraints {
                // apply constraints here
            }
        }

        "/v1/customrers"(resources: "customer", namespace: "v1")
        "/v1/test"(resources: 'test', namespace: 'v1')
        "/v1/signUp"(controller: 'test', namespace: 'v1', action: 'signUp')
        "/"(view: "/index")
        "500"(view: '/error')
    }
}
