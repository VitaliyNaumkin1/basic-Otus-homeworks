package ru.naumkin.homeworks.homework20;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Socket socket = new Socket("localhost", 8090);) {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            String operations = in.readUTF();
            System.out.println(operations);
            System.out.println("Введите операцию: ");
            String operation = scanner.next();
            System.out.println("Введите первое число: ");
            double firstNumber = scanner.nextDouble();
            System.out.println("Введите второе число: ");
            double secondNumber = scanner.nextDouble();
            out.writeUTF(operation);
            out.writeDouble(firstNumber);
            out.writeDouble(secondNumber);
            out.flush();
            double result = in.readDouble();
            System.out.println("result = " + result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

