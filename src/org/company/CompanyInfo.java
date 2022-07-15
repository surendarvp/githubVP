package org.company;

public class CompanyInfo {

	 private void companyName() {
		System.out.println("company name : hcl");

	}
	private void companyId() {
		System.out.println("company Id : 3556");
		

	}
	private void companyAddress() {
		System.out.println("no.45, thoraippakam road, omr-631108");

	}
	public static void main(String[] args) {
		CompanyInfo c = new CompanyInfo();
		c.companyName();
		c.companyId();
		c.companyAddress();
				
	}
	
	
}
