package raspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RaspiSpringbootApplication

fun main(args: Array<String>) {
    runApplication<RaspiSpringbootApplication>(*args)
}
