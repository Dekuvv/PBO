public class UserProfile {
    protected int user_id;
    protected String password;
    protected String name;
    protected int age;
    protected String email;
    protected String doc;

    public UserProfile(int user_id, String password, String name, int age, String email, String doc) {
        this.user_id = user_id;
        this.password = password;
        this.name = name;
        this.age = age;
        this.email = email;
        this.doc = doc;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void editProfile(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        System.out.println("Profile updated successfully.");
    }

    public void showDocuments() {
        System.out.println("Documents: " + doc);
    }
}
