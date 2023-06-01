package library;

public class Library {
    private int readingChairs;
    private int shelves;

    public int getReadingChairs() {
        return readingChairs;
    }

    public void setReadingChairs(int readingChairs) {
        this.readingChairs = readingChairs;
    }

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    @Override
    public String toString() {
        return "Library{" +
                "readingChairs=" + readingChairs +
                ", shelves=" + shelves +
                '}';
    }
}
