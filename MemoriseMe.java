/*
Problem Statement:

Arijit is a brilliant boy. He likes memory games. He likes to participate alone but this time he has to have a partner. 
So he chooses you.

In this Game , your team will be shown N numbers for few minutes . You will have to memorize these numbers.

Now, the questioner will ask you Q queries, in each query He will give you a number , 
and you have to tell him the total number of occurrences of that number in the array of numbers shown to your team . 
If the number is not present , then you will have to say “NOT PRESENT” (without quotes).

INPUT And OUTPUT

The first line of input will contain N, an integer, which is the total number of numbers shown to your team.

The second line of input contains N space separated integers .

The third line of input contains an integer Q , denoting the total number of integers.

The Next Q lines will contain an integer denoting an integer, B(i) , 
for which you have to print the number of occurrences of that number B(i) in those N numbers on a new line.

If the number B(i) isn’t present then Print “NOT PRESENT” (without quotes) on a new line.

CONSTRAINTS

1 <= N <= 10^5
0 <= B(i) <= 1000
1 <= Q <= 10^5

SAMPLE INPUT 
6
1 1 1 2 2 0
6
1
2
1
0
3
4

SAMPLE OUTPUT 
3
2
3
1
NOT PRESENT
NOT PRESENT

*/

import java.util.*;

public class MemoriseMe {
    public static void main(String args[]) throws Exception {
        MemoriseMe object = new MemoriseMe();
        Scanner sc = new Scanner(System.in);
        // key: number & value: number-count
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        object.addElementsToMap(map, sc);
        
        int queries = sc.nextInt();
        for(int i = 0; i < queries; i++) {
            Integer result = map.get(sc.nextInt());
            System.out.println(result != null ? result : "NOT PRESENT");
        }
        sc.close();
    }
    
    private void addElementsToMap(Map<Integer,Integer> map, Scanner s) {
        int N = s.nextInt();
        for(int i = 0; i < N; i++) {
            int numberToAdd = s.nextInt();
            Integer count = map.get(numberToAdd);
            if(count != null) {
                map.put(numberToAdd, ++count);
            } else {
                map.put(numberToAdd, 1);
            }
        }
    }
}
