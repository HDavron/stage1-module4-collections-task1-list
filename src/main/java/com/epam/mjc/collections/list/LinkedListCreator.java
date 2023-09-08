package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> list = new LinkedList<>();
        for (Integer n : sourceList) {
            if (n % 2 == 0)
                list.addLast(n);
            else list.addFirst(n);
        }
        return list;
    }
}
