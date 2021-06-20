package domain;

public class DrugPojo {
	private String name;
	private String type;
	private String barcode;
	private String dose;
	private String code;
	private String cost_price;
	private String selling_price;
	private String expiry;
	private String company_name;
	private String production_date;
	private String expiration_date;
	private String place;
	private String quantity;
	public DrugPojo() {};
	public DrugPojo(String name, String type, String barcode, String dose, String code, String cost_price,
			String selling_price, String expiry, String company_name, String production_date, String expiration_date,
			String place, String quantity) {
		super();
		this.name = name;
		this.type = type;
		this.barcode = barcode;
		this.dose = dose;
		this.code = code;
		this.cost_price = cost_price;
		this.selling_price = selling_price;
		this.expiry = expiry;
		this.company_name = company_name;
		this.production_date = production_date;
		this.expiration_date = expiration_date;
		this.place = place;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getBarcode() {
		return barcode;
	}
	public String getDose() {
		return dose;
	}
	public String getCode() {
		return code;
	}
	public String getCost_price() {
		return cost_price;
	}
	public String getSelling_price() {
		return selling_price;
	}
	public String getExpiry() {
		return expiry;
	}
	public String getCompany_name() {
		return company_name;
	}
	public String getProduction_date() {
		return production_date;
	}
	public String getExpiration_date() {
		return expiration_date;
	}
	public String getPlace() {
		return place;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setCost_price(String cost_price) {
		this.cost_price = cost_price;
	}
	public void setSelling_price(String selling_price) {
		this.selling_price = selling_price;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public void setProduction_date(String production_date) {
		this.production_date = production_date;
	}
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	

}
