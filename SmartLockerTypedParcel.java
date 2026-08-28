public class SmartLockerTypedParcel {
    public static void main(String[] args) {
        final double MIN_PARCEL_WEIGHT_KG = 0.1;
        final double MAX_PARCEL_WEIGHT_KG = 20.0;

        String parcelId = "P-1001";
        String recipientName = "Ravi Kumar";
        char sizeCode = 'M';
        double weightKg = 2.75;
        boolean accepted = true;
        int intakeSequence = 1001;
        long receivedEpochSeconds = 1786406400L;

        System.out.println("=== Smart-Locker Typed Parcel ===");
        System.out.println("Parcel ID: " + parcelId);
        System.out.println("Recipient name: " + recipientName);
        System.out.println("Size code: " + sizeCode);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Accepted: " + accepted);
        System.out.println("Intake sequence: " + intakeSequence);
        System.out.println("Received epoch seconds: " + receivedEpochSeconds);
        System.out.println("Minimum parcel weight (kg): " + MIN_PARCEL_WEIGHT_KG);
        System.out.println("Maximum parcel weight (kg): " + MAX_PARCEL_WEIGHT_KG);
    }
}
