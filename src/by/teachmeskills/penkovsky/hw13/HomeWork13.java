package by.teachmeskills.penkovsky.hw13;

import by.teachmeskills.penkovsky.hw13.util.IntList;

import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целочисленный массив через пробел: ");
        String input = scanner.nextLine();
        String[] valuesAsString = input.split(" ");
        int[] values = new int[valuesAsString.length];
        for (int i = 0; i < valuesAsString.length; i++) {
            values[i] = Integer.parseInt(valuesAsString[i]);
        }

        IntList intList = new IntList(values);
        System.out.println("Исходный список: " + intList.toString());

        while (true) {
            System.out.println("Выберите задачу: ");
            System.out.println("1. Вывод списка на экран");
            System.out.println("2. Получение элемента списка по индексу");
            System.out.println("3. Изменение элемента списка по индексу");
            System.out.println("4. Получение размера списка");
            System.out.println("5. Добавление элемента в конец списка");
            System.out.println("6. Удаление элемента списка по индексу");
            System.out.println("7. Получение подсписка списка");
            System.out.println("8. Поиск индекса последнего вхождения элемента в список");
            System.out.println("9. Сортировка списка");
            System.out.println("0. Выход");
            System.out.print("Введите номер задачи: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(intList.toString());
                    break;
                case 2:
                    System.out.print("Введите индекс: ");
                    int index = scanner.nextInt();
                    System.out.println("Элемент по индексу " + index + ": " + intList.get(index));
                    break;
                case 3:
                    System.out.print("Введите индекс: ");
                    int indexToSet = scanner.nextInt();
                    System.out.print("Введите значение: ");
                    int elementToSet = scanner.nextInt();
                    int previous = intList.set(indexToSet, elementToSet);
                    System.out.println("Предыдущее значение элемента: " + previous);
                    break;
                case 4:
                    System.out.println("Размер списка: " + intList.size());
                    break;
                case 5:
                    System.out.print("Введите значение элемента: ");
                    int elementToAdd = scanner.nextInt();
                    intList.add(elementToAdd);
                    System.out.println("Список после добавления элемента: " + intList.toString());
                    break;
                case 6:
                    System.out.print("Введите индекс элемента, который нужно удалить: ");
                    int indexToRemove = scanner.nextInt();
                    int removedElement = intList.remove(indexToRemove);
                    System.out.println("Удаленный элемент: " + removedElement);
                    System.out.println("Список после удаления элемента: " + intList.toString());
                    break;
                case 7:
                    System.out.print("Введите начальный индекс: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Введите конечный индекс: ");
                    int endIndex = scanner.nextInt();
                    IntList sublist = intList.subList(startIndex, endIndex);
                    System.out.println("Подсписок: " + sublist.toString());
                    break;
                case 8:
                    System.out.print("Введите элемент для поиска: ");
                    int elementToFind = scanner.nextInt();
                    int lastIndex = intList.lastIndexOf(elementToFind);
                    if (lastIndex != -1) {
                        System.out.println("Индекс последнего вхождения элемента " + elementToFind + ": " + lastIndex);
                    } else {
                        System.out.println("Элемент " + elementToFind + " не найден в списке.");
                    }
                    break;
                case 9:
                    intList.sort();
                    System.out.println("Список после сортировки: " + intList.toString());
                    break;
                case 0:
                    System.out.println("Выход.");
                    return;
                default:
                    System.out.println("Неверный номер задачи.");
                    break;
            }
        }
    }
}
