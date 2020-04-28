package reporting;

public class Procedure {
private String procedure;
private Integer dt;
private Integer accepte;
private Integer refuse;
private Integer ta;
private Integer md;



public Procedure(String procedure, Integer dt, Integer accepte, Integer md) {
	super();
	this.procedure = procedure;
	this.dt = dt;
	this.accepte = accepte;
	this.md = md;
	this.ta = this.dt * 100 / this.accepte;
	this.refuse = this.dt - this.accepte;
}
public String getprocedure() {
	return procedure;
}
public void setprocedure(String procedure) {
	this.procedure = procedure;
}
public Integer getDt() {
	return dt;
}
public void setDt(Integer dt) {
	this.dt = dt;
}
public Integer getAccepte() {
	return accepte;
}
public void setAccepte(Integer accepte) {
	this.accepte = accepte;
}
public Integer getRefuse() {
	return refuse;
}
public void setRefuse(Integer refuse) {
	this.refuse = refuse;
}
public Integer getTa() {
	return ta;
}
public void setTa(Integer ta) {
	this.ta = ta;
}
public Integer getMd() {
	return md;
}
public void setMd(Integer md) {
	this.md = md;
}


}
