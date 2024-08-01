package org.example.BaekJoon.StackQueueDeque.ex12789;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        boolean result = true;
        int turn = 1;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=N-1 ; i>=0 ; i--){
            first.push(arr[i]);
        }
        while(!first.empty()){
            if(first.peek() == turn){ first.pop(); turn++; }
            else {
                if(!second.empty() && second.peek()==turn){
                    second.pop();
                    turn++;
                }
                else{
                    second.push(first.pop());
                }
            }
        }
        while(!second.empty()){
            if(second.peek() == turn){ second.pop(); turn++; }
            else{ result = false; break;}
        }
        if(result){ sb.append("Nice").append("\n"); }
        else { sb.append("Sad").append("\n"); }
        br.close();
        System.out.println(sb);
    }
}