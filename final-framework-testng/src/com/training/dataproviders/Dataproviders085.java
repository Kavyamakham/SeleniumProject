/**
 * 
 */
package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.bean.TC085;
import com.training.dao.ELearningDAO;
import com.training.dao.TC085_Elearning;

/**
 * @author kavya
 *
 */
public class Dataproviders085 {
	

		@DataProvider(name = "db-inputs")
		public Object [][] getDBData() {

			List<TC085> list = new TC085_Elearning().getuserdetails(); 
			
			Object[][] result = new Object[list.size()][]; 
			int count = 0; 
			for(TC085 temp : list){
				Object[]  obj = new Object[7]; 
				obj[0] = temp.getfirstname(); 
				obj[1] = temp.getlastname(); 
				obj[2] = temp.getEmailid(); 
				obj[3] = temp.getphone();
				obj[4] = temp.getlogin(); 
				obj[5] = temp.getPassword(); 
				obj[6] = temp.getProfile(); 
				
				result[count ++] = obj; 
			}
			
			
			return result;
		}

}
