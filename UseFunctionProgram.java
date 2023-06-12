package Java8HW;
import java.util.function.*;

public class UseFunctionProgram {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer>nums=(a,b)->a+b;
		System.out.println(nums.apply(100, 457));
		
	}

}
