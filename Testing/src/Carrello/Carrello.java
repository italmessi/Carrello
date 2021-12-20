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
		//aggiungolineadicommento
	}
	public void removeOneProduct() {
		amount--;
	}
}
