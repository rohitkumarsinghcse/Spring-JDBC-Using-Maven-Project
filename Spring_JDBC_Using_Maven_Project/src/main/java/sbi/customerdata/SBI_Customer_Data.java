package sbi.customerdata;

import org.springframework.stereotype.Component;

@Component
public class SBI_Customer_Data
{
           private long  accountNumber;
           private String  accountHolderName;
           private long  totalAmount;
		
           
           public SBI_Customer_Data()
           {
        	   System.out.println("SBI_Customer_Data Object Created SuccessFully ");
           }

           public long getAccountNumber() {
			return accountNumber;
           }
		
           public void setAccountNumber(long accountNumber) {
			this.accountNumber = accountNumber;
           }
		
           public String getAccountHolderName() {
			return accountHolderName;
           }
		
           public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
           }
		
           public long getTotalAmount() {
			return totalAmount;
           }
		
           public void setTotalAmount(long totalAmount) {
			this.totalAmount = totalAmount;
           }

		@Override
		public String toString() {
			return "SBI_Customer_Data [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
					+ ", totalAmount=" + totalAmount + "]";
		}
           
           
           
}
  