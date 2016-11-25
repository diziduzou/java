public class object {
  public static void main(String[] args) {
    Car posche = new Car();
    posche.run();

    People xu = new People("26");
    People xus = new People(25);
    xu.setAge(24);
    System.out.println(xu.getAge());
  }

}
class People {
  private int age;
  public void setAge (int age) {
    this.age = age;
  }
  public int getAge () {
    return this.age;
  }
  public People() {
    System.out.println("done the contructor function");
  }
  public People(String name){
    System.out.println("contructor"+name+"h");
  }
  public People(int age){
    this.age = age;
    System.out.println("contructor"+this.age);
  }
  {
    System.out.println("done");
  }
}
class Car {
  String color = "red";
  int number = 4;
  void run () {
    System.out.println("i have a "+this.number+" wheels and "+this.color+" car");
  }
}
