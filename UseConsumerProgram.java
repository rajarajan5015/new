package Java8HW;
import java.util.function.*;

public class UseConsumerProgram {
	public static void main(String[] args) {
		BiConsumer<Integer,Integer>nums=(a,b)->System.out.println(a-b);
		nums.accept(76, 70);
	}

}
