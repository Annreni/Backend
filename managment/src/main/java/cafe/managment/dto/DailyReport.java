package cafe.managment.dto;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class DailyReport {

    private String product;
    private int quantity;
    private Double totelPrice;


    public DailyReport(String product,int quantity, Double totelPrice) {
        this.product = product;
        this.totelPrice = totelPrice;
        this.quantity = quantity;
    }


	public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Double getTotelPrice() {
		return totelPrice;
	}


	public void setTotelPrice(Double totelPrice) {
		this.totelPrice = totelPrice;
	}
    
}
