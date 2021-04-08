package com.test

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller



class Websocket2Controller {


    @MessageMapping("requestcontroller2")
    @SendTo("replycontroller2")
    protected String reply(){
        return "This is a websocket reply2"
    }
}
