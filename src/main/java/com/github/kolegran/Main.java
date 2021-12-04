package com.github.kolegran;

import org.apache.camel.impl.DefaultCamelContext;

public class Main {

    public static void main(String[] args) throws Exception {
        final DefaultCamelContext defaultCamelContext = new DefaultCamelContext();
        defaultCamelContext.addRoutes(new FileReader("D:\\temp", new SlackMessageSender()));
        defaultCamelContext.start();

        while (true) {
            Thread.sleep(1000);
        }
    }
}
