public class Fact{
  public static int factorial(int n){
    if(n <= 1)
      return 1;
    return n*factorial(n-1);
  }
  public static int sum(int n){
    if(n <= 0)
      return 0;
    return n + sum(n-1);
  }
  public static void main(String[] args){
    //System.out.println(factorial(5));
    //System.out.println(sum(20));
    int n = 20;
    System.out.println(n*(n+1)/2);
  }
}
