package Java8HW;
import java.util.Optional;

public class OptinalProgram {
	public static void main(String[] args) {
		String p="raja";
		Optional<String>name=Optional.ofNullable(p);
		if(name.isEmpty()) {
			System.out.println("empty");
		}
		else {
			System.out.println("not empty");
		}
	}

}
