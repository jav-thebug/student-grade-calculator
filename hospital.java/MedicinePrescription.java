class MedicinePrescription extends Prescription {
    
    private String patientName;
    private String medicine;
    private MessageSender messageSender;
    
    public MedicinePrescription(String patientName, String medicine, 
                                MessageSender messageSender) {
        super(messageSender);
        this.patientName = patientName;
        this.medicine = medicine;
        this.messageSender = messageSender;
    }
    
    @Override
    public void send() {
        String message = "Dear " + patientName + 
                        ", Your medicine: " + medicine;
        messageSender.sendMessage(message, patientName);
    }
}