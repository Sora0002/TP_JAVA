package Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GreetClient {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    // Method to establish a connection to the server
    public void startConnection(String ip, int port) {
        try {
            // Create a socket and connect to the server with the specified IP address and port
            clientSocket = new Socket(ip, port);

            // Create PrintWriter and BufferedReader for communication with the server
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to send a message to the server and receive the response
    public String sendMessage(String msg) {
        out.println(msg); // Send the message to the server
        try {
            String resp = in.readLine(); // Receive the response from the server
            return resp;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to stop the connection and close resources
    public void stopConnection() {
        try {
            // Close resources (streams and socket)
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
