package com.github.kolegran;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileToSendableAdapter implements Sendable {

    private final File file;

    public FileToSendableAdapter(File file) {
        this.file = file;
    }

    @Override
    public String getMessageBody() {
        try {
            return Files.readString(file.toPath());
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
