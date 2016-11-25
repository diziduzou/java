public class yuju{
  public static void main(String[] args) {
    int a = 10;
    if(a > 10) {
      System.out.println("i am bigger than ten");
    }else{
      System.out.println("i am not bigger than ten");
    }

    String str = "xuxile";
    switch (str) {
      case "xupeng":System.out.println("no");break;
      case "humin":System.out.println("no");break;
      case "xuxile":System.out.println("yes");break;
      default:break;
    }
    int b = 0;
    while (b < 50) {
      b += b;
      System.out.println(b);
      b++;
    }

    System.out.println(b);
    int bb = 0;
    do{
      System.out.println(bb);
      bb++;
    }while(bb < 10);
    // ====================for
    int num = 0;
    for(int c = 0;c <= 100;c++){
      num += c;
    }
    System.out.println(num);

    // ======================print a changfangxing
    for (int d = 0;d < 4;d++){
      for(int e = 0;e < 4;e++){
        System.out.print("*");
      }
      System.out.println();
    }

    // ======================println a trange
    for (int f = 0;f < 10;f++){
      for(int g = 0;g < f;g++){
        System.out.print("*");
      }
      System.out.println();
    }

    for (int h = 0;h < 10;h++){
      for (int i = h + 1;i < 10;i++){
        System.out.print(" ");
      }
      for (int j = 0;j <= h;j++){
        System.out.print("* ");
      }
      System.out.println();
    }

    for (int k = 0;k < 10;k++){
      for (int l = 0;l < k;l++){
        System.out.print(" ");
      }
      for (int m = k;m < 10;m++){
        System.out.print("* ");
      }
      System.out.println();
    }

    // nine nine chengfabiao
    for(int n = 0;n<10;n++){
      for(int o = 0;o < n+1;o++){
        System.out.print(n+"*"+o+"="+n*o+" ");
      }
      System.out.println();
    }
    System.out.println(getNum(10));
    System.out.println(getNum(10,0));
    System.out.println(getNum(10,0,0));
  }
  public static int getNum (int p){
    return p+5;
  }
  public static int getNum (int p,int q) {
    return p + 6;
  }
  public static int getNum (int p,int q,int r){
    return p + 7;
  }
}
