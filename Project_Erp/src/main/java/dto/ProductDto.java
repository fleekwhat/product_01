package dto;

public class ProductDto {
	private int num;
	private String name;
	private String description;
	private int price;
	private String status;
	private String imagePath;

	public ProductDto() {
		// 기본 생성자
	}

	// 🔥 여기에 추가된 생성자!
	public ProductDto(String name, String description, int price, String status, String imagePath) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.status = status;
		this.imagePath = imagePath;
	}

	// Getter / Setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
}
