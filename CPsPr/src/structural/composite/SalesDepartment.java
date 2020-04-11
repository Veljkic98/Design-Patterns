package structural.composite;

public class SalesDepartment implements Department {

	
	private Integer id;
	private String name;
	
	@Override
	public void printName() {
		System.out.println(getClass().getSimpleName());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SalesDepartment() {
		super();
	}

	public SalesDepartment(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
