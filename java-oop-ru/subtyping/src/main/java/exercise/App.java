package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        var entries = storage.toMap().entrySet();
        for (var entry : entries) {
            storage.set(entry.getValue(), entry.getKey());
            storage.unset(entry.getKey());
        }

    }
}
// END
