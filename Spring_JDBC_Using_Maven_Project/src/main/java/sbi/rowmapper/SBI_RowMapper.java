package sbi.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import sbi.customerdata.SBI_Customer_Data;

public class SBI_RowMapper implements  RowMapper<SBI_Customer_Data>  {

	@Override
	public SBI_Customer_Data mapRow(ResultSet rs, int rowNum) throws SQLException {
		 SBI_Customer_Data data = new SBI_Customer_Data();
		 data.setAccountNumber(rs.getLong("ACCOUNTNUMBER"));
		 data.setAccountHolderName(rs.getString("ACCOUNTHOLDERNAME"));
		 data.setTotalAmount(rs.getLong("TOTALAMOUNT"));
		return data;
	}

	 
}
