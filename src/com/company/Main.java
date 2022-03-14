package com.company;

import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, ArrayList<String>> database = new TreeMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            ArrayList<String> access = new ArrayList<>();
            for(String s: line) {
                if(s.equals("W")) {
                    access.add("write");
                }
                else if(s.equals("R")) {
                    access.add("read");
                }
                else {
                    access.add("execute");
                }
                database.put(line[0], access);
            }
        }
        int m = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < m; i++) {
            String[] line = sc.nextLine().split(" ");
            System.out.println(database.get(line[1]).contains(line[0]) ? "OK" : "Access denied");
        }
    }
}
