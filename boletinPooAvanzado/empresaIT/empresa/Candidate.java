package empresaIT.empresa;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Candidate implements Comparable<Candidate>{

	private LocalDate dateOfBirth;
	private LocalDateTime startDate;
	private String dni;
	private String name;
	private String surname;
	private ContractType ct;
	private boolean inProject;
	
		
	public Candidate(LocalDate dateOfBirth, String dni, String name, String surname, String ct,boolean esta) {
		super();
		this.dateOfBirth = dateOfBirth;
		this.startDate = LocalDateTime.now();
		this.dni = dni;
		this.name = name;
		this.surname = surname;
		this.ct = ContractType.valueOf(ct);
		this.inProject=esta;
	}

	public abstract Double computeGrossSalary();
	

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public ContractType getCt() {
		return ct;
	}

	public void setCt(ContractType ct) {
		this.ct = ct;
	}

	public boolean isInProject() {
		return inProject;
	}

	public void setInProject(boolean inProject) {
		this.inProject = inProject;
	}
		
	@Override
	public int compareTo(Candidate c) {
		
		return c.getDni().compareTo(this.dni);
	}

	@Override
	public String toString() {
		return "Nombre: " + name +"\nApellido: " + surname + "\nFecha nacimiento: " + dateOfBirth + "\nFecha empezo en la empresa: " + startDate + "\nDni: " + dni + 
				"\nTipo contrado: " + ct + "\nEsta en un proyecto: " + inProject;
	}	

}
