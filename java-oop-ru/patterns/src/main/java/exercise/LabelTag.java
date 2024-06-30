package exercise;

// BEGIN
public class LabelTag implements TagInterface{
    private String textValue;
    private TagInterface tag;

    public LabelTag(String textValue, TagInterface tag) {
        this.textValue = textValue;
        this.tag = tag;
    }

    @Override
    public String render() {
        return "<label>" + textValue + tag.render() + "</label>";
    }
}
// END
