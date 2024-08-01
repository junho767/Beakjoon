package org.example.BaekJoon.Advanced2.ex25192;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> arrStr = new HashSet<>();
        int count = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if(str.equals("ENTER")) {
                arrStr.clear();
            } else if(!arrStr.contains(str)){
                arrStr.add(str);
                count++;
            }
        }
        sb.append(count);
        br.close();
        System.out.println(sb);
    }
}
