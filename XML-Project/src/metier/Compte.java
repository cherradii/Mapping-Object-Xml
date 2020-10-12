package metier;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte implements Serializable{

	@XmlAttribute(name = "id")
	private Long code;
	@XmlElement
	private double solde;
	@XmlTransient
	private Date dateCreation;
	
	public Compte() {

	}

	public Compte(Long code, double solde, Date dateCreation) {
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + ", dateCreation=" + dateCreation + "]";
	}
	
	

}
