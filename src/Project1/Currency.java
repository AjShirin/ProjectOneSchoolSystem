package Project1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Currency {
	public void currecny() {
		int currency;
		double feesAmount = 0;
		double amountCalulation = 0;
		double amount;

		Scanner sc = new Scanner(System.in);
		Stack<String> historySatck = new Stack<>();

		Map<String, Double> currencyMap = new HashMap<>();
		Map<String, Map<String, Double>> secondCurrencyMap = new HashMap<>();

		String currencyName = "Saudi Riyal";

		System.out.println("Enter student name who want to convert:");

		String studentConversionName = sc.next();
		historySatck.push(studentConversionName);

		System.out.println("Choose Currency you want to convert:\n" + "1. Saudi Riyal \n"
				+ " 2. United Arab Emirates Dirham \n" + " 3. Kuwaiti Dinar \n" + " 4. Qatari Rial ");

		currency = sc.nextInt();
		String currencyNew = Integer.toString(currency);
		historySatck.push(currencyNew);

		System.out.println("Enter Fees Amount");

		feesAmount = sc.nextDouble();
		String feesAmountNew = Double.toString(feesAmount);
		historySatck.push(feesAmountNew);

		if (currency == 1) {

			amountCalulation = feesAmount * 9.76;
			// Math.round(amountCal);

		}

		else if (currency == 2) {

			amountCalulation = feesAmount * 0.10;
//Math.round(amountCal);
			currencyName = "AED";

		}

		else if (currency == 3) {

			amountCalulation = feesAmount * 1.24;
//Math.round(amountCal);
			currencyName = "KWD";
//System.out.printf("%.2f", amountCal);

		} else if (currency == 4) {

			amountCalulation = feesAmount * 0.11;
//Math.round(amountCal);
			currencyName = "QAR";
//System.out.printf("%.2f", amountCal);

		}
//System.out.printf("%.2f", comparisionMap);

		currencyMap.put(currencyName, amountCalulation);
		secondCurrencyMap.put(studentConversionName, currencyMap);
//System.out.println( currencyMap);

		// find the closest int for these floats
		// System.out.println(Math.round(comparisionMap));
		System.out.println(secondCurrencyMap);
//	mainMenueFunction();

		// String formattedString = String.format("%.2f", comparisionMap);
//System.out.println("%.2f",formattedString);

	}
}
