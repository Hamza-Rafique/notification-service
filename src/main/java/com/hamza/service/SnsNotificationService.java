package com.hamza.notification_service.service;

import com.hamza.notification_service.dto.NotificationRequest;

import org.springframework.stereotype.Service;

import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;

@Service
public class SnsNotificationService {

    private final SnsClient snsClient = SnsClient.create();

    private final String TOPIC_ARN =
            "arn:aws:sns:us-east-1:124447100863:notification-topic";

    public String sendNotification(NotificationRequest request) {

        String finalMessage =
                "Priority: " + request.getPriority()
                + "\nMessage: " + request.getMessage();

        PublishRequest publishRequest =
                PublishRequest.builder()
                        .topicArn(TOPIC_ARN)
                        .message(finalMessage)
                        .subject("Spring Boot AWS Notification")
                        .build();

        snsClient.publish(publishRequest);

        return "Email Notification Sent Successfully";
    }
}