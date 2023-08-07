package automation;

public class AmazonTests {

    public static void main(String[] args) {
        DriverManager manager = new DriverManager();
        try {
            manager.setUpChrome();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        manager.headerMenuTest();


    }
}
