/**
 * 
 */
package csi.borges.pkg;

/**
 * @author user
 *
 */
public class DataTypes {
    public static void main(String[] args){

        // integer
        int myValue = 7_000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // overflow
        System.out.println("Overflow: " + (Integer.MAX_VALUE + 1));
        // underflow
        System.out.println("Underlow" + (Integer.MIN_VALUE - 1));


        //BYTE
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Min byte value: " + myMinByteValue);
        System.out.println("Max byte value: " + myMaxByteValue);

        //SHORT
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Min short value: " + myMinShortValue);
        System.out.println("Max short value: " + myMaxShortValue);

        //SHORT
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        long myLongValue = 2_147_483_648L;

        System.out.println("Min long value: " + myMinLongValue);
        System.out.println("Max long value: " + myMaxLongValue);
        System.out.println("My long value: " + myLongValue);


        //CASTING
        //java recognizes numbers as int by default

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinByteValue / 2);


        //Floating numbers
        float myMinFloatValue = Float.MIN_NORMAL;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("My min float value: " + myMinFloatValue);
        System.out.println("My max float value: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_NORMAL;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("My min float value: " + myMinDoubleValue);
        System.out.println("My max float value: " + myMaxDoubleValue);

        //java assumes double as standard for floating numbers
        int myIntNumber = 5 / 3 ;
        float myFloatNumber = 5f / 3f;
        double myDoubleNumber = 5d / 3d;

        System.out.println("myIntNumber = " + myIntNumber);
        System.out.println("myFloatNumber = " + myFloatNumber);
        System.out.println("myDoubleNumber = " + myDoubleNumber);


        //CHAR
        // char variables can story only one literal letter or an unicode character and are defined by '' instead of ""
        char myCharVarabiable = 'D';
        char myUnicodeChar = '\u0044';

        System.out.println(myCharVarabiable);
        System.out.println(myUnicodeChar);

        //boolean | true or false | 0 or 1
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        //String
        String myString = "This is a string";
        myString = myString + " \u00A9 2019";
        System.out.println("myString value is " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println(numberString);
    }
}
