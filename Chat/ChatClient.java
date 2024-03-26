import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader consoleIn = new BufferedReader(new InputStreamReader(System.in));

            // Demander à l'utilisateur de saisir son nom
            System.out.print("Enter your name: ");
            String userName = consoleIn.readLine();
            out.println(userName); // Envoyer le nom au serveur

            // Thread pour afficher les messages du serveur
            new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        System.out.println(message); // Afficher le message reçu du serveur
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            // Thread pour envoyer les messages saisis par l'utilisateur au serveur
            new Thread(() -> {
                try {
                    String userInput;
                    while ((userInput = consoleIn.readLine()) != null) {
                        out.println(userInput); // Envoie du message au serveur
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}