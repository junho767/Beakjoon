package org.example.BaekJoon.Combinatorics.ex15439;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine());
        sb.append(n*(n-1));
        br.close();
        System.out.println(sb);
    }
}
