package com.learning.binding;

public class Consumers {

	private String name;
	private Integer age;
	private Boolean iSbpl;
	private Long salary;
	private String sex;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getiSbpl() {
		return iSbpl;
	}

	public void setiSbpl(Boolean iSbpl) {
		this.iSbpl = iSbpl;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Consumers [name=" + name + ", age=" + age + ", iSbpl=" + iSbpl + ", salary=" + salary + ", sex=" + sex
				+ ", address=" + address + "]";
	}

}
