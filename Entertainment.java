// EntertainmentProject: Amran Feroz, Gong Zhenmu, Michelle Lindblom
package Entertainment;

public abstract class Entertainment {
	
private String name;
private double annualIncome;

public String toString() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getAnnualIncome() {
	return annualIncome;
}

public void setAnnualIncome(double annualIncome) {
	this.annualIncome = annualIncome;
}

}
