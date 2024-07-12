package cafe.managment.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="order_id")
    private Long id;

    private String customerName;
    private long mobile;
    private String place;
    private LocalDate orderDate;

    private double grandTotelPrize;
    private int quantity;
    private String paymentMethod;
    private boolean isAccept;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private List<OrderDetails> orderDetailList;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getGrandTotelPrize() {
		return grandTotelPrize;
	}
	public void setGrandTotelPrize(double grandTotelPrize) {
		this.grandTotelPrize = grandTotelPrize;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public boolean isAccept() {
		return isAccept;
	}
	public void setAccept(boolean isAccept) {
		this.isAccept = isAccept;
	}
	public List<OrderDetails> getOrderDetailList() {
		return orderDetailList;
	}
	public void setOrderDetailList(List<OrderDetails> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
    
}
