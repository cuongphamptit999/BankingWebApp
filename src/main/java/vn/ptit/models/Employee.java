package vn.ptit.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {
	private int id;
	private String idCard;
	private String fullName;
	private Date dateOfBirth;
	private String address;
	private int level;
	private int seniority;
	private String position;
	private double basicSalary;
	private Account account;
	private List<Salary> salaries = new ArrayList<>();
	private boolean status;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String idCard, String fullName, Date dateOfBirth, String address, int level, int seniority,
			String position, double basicSalary, Account account, List<Salary> salaries, boolean status) {
		super();
		this.idCard = idCard;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.level = level;
		this.seniority = seniority;
		this.position = position;
		this.basicSalary = basicSalary;
		this.account = account;
		this.salaries = salaries;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Salary> getSalaries() {
		return salaries;
	}

	public void setSalaries(List<Salary> salaries) {
		this.salaries = salaries;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

}
