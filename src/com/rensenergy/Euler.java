package com.rensenergy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Euler {
	/*
	 * public static void main(String[] args) { int sum = 0; for (int i = 1; i <
	 * 1000; i++){ if (i % 3 == 0 || i % 5 == 0){ sum = sum + i; } }
	 * System.out.println(sum); }
	 */
	/*
	 * public static void main(String[] args) { int i = 1; long a = 1; long b = 2;
	 * long sum = 0; long finalsum = 2; while(true) { sum = a + b; if (sum % 2 == 0)
	 * { finalsum = finalsum + sum; System.out.println(finalsum); } a = b; b = sum;
	 * i++; if (sum > 4000000) { System.out.println("i的值为： "+i); break; } }
	 * System.out.println(finalsum); }
	 */
	/*
	 * public static void main(String[] args) { while (true) { Scanner sca = new
	 * Scanner(System.in); Long a = sca.nextLong(); Long s = a; boolean boo = true;
	 * while (boo) { for (Long i = 2L; i < s; i++){ if (s % i == 0) { s = s / i;
	 * System.out.println(i); break; } if (i == s - 1) { System.out.println(s); boo
	 * = false; } } } } }
	 */
	/*
	 * public static void main(String[] args) { // boolean flag = false; Long
	 * startTime = System.nanoTime(); List<Integer> list = new ArrayList<>(); for
	 * (int i = 999; i >= 100; i--) { for (int j = 999;j >= 100; j--) { int a = i *
	 * j; int b = 0; int tmp = a; while (tmp != 0) { b = b * 10 + tmp % 10; tmp /=
	 * 10; } if (a == b) { list.add(a); } }
	 * 
	 * } Collections.sort(list); Long endTime = System.nanoTime();
	 * System.out.println(endTime - startTime);//17346574
	 * System.out.println(list.get(list.size()-1)); }
	 */
	/*
	 * public static int sumSquare(int a) { int sum = 0; if (a % 2 == 0) { sum =
	 * (int)Math.pow((1 + a) * (a / 2), 2); } else { sum = (int)Math.pow(((1 + a) *
	 * (a - 1) / 2) + ((1 + a) / 2), 2); } System.out.println(sum); return sum; }
	 * public static int squareSum(int a) { int sum = 0; for (int i = 1; i <= a;
	 * i++) { sum = sum + i * i; } System.out.println(sum); return sum; } public
	 * static void main(String[] args) { Scanner sca = new Scanner(System.in); int s
	 * = sca.nextInt(); int dd = sumSquare(s) - squareSum(s);
	 * System.out.println(dd); }
	 */
	public static void main(String[] args) {
		int i = 3, j = 1;
		for (; j < 10001; i += 2) {
			Prime prime = new Prime(i);
			if (prime.is_prime()) {
				j++;
			}
		}
		System.out.println(i - 2);
	}
}

class Prime{
    public int num;
    
    public Prime(int i){
        num = i;
    }
    public boolean is_prime(){
        for(int i=2;i*i<=num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}

