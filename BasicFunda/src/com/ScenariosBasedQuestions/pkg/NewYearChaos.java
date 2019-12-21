package com.ScenariosBasedQuestions.pkg;


public class NewYearChaos {

	public static void main(String[] args) {
		
		
		int[] input = {1,2,5,3,7,8,6,4};
		NewYearChaos.minimumBribes(input);
	}
	
	static void minimumBribes(int[] q) {
		int size=q.length, var=1, swap[]= new int[size];
		int[] temp = new int[size];
		for(int i=0; i<size; i++) {
			temp[i]=var;
			var++;
		}
		
		for(int i =0; i<size; i++) {
			if((temp[i]!=q[i])&&(i+1<size)&&(swap[i]<3)) {
				var=q[i+1];
				q[i+1]=q[i];
				q[i]=var;
				swap[i]++;
			}
		}
		for(int i=0; i<size;) {
			if(q[i]!=temp[i]){
				System.out.println("Too chaotic");
				break;
			}
			else {
				System.out.println(swap[i]);
				break;
			}
		}
		
		for(int i: q){
			System.out.println(i);
		}
	}

}
//2 1 4 3 4
//1 2 3 4 5
