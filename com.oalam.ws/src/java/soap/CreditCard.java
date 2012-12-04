/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author tom
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CreditCard {

    @XmlAttribute(required = true)
    private String number;
    @XmlElement(name = "expiry-date", defaultValue = "01/10")
    private String expiryDate;
    private String type;
    @XmlElement(name = "control-number")
    private Integer controlNumber;
    // Constructeurs, getters, setters

    public CreditCard() {
    }

    public Integer getControlNumber() {
	return controlNumber;
    }

    public void setControlNumber(Integer controlNumber) {
	this.controlNumber = controlNumber;
    }

    public String getExpiryDate() {
	return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
	this.expiryDate = expiryDate;
    }

    public String getNumber() {
	return number;
    }

    public void setNumber(String number) {
	this.number = number;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }
}