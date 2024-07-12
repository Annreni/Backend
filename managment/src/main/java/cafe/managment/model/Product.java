package cafe.managment.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="product_id")
    private Long id;

    private String name;
    private Double costPrice;
    private Double salePrice;
    private int noOfQuantity;
    private boolean isActivated;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;
    @NonNull
    @ElementCollection
    @CollectionTable(name = "product_images_url", joinColumns = @JoinColumn(name = "product_id"))
    private List<String> imagesUrl;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}
	public Double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
	public int getNoOfQuantity() {
		return noOfQuantity;
	}
	public void setNoOfQuantity(int noOfQuantity) {
		this.noOfQuantity = noOfQuantity;
	}
	public boolean isActivated() {
		return isActivated;
	}
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public List<String> getImagesUrl() {
		return imagesUrl;
	}
	public void setImagesUrl(List<String> imagesUrl) {
		this.imagesUrl = imagesUrl;
	}
    
    

}
