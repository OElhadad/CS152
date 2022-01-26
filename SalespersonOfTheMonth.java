/*
 * Omar Elhadad CS 152 Homework 1 Problem 1
 */

// Importing necessary extensions for data
// Writing and reading files
import java.io.File;
// Coverage of IOException error
import java.io.IOException;
// used to scan inputs
import java.util.Scanner;


public class Problem1 {

  public static void main(String[] args) throws IOException {
    // Initializing text file object to read given text file
    File textFile = new File("salesSlips2.txt");
    // Creation of two arrays, data to represent text file and sales to hold values for final output
    String[][] data = new String[3][500];
    String[][] sales = new String[8][6];
    // Assignment of labels for table, X values
    sales[0][1] = "Total";
    sales[0][2] = "1";
    sales[0][3] = "2";
    sales[0][4] = "3";
    sales[0][5] = "4";
    // Assignment of labels for table, Y values
    sales[1][0] = "Total";
    sales[2][0] = "1";
    sales[3][0] = "2";
    sales[4][0] = "3";
    sales[5][0] = "4";
    sales[6][0] = "5";
    sales[7][0] = "6";
    // Mass creation of variables representing each product and their respective salesperson
    // Holds respective values while scanning
    double sales1Product1 = 0.0;
    double sales1Product2 = 0.0;
    double sales1Product3 = 0.0;
    double sales1Product4 = 0.0;
    double sales1Product5 = 0.0;
    double sales1Product6 = 0.0;

    double sales2Product1 = 0.0;
    double sales2Product2 = 0.0;
    double sales2Product3 = 0.0;
    double sales2Product4 = 0.0;
    double sales2Product5 = 0.0;
    double sales2Product6 = 0.0;

    double sales3Product1 = 0.0;
    double sales3Product2 = 0.0;
    double sales3Product3 = 0.0;
    double sales3Product4 = 0.0;
    double sales3Product5 = 0.0;
    double sales3Product6 = 0.0;

    double sales4Product1 = 0.0;
    double sales4Product2 = 0.0;
    double sales4Product3 = 0.0;
    double sales4Product4 = 0.0;
    double sales4Product5 = 0.0;
    double sales4Product6 = 0.0;

    // !!Remember to close!!
    // Initializing new scanner object to scan text file
    Scanner fileScanner = new Scanner(textFile);
    // Forcing scanner to skip over first line, gives layout of file
    fileScanner.nextLine();
    // while loop to iterate through file and store values, purpose is to check first value for
    // salesperson
    // then based on salesperson, determine product number and add to total
    while (fileScanner.hasNextLine()) {
      int row = 0;
      String line = fileScanner.nextLine();
      // splits file based off of comma
      data[row] = line.split(",");
      // variable for each respective value
      // salesperson always first of 3 values
      int salesPerson = Integer.parseInt(data[row][0]);
      // productNumber always second of 3 values
      double productNumber = Double.parseDouble(data[row][1]);
      // amountNumber always third of 3 values
      double amountNumber = Double.parseDouble(data[row][2]);
      // if statement to check salesperson, then product number, then add to total
      if (salesPerson == 1) {
        if (productNumber == 1) {
          sales1Product1 += amountNumber;
        } else if (productNumber == 2) {
          sales1Product2 += amountNumber;
        } else if (productNumber == 3) {
          sales1Product3 += amountNumber;
        } else if (productNumber == 4) {
          sales1Product4 += amountNumber;
        } else if (productNumber == 5) {
          sales1Product5 += amountNumber;
        } else if (productNumber == 6) {
          sales1Product6 += amountNumber;
        }
      }
      // if statement to check salesperson, then product number, then add to total
      if (salesPerson == 2) {
        if (productNumber == 1) {
          sales2Product1 += amountNumber;
        } else if (productNumber == 2) {
          sales2Product2 += amountNumber;
        } else if (productNumber == 3) {
          sales2Product3 += amountNumber;
        } else if (productNumber == 4) {
          sales2Product4 += amountNumber;
        } else if (productNumber == 5) {
          sales2Product5 += amountNumber;
        } else if (productNumber == 6) {
          sales2Product6 += amountNumber;
        }
      }
      // if statement to check salesperson, then product number, then add to total
      if (salesPerson == 3) {
        if (productNumber == 1) {
          sales3Product1 += amountNumber;
        } else if (productNumber == 2) {
          sales3Product2 += amountNumber;
        } else if (productNumber == 3) {
          sales3Product3 += amountNumber;
        } else if (productNumber == 4) {
          sales3Product4 += amountNumber;
        } else if (productNumber == 5) {
          sales3Product5 += amountNumber;
        } else if (productNumber == 6) {
          sales3Product6 += amountNumber;
        }
      }
      // if statement to check salesperson, then product number, then add to total
      if (salesPerson == 4) {
        if (productNumber == 1) {
          sales4Product1 += amountNumber;
        } else if (productNumber == 2) {
          sales4Product2 += amountNumber;
        } else if (productNumber == 3) {
          sales4Product3 += amountNumber;
        } else if (productNumber == 4) {
          sales4Product4 += amountNumber;
        } else if (productNumber == 5) {
          sales4Product5 += amountNumber;
        } else if (productNumber == 6) {
          sales4Product6 += amountNumber;
        }
      }
      // iterate to push line forward
      row++;
    }

    // Close scanner to prevent open file/security issues
    fileScanner.close();

    // Another mass assignment of variables, calculates total of each product and assigns them to a
    // spot in array
    sales[1][1] = "0.00";
    sales[2][1] = String.valueOf(sales1Product1 + sales2Product1 + sales3Product1 + sales4Product1);
    sales[3][1] = String.valueOf(sales1Product2 + sales2Product2 + sales3Product2 + sales4Product2);
    sales[4][1] = String.valueOf(sales1Product3 + sales2Product3 + sales3Product3 + sales4Product3);
    sales[5][1] = String.valueOf(sales1Product4 + sales2Product4 + sales3Product4 + sales4Product4);
    sales[6][1] = String.valueOf(sales1Product5 + sales2Product5 + sales3Product5 + sales4Product5);
    sales[7][1] = String.valueOf(sales1Product6 + sales2Product6 + sales3Product6 + sales4Product6);
    // Similar to assignments above but calculates total for each salesperson and then assigns
    sales[1][2] = String.valueOf(sales1Product1 + sales1Product2 + sales1Product3 + sales1Product4
        + sales1Product5 + sales1Product6);
    sales[1][3] = String.valueOf(sales2Product1 + sales2Product2 + sales2Product3 + sales2Product4
        + sales2Product5 + sales2Product6);
    sales[1][4] = String.valueOf(sales3Product1 + sales3Product2 + sales3Product3 + sales3Product4
        + sales3Product5 + sales3Product6);
    sales[1][5] = String.valueOf(sales4Product1 + sales4Product2 + sales4Product3 + sales4Product4
        + sales4Product5 + sales4Product6);
    // Final mass assignment of remaining values in their respective spots
    sales[2][2] = String.valueOf(sales1Product1);
    sales[3][2] = String.valueOf(sales1Product2);
    sales[4][2] = String.valueOf(sales1Product3);
    sales[5][2] = String.valueOf(sales1Product4);
    sales[6][2] = String.valueOf(sales1Product5);
    sales[7][2] = String.valueOf(sales1Product6);

    sales[2][3] = String.valueOf(sales2Product1);
    sales[3][3] = String.valueOf(sales2Product2);
    sales[4][3] = String.valueOf(sales2Product3);
    sales[5][3] = String.valueOf(sales2Product4);
    sales[6][3] = String.valueOf(sales2Product5);
    sales[7][3] = String.valueOf(sales2Product6);

    sales[2][4] = String.valueOf(sales3Product1);
    sales[3][4] = String.valueOf(sales3Product2);
    sales[4][4] = String.valueOf(sales3Product3);
    sales[5][4] = String.valueOf(sales3Product4);
    sales[6][4] = String.valueOf(sales3Product5);
    sales[7][4] = String.valueOf(sales3Product6);

    sales[2][5] = String.valueOf(sales4Product1);
    sales[3][5] = String.valueOf(sales4Product2);
    sales[4][5] = String.valueOf(sales4Product3);
    sales[5][5] = String.valueOf(sales4Product4);
    sales[6][5] = String.valueOf(sales4Product5);
    sales[7][5] = String.valueOf(sales4Product6);

    // Addition of Sales Person Y label
    System.out.printf("%42s", "Sales Person");
    System.out.println(" ");
    // Declaration of variable used to make spaces after every 6th column
    int spacer = 0;
    // Double nested for loop used to traverse, format, and print every value in 2D sales array
    for (int row = 0; row < sales.length; row++) {
      for (int column = 0; column < sales[row].length; column++) {
        // Checks if any spots in array return null (mainly [0][0]) and creates a blank space
        // instead
        if (sales[row][column] == null) {
          // spacing formatting using printf
          System.out.printf("%10s", " ");
          // iterate spacer on either true or false outcome (true)
          spacer++;
        } else {
          // if there is no null space, print current spot in array
          System.out.printf("%10.6s", sales[row][column]);
          // iterate spacer on either true or false outcome (false)
          spacer++;
        }
        // Checks if spacer is divisible by 6, if true; forces print to move to next line
        if (spacer % 6 == 0) {
          System.out.println("");
        }
      }
    }

  }
}


