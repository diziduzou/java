


public class five {
  public static void main(String[] args) {
    Person xu = new Person(24,"xupeng");
    Person hu = new Person(20,"humin");
    boolean b = xu.compare(hu);
    System.out.println(b);
    System.out.println(xu.getAge());

    Person xuxile = new Person(0,"xuxile");
    System.out.println(Person.instrest);
    int[] x = {2,3,1,-11,101};
    System.out.println(ArrayTools.getMax(x));
    System.out.println(ArrayTools.getMin(x));
  }

}

class ArrayTools {
  public static int getMax(int[] arr){
    int max = arr[0];
    for (int a = 0;a < arr.length;a++){
      max = arr[a] > max ? arr[a] : max;
    }
    return max;
  }
  public static int getMin(int[] arr) {
    int min = arr[0];
    for (int b = 0;b < arr.length;b++){
      min = arr[b] < min ? arr[b] : min;
    }
    return min;
  }
}

class Person {
  private int age;
  private String name;
  static String instrest = "cry";
  public Person (int age) {
    this.age = age;
  }
  public Person (int age,String name) {
    this(age);
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public int getAge () {
    return this.age;
  }
  public boolean compare (Person p){
    return this.age == p.age;
  }
  public String getName () {
    return this.name;
  }
}
