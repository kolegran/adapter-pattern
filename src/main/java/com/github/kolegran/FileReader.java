package com.github.kolegran;

import org.apache.camel.builder.RouteBuilder;

public class FileReader extends RouteBuilder {

    private final String folder;
    private final SlackMessageSender slackMessageSender;

    public FileReader(String folder, SlackMessageSender slackMessageSender) {
        this.folder = folder;
        this.slackMessageSender = slackMessageSender;
    }

    @Override
    public void configure() throws Exception {
        from("file://" + folder)
            .process(new FileProcessor(slackMessageSender));
    }
}
