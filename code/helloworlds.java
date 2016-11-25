public class helloworlds{
  public static void main(String[] args) {
    int num = 5;
    byte num2 = 2;
    num2 = (byte)(num + num2);

    int a = 8510;
    a = a / 1000 * 1000;
    float b = 8510;
    b = b / 1000 * 1000;
    System.out.println(a);
    System.out.println((int)(b));
    System.out.println(Integer.toBinaryString(6));
    System.out.println(Integer.toBinaryString(num));
    System.out.println(num2);

    System.out.println(true^true);

    System.out.println(2<<4);
    System.out.println(3<<4);

    int c = 5,d = 6;
    c = c + d;
    d = c - d;
    c = c - d;
    System.out.println(c+":"+d);

    int e = 12,f = 16;
    e = e ^ f;
    f = e ^ f;
    e = e ^ f;
    System.out.println(e+":"+f);
  }
}
