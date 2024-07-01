package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    private String nameTag;
    private Map<String, String> dictionary;

    public Tag(String nameTag, Map<String, String> dictionary) {
        this.nameTag = nameTag;
        this.dictionary = dictionary;
    }

    public String getNameTag() {
        return nameTag;
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setNameTag(String nameTag) {
        this.nameTag = nameTag;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }


    public String render() {
        StringBuilder mapAsString = new StringBuilder("<" + getNameTag() + " ");
        for (var key : getDictionary().keySet()) {
            mapAsString.append(key + "=\"" + getDictionary().get(key) + "\" ");
        }
        mapAsString.delete(mapAsString.length()-1, mapAsString.length()).append(">");
        return mapAsString.toString();
    }
}
// END