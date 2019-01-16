/**
 * 
 */
package com.training.dao;

/**
 * @author kavya
 *
 */
//To verify whether registered user details for the course get stored in database
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.TC085;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

public class TC085_Elearning {

	Properties properties;

	public TC085_Elearning() 
	{
		try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<TC085> getuserdetails(){
		String sql = properties.getProperty("get.userdetails");

		GetConnection gc  = new GetConnection();
		List<TC085> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql);
			list = new ArrayList<TC085>();

			gc.rs1 = gc.ps1.executeQuery();

			while(gc.rs1.next()) {

				TC085 temp = new TC085(sql, sql, sql, sql, sql, sql, sql);
				temp.setfirstname(gc.rs1.getString(1));
				temp.setlastname(gc.rs1.getString(2));
				temp.setEmailid(gc.rs1.getString(3));
				temp.setphone(gc.rs1.getString(4));
				temp.setlogin(gc.rs1.getString(5));
				temp.setPassword(gc.rs1.getString(6));
				temp.setProfile(gc.rs1.getString(7));

				list.add(temp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public static void main(String[] args) {
		new TC085_Elearning().getuserdetails().forEach(System.out :: println);
	}


}




