package conversions;

import java.text.NumberFormat;

public class PrimitivesToStrings {

    public static void main(String[] args) {

        int intValue = 42;
        // Helper class - note cap
        String fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        // Helper class
        String fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        // note underscores
        long longValue = 10_000_000;
        // formatter
        NumberFormat formatter = NumberFormat.getNumberInstance();
        String formatted = formatter.format(longValue);
        System.out.println(formatted);

    }

}
