package twebsockets2

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/websocket/websocket")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
