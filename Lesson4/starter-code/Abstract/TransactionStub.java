public class TransactionStub{
	public static void main(String[] args){

		Transaction ts1 = new OnlineTransaction();
		ts1.setProductPrice(20.5);
		double trans_amt1 = ts1.checkout();
		System.out.println(trans_amt1);


		Transaction ts2 = new StoreTransaction();
    ts2.setProductPrice(100);
		double trans_amt2 = ts2.checkout();
		System.out.println(ts2.getProductPrice());

	}


}
