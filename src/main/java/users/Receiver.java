package users;

import static users.UserID.generate;

public class Receiver implements User {
    private int id;

    public Receiver() {
        this.id = generate();
    }

    @Override
    public void update(String status) {
        System.out.println("Order status: " + status);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
