package pass;

import java.lang.System;
import java.lang.Integer;

public class Primes {
	boolean[] isPrime;
	
	public String primes(int n) {
		String tmp="";
		isPrime = new boolean[n+1];
		int count =2;
		while(count <= n) {
			isPrime[count] = true;
			count +=1 ;
		}
		count = 2;
		while(count*count <= n){
            if (isPrime[count]== true) {
            	int count2 = count;
                while(count2 * count <= n){
                    isPrime[count2*count] = false;
                    count2 += 1;
                }
            }
            count += 1;
        }
		
		count = 2;
        while(count <= n){
        	if(count > 2 && isPrime[count] ==true ) {
        		tmp += " ";
        	}
            if (isPrime[count] == true) {
            	tmp += count;
            }
            
            count += 1;
        }
		return tmp;
	}
	
	public static void main(String[] args) {
		Primes p = new Primes();
        int x = Integer.parseInt(args[0]);
        System.out.println(p.primes(x));
    }
}
