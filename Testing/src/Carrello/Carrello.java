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
		System.out.println("modifica da remoto")
	}
	public void removeOneProduct() {
		amount--;
	}
}
