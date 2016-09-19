//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.jpa.entities.ubl.common;

import java.util.ArrayList;
import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "DocumentResponseType")
@Table(name = "DOCUMENTRESPONSETYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class DocumentResponseType {

    protected ResponseType response;
    protected DocumentReferenceEntity documentReference;
    protected PartyType issuerParty;
    protected PartyType recipientParty;
    protected List<LineResponseType> lineResponse;
    protected String id;

    @ManyToOne(targetEntity = ResponseType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "RESPONSE_DOCUMENTRESPONSETYP_0")
    public ResponseType getResponse() {
        return response;
    }

    public void setResponse(ResponseType value) {
        this.response = value;
    }

    @ManyToOne(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DOCUMENTREFERENCE_DOCUMENTRE_0")
    public DocumentReferenceEntity getDocumentReference() {
        return documentReference;
    }

    public void setDocumentReference(DocumentReferenceEntity value) {
        this.documentReference = value;
    }

    @ManyToOne(targetEntity = PartyType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ISSUERPARTY_DOCUMENTRESPONSE_0")
    public PartyType getIssuerParty() {
        return issuerParty;
    }

    public void setIssuerParty(PartyType value) {
        this.issuerParty = value;
    }

    @ManyToOne(targetEntity = PartyType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "RECIPIENTPARTY_DOCUMENTRESPO_0")
    public PartyType getRecipientParty() {
        return recipientParty;
    }

    public void setRecipientParty(PartyType value) {
        this.recipientParty = value;
    }

    @OneToMany(targetEntity = LineResponseType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LINERESPONSE_DOCUMENTRESPONS_0")
    public List<LineResponseType> getLineResponse() {
        if (lineResponse == null) {
            lineResponse = new ArrayList<LineResponseType>();
        }
        return this.lineResponse;
    }

    public void setLineResponse(List<LineResponseType> lineResponse) {
        this.lineResponse = lineResponse;
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
