package com.github.kolegran;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.io.File;

public class FileProcessor implements Processor {

    final SlackMessageSender slackMessageSender;

    public FileProcessor(SlackMessageSender slackMessageSender) {
        this.slackMessageSender = slackMessageSender;
    }

    @Override
    public void process(Exchange exchange) {
        File file = exchange.getMessage().getBody(File.class);
        slackMessageSender.send(new FileToSendableAdapter(file));
    }
}
