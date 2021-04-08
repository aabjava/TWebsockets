package com.test

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller



class Websocket2Controller {


    @MessageMapping("requestcontroller2")
    @SendTo("/topic/replycontroller2")
    protected String reply(String text){
        log.debug("Received message controller2 = ${text} ")
        return "This is a websocket controller 2 your string = ${text}"
    }
}
