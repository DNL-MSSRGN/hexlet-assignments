package exercise;

import java.util.Map;

// BEGIN
public class SingleTag extends Tag{
    public SingleTag(String nameTag, Map<String, String> dictionary) {
        super(nameTag, dictionary);
    }

    @Override
    public String toString() {
        return render();
    }
}

// END
