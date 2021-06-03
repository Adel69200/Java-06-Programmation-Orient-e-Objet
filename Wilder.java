package wilder;

public class Wilder {
	
private String firstname;
private boolean aware;



//création construteur//
public Wilder (String firstname,boolean aware){
	
this.firstname = firstname;
this.aware = aware;
	
	

}
//GETTER
public String getFirstname() {
	return firstname;
	
	
}
//GETTER
public boolean getAware() {
	return aware;
	
	
}
//Setter
public void setFirstname(String firstname) {
	this.firstname = firstname;
	
}


public void setAware(boolean aware) {
	this.aware = aware;
	
}


public String whoAmI() {
return "Je m'appelle " + this.getFirstname()  + " et je suis " + this.getAware();


}

}


