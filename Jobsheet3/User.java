package Jobsheet3;

public class User {
    public String username;
    public String nama;
    public String email;
    public String alamat;
    public String pekerjaan;

    public User(String username, String Nama, String email){
        this.username = username;
        this.nama = Nama;
        this.email = email;
    }

    public void cetakInfo(){
        System.out.println("Username: " + username);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pekerjaan: " + pekerjaan);
    }
}
