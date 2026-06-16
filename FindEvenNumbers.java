import java.util.Scanner;

public class FindEvenNumbers {
    public int[] findEvenNumbers(int[] numbers) {
    int[] evenNumbers = new int[0];    
    
    for (int i = 0; i < number.length; i++) {
        if (numbers[i] % 2 == 0) {
            int[] newEvenNumbers = new int[evenNumbers.length + 1];
            System.arraycopy(evenNumbers, 0, newEvenNumbers, 0, evenNumbers.length);
            newEvenNumbers[evenNumbers.length] = numbers[i];
            evenNumbers = newEvenNumbers;
        }
    }
    
    return evenNumbers;

 }
 
 public static void main(String[] args) {
     int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     
     FindEvenNumbers obj = new FindEvenNumbers();
     int[] evenNumbers = obj.findEvenNumbers(numbers);
     
     System.out.print("Even numbers: ");
     for (int num: evenNumbers) {
         System.out.print(num + " ");
     }
 }
