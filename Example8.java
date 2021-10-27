package com.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int sum=0;
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("Enter elements");
		list.add(s.nextInt());
		list.add(s.nextInt());
		list.add(s.nextInt());
		list.add(s.nextInt());
		list.add(s.nextInt());
		list.add(s.nextInt());
		System.out.println(list);
		for(int data:list)
			sum+=data;
		System.out.println("Sum: "+sum);
		System.out.println("Mean: "+sum/list.size());
		list.sort(null);
		System.out.println(list);
		
		int median = list.size()/2;
        if (list.size()%2 == 0) {
           median = (list.get(list.size()/2) + list.get(list.size()/2 - 1))/2;
        } else {
            median = list.get(list.size() / 2);
        }
        System.out.println("Median: "+median);
	}

}
