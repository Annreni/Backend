package cafe.managment.dto;

import cafe.managment.model.Category;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor


public class ProductDto {
    private Long id;

    private String name;
    private Double costPrice;
    private Double salePrice;
    private int noOfQuantity;
    private boolean isActivated;

    private Long categoryId;

   private List<MultipartFile> imagesUrl;

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

public Long getCategoryId() {
	return categoryId;
}

public void setCategoryId(Long categoryId) {
	this.categoryId = categoryId;
}

public List<MultipartFile> getImagesUrl() {
	return imagesUrl;
}

public void setImagesUrl(List<MultipartFile> imagesUrl) {
	this.imagesUrl = imagesUrl;
}
   
}
