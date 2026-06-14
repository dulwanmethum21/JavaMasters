package greenloop.model;

public class Notification {
    private String notificationId;
    private String receiverEmail;
    private String message;
    private String type;

    public Notification(String notificationId, String receiverEmail, String message, String type) {
        this.notificationId = notificationId;
        this.receiverEmail = receiverEmail;
        this.message = message;
        this.type = type;
    }

    public String getNotificationId() { return notificationId; }
    public String getReceiverEmail() { return receiverEmail; }
    public String getMessage() { return message; }
    public String getType() { return type; }
}