package users;

public class UserID {
    static int id = 0;
    public static int generate() {
        return id += 1;
    }
}
