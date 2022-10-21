package liga.medical.service;

import liga.medical.model.QueueNames;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbitQueuesListener {

    @RabbitListener(queues = QueueNames.DAILY_QUEUE_NAME)
    public void listenDailyQueue(String message) {
        System.out.println(String.format("Сообщение %s получено из очереди %s .", message, QueueNames.DAILY_QUEUE_NAME));
    }

    @RabbitListener(queues = QueueNames.ALERT_QUEUE_NAME)
    public void listenAlertQueue(String message) {
        System.out.println(String.format("Сообщение %s получено из очереди %s .", message, QueueNames.ALERT_QUEUE_NAME));
    }

    @RabbitListener(queues = QueueNames.ERROR_QUEUE_NAME)
    public void listenErrorQueue(String message) {
        System.out.println(String.format("Сообщение %s получено из очереди %s .", message, QueueNames.ERROR_QUEUE_NAME));
    }
}
