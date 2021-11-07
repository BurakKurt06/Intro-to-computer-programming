import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
     int[] lotteryNumbers = new int[5];
     public int[] getLotteryNumbers() {
     return lotteryNumbers;
     }
//==========
     Main() {Random randomVal = new Random();
     for (int i = 0; i < lotteryNumbers.length; i++) {
     lotteryNumbers[i] = randomVal.nextInt((50 - 1) + 1);
     }
     }
     int compare(int[] personLottery) {
     int count = 0;
     Arrays.sort(lotteryNumbers);
     Arrays.sort(personLottery);
     for (int i = 0; i < lotteryNumbers.length; i++) {
     if (lotteryNumbers[i] == personLottery[i]) {
     count++;
     }
     }
     return count;
     }
//==========
     public static void main(String[] args) {
     int[] personLotteryNum = new int[5];
     int matchNum;
     Main lnum = new Main();
     Scanner input = new Scanner(System.in);
//==========
     System.out.println("Enten the five digit lottery number");
     for (int i = 0; i < personLotteryNum.length; i++) {
     System.out.println("Enter the digit " + (i + 1) + " :");
     personLotteryNum[i] = input.nextInt();
     }
//==========
     matchNum = lnum.compare(personLotteryNum);
     if (matchNum == 5)
     System.out.println("YOU WIN!!");
     else
     System.out.println("YOU LOSS!!");   
     System.out.println("Computer Generated Lottery Number :");
     System.out.print("|");
//==========
     for (int i = 0; i < lnum.getLotteryNumbers().length; i++) {
     System.out.print(lnum.getLotteryNumbers()[i] + "|");
     }
     System.out.println("\n\nLottery Number Of user:");
     System.out.print("|");
//==========
     for (int i = 0; i < personLotteryNum.length; i++) {
     System.out.print(personLotteryNum[i] + "|");
     }
     System.out.println("Number Of digit matched: " + matchNum);
     }
     }