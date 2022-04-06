/**
 * Class containing the main-method of the program. The program 
 * expects exactly one input argument, an integer x >= 1. If the input is wrong,
 * the program terminates with an error message, as well as showing the manual.
 * If the input is correct, the program counts from 1 to x, printing one number
 * in each line
 */
public class Count{

	public static void main(String[] args){

		//Create an instance of the Count class
		//No delete necessary, because of Java Garbage Collection
		Count classObject = new Count();

		//Check input by calling the instance method
		//In Java, method calls are always using the dot (.) notation
		//there are no arrows (->) like in C++
		if(!classObject.checkInput(args)){
			System.out.println("Wrong input");
			System.out.println("Call with: \"java Count <x>\"" + 
					", where <x> is an integer >= 1");
			System.exit(-1);
		}
		
		//Print the numbers to the screen
		int numberToCountTo = Integer.parseInt(args[0]);
		for(int i = 0; i < numberToCountTo; i++){
			System.out.println(i);
		}
	}

	
	/**
	 * Checks whether exactly one input argument was passed and whether
	 * this argument is an integer > 1
	 *
	 * (Design note: This could have also been a static method, as it
	 * does not reference any instance variable within the class. The 
	 * ML implements it as an instance method in order to show how
	 * objects are created within Java)
	 *
	 * @param input The input from the command line
	 * @return Whether the input was correct
	 */
	boolean checkInput(String[] input){

		//Check if only one command was passed
		if(input.length != 1){
			return false;
		}
		
		//Check that input is an integer >= 1
		if(Integer.parseInt(input[0]) < 1){
			return false;	
		}

		return true;
	}

}
