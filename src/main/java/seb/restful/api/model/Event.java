package seb.restful.api.model;

import java.time.LocalDateTime;

import seb.restful.api.model.enums.MessageType;

public class Event {

    private int id;
    private LocalDateTime time;
    private MessageType type;
    private String message;
    private String userId;
    private String transactionId;

    public Event(int id, LocalDateTime time, MessageType type,
    String message, String userId, String transactionId) {
        this.id = id;
        this.time = time;
        this.type = type;
        this.message = messageLengthValidator(message);
        this.userId = userId;
        this.transactionId = transactionId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String messageLengthValidator(String value) {
        if (value != null && value.length() >= 1024) {
            throw new IllegalArgumentException("Message format corrupted: cannot exceed 1024 symbols.");
        }
        return this.message = value;
    }
}
