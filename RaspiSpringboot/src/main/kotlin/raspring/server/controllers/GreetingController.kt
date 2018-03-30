package raspring.server.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import raspring.raspi.controllers.MotorController

@RestController
class GreetingController {



    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): String {

        val mc = MotorController()
        mc.startMotor()

        return "Hello, $name"
    }


    @GetMapping("/noname/greeting")
    fun noNameGreeting() = "Hello, Everybody"


    //@GetMapping("/led/greeting")
    //fun ledGreeting(@RequestParam(value = "name", defaultValue = "LED") name: String) =
        //"Hello, $name with a LED"

}