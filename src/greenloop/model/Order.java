package greenloop.model;

public class Order {
    private String orderId;
    private String clientId;
    private String productId;
    private int quantity;
    private double totalAmount;
    private String assignedAgentId;
    private String status;

    public Order(String orderId, String clientId, String productId, int quantity, double totalAmount) {
        this.orderId = orderId;
        this.clientId = clientId;
        this.productId = productId;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.assignedAgentId = "Not Assigned";
        this.status = "Pending";
    }

    public String getOrderId() { return orderId; }
    public String getClientId() { return clientId; }
    public String getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getTotalAmount() { return totalAmount; }
    public String getAssignedAgentId() { return assignedAgentId; }
    public String getStatus() { return status; }

    public void setAssignedAgentId(String assignedAgentId) { this.assignedAgentId = assignedAgentId; }
    public void setStatus(String status) { this.status = status; }
}