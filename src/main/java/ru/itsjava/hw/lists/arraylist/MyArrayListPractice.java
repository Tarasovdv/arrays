package ru.itsjava.hw.lists.arraylist;

import ru.itsjava.hw.lists.Person;

public class MyArrayListPractice {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();
        MyArrayList list1 = new MyArrayList();

        Person d = new Person("D",0,"m");
        System.out.println(list.size());
        list.add("hi");
        list.add("by");
        list.add(d);

        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list1.isEmpty() = " + list1.isEmpty());

        System.out.println("list.contains(d) = " + list.contains(d));
        System.out.println("list.contains(\"by\") = " + list.contains("by"));


        System.out.println("\nПосле удаления: ");
        list.remove(1);
        System.out.println("list = " + list);

        System.out.println("\nПосле очистки списка: ");
        list.clear();
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
        System.out.println("list.isEmpty() = " + list.isEmpty());


    }
}
