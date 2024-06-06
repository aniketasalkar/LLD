package Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DBconnector {
    private static DBconnector instance;
    private static Lock lock = new ReentrantLock();
    private DBconnector(){
//        getInstance();
    }

    public static DBconnector getInstance() {

        // Considering Multiple threads entering initially
        if (instance == null) {
            lock.lock();
            if (instance == null){
                instance = new DBconnector();
            }
            lock.unlock();
        }
        return instance;
    }

    public void connectToDB() {
        System.out.println("Connecting to the database...");
    }

}
