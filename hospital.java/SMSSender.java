class SMSSender implements MessageSender {
    
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending SMS to: " + recipient);
        System.out.println("Message: " + message + "\n");
    }
}