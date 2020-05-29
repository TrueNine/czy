package com.czy.study.workQueues;

import com.czy.MQUtil;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author chenzy
 * @since 2020-05-29
 * <p>
 * 一个生产者发消息给一个队列，多个消费者从队列接收消息
 * 多个消费者平均接收消息，不管消费者的消费能力的差异。轮询分发
 */
public class WorkQueueRecv {

    private static final String QUEUE_NAME = "hello.workQueue";
    private static final String EXCHANGE_NAME = "hello";

    public static void main(String[] args) {
        try {
            var con = MQUtil.getCon();
            var channel = con.createChannel();
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            channel.basicConsume(QUEUE_NAME, true, new DefaultConsumer(channel) {
                @Override
                public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                    String message = new String(body, "UTF-8");
                    System.out.println(" Received '" + message + "'");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
