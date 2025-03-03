package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        if (Math.abs(x) == Math.abs(y))
            return Integer.compare(x, y);

        x = 5 * x * x + 3;
        y = 5 * y * y + 3;

        return Integer.compare(x, y);
    }
}
