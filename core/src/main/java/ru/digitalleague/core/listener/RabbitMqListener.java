package ru.digitalleague.core.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
@Slf4j
@ConditionalOnBean(value = RabbitTemplate.class)
public class RabbitMqListener {

    /*@RabbitListener(queues = "")
    public void processRabbitMessage(String message) {
        log.info(" " + message);
    }*/
}
