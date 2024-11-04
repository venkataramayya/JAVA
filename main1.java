public class main1 {
    public static void main(String[] args) {
      int[][] myNumbers = { {1, 2, 3}, {5, 6, 7} };
      myNumbers[1][1] = 9;
      System.out.println(myNumbers[1][1]); // Outputs 9 instead of 7
    }
  }
  