package run;

import java.util.Comparator;

public class SortByDistance implements Comparator<Run> {
    public int compare(Run a, Run b) {

        return Double.compare(b.distance, a.distance);

    }
}
