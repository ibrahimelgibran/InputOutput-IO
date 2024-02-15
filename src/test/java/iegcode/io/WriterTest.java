package iegcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriterTest {

    @Test
    void writer() {
        Path path = Path.of("writer.txt");
        try (Writer writer = Files.newBufferedWriter(path)){
            for (int i = 0; i < 10; i++) {
                writer.write("Hello World\n");
                writer.flush();
            }
        }catch (IOException e) {
            Assertions.fail(e);
        }
    }

    @Test
    void gabut() {
        Path path = Path.of("gabut.txt");
        try (Writer writer = Files.newBufferedWriter(path)){
            for (int i = 0; i < 10; i++) {
                writer.write("Percobaan\n");
                writer.flush();
            }
        }catch (IOException e){
            Assertions.fail(e);
        }
    }
}
