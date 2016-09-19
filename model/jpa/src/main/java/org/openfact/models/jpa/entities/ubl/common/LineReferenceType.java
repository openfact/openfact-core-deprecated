//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "LineReferenceType")
@Table(name = "LINEREFERENCETYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class LineReferenceType {

    protected LineIDType lineID;
    protected UUIDType uuid;
    protected LineStatusCodeTypeCommBas lineStatusCode;
    protected DocumentReferenceEntity documentReference;
    protected String id;

    @ManyToOne(targetEntity = LineIDType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LINEID_LINEREFERENCETYPE_OFID")
    public LineIDType getLineID() {
        return lineID;
    }

    public void setLineID(LineIDType value) {
        this.lineID = value;
    }

    @ManyToOne(targetEntity = UUIDType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "UUID_LINEREFERENCETYPE_OFID")
    public UUIDType getUUID() {
        return uuid;
    }

    public void setUUID(UUIDType value) {
        this.uuid = value;
    }

    @ManyToOne(targetEntity = LineStatusCodeTypeCommBas.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LINESTATUSCODE_LINEREFERENCE_0")
    public LineStatusCodeTypeCommBas getLineStatusCode() {
        return lineStatusCode;
    }

    public void setLineStatusCode(LineStatusCodeTypeCommBas value) {
        this.lineStatusCode = value;
    }

    @ManyToOne(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DOCUMENTREFERENCE_LINEREFERE_0")
    public DocumentReferenceEntity getDocumentReference() {
        return documentReference;
    }

    public void setDocumentReference(DocumentReferenceEntity value) {
        this.documentReference = value;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

}
