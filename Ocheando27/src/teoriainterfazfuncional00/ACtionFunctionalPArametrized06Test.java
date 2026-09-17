package teoriainterfazfuncional00;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ACtionFunctionalPArametrized06Test {

	@Test
	void test() {
	//Aqui se declara el objeto action
	ACtionFunctionalPArametrized06<Integer,String> action;
	//Aqui se implementa la funcion convert y se crea el objeto action
	action=(source)->{return source.length()+7;};
	//La linea anterior es como decir:
	action=new ACtionFunctionalPArametrized06<Integer, String>() {
		
		@Override
		public Integer convert(String source) {
			return source.length()+7;
		}
	};
	//se hace uso del objeto
	System.out.println(action.convert("Olla"));
	}

}
