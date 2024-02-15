package iegcode.io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ObjectStreamTest {

    @Test
    void savePerson() {
        Person person = new Person();
        person.setId("1");
        person.setName("Gibran");

        Path path = Path.of("gibran.person");

        try (OutputStream stream = Files.newOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(stream)){

            objectOutputStream.writeObject(person);
            objectOutputStream.flush();

        }catch (IOException e){
            Assertions.fail(e);
        }
    }

    @Test
    void getPerson() {
        Path path = Path.of("gibran.person");

        try (InputStream stream = Files.newInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(stream)){

            Person person = (Person) objectInputStream.readObject();

            Assertions.assertEquals("1", person.getId());
            Assertions.assertEquals("Gibran", person.getName());

        }catch (IOException | ClassNotFoundException e){
            Assertions.fail(e);
        }
    }
}
