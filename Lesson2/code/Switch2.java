class MySwitch{
  int box1 = 0;
  int box2 = 0;
  public void swap(MySwitch obj){
    int temp = obj.box1;
    obj.box1 = obj.box2;
    obj.box2 = temp;
  }
}
public class Switch2{
  public static void main(String [] args){
    int b1 = 100;
    int b2 = 200;
    MySwitch obj = new MySwitch();
    obj.box1 = b1;
    obj.box2 = b2;
    obj.swap(obj);
    System.out.println(obj.box1 + "\t" + obj.box2);
  }
}
