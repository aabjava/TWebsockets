package com.some

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller


@Controller
class WebsocketBean {

    @MessageMapping("requestcontroller")
    @SendTo("replycontroller")
    protected String reply(){
        return "This is a websocket reply"
    }

}
