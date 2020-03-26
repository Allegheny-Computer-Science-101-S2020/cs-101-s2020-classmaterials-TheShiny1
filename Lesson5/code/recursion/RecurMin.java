public class RecurMin{
  public static int findMin(int a[], int index, int compare){
    /*if (index == a.length-1){
      if(a[index] < compare){
        compare = a[index];
      }
      return compare;
    } else {
      if(a[index] < compare){
        compare = a[index];
      }
      return findMin(a, index + 1, compare);
    }
  }
  */
  if(index[a] < compare)
    return compare;
  if(index == a.length-1)
    return compare;
  else 
    return findMin(a, index + 1, compare);

  public static void main(String[] args){
    int a[] == {8,3,10,5,2};
    int min = findMin(a[],0,100);
  }
}
