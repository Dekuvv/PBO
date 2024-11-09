public class Customer extends User {
    private boolean verification_status = false;

    public Customer(int user_id, String password, String name, int age, String email, String doc) {
        super(user_id, password, name, age, email, doc);
    }

    public boolean getVerificationStatus() {
        return verification_status;
    }

    public void applyVerification(String doc) {
        this.doc = doc;
        System.out.println("Verifikasi diajukan dengan dokumen: " + doc);
        this.verification_status = true;
    }
}
