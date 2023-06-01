package library;

public class Books {
    Fiction fiction;
    NonFiction nonFiction;

    public Fiction getFiction() {
        return fiction;
    }

    public void setFiction(Fiction fiction) {
        this.fiction = fiction;
    }

    public NonFiction getNonFiction() {
        return nonFiction;
    }

    public void setNonFiction(NonFiction nonFiction) {
        this.nonFiction = nonFiction;
    }

    @Override
    public String toString() {
        return "Books{" +
                "fiction=" + fiction +
                ", nonFiction=" + nonFiction +
                '}';
    }
}
