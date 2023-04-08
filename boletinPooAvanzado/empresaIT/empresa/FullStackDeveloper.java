package empresaIT.empresa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class FullStackDeveloper extends Candidate implements Backend, Frontend{
	
	

	public FullStackDeveloper(LocalDate dateOfBirth, String dni, String name, String surname, String ct,boolean esta) {
		super(dateOfBirth,dni,name,surname,ct,esta);
	}
	
	@Override
	public Double computaWebDesignCost() {
		
		return WEB_INTERFACE_DESIGN_COST;
	}

	@Override
	public Double computaFEMaintenanceCost() {
		
		return FE_MAINTENANCE_COST;
	}

	@Override
	public Double computeGrossSalary() {
		
		Double salario;
		
		if(isInProject()) {
			
			salario=this.getCt().equals(ContractType.FULLTIME)?this.createWebAPIandDBConectionCost():this.createWebAPIandDBConectionCost()-(this.createWebAPIandDBConectionCost()*0.33);
			salario+=this.getCt().equals(ContractType.FULLTIME)?this.maintenanceCost():this.maintenanceCost()-(this.maintenanceCost()*0.33);
			
		}else {
			
			salario=this.getCt().equals(ContractType.FULLTIME)?this.computaWebDesignCost():this.computaWebDesignCost()-(this.computaWebDesignCost()*0.33);
			salario+=this.getCt().equals(ContractType.FULLTIME)?this.computaFEMaintenanceCost():this.computaFEMaintenanceCost()-(this.computaFEMaintenanceCost()*0.33);
			
		}		
		
		return salario+(ChronoUnit.YEARS.between(getStartDate(), LocalDateTime.now())*(salario*0.05));
		
	}

	@Override
	public Double createWebAPIandDBConectionCost() {
		return WEB_API_BD_COST;
	}

	@Override
	public Double maintenanceCost() {
		return BE_MAINTENANCE_COST;
	}

}
