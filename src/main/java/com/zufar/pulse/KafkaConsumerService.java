package com.zufar.pulse;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumerService {

    /**
     * Метод для обработки входящих сообщений из Kafka.
     * Название топика и идентификатор группы берутся из конфигурационного файла (application.yml).
     *
     * @param message полученное сообщение
     */
    @KafkaListener(topics = "${kafka.topic}", groupId = "${spring.kafka.consumer.group-id}")
    public void consumeMessage(String message) {
        try {
            log.info("Получено сообщение: {}", message);
            // Здесь можно добавить дополнительную логику обработки, например, парсинг JSON и сохранение метрик
        } catch (Exception e) {
            log.error("Ошибка при обработке сообщения: {}", message, e);
        }
    }
}
