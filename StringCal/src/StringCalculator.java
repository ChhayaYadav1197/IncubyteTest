package src;

public class StringCalculator {

	int Add(String numbers) throws Exception {
		if (numbers.isEmpty())
			return 0;
		else {

			String delimiter = ",";
			if (numbers.startsWith("//")) {
				int delimiterIndex = numbers.indexOf("//") + 2;
				delimiter = numbers.substring(delimiterIndex, delimiterIndex + 1);
				numbers = numbers.substring(numbers.indexOf("\n") + 1);

			}
			if (delimiter.equals("|") || delimiter.equals("^"))
				delimiter = "\\" + delimiter;

			String[] numberArray = numbers.split(delimiter);

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
