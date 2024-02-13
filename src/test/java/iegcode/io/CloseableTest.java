package iegcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class CloseableTest {
    @Test
    void createIOWithTryResource() {
        Path path = Path.of("pom.xml");
        try (InputStream inputStream = Files.newInputStream(path);
             InputStream inputStream2 = Files.newInputStream(path);
             InputStream inputStream3 = Files.newInputStream(path);){
            // masukkan apappun dengan input stream
        }catch (IOException exception){
            Assertions.fail(exception);
        }
    }
}
