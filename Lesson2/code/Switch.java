public class Switch{
  public void swap(int b1, int b2){
    int temp = b1;
    b1 = b2;
    b2 = temp;
  }
  public static void main(String [] args){
    int b1 = 100;
    int b2 = 200;
    swap(b1, b2);
    System.out.println(b1 + "\t" + b2);
  }
}
