package src;

public class StringCalculator {

	int Add(String numbers) {
		if (numbers.isEmpty())
			return 0;
		else {
			String[] numberArray = numbers.split(",");
			int addition = 0;
			for(String s : numberArray)
			{
				addition+=Integer.parseInt(s) ;
			}
			return addition;
		}

	}

}
