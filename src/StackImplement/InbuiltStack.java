package StackImplement;

import CollectionFramework.com.Dequeue;

import java.util.*;

public class InbuiltStack {

    public static void main(String[] args) {
       Stack<Integer> s = new Stack<>();
//
//        s.push(56);
//        s.push(57);
//        s.push(58);
//
//        System.out.println(s.pop());


//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(56);
//        queue.add(6);
//        queue.add(5);
//        queue.add(50);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> d = new ArrayDeque<>();
        d.add(69);
        d.addFirst(56);
        d.removeFirst();

    }

}
