package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import domain.UserPojo;
import main.Connect;

public class UserDAOImpl implements DAO<UserPojo> {
	public UserDAOImpl() {
		
	}
	public void save(UserPojo user) throws Exception {
		String sql = "insert into users (ID,NAME,DOB,ADDRESS,PHONE,SALARY,PASSWORD) values ('"+user.getId()+"','"+user.getName()+"' , '"+user.getDob()+"' ,'"
	+user.getAddress()+"' ,'"+user.getPhone()+"' ,'"+user.getSalary()+"' ,'"+user.getPwd()+"')";
		PreparedStatement pre= null;
		Connection con =Connect.getInstance();
		 pre=con.prepareStatement(sql);
		 pre.execute();
		
	}
	public void delete(UserPojo user) throws Exception {
		String sql = "delete from users where ID='"+user.getId()+"' ";
		PreparedStatement pre= null;
		Connection con =Connect.getInstance();
		 pre=con.prepareStatement(sql);
		 pre.execute();
		
	}
	public void update(UserPojo user) throws Exception {
		 String sql = "update users set NAME='"+user.getName()+"' ,ADDRESS='"+user.getAddress()+"' ,PHONE='"+user.getPhone()+"' ,SALARY='"+user.getSalary()+"' where ID='"+user.getId()+"' ";
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
	public boolean isExist(UserPojo user) throws Exception {
		 boolean check =false;
	        String sql = "select ID from users where ID='"+user.getId()+"' ";
	        PreparedStatement pre= null;
			Connection con =Connect.getInstance();
	        pre=con.prepareStatement(sql);
	        ResultSet res=pre.executeQuery();
            if(res.next()){
          check=true;
            }
            return check;
	}
	public Optional<UserPojo> get(long userPojo) throws Exception{
		String sql = "select * from users where ID='"+userPojo+"' ";
		Connection con =Connect.getInstance();
		 PreparedStatement pre= null;
        pre=con.prepareStatement(sql);
		ResultSet res=pre.executeQuery();
		UserPojo user = new UserPojo();
	    if(res.next()){
	    	 String iD = res.getString("ID");
	        
	         user.setId(iD);
	          String name = res.getString("NAME");
	          user.setName(name);
	         
	              String day = res.getString("DOB").split("-")[0];
	              String month = res.getString("DOB").split("-")[1];
	              String year = res.getString("DOB").split("-")[2];
                      System.out.println("DOb"+res.getString("DOB"));
	         user.setDob(day+"-"+month+"-"+year);
	          String address = res.getString("ADDRESS");
	          user.setAddress(address);
	          String phone = res.getString("PHONE");
	         user.setPhone(phone);
	          String salary = res.getString("SALARY");
	          user.setSalary(salary);
	          String pwd = res.getString("PASSWORD");
	          user.setPwd(pwd);
	    }
		return Optional.ofNullable(user);
	}

}
