package reporting;

public class Etape {
	private String employe;
	private Integer et;
	private Integer accepte;
	private Integer refuse;
	private Integer ta;
	private Integer md;


	public Etape(String employe, Integer et, Integer accepte, Integer md) {
		super();
		this.employe = employe;
		this.et = et;
		this.accepte = accepte;
		this.md = md;
		this.ta = this.et * 100 / this.accepte;
		this.refuse = this.et - this.accepte;
	}


	public String getEmploye() {
		return employe;
	}


	public void setEmploye(String employe) {
		this.employe = employe;
	}


	public Integer getEt() {
		return et;
	}


	public void setEt(Integer et) {
		this.et = et;
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
