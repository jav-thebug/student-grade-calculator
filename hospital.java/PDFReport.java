abstract class Prescription {
    protected MessageSender messageSender;
    
    protected Prescription(MessageSender messageSender) {
        this.messageSender = messageSender;
    }
    
    public abstract void send();
}