public class interfaces{
  public static void main(String[] args) {
    Student s = new Student("nan",123);
    s.speak();
    System.out.println(s.sex);
    Xu x = new Xu("nan",70);
    x.study();
    System.out.println(x.sex);
    System.out.println(x.money);
  }
}

class Student extends Human implements Person {
  public Student (String sex,int money) {
    super(sex,money);
  }
  public Student () {
    // super();
    System.out.println("no info");
  }
  public void speak() {
    System.out.println(this.AGE);
  }
  void study() {
    System.out.println("studysss");
  }
}

class Xu extends Student implements StudentFunction{
  public Xu (String sex,int money){
    super(sex,money);
  }
  public Xu () {
    System.out.println("no info yet!");
  }
  public void study () {
    System.out.println("study");
  }
}

interface Person {
  public static final int AGE = 20;
  public void speak();
}

interface StudentFunction {
  void study();
}

abstract class Human {
  String sex;
  abstract void study();
  int money;
  public Human () {
    System.out.println("no info too");
  }
  public Human (String sex,int money) {
    this.sex = sex;
    this.money = money;
  }
}
