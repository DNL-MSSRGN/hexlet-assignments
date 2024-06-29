package exercise;

import java.util.HashMap;
import java.util.Map;

import static exercise.Utils.serialize;
import static exercise.Utils.writeFile;

// BEGIN
public class FileKV implements KeyValueStorage{
    private String path;
    private Map<String, String> dictionary;

    public FileKV(String path, Map<String, String> dictionary) {
        this.path = path;
        this.dictionary = new HashMap<>(dictionary);
        String content = serialize(dictionary);
        writeFile(path, content);
    }
    @Override
    public void set(String key, String value) {
        dictionary.put(key, value);

    }

    @Override
    public void unset(String key) {
        dictionary.remove(key);
    }

    @Override
    public String get(String key, String defaultValue) {
        return dictionary.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(dictionary);
    }
}
// END
