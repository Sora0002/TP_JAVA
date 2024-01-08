import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MiniChat {

    static class Server {
        private List<PrintWriter> clients = new ArrayList<>();

        public static void main(String[] args) {
            new Server().startServer(12345);
        }

        private void startServer(int port) {
            try (ServerSocket serverSocket = new ServerSocket(port)) {
                System.out.println("Server started on port " + port);

                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("New client connected: " + clientSocket);

                    PrintWriter clientOut = new PrintWriter(clientSocket.getOutputStream(), true);
                    clients.add(clientOut);

                    new Thread(() -> handleClient(clientSocket)).start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void handleClient(Socket clientSocket) {
            try (Scanner clientIn = new Scanner(clientSocket.getInputStream())) {
                while (clientIn.hasNext()) {
                    String message = clientIn.nextLine();
                    broadcastMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                removeClient(clientSocket);
            }
        }

        private void broadcastMessage(String message) {
            for (PrintWriter clientOut : clients) {
                clientOut.println(message);
            }
        }

        private void removeClient(Socket clientSocket) {
            clients.removeIf(clientOut -> clientOut.checkError() || clientOut.equals(clientSocket));
            System.out.println("Client disconnected: " + clientSocket);
        }
    }

    static class Client {
        public static void main(String[] args) {
            new Client().startClient("localhost", 12345);
        }

        private void startClient(String serverAddress, int port) {
            try (Socket socket = new Socket(serverAddress, port);
                 PrintWriter serverOut = new PrintWriter(socket.getOutputStream(), true);
                 Scanner serverIn = new Scanner(socket.getInputStream());
                 Scanner userInput = new Scanner(System.in)) {

                System.out.println("Connected to the server");

                // Thread to receive messages from the server
                new Thread(() -> {
                    while (serverIn.hasNext()) {
                        String message = serverIn.nextLine();
                        System.out.println("Server: " + message);
                    }
                }).start();

                // Reading user input and sending messages to the server
                while (true) {
                    String message = userInput.nextLine();
                    serverOut.println(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
