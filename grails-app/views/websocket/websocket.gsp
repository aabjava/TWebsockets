<!doctype html>
<html>
<head>

    <title>Test flip button</title>

 %{--   <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/@stomp/stompjs@5.0.0/bundles/stomp.umd.js"></script>--}%
    <asset:javascript src="/jquery-3.3.1.min.js"/>
    <asset:javascript src="spring-websocket"/>
</head>
<body>


<script type="text/javascript">
    $(function() {
        var socket = new SockJS("${createLink(uri: '/stomp')}");
        var client = Stomp.over(socket);

        client.connect({}, function() {
            console.debug("Connected ")
            client.subscribe("/topic/replycontroller", function(message) {
                console.debug("Message from controller =",message)
                $("#helloDiv").append(message.body);
            });
            client.subscribe("/topic/replycontroller2", function(message) {
                console.debug("Message from controller 2 =",message)
                $("#helloDiv").append(message.body);
            });



            client.send("/app/requestcontroller",{},"Hello controller ");
            client.send("/app/requestcontroller2",{},"Hello controller 2");


        });




    });
</script>

</body>
</html>
