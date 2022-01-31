/*
 * Omar Elhadad CS 152 - Problem 2
 */

public class DigitCounter {

  // Overall idea is to convert input to string, split by decimal point, return left or right
  // depending on function

  // integer version
  public static int digits(int number) {
    // create holder array for both sides
    String[] holder = new String[2];
    // converts input to string for easier handling
    String newNumber = String.valueOf(number);
    // splits string by decimal point, \\. necessary for java to see decimal character
    holder = newNumber.split("\\.");
    // check to see if side has data, if not, return 0
    if (holder[0] == null) {
      return 0;
    } else {
      // return length of index 0, left side of number
      return holder[0].length();
    }
  }

  // double version
  public static double digits(double number) {
    // create holder array for both sides
    String[] holder = new String[2];
    // converts input to string for easier handling
    String newNumber = String.valueOf(number);
    // splits string by decimal point, see line 19
    holder = newNumber.split("\\.");
    // check to see if side has data, if not, return 0
    if (holder[0] == null) {
      return 0;
    } else {
      // return length of index 0, left side of number
      return holder[0].length();
    }
  }

  // float version, similar to double
  public static float digits(float number) {
    // create holder array for both sides
    String[] holder = new String[2];
    // converts input to string for easier handling
    String newNumber = String.valueOf(number);
    // splits string by decimal point, see line 19
    holder = newNumber.split("\\.");
    // check to see if side has data, if not, return 0
    if (holder[0] == null) {
      return 0;
    } else {
      // return length of index 0, left side of number
      return holder[0].length();
    }
  }

  // String version, requires less conversion
  public static int digits(String number) {
    // create holder array for both sides
    String[] holder = new String[2];
    // splits string by decimal point, see line 19
    holder = number.split("\\.");
    // check to see if side has data, if not, return 0
    if (holder[0] == null) {
      return 0;
    } else {
      // return length of index 0, left side of number
      return holder[0].length();
    }
  }


  // Switch to decimals, extremely similar to above functions but returns index 1 (right side of
  // decimal)
  // integer version
  public static int decimals(int number) {
    // create holder array for both sides
    String[] holder = new String[2];
    // converts input to string for easier handling
    String newNumber = String.valueOf(number);
    // splits string by decimal point, see line 19
    holder = newNumber.split("\\.");
    // new check, checks length of entire array, if it returns 1, it is assumed that the number is
    // only
    // contained on the left side of the decimal, method only cares for right side
    if (holder.length == 1) {
      return 0;
    } else {
      // return length of index 1, right side of number
      return holder[1].length();

    }
  }

  // double version
  public static double decimals(double number) {
    // create holder array for both sides
    String[] holder = new String[2];
    // converts input to string for easier handling
    String newNumber = String.valueOf(number);
    // splits string by decimal point, see line 19
    holder = newNumber.split("\\.");
    // new check, see line 86-87
    if (holder.length == 1) {
      return 0;
    } else {
      // return length of index 1, right side of number
      return holder[1].length();
    }
  }

  // float version
  public static float decimals(float number) {
    // create holder array for both sides
    String[] holder = new String[2];
    // converts input to string for easier handling
    String newNumber = String.valueOf(number);
    // splits string by decimal point, see line 19
    holder = newNumber.split("\\.");
    // new check, see line 86-87
    if (holder.length == 1) {
      return 0;
    } else {
      // return length of index 1, right side of number
      return holder[1].length();
    }
  }

  // string version, requires less conversion
  public static int decimals(String number) {
    // create holder array for both sides
    String[] holder = new String[2];
    // splits string by decimal point, see line 19
    holder = number.split("\\.");
    // new check, see line 86-87
    if (holder.length == 1) {
      return 0;
    } else {
      // return length of index 1, right side of number
      return holder[1].length();
    }
  }
}
