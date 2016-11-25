public class duotai{
  public static void main(String[] args) {
    AnimalEat(new Cat());
    AnimalEat(new Dog());

    DoStudent s = new DoStudent();
    s.dosome(new SmallClass());
    s.dosome(new BigClass());

    Fu f = new Zi();
    Zi z = new Zi();
    System.out.println(f.num);
    System.out.println(z.num);
    f.method2();
    f.method1();
  }
  public static void AnimalEat (Animal a) {
    a.eat();
    if(a instanceof Cat) {
      Cat c = (Cat) a;
      c.sleep();
    }
  }
}

class DoStudent {
  public void dosome (YoungStudent s) {
    s.study();
    s.sleep();
    s.project();
  }
}

abstract class Animal {
  abstract void eat();
}

class Dog extends Animal{
  void eat () {
    System.out.println("dog eat bone");
  }
}

class Cat extends Animal {
  void sleep () {
    System.out.println("cat is sleepping");
  }
  void eat () {
    System.out.println("cat eat fish");
  }
}

// ========================you er yuan
abstract class YoungStudent implements Project{
  public abstract void study ();
  public abstract void sleep();
}

interface Project {
  void project();
}

class SmallClass extends YoungStudent{
  public void study () {
    System.out.println("small math");
  }
  public void sleep () {
    System.out.println("sleep 2 hours");
  }
  public void project () {
    System.out.println("improve to BigClass");
  }

}

class BigClass extends YoungStudent{
  public void study () {
    System.out.println("big math");
  }
  public void sleep () {
    System.out.println("sleep 2.5 hours");
  }
  public void project () {
    System.out.println("improve to primary school");
  }
}

// ================================fu yu zi
class Fu {
  int num = 5;
  void method1 () {
    System.out.println("fu method1");
  }
  void method2 () {
    System.out.println("fu method2");
  }
}
class Zi extends Fu {
  int num = 8;
  void method1 () {
    System.out.println("zi method1");
  }
  void method3 () {
    System.out.println("zi method3");
  }
}
