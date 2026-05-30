public class TestConnection {

    public static void main(String[] args) {

        if (DBConnection.connect() != null) {
            System.out.println("Connected!");
        } else {
            System.out.println("Connection Failed!");
        }
    }
}
