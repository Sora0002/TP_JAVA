package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetServer {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    // Method to start the server on the specified port
    public void start(int port) {
        try {
            // Create a ServerSocket to listen on the specified port
            serverSocket = new ServerSocket(port);

            // Wait for a client to connect
            clientSocket = serverSocket.accept();

            // Create PrintWriter and BufferedReader for communication with the client
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // Read the greeting message from the client
            String greeting = in.readLine();

            // Check the greeting and respond accordingly
            if ("hello server".equals(greeting)) {
                out.println("hello client"); // Send response to the client
            } else {
                out.println("unrecognized greeting"); // Send an error response
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to stop the server and close connections
    public void stop() {
        try {
            // Close resources (streams and sockets)
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Main method to create and start the server
    public static void main(String[] args) {
        GreetServer server = new GreetServer();
        server.start(6666); // Start the server on port 6666
    }
}
