package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag{

    private String bodyTag;
    private List<Tag> tags;

    public PairedTag(String nameTag, Map<String, String> dictionary, String bodyTag, List<Tag> tags) {
        super(nameTag, dictionary);
        this.bodyTag = bodyTag;
        this.tags = tags;
    }

    @Override
    public String toString() {
        var joinTags = "";
        for(var tag : tags) {
            joinTags += tag.toString();
        }
        return render() + bodyTag + joinTags + "</" + getNameTag() + ">";
    }
}
// END
