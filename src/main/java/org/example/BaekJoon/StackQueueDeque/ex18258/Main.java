package org.example.BaekJoon.StackQueueDeque.ex18258;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N ; i++){
            String command = br.readLine();
            String[] command1 = command.split(" ");
            if(command1.length > 1 && Objects.equals(command1[0], "push")){
                queue.add(Integer.parseInt(command1[1]));
            } else{
                switch (command){
                    case "pop":
                        if(queue.isEmpty()) sb.append(-1).append("\n");
                        else {
                            sb.append(queue.peekFirst()).append("\n");
                            queue.remove();
                        }
                        break;
                    case "size":
                        sb.append(queue.size()).append("\n");
                        break;
                    case "empty":
                        if(queue.isEmpty()) sb.append(1).append("\n");
                        else sb.append(0).append("\n");
                        break;
                    case "front":
                        if(!queue.isEmpty()) sb.append(queue.peekFirst()).append("\n");
                        else sb.append(-1).append("\n");
                        break;
                    case "back":
                        if(!queue.isEmpty()) sb.append(queue.peekLast()).append("\n");
                        else sb.append(-1).append("\n");
                        break;
                    default:
                        break;
                }
            }


        }
        br.close();
        System.out.println(sb);
    }
}