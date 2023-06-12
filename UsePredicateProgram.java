package Java8HW;
import java.util.*;
import java.util.function.*;

public class UsePredicateProgram {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer>nums=(a,b)->(a>b);
		System.out.println(nums.test(75, 89));
	}

}
