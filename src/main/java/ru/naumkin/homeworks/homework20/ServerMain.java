package ru.naumkin.homeworks.homework20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8090);) {
            Socket socket = serverSocket.accept();
            System.out.println("Client Connected");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Доступные математические операции : +, - , * , /");
            String operation = in.readUTF();
            double firstNumber = in.readDouble();
            double secondNumber = in.readDouble();
            double result = calculate(firstNumber, secondNumber, operation);
            out.writeDouble(result);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double calculate(double firstNumber, double secondNumber, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }
        return result;
    }
}
