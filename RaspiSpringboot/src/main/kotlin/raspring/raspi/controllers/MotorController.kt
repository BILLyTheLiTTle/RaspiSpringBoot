package raspring.raspi.controllers

import com.pi4j.io.gpio.*

class MotorController{
    fun startMotor(){
        val gpio = GpioFactory.getInstance();
        val pin4 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "Pin4")
        val pin7 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_07, "Pin7")

        pin4.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);
        pin7.setShutdownOptions(true, PinState.LOW, PinPullResistance.OFF);

        System.out.println("rotate motor clockwise for 6 seconds")
        pin4.high()
        pin7.high()
        Thread.sleep(6000)
        // stop motor
        System.out.println("Stopping motor")
        pin4.low()
        pin7.low()
        gpio.shutdown()
        System.out.println("Stopped motor: ${gpio.isShutdown}")

        System.out.println("Setting to null")

        System.out.println("Set to null")
    }
}

