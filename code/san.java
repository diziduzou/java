public class san{
  public static void main(String[] args) {
    int[] x = new int[]{1,2,3};
    for (int i = 0;i<x.length;i++){
      System.out.println(x[i]);
    }
    int[] y = new int[]{3,2,12,4,22};
    printArr(y);

    int [] x,y [];
    x[0] = y;
  }
  public static void printArr (int[] x){
    for (int k = 0;k < x.length;k++){
      for (int l = 0;l < x.length;l++){
        if(x[k] > x[l]){
          x[k] = x[k] ^ x[l];
          x[l] = x[k] ^ x[l];
          x[k] = x[k] ^ x[l];
        }
      }
    }
    for(int a = 0;a < x.length;a++) {
      System.out.print(x[a]);
      if(a+1 == x.length){
        break;
      }
      System.out.print(",");
    }
    System.out.println();
    int max = x[0];
    int min = x[0];
    for(int i = 0;i < x.length;i++){
      max = x[i] > max ? x[i] : max;
    }
    for(int j = 0;j < x.length;j++){
      min = x[j] < min ? x[j] : min;
    }
    System.out.println(max);
    System.out.println(min);

  }
}
