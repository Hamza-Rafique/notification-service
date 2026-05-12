package com.hamza.notification_service.service;

import com.hamza.notification_service.dto.NotificationRequest;
import org.springframework.stereotype.Service;

import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;

@Service
public class SnsNotificationService {

    private final SnsClient snsClient = SnsClient.create();

    public String sendNotification(NotificationRequest request) {

        String finalMessage =
                "Priority: " + request.getPriority()
                        + "\nMessage: " + request.getMessage();

        if ("SMS".equalsIgnoreCase(request.getType())) {

            PublishRequest publishRequest = PublishRequest.builder()
                    .phoneNumber(request.getPhoneNumber())
                    .message(finalMessage)
                    .build();

            snsClient.publish(publishRequest);

            return "SMS Notification Sent";
        }

        return "Unsupported Notification Type";
    }
}