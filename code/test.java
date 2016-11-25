public class test {
  public static void main(String[] args) throws ClassNotFoundException{
    String str = "xx";
    Class cls1 = str.getClass();
    System.out.println(cls1.isPrimitive());
  }
}
