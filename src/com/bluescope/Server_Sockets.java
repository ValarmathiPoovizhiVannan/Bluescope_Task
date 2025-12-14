package com.bluescope;

import java.io.*;
import java.net.*;

public class Server_Sockets {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server started...");

        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        String msg = in.readLine();
        System.out.println("Client: " + msg);

        out.println("Hello from Server!");
        server.close();
    }
}

