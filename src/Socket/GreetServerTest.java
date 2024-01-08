package Socket;
public class GreetServerTest {

    public static void main(String[] args) {
        // Start the server in a separate thread
        new Thread(() -> {
            GreetServer server = new GreetServer();
            server.start(6666);
        }).start();
    }
}

