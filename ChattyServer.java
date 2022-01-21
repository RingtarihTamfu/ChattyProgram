package com.company;

import java.util.ArrayList;

public class ChattyServer implements IChattySend{
    private ArrayList<IChattyReceive> Chatters = new ArrayList<>();
    public void Add(IChattyReceive x) { Chatters.add(x); }
    public void Send(String From, String Message) {

        for (IChattyReceive Chatter : Chatters) Chatter.Receive(From, Message);
    }
}
