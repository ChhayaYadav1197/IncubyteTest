package src;

public class StringCalculator {

	int Add(String numbers) throws Exception {
		if (numbers.isEmpty())
			return 0;
		else {
			String[] numberArray = numbers.split(",");
			int addition = 0;
			for (String s : numberArray) {
				if (s.isBlank() || s.startsWith("\n") || s.endsWith("\n"))
					throw new NumberFormatException("Invalid Input");
				for (String x : s.split("\n")) {
					
					addition += Integer.parseInt(x);
				}
			}
			return addition;
		}

	}

}
