package com.javamasterclass.abstractclassesandinterfaces.abstractclasseschallenge;

public interface NodeList {
    ListItem getRoot();

    boolean addItem(ListItem item);

    boolean removeListItem(ListItem item);

    void traverse(ListItem root);
}
