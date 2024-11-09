public class Main {
    public static void main(String[] args) {
        // Membuat objek UserProfile
        UserProfile userProfile = new UserProfile(101, "userpass123", "Adit Bagus", 20, "Aditbagus@example.com", "userDoc.pdf");

        System.out.println("===== UserProfile =====");
        System.out.println("User ID: " + userProfile.getUser_id());
        System.out.println("Password: " + userProfile.getPassword());
        System.out.println("Name: " + userProfile.getName());
        System.out.println("Age: " + userProfile.getAge());
        System.out.println("Email: " + userProfile.getEmail());
        userProfile.editProfile("Adit Bagus", 20, "AditBagus@example.com");
        userProfile.showDocuments();

        // Membuat objek User
        User user = new User(102, "userpassword", "Vidi Josubzky", 20, "vidi@example.com", "userDoc2.pdf");

        System.out.println("\n===== User =====");
        System.out.println("User ID: " + user.getUser_id());
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Email: " + user.getEmail());
        user.logIn(102, "userpassword");
        user.recoverPassword();
        user.logOut();

        // Membuat objek Customer
        Customer customer = new Customer(103, "custpass123", "Ujung Satria", 20, "Kogg@example.com", "custDoc.png");

        System.out.println("\n===== Customer =====");
        System.out.println("User ID: " + customer.getUser_id());
        System.out.println("Name: " + customer.getName());
        System.out.println("Age: " + customer.getAge());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Verification Status: " + customer.getVerificationStatus());
        customer.applyVerification("verifiedDoc.pdf");
        System.out.println("Verification Status after apply: " + customer.getVerificationStatus());

        // Membuat objek Admin
        Admin admin = new Admin(104, "adminpass", "Ryan Ferdinan", 20, "Junet_gaming@example.com", "adminDoc.pdf");

        System.out.println("\n===== Admin =====");
        System.out.println("User ID: " + admin.getUser_id());
        System.out.println("Name: " + admin.getName());
        System.out.println("Age: " + admin.getAge());
        System.out.println("Email: " + admin.getEmail());
        admin.updateVehicleDetails(1234);
        admin.addVehicle("Ferarri");
        admin.retrieveComplain();
        admin.verifyUser(customer);
    }
}
