public class model {
  public static void main(String[] args) {
    Single s = Single.getInstance();
    Zi z = new Zi();
    z.show();
    z.sayHi();
    z.sayHi("haha");

    Student xu = new Student("xuxile",0);
    xu.show();
  }
}

class Fu {
  int num = 4;
  public void sayHi() {
    System.out.println("hi");
  }
}

class Zi extends Fu {
  int num = 5;
  public void sayHi(String hi) {
    System.out.println(hi);
  }
  void show() {
    System.out.println(super.num + this.num);
    System.out.println(super.num);
  }
}

class Person {
  int age;
  String name;
  public Person (String name,int age) {
    this.name = name;
    this.age = age;
  }
}
class Student extends Person {

  public Student (String name,int age) {
    super(name,age);
  }
  public void show() {
    System.out.println("i am a student named " + this.name + ", and i am "+this.age+"years old");
  }
}

class Single {
  private Single() {

  }
  private static Single s = new Single();

  public static Single getInstance () {
    return s;
  }

}
