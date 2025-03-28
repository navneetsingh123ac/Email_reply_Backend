package com.ai_email_replier.email_reply.controller;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    private String tone;
}
