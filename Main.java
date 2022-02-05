/*
    Author: Ringtarih Tamfu

    Project: Chat Program
*/


package com.company;

public class Main {
    static ChattyServer server = new ChattyServer();
    public static void main(String[] args) {
        server.Add(new ChattyFunctions( "Denise", server));
        server.Add(new ChattyFunctions( "Gabby", server));
        server.Add(new ChattyFunctions("Mia", server));
        server.Add(new ChattyFunctions("Santiago", server));
        //I can add more people to the chat here
    }
}
