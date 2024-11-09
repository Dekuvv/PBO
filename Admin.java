public class Admin extends User {
    public Admin(int user_id, String password, String name, int age, String email, String doc) {
        super(user_id, password, name, age, email, doc);
    }

    public void updateVehicleDetails(int vehicle_id) {
        System.out.println("Detail kendaraan berhasil diperbarui untuk ID Kendaraan: " + vehicle_id);
    }

    public void addVehicle(String vehicle) {
        System.out.println("Kendaraan berhasil ditambahkan: " + vehicle);
    }

    public void retrieveComplain() {
        System.out.println("Keluhan berhasil diambil.");
    }

    public void verifyUser(Customer customer) {
        if (customer.getVerificationStatus()) {
            System.out.println("Pengguna telah terverifikasi.");
        } else {
            System.out.println("Pengguna belum terverifikasi.");
        }
    }
}
