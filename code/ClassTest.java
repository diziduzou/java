public class ClassTest {
  public static void main(String[] args) throws ClassNotFoundException {
    String str1 = "xupeng";
    Class cls1 = str1.getClass();
    Class cls2 = String.class;
    Class cls3 = Class.forName("java.lang.String");

    System.out.println(cls1);
    System.out.println(cls2);
    System.out.println(cls3);

    System.out.println(cls1.isPrimitive());
    System.out.println(Integer.class == int.class);
    System.out.println(int.class == Integer.TYPE);
  }
}
