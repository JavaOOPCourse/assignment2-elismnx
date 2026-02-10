public class EBook extends Book {

    private final double fileSize;

    // TODO: Implement constructor using super()
    public EBook(String title, String author, int year, double size) {
        super(title, author, year);
        // implement
        fileSize = size;
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return super.toString() + "\n File Size: " + fileSize + "MB";
    }
}
