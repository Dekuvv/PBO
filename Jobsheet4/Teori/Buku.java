package Jobsheet4.Teori;

public class Buku {
    private String judul;
    private String penulis;
    private String isbn;

    public Buku(String judul, String penulis, String isbn) {
        this.judul = judul;
        this.penulis = penulis;
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getIsbn() {
        return isbn;
    }

    public void infoBuku() {
        System.out.println("Buku: " + judul + " oleh " + penulis + " (ISBN: " + isbn + ")");
    }
}