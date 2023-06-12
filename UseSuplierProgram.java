package Java8HW;
import java.util.function.*;

public class UseSuplierProgram {
	public static void main(String[] args) {
		Supplier<String>name=()->"raja";
		System.out.println(name.get());
	}

}
