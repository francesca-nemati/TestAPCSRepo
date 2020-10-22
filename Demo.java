public class Demo {

  public static void main(String[] args) {
    int n;
    if (args.length > 0) {
      n = Integer.parseInt(args[0]);
    }
    else n = 5;
    printLoop(n);
  }

  public static void printLoop(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = i-1; j < n; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }

  public static String arrToString(int[] arr) {
    String sArr = "{" ;
    for (int i = 0; i < arr.length; i++) {
      if (i != arr.length-1) sArr = sArr + arr[i] + ", ";
      else sArr = sArr + arr[i];
    }
    sArr = sArr + "}";
    return sArr;
  }

  public static String arrayDeepToString(int[][] arr) {
    String sDArr = "{";
    for (int i = 0; i < arr.length; i++) {
      if (i != arr.length-1) sDArr = sDArr + arrToString(arr[i]) + ", ";
      else sDArr = sDArr + arrToString(arr[i]);
    }
    sDArr = sDArr + "}";
    return sDArr;
  }

  public static int[][] create2DArray(int rows, int cols,int maxValue){
    int[][] arr = new int[rows][cols];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int)(Math.random() * maxValue + 0.4);
      }
    }
    return arr;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols,int maxValue){
    int[][] arr = new int[rows][];
    for (int i = 0; i < arr.length; i++) {
      int r_cols = (int)(Math.random() * cols + 0.4);
      arr[i] = new int[r_cols];
      for (int j = 0; j < arr[i].length; j++) {
        arr[i][j] = (int)(Math.random() * maxValue + 0.4);
      }
    }
    return arr;
  }

}
