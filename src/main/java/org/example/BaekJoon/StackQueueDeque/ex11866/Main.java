package org.example.BaekJoon.StackQueueDeque.ex11866;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();
        String str = br.readLine();
        String[] str1 = str.split(" ");
        int N = Integer.parseInt(str1[0]);
        int K = Integer.parseInt(str1[1]);
        for(int i=1; i<=N ; i++){
            queue.addLast(i);
        }
        sb.append("<");
        while(!queue.isEmpty()){
            for(int i=0; i<K-1 ; i++){
                queue.addLast(queue.removeFirst());
            }
            sb.append(queue.removeFirst());
            if(!queue.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append(">");
        br.close();
        System.out.println(sb);
    }
}