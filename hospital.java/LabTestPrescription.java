class LabTestPrescription extends Prescription {
    
    private String patientName;
    private String testName;
    
    public LabTestPrescription(String patientName, String testName, 
                               MessageSender messageSender) {
        super(messageSender);
        this.patientName = patientName;
        this.testName = testName;
    }
    
    @Override
    public void send() {
        String message = "Dear " + patientName + 
                        ", Please get " + testName + " test done.";
        ((MessageSender) messageSender).sendMessage(message, patientName);
    }
}