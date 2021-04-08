package com.test

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller


@Controller
class WebsocketController {


    @MessageMapping("requestcontroller")
    @SendTo("/topic/replycontroller")
    protected String reply(String text){
        log.debug("Received message controller = ${text} ")
        return "This is a websocket controller your string = ${text}"
    }
}
