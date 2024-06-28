package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
private String word;

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        return word.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return word.subSequence(start, end);
    }

    @Override
    public String toString() {
        return  word;
    }

    public ReversedSequence(String word) {
        this.word = new StringBuilder(word).reverse().toString();;
    }

}
// END
