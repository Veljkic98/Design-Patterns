package structural.composite;

public class Main {

	public static void main(String[] args) {
		Department sd = new SalesDepartment(1, "Sales department");
		Department fd = new FinancialDepartment(2, "Financial department");
		
		HeadDepartment hd = new HeadDepartment(3, "Head department");
		
		hd.addDepartment(sd);
		hd.addDepartment(fd);
		
		hd.printName();
	}

}
