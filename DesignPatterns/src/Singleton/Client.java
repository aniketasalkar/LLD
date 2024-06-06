package Singleton;

public class Client {
    public static void main(String[] args) {
        DBconnector dBconnector = DBconnector.getInstance();

        dBconnector.connectToDB();

        //this will have same instance as dBconnector
        DBconnector dbConnectorNew = DBconnector.getInstance();
        dBconnector.connectToDB();
    }
}
