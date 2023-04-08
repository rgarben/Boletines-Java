package empresaIT.empresa;

public interface Backend {

	public static final Double WEB_API_BD_COST=2200.0;
	public static final Double BE_MAINTENANCE_COST=500.0;	
	
	public Double createWebAPIandDBConectionCost();
	
	public Double maintenanceCost();
	
}
