package com.bluescope;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.*;

public class Clinet_sockets {
	public static void main(String[] args) throws IOException {
		
	
	Socket socket = new Socket("localhost", 5000);
	socket.setSoTimeout(5000); // wait max 5 seconds

	BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

	out.println("Hi Server!");

	try {
	    System.out.println("Server: " + in.readLine());
	} catch (SocketTimeoutException e) {
	    System.out.println("Server took too long to respond!");
	}

	socket.close();

	}
}
