package com.hamza.notification_service.controller;

import com.hamza.notification_service.dto.NotificationRequest;
import com.hamza.notification_service.service.SnsNotificationService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    private final SnsNotificationService snsService;

    public NotificationController(SnsNotificationService snsService) {
        this.snsService = snsService;
    }

    @PostMapping
    public String sendNotification(
            @RequestBody NotificationRequest request) {

        return snsService.sendNotification(request);
    }
}