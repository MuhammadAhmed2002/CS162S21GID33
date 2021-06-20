package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import domain.DrugPojo;
import domain.PurchasePojo;
import domain.UserPojo;
import main.Connect;
import main.Pharmacy;

public class PurchaseDAOImpl implements DAO<PurchasePojo> {
	public PurchaseDAOImpl() {
		
	}
	public void save(PurchasePojo purchase) throws Exception {
		String sql = "insert into purchase (BARCODE,NAME,TYPE,COMPANY_NAME,QUANTITY,PRICE,AMOUNT) values ('"+purchase.getBarcode()+"' ,'"+purchase.getName()
		+"' ,'"+purchase.getType()+"' ,'"+purchase.getCompany_name()+"' ,'"+purchase.getQuantity()+"' ,'"
				+purchase.getPrice()+"' ,'"+purchase.getAmount()+"' )";
			PreparedStatement pre= null;
			Connection con =Connect.getInstance();
		 pre=con.prepareStatement(sql);
		 pre.execute();
		
	}
	public void delete(PurchasePojo drug) throws Exception {
		String sql = "delete from purchase where BARCODE='"+drug.getBarcode()+"' ";
		PreparedStatement pre= null;
		Connection con =Connect.getInstance();
		 pre=con.prepareStatement(sql);
		 pre.execute();
		
	}
	public void update(PurchasePojo purchase) throws Exception {
		String sql = "update purchase set NAME='"+purchase.getName()+"', TYPE='"+purchase.getType()
		+"' , COMPANY_NAME='"+purchase.getCompany_name()+"' ,QUANTITY='"+purchase.getQuantity()
		+"' ,PRICE='"+purchase.getPrice()+"',AMOUNT='"+purchase.getAmount()+"' ";
		 PreparedStatement pre= null;
		Connection con =Connect.getInstance();
		 pre=con.prepareStatement(sql);
		 pre.execute();
		
	}
	public List<ResultSet> getAll() throws Exception{
		String sql = "select ID,NAME,DOB,ADDRESS,PHONE,SALARY from users";
		PreparedStatement pre= null;
		Connection con =Connect.getInstance();
		 pre=con.prepareStatement(sql);
		ResultSet res=pre.executeQuery();
		List<ResultSet> lst = new ArrayList<ResultSet>();
		lst.add(res);
		 return lst;
	}
	public boolean isExist(PurchasePojo purchase) throws Exception {
		 boolean check =false;
		 String sql = "select * from purchase where BARCODE='"+purchase.getBarcode()+"' " ;
		 PreparedStatement pre= null;
			Connection con =Connect.getInstance();
	        pre=con.prepareStatement(sql);
	        ResultSet res=pre.executeQuery();
            if(res.next()){
          check=true;
            }
            return check;
	}
	public Optional<PurchasePojo> get(long purchase) throws Exception{
		String sql = "select * from purchase where BARCODE='"+purchase+"' ";
		Connection con =Connect.getInstance();
		 PreparedStatement pre= null;
        pre=con.prepareStatement(sql);
		ResultSet res=pre.executeQuery();
		PurchasePojo purchaseObj = new PurchasePojo();
	    if(res.next()){
	    	String name = res.getString("NAME");
	    	purchaseObj.setName(name);
	        
	        String type = res.getString("TYPE");
	        purchaseObj.setType(type);;
	        
	        String c_name = res.getString("COMPANY_NAME");
	        purchaseObj.setCompany_name(c_name);;
	        
	        String price = res.getString("PRICE");
	        purchaseObj.setPrice(price);;
	        
	        String quantity = res.getString("QUANTITY");
	        purchaseObj.setQuantity(quantity);
	        
	        String amount = res.getString("AMOUNT");
	        purchaseObj.setAmount(amount);	    }
		return Optional.ofNullable(purchaseObj);
	}

}
