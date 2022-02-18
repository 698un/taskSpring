package by.unil2.itstep.taskSpring;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



//@SpringBootTest
class TaskSpringApplicationTests {

	Calculator calcForTest = new Calculator();

	@Test
	void isShouldAddNumbers(){

		int numberOne = 20;
		int numberTwo = 30;
		
		//when
		int result = calcForTest.add(numberOne,numberTwo);

		//then
		int expected=50;
		assertThat(result).isEqualTo(expected);

		//that

		//Assert.assertEquals()

	}




	class Calculator{
		int add(int a,int b) {return a+b;}
	}

}
