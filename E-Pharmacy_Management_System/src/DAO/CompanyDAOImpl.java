package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import domain.CompanyPojo;
import domain.DrugPojo;
import domain.UserPojo;
import main.Connect;
import main.Pharmacy;

public class CompanyDAOImpl implements DAO<CompanyPojo> {
	public CompanyDAOImpl() {
		
	}
	public void save(CompanyPojo company) throws Exception {
		String sql = "insert into company (NAME,ADDRESS,PHONE) values ('"+company.getName()+"' ,'"+
				company.getAddress()+"' ,'"+company.getPhone()+"' )";
			PreparedStatement pre= null;
			Connection con =Connect.getInstance();
		 pre=con.prepareStatement(sql);
		 pre.execute();
		
	}
	public void delete(CompanyPojo company) throws Exception {
		String sql = "delete from company where NAME='"+company.getName()+"' ";
		PreparedStatement pre= null;
		Connection con =Connect.getInstance();
		 pre=con.prepareStatement(sql);
		 pre.execute();
		
	}
	public void update(CompanyPojo company) throws Exception {
		String sql = "update company set ADDRESS='"+company.getAddress()+"' ,PHONE='"+company.getPhone()
		+"' where NAME='"+company.getName()+"' ";
		 PreparedStatement pre= null;
		Connection con =Connect.getInstance();
		 pre=con.prepareStatement(sql);
		 pre.execute();
		
	}
	public List<ResultSet> getAll() throws Exception{
		String sql = "select * from company";
		PreparedStatement pre= null;
		Connection con =Connect.getInstance();
		 pre=con.prepareStatement(sql);
		ResultSet res=pre.executeQuery();
		List<ResultSet> lst = new ArrayList<ResultSet>();
		lst.add(res);
		 return lst;
	}
	public boolean isExist(CompanyPojo company) throws Exception {
		 boolean check =false;
		 String sql = null;//"select BARCODE from drugs where BARCODE='"+drug.getBarcode()+"' ";
		 PreparedStatement pre= null;
			Connection con =Connect.getInstance();
	        pre=con.prepareStatement(sql);
	        ResultSet res=pre.executeQuery();
            if(res.next()){
          check=true;
            }
            return check;
	}
	public Optional<CompanyPojo> get(long company) throws Exception{
		String sql = "select * from drugs where BARCODE='"+company+"' ";
		Connection con =Connect.getInstance();
		 PreparedStatement pre= null;
        pre=con.prepareStatement(sql);
		ResultSet res=pre.executeQuery();
		DrugPojo drugObj = new DrugPojo();
	    if(res.next()){
	          drugObj.setName(res.getString("NAME"));
	          String type = res.getString("TYPE");
	          drugObj.setType(type);
	          
	          String barcode = res.getString("BARCODE");
	          drugObj.setBarcode(barcode);
	          String code = res.getString("CODE");
	          drugObj.setCode(code);
	          String dose = res.getString("DOSE");
	          drugObj.setDose(dose);
	          String cost_price = res.getString("COST_PRICE");
	          drugObj.setCost_price(cost_price);
	          String sell_price = res.getString("SELLING_PRICE");
	          drugObj.setSelling_price(sell_price);
	          String company_name = res.getString("COMPANY_NAME");
	          drugObj.setCompany_name(company_name);
	          String quantity = res.getString("QUANTITY");
	          drugObj.setQuantity(quantity);
	               String day = res.getString("PRODUCTION_DATE").split("-")[0];
	               String month = res.getString("PRODUCTION_DATE").split("-")[1];
	               String year = res.getString("PRODUCTION_DATE").split("-")[2];
	               drugObj.setProduction_date(day+"-"+month+"-"+year);
	                String ex_Day = res.getString("EXPIRATION_DATE").split("-")[0];
	               String ex_Month = res.getString("EXPIRATION_DATE").split("-")[1];
	               String ex_Year = res.getString("EXPIRATION_DATE").split("-")[2];
	               drugObj.setExpiration_date(ex_Day+"-"+ex_Month+"-"+ex_Month);
	               String sec = res.getString("PLACE").split("-")[0];
	               String pla = res.getString("PLACE").split("-")[1];
	               drugObj.setPlace(sec+"-"+pla);
	    }
		return null;//Optional.ofNullable(drugObj);
	}

}
