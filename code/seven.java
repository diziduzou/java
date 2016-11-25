public class seven {
  public static void main(String[] args) {
    // ========abstract
    Manger xupeng = new Manger("xupeng","becf0035",7000,500);
    xupeng.work();
    System.out.println(xupeng.getBouns());
    Test t = new Test();
    t.getTime();
  }
}

abstract class Employee {
  private String name;
  private String id;
  private double pay;
  public Employee (String name,String id,double pay){
    this.name = name;
    this.id = id;
    this.pay = pay;
  }
  public abstract void work();
}

class Manger extends Employee{
  private int bonus;
  public Manger (String name,String id,double pay,int bonus){
    super(name,id,pay);
    this.bonus = bonus;
  }
  public int getBouns(){
    return this.bonus;
  }
  public void work() {
    System.out.println("guanli");
  }
}

abstract class GetTime {
  public final void getTime() {
    long start = System.currentTimeMillis();
    returnCode();
    long end = System.currentTimeMillis();
    System.out.println(end - start);
  }
  abstract public void returnCode();
}

class Test extends GetTime{
  public void returnCode() {
    for (int i =0;i<10;i++){
      System.out.print(" "+i);
    }
    System.out.println();
  }
}
