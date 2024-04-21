package models;

public class User {
    private String name;
    private String email;
    private String idNumber;

    // Constructors
    public User() {
    }

    public User(String name, String email, String idNumber) {
        this.name = name;
        this.email = email;
        this.idNumber = idNumber;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
