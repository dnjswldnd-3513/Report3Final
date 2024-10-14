package 람다표현식;

import java.util.Arrays;
import java.util.List;

public class 람다표현식 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("a","b","c");
		names.forEach(name -> System.out.println(name));
	}
}
