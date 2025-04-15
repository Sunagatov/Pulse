package com.zufar.pulse;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumerService {

    /**
     * Метод для обработки входящих сообщений из Kafka.
     * Название топика и идентификатор группы берутся из конфигурационного файла (application.yml).
     *
     * @param message полученное сообщение
     */
    @KafkaListener(topics = "${app.kafka.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeMessage(String message) {
        // Здесь можно добавить логику обработки полученного сообщения.
        System.out.println("Получено сообщение: " + message);
    }
}

