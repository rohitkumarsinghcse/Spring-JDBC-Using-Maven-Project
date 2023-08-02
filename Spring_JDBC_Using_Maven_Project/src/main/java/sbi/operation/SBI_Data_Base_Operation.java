package sbi.operation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import sbi.customerdata.SBI_Customer_Data;

@Component
public class SBI_Data_Base_Operation
{
						@Autowired
						JdbcTemplate  JDBCTemplate;
	
						public int addDetails(SBI_Customer_Data object)
						{
							String query = "Insert into Sbi_Details Values ("+object.getAccountNumber()+",'"+object.getAccountHolderName()+" ',"+object.getTotalAmount()+")";
						
							return  JDBCTemplate.update(query);
						}
						
						public int deleteDetails(SBI_Customer_Data object) 
						{
							String query = "delete  from Sbi_Details where accountNumber = "+object.getAccountNumber();
							
							return JDBCTemplate.update(query);
						}
	
}
