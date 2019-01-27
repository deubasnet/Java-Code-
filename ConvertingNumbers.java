package conversions;
public class ConvertingNumbers {

	public static void main(String[] args) {

		
		int intValue1 = 56;
		int intValue2 = intValue1;
		System.out.println("The 2nd value is " + intValue2);

		// widening
		byte byteValue1 = 2;
		int intValue3 = byteValue1;
		System.out.println("The new int value is " + intValue3);
		
		// widening
		long longValue1 = intValue1;
		System.out.println("The long value is " + longValue1);

		// narrowing
		intValue1 = 1000000;
//		short shortValue1 = intValue1;
		short shortValue1 = (short) intValue1;
		System.out.println("The new int value is " + intValue1);
		System.out.println("The short value is " + shortValue1);

		// narrowing
		int intValue4 = 1024;
//		byte byteValue2 = intValue4;
		byte byteValue2 = (byte) intValue4;
		System.out.println("The byte value is " + byteValue2);

		// narrowing
		double doubleValue = 3.999999d;
//		int intValue5 = doubleValue;
		int intValue5 = (int) doubleValue;
		System.out.println("Double to int: " + intValue5);

	}

}
