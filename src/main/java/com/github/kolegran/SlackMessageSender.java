package com.github.kolegran;

public class SlackMessageSender {

    // will not always accept interface as a parameter behind which we can hide an adapter
    public void send(Sendable message) {
        System.out.println(message.getMessageBody());
    }
}
