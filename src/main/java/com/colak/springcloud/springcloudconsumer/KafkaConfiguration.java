package com.colak.springcloud.springcloudconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class KafkaConfiguration {
    @Bean
    public Consumer<String> fizzBuzzConsumer(){
        return (value) -> log.info("Consumer Received : " + value);
    }
}
