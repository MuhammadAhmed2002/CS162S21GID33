package domain;

public class PurchasePojo {
	private String barcode;
	private String name;
	private String type;
	private String company_name;
	private String quantity;
	private String price;
	private String amount;
	public PurchasePojo() {}
	public PurchasePojo(String barcode, String name, String type, String company_name, String quantity, String price,
			String amount) {
		super();
		this.barcode = barcode;
		this.name = name;
		this.type = type;
		this.company_name = company_name;
		this.quantity = quantity;
		this.price = price;
		this.amount = amount;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	

}
