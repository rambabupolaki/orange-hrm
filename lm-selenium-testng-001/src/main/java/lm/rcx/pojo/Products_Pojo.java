package lm.rcx.pojo;

import selenium.framework.common.CommonMethods;

public class Products_Pojo extends CommonMethods {
	String productName;
	String description;
	String name;
	String category;
	String subCategory;
	String cost;
	String style;
	public String getStyle() {
		if(style == null){
			this.style = generateRandomName();
		}
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getName() {
		if(name == null){
			this.name = generateRandomName();
		}
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		if(category == null){
			this.category = generateRandomName();
		}
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		if(subCategory == null){
			this.subCategory = generateRandomName();
		}
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getCost() {
		if(cost == null){
			this.cost = generateRandomNumbers(4);
		}
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getProductName() {
		if(productName == null){
			this.productName = generateRandomName();
		}
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		if(description == null){
			this.description = generateRandomName();
		}
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getskuname() {
		if(description == null){
			this.description = generateRandomName();
		}
		return description;
	}
	public void setskuname(String description) {
		this.description = description;
	}
}
