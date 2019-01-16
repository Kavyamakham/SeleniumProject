/**
 * 
 */
package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.readexcel.ApachePOIExcelRead;

/**
 * @author kavya
 *
 */
//To verify whether registered user details for the course get stored in database
public class UserDataProviders081 {

	
	@DataProvider(name = "ELTD_072")
	public static Object[][] getExcelData(){
		//String fileName = "C:/Users/Naveen/Desktop/Testing.xlsx";
		String fileName = "./resources/ExcelData1.xlsx";
       
		List<List<Object>> retVal = ApachePOIExcelRead.getExcelContent(fileName);
		System.out.println("size " + retVal.size());
		
		Object[][] result = new Object[retVal.size()][retVal.size()]; 
		int count = 0; 

		for(List<Object> temp : retVal){
			if(temp!=null){
			Object[]  obj = new Object[7]; 
			System.out.println(temp.get(0));
			System.out.println(temp.get(1));
			System.out.println(temp.get(2));
			System.out.println(temp.get(3));
			System.out.println(temp.get(4));
			System.out.println(temp.get(5));
			System.out.println(temp.get(6));

		    obj[0] = temp.get(0); 
			obj[1] = temp.get(1); 
			obj[2] = temp.get(2);
			obj[3] = temp.get(3);
			obj[4] = temp.get(4); 
			obj[5] = temp.get(5); 
			obj[6] = temp.get(6); 
			
			result[count ++] = obj; 
			
			}
		}
		
		return result; 
	}
}
