package Algorithms;

import Helper.Node;

import java.util.*;

public class Traversals {

    public static void dfs(Map<Integer, List<Node>> graph, Integer s) {
        Stack<Integer> stack = new Stack<>(); // kreiranje stack-a
        boolean[] visited = new boolean[graph.size()]; // niz za praćenje posećenih čvorova

        stack.push(s); // dodavanje startnog čvora u stack
        visited[s] = true; // označavanje startnog čvora kao da je posećen

        while(!stack.isEmpty()) {
            var curr = stack.pop(); // izbacujemo čvor iz liste
            System.out.print(curr + " ");

            for(var neigh : graph.get(curr)) { // prolazimo kroz sve susedne čvorove
                if(!visited[neigh.getVertex()]) { // proveravamo da li je susedni čvor posećen
                    visited[neigh.getVertex()] = true; // označavamo ga kao posećenog
                    stack.push(neigh.getVertex()); // dodajemo ga u listu
                }
            }
        }
    }

    public static void dfsRecursive(Map<Integer, List<Node>> graph, int s, boolean[] visited) {
        System.out.print(s + " ");
        visited[s] = true; // označavamo početni čvor kao da je posećen
        for(var neigh : graph.get(s)) { // prolazimo kroz susedne čvorove
            if(!visited[neigh.getVertex()]) { // proveravamo da li je susdeni čvor posećen
                dfsRecursive(graph, neigh.getVertex(), visited); // rekurzivan poziv metode
            }
        }
    }

    public static void bfs(Map<Integer, List<Node>> graph, int s) {
        Queue<Integer> queue = new LinkedList<>(); // kreiranje queue-a
        // u nizu visited ćemo čuvati informacije o tome koji čvor je posećen
        boolean[] visited = new boolean[graph.size()];

        queue.add(s); // dodajemo početni čvor u queue
        visited[s] = true; // označavamo ga kao posećen

        while(!queue.isEmpty()) {
            var curr = queue.poll(); // izbacujemo čvor iz queue-a
            System.out.print(curr + " ");

            for(var neigh : graph.get(curr)) { // prolazimo kroz sve susedne čvorove
                if(!visited[neigh.getVertex()]) { // proveravamo da li je čvor posećen
                    visited[neigh.getVertex()] = true; // označavamo čvor kao posećen
                    queue.add(neigh.getVertex()); // dodajemo ga queue
                }
            }
        }
    }
}
