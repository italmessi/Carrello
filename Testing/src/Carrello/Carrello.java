package Carrello;

public class Carrello {

	private int amount;
	
	
	public Carrello() {
		amount=0;
	}
	
	public int getAmount() {
		return amount;
	}
	public void InsertOneProduct() {
		amount++;
	}
	public void removeOneProduct() {
		amount--;
	}
}
