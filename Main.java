import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner keyedInput = new Scanner(System.in);

    //Variable representing array size is declared and initialized by user input.
    System.out.print("Please enter the size (number of integers) of your data set.\n");
    int setSize = keyedInput.nextInt();
   
    //Declared the data set array.
    int[] dataSet = new int[setSize];

    //Initialized the array using user inputs.
    System.out.print("\nNow, enter the numbers in your data set.\n");
    for (int i = 0; i < dataSet.length; i = i + 1) {

      dataSet[i] = keyedInput.nextInt();

    }

    //Original data set is printed out using a for loop. A gap is left between each value using a gap in quotation marks for the user's convenience.
    System.out.print("\nOriginal Data Set: ");
    for (int i = 0; i < dataSet.length; i = i + 1) {

      System.out.print(dataSet[i] + " ");

    }

    //This following logic allows the data to be ordered from smallest to largest.
    for (int i = 0; i < dataSet.length; i = i + 1) {

      for (int j = i; j < dataSet.length; j = j + 1) {

        if (dataSet[i] > dataSet[j] && i!=j) {
          
          //This new variable stores the original index value temporarily.
          int firstNum = dataSet[i];

          //The smaller value of the next index is assigned to the previous index.
          dataSet[i] = dataSet[j];
          
          //The next index's value is now replaced with the previous index's original value.
          dataSet[j] = firstNum;

        }
       
      }

    }

    //The ordered data set is printed out.
    System.out.print("\nOrdered Data Set: ");
    for (int i = 0; i < dataSet.length; i = i + 1) {

      System.out.print(dataSet[i] + " ");
     
    }

  }

}