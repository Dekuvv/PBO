public class User extends UserProfile {
    public User(int user_id, String password, String name, int age, String email, String doc) {
        super(user_id, password, name, age, email, doc);
    }

    public void logIn(int user_id, String password) {
        if (this.user_id == user_id && this.password.equals(password)) {
            System.out.println("Login berhasil.");
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    public void recoverPassword() {
        System.out.println("Tautan pemulihan telah dikirim ke email: " + email);
    }

    public void logOut() {
        System.out.println("Pengguna berhasil keluar.");
    }
}
