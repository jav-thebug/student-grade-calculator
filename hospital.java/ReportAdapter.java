class EmailSender implements MessageSender {
    
    @Override
    public void sendMessage(String message, String recipient) {
        System.out.println("Sending Email to: " + recipient);
        System.out.println("Message: " + message + "\n");
    }
}