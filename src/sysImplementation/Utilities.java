package sysImplementation;

import java.util.ArrayList;

public class Utilities {

	public static String addDelimiter(String str, char delimeter) {
		String answer="";
		if(str.length()==1) {
			answer+=str.charAt(0);
		}
		else {
			answer+=str.charAt(0);
			answer+=delimeter;
			answer+=addDelimiter(str.substring(1),delimeter);
		}
		return answer;
	}

	public static String getDigits(String str) {
		String answer="";
		if(str.isEmpty()) {
			return answer;
		}
		else if(Character.isDigit(str.charAt(0))) {
			answer+=str.charAt(0);
			answer+=getDigits(str.substring(1));
		}
		else if(Character.isDigit(str.charAt(0))==false) {
			answer+=getDigits(str.substring(1));
		}
		return answer;
	}

	public static void replaceCharacter(char[] array, char target, char replacement) {
		if(array.length==0) {
			return;
		}
		replacearray(array,target,replacement,0);
		
	}
	//auxiliary method
	
	private static void replacearray(char[] arr1,char target,char replacement,int index) {
		if(arr1.length==index) {
			return;
		}
		else if(arr1[index]==target) {
			arr1[index]=replacement;
		}
		replacearray(arr1,target,replacement,index+1);
	}
	public static int getSumEven(int[] array) {
		int sum=0;
		if(array.length==0) {
			return sum;
		}
		return sumarray(array,sum,0);
	}
	//auxiliary method
	private static int sumarray(int[] arr1,int sum,int index) {
		if(arr1.length==index) {
			return sum;
		}
		else if(arr1[index]%2==0) {
			sum+=arr1[index];
		}
		return sumarray(arr1,sum,index+1);
	}
	public static ArrayList<Integer> getListRowIndices(int[][] array, int rowLength) {
		ArrayList<Integer> arr1=new ArrayList<>();
		return rowindices(array,arr1,rowLength,0);
	}
	//auxiliary method
	private static ArrayList<Integer> rowindices(int[][] array,ArrayList<Integer> arr1,int rowLength,int row) {
		if(array.length==row) {
			return arr1;
		}
		else if(array[row].length==rowLength) {
			arr1.add(row);
		}
		return rowindices(array,arr1,rowLength,row+1);
	}

	public static int replaceCells(char[][] array, int x, int y, char target, char replacement) {
		if(cells(x,y,array) && array[x][y]==target){
			array[x][y]=replacement;
			return 1+replaceCells(array,x-1,y-1,target,replacement)
			+replaceCells(array,x-1,y,target,replacement)+replaceCells(array,x,y-1,target,replacement)
			+replaceCells(array,x+1,y-1,target,replacement)+replaceCells(array,x+1,y,target,replacement)
			+replaceCells(array,x-1,y+1,target,replacement)+replaceCells(array,x,y+1,target,replacement)
			+replaceCells(array,x+1,y+1,target,replacement);
		}
		else {
			return 0;
		}
	}
	private static boolean cells(int x,int y,char[][] array) {
		if(x>=0 && y>=0 && x<array.length && y<array[x].length) {
			return true;
		}
		else {
			return false;
		}
	}
}
