package cafe.managment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor



public class CategoryDto {
    private Long id;
    private String name;
    private String description;
    private boolean isActivted;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isActivted() {
		return isActivted;
	}
	public void setActivted(boolean isActivted) {
		this.isActivted = isActivted;
	}
    
}
