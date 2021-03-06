
package uk.co.listpoint.codelist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.listpoint.co.uk/messages/CodeList}CodeListStartNewDraftResponse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codeListStartNewDraftResponse"
})
@XmlRootElement(name = "CodeListStartNewDraftResponse")
public class CodeListStartNewDraftResponse {

    @XmlElement(name = "CodeListStartNewDraftResponse", namespace = "http://www.listpoint.co.uk/messages/CodeList")
    protected CodeListStartNewDraftResponse6Type codeListStartNewDraftResponse;

    /**
     * Gets the value of the codeListStartNewDraftResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListStartNewDraftResponse6Type }
     *     
     */
    public CodeListStartNewDraftResponse6Type getCodeListStartNewDraftResponse() {
        return codeListStartNewDraftResponse;
    }

    /**
     * Sets the value of the codeListStartNewDraftResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListStartNewDraftResponse6Type }
     *     
     */
    public void setCodeListStartNewDraftResponse(CodeListStartNewDraftResponse6Type value) {
        this.codeListStartNewDraftResponse = value;
    }

}
