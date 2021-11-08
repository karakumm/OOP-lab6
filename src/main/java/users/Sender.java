package users;

import static users.UserID.generate;

public class Sender implements User {
    private int id;

    public Sender() {
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
