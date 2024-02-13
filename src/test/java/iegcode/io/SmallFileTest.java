package iegcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SmallFileTest {

    // jika ingin menulis file ukuran kecil
    @Test
    void writeSmallFile() throws IOException {
        Path path1 = Path.of("small1.txt");
        byte[] bytes = "Hello World".getBytes();
        Files.write(path1, bytes);
        Assertions.assertTrue(Files.exists(path1));

        Path path2 = Path.of("small2.txt");
        Files.writeString(path2, "Hello World");
        Assertions.assertTrue(Files.exists(path2));
    }

    // kalo ingin membaca file ukuran kecil

    @Test
    void readSmallFile() throws IOException {
        Path path1 = Path.of("small1.txt");
        byte[] bytes = Files.readAllBytes(path1);
        String contect1 = new String(bytes);
        Assertions.assertEquals("Hello World", contect1);

        Path path2 = Path.of("small2.txt");
        String contect2 = Files.readString(path2);
        Assertions.assertEquals("Hello World", contect2);
    }
}
