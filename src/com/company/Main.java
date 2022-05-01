package com.company;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {

        MoviesList tempList = new MoviesList();
        tempList.CreateList();
        Menu menu = new Menu();
        menu.menu();

    }
}
