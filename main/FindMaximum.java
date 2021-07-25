package main;
import main.RefactorOne;


public class FindMaximum {
	public static void main(String[] args) {
		Integer integer1 = 72;
		Integer integer2 = 70;
		Integer integer3 = 74;

		Float float1 = 1.1f;
		Float float2 = 2.2f;
		Float float3 = 3.3f;
		
		String string = "Apple";
		String string2 = "Mango";
		String string3 = "Banana";

		
		RefactorOne refactor1=new RefactorOne<Integer>();
		refactor1.findMax(integer1, integer2, integer3);
		
		RefactorOne refactor2=new RefactorOne<Integer>();
		refactor2.findMax(float1, float2, float3);
		
		RefactorOne refactor3=new RefactorOne<Integer>();
		refactor3.findMax(string, string2, string3);
		
		RefactorTwo<Integer> refactor22=new RefactorTwo<Integer>(1,2,3);
		refactor22.findMax(1, 2, 3);
		
		RefactorTwo<Float> refactor23=new RefactorTwo<Float>(1.1f,2.2f,3.3f);
		refactor23.findMax(1.1f,2.2f,3.3f);
		
		RefactorTwo<String> refactor24=new RefactorTwo<String>("apple","mango","banana");
		refactor24.findMax("apple","mango","banana");
	}
}