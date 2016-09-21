//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "EXTERNALREFERENCE")
public class ExternalReferenceEntity {

    @Id
    @Column(name = "ID_OFID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    protected String id;

    @Column(name = "URI")
    protected String uri;

    @Column(name = "DOCUMENT_HASH")
    protected String documentHash;

    @Column(name = "EXPIRYDATE")
    protected LocalDate expiryDate;

    @Column(name = "EXPIRYTIME")
    protected LocalTime expiryTime;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * @param uri
     *            the uri to set
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * @return the documentHash
     */
    public String getDocumentHash() {
        return documentHash;
    }

    /**
     * @param documentHash
     *            the documentHash to set
     */
    public void setDocumentHash(String documentHash) {
        this.documentHash = documentHash;
    }

    /**
     * @return the expiryDate
     */
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate
     *            the expiryDate to set
     */
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * @return the expiryTime
     */
    public LocalTime getExpiryTime() {
        return expiryTime;
    }

    /**
     * @param expiryTime
     *            the expiryTime to set
     */
    public void setExpiryTime(LocalTime expiryTime) {
        this.expiryTime = expiryTime;
    }

}
