package site;

public abstract class User {

    private String email;

    public abstract int getRank();

    public User(String email) {
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " User{" +
                "email='" + email + '\'' +
                ", rank='" + getRank() + '\'' +
                '}';
    }
}
