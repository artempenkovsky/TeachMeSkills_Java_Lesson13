package by.teachmeskills.penkovsky.hw13.util;

import java.util.Arrays;

public class IntList {
    private int[] items;
    private int size;

    public IntList() {
        items = new int[0];
    }

    public IntList(int[] values) {
        size = values.length;
        items = Arrays.copyOf(values, size);
    }

    public String toString() {
        return Arrays.toString(items);
    }

    public int get(int index) {
        return items[index];
    }

    public int set(int index, int element) {
        int previous = items[index];
        items[index] = element;
        return previous;
    }

    public int size() {
        return size;
    }

    public void add(int element) {
        int[] newItems = Arrays.copyOf(items, size + 1);
        newItems[size] = element;
        items = newItems;
        size++;
    }

    public int remove(int index) {
        int element = items[index];
        int[] newItems = new int[size - 1];
        System.arraycopy(items, 0, newItems, 0, index);
        System.arraycopy(items, index + 1, newItems, index, size - index - 1);
        items = newItems;
        size--;
        return element;
    }

    public IntList subList(int startIndexInclusive, int endIndexExclusive) {
        int[] newItems = new int[endIndexExclusive - startIndexInclusive];
        System.arraycopy(items, startIndexInclusive, newItems, 0, endIndexExclusive - startIndexInclusive);
        return new IntList(newItems);
    }

    public IntList subList(int startIndexInclusive) {
        return subList(startIndexInclusive, size);
    }

    public int lastIndexOf(int element) {
        for (int i = size - 1; i >= 0; i--) {
            if (items[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (items[j] > items[j + 1]) {
                    int temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }
}

