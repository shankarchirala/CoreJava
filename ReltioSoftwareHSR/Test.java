package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		//question 1
		StringBuilder sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4,"ccc");
		System.out.println(sb);
		
		//question 2
		List<String> list1 = new ArrayList();
		list1.add("abc");
		List<String> list2 = new ArrayList();
		list2.add("abc");
		
		if(list1==list2){
			System.out.println("A");
		}else if(list1.equals(list2)){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		
	}

}
