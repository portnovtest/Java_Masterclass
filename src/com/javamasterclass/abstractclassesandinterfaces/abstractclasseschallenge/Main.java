package com.javamasterclass.abstractclassesandinterfaces.abstractclasseschallenge;

public class Main {
    public static void main(String[] args) {
        //MyLinkedList list = new MyLinkedList(null);
        SearchTree list = new SearchTree(null);
        list.traverse(list.getRoot());

        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());

        list.traverse(list.getRoot());
        list.removeListItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeListItem(new Node("5"));
        list.traverse(list.getRoot());

        list.removeListItem(new Node("0"));
        list.removeListItem(new Node("4"));
        list.removeListItem(new Node("2"));
        list.traverse(list.getRoot());

        list.removeListItem(new Node("9"));
        list.traverse(list.getRoot());
        list.removeListItem(new Node("8"));
        list.traverse(list.getRoot());
        list.removeListItem(new Node("6"));
        list.traverse(list.getRoot());
        list.removeListItem(list.getRoot());
        list.traverse(list.getRoot());
        list.removeListItem(list.getRoot());
        list.traverse(list.getRoot());
    }
}
