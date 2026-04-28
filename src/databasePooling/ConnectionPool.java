package databasePooling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {

    private final BlockingQueue<Connection> pool;
    private final int MAX_POOL_SIZE = 5;

    public ConnectionPool(String url, String user, String password) throws Exception {
        pool = new LinkedBlockingQueue<>();

        for (int i = 0; i < MAX_POOL_SIZE; i++) {
            Connection conn = DriverManager.getConnection(url, user, password);
            pool.offer(conn);
        }
    }

    // Borrow connection
    public Connection getConnection() throws InterruptedException {
        return pool.take(); // waits if empty
    }

    // Return connection
    public void releaseConnection(Connection conn) {
        if (conn != null) {
            pool.offer(conn);
        }
    }
}
