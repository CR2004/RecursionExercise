package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import sysImplementation.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) 
public class StudentTests {
	
	@Test
	public void test1() {
		String a=Utilities.addDelimiter("Abercromdndeie", '#');
		System.out.println(a);
	}
	@Test
	public void test2() {
		String a=Utilities.getDigits("A1M2A3N4");
		System.out.println(a);
	}
	@Test
	public void test3() {
		char[] array= {'a','b','c','d','e'};
		Utilities.replaceCharacter(array,'c','x');
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
	}
	@Test
	public void test4() {
		int[] array= {1,2,3,4,5,6};
		int a=Utilities.getSumEven(array);
		System.out.println("\n"+a);
	}
	@Test
	public void test5() {
		int[][] array= {{1,2,3,4,5,6},{1,2},{3,4,5}};
		ArrayList<Integer> arr1=new ArrayList<>(Utilities.getListRowIndices(array,4));
		int length=arr1.size();
		for(int i=0;i<length;i++) {
			System.out.println(arr1.get(i));
		}
	}
	@Test
	public void test6() {
		char[][] array= {{'1','2','3','4'},{'1','2','4','2'},{'3','4','5','2'}};
		int a =Utilities.replaceCells(array, 2, 2, '5', 'x');
		System.out.println(a);
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}