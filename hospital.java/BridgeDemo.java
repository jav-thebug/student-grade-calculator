public class BridgeDemo {
    public static void main(String[] args) {
        
        // Send medicine prescription via SMS
        Prescription prescription1 = new MedicinePrescription(
            "Ahmed Ali", "Panadol 500mg", new SMSSender()
        );
        prescription1.send();
        
        // Send lab test prescription via Email
        Prescription prescription2 = new LabTestPrescription(
            "Sara Khan", "Blood Test", new EmailSender()
        );
        prescription2.send();
        
        // Send medicine prescription via Email
        Prescription prescription3 = new MedicinePrescription(
            "Bilal Ahmed", "Aspirin 100mg", new EmailSender()
        );
        prescription3.send();
    }
}