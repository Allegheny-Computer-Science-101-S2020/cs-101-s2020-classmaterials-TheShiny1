public class StoreTransaction extends Transaction{
  double checkout(){
    double shipping = super.getProductPrice()/10;
    double res = super.getProductPrice() + shipping;
    return res;
  }
}
