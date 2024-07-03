package exercise;

import lombok.SneakyThrows;

import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    @SneakyThrows
    public static void save(Path path, Car car) {
        String json = car.serialize(car);
        Files.writeString(path, json, StandardOpenOption.TRUNCATE_EXISTING);
    }

    @SneakyThrows
    public static Car extract(Path path) {
        String carString =  Files.readString(path);
        return Car.unserialize(carString);
    }
}
// END
