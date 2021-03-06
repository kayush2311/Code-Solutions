/*
Problem Statement:

Micro purchased an array A having N integer values. 
After playing it for a while, he got bored of it and decided to update value of its element. 
In one second he can increase value of each array element by 1. 
He wants each array element's value to become greater than or equal to K. 
Please help Micro to find out the minimum amount of time it will take, for him to do so.

Input: 
First line consists of a single integer, T, denoting the number of test cases. 
First line of each test case consists of two space separated integers denoting N and K. 
Second line of each test case consists of N space separated integers denoting the array A.

Output:
For each test case, print the minimum time in which all array elements will become greater than or equal to K. 
Print a new line after each test case.

Constraints: 

1 <= T <= 5
1 <= N <= 10^5
1 <= A[i],K <= 10^6

SAMPLE INPUT 
2
3 4
1 2 5
3 2
2 5 5

SAMPLE OUTPUT 
3
0

*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MicroAndArrayUpdate {
  public static void main(String args[] ) throws Exception {
        MicroAndArrayUpdate object = new MicroAndArrayUpdate();
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int i = 0; i < T; i++) {
            object.getSolution(s);
        }
        s.close();
    }
    
    private void getSolution(Scanner s) {
        int N = s.nextInt();
        int K = s.nextInt();
        List<Integer> arrayList = new ArrayList<Integer>(N);
        for(int j = 0; j < N; j++) {
            arrayList.add(s.nextInt());
        }
        Collections.sort(arrayList);
        int lowestElement = arrayList.get(0);
        System.out.println(K > lowestElement ? K - lowestElement : 0);
    }
}
