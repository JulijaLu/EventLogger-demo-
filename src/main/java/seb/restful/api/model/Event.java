package seb.restful.api.model;

import java.time.LocalDateTime;

public class Event {

    public enum Type {
        DEBUG, INFO, WARNING, ERROR
    }

    private int id;
    private LocalDateTime timeStamp;
    private Type type;
    private String message;
    private String userId;
    private String transactionId;

    public Event(
            int id, Type type, String message, String userId, String transactionId
    ) {
        this.id = id;
        this.timeStamp = timeStamp.now();
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

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
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
