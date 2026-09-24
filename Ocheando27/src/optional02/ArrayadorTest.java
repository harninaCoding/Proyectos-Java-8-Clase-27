package optional02;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class ArrayadorTest {

	@Test
	void test() {
		//sin optional
		ArrayList<String> array = new Arrayador().getArray("holad");
		if(array!=null) {
			System.out.println(array.size());
		}
	}
	@Test
	void testoption() {
		//sin optional
		Optional<ArrayList<String>> optionalArray = new Arrayador().getArrayOptional("holad");
		optionalArray.ifPresent((array)->{
			System.out.println(array.size());
		});
		
	}

}
