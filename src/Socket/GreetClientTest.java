package Socket;



public class GreetClientTest {

    public static void main(String[] args) {
        // Start the server in a separate thread
        new Thread(() -> {
            GreetServer server = new GreetServer();
            server.start(7000);
        }).start();

        // Client test
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", 7000);

        // Send a message to the server
        String response = client.sendMessage("hello server");

        // Print the server's response
        System.out.println("Server response: " + response);

        // Stop the client connection
        client.stopConnection();
    }
}
