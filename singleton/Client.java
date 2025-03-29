package singleton;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        db1.connect();
        db2.connect();

        System.out.println("db1 and db2 are same: " + (db1 == db2));
    }
}
