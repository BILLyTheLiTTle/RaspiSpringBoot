package raspring.raspi.controllers

import com.pi4j.io.gpio.GpioController
import com.pi4j.io.gpio.GpioFactory
import com.pi4j.io.gpio.GpioPinDigitalOutput
import com.pi4j.io.gpio.RaspiPin

class MotorController{
    fun startMotor(){
        val gpio = GpioFactory.getInstance();
        val pin8 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_08, "Pin8");
        System.out.println("rotate motor clockwise for 3 seconds");
        pin8.high();
        Thread.sleep(6000);
        // stop motor
        System.out.println("Stopping motor");
        pin8.low();
        gpio.shutdown();
    }
}

