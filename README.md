Basic Java Application
This repository contains a basic Java application with a Server and Client. The server listens for incoming connections, while the client connects to the server and sends data.

Prerequisites
Java Development Kit (JDK): Ensure that you have JDK 8 or later installed on your machine. You can download it from Oracle's website or use a package manager.

IDE or Text Editor: You can use any IDE (like IntelliJ IDEA or Eclipse) or a text editor (like VSCode or Sublime Text) to edit the Java files.
Getting Started
Follow these steps to run the server and client applications:

1. Clone the Repository
   Clone the repository to your local machine using:
   git clone <repository-url>
   cd <repository-directory>
2. Compile the Java Files
Open a terminal or command prompt and navigate to the directory where the Server.java and Client.java files are located. Compile the Java files using the javac command:

sh
Copy code
javac Server.java Client.java
3. Run the Server
Start the server application by executing the following command:

sh
Copy code
java Server
The server will start and listen for incoming connections on a specified port (e.g., port 12345).

4. Run the Client
In a new terminal or command prompt window, run the client application by executing:

sh
Copy code
java Client
The client will connect to the server and send data.

Usage
Server.java: Listens for incoming connections on a specified port and processes data received from clients.
Client.java: Connects to the server using the server's IP address and port, then sends data to the server.
