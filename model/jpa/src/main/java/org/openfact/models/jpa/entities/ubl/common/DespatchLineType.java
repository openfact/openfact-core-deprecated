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

@Entity(name = "DespatchLineType")
@Table(name = "DESPATCHLINETYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class DespatchLineType {

    protected IDType ID;
    protected UUIDType uuid;
    protected NoteType note;
    protected LineStatusCodeTypeCommBas lineStatusCode;
    protected DeliveredQuantityType deliveredQuantity;
    protected BackorderQuantityType backorderQuantity;
    protected BackorderReasonType backorderReason;
    protected OutstandingQuantityType outstandingQuantity;
    protected OutstandingReasonType outstandingReason;
    protected OversupplyQuantityType oversupplyQuantity;
    protected List<OrderLineReferenceType> orderLineReference;
    protected List<DocumentReferenceEntity> documentReference;
    protected ItemType item;
    protected List<ShipmentType> shipment;
    protected String id;

    @ManyToOne(targetEntity = IDType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ID_DESPATCHLINETYPE_OFID")
    public IDType getID() {
        return ID;
    }

    public void setID(IDType value) {
        this.ID = value;
    }

    @ManyToOne(targetEntity = UUIDType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "UUID_DESPATCHLINETYPE_OFID")
    public UUIDType getUUID() {
        return uuid;
    }

    public void setUUID(UUIDType value) {
        this.uuid = value;
    }

    @ManyToOne(targetEntity = NoteType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "NOTE_DESPATCHLINETYPE_OFID")
    public NoteType getNote() {
        return note;
    }

    public void setNote(NoteType value) {
        this.note = value;
    }

    @ManyToOne(targetEntity = LineStatusCodeTypeCommBas.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LINESTATUSCODE_DESPATCHLINET_0")
    public LineStatusCodeTypeCommBas getLineStatusCode() {
        return lineStatusCode;
    }

    public void setLineStatusCode(LineStatusCodeTypeCommBas value) {
        this.lineStatusCode = value;
    }

    @ManyToOne(targetEntity = DeliveredQuantityType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DELIVEREDQUANTITY_DESPATCHLI_0")
    public DeliveredQuantityType getDeliveredQuantity() {
        return deliveredQuantity;
    }

    public void setDeliveredQuantity(DeliveredQuantityType value) {
        this.deliveredQuantity = value;
    }

    @ManyToOne(targetEntity = BackorderQuantityType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "BACKORDERQUANTITY_DESPATCHLI_0")
    public BackorderQuantityType getBackorderQuantity() {
        return backorderQuantity;
    }

    public void setBackorderQuantity(BackorderQuantityType value) {
        this.backorderQuantity = value;
    }

    @ManyToOne(targetEntity = BackorderReasonType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "BACKORDERREASON_DESPATCHLINE_0")
    public BackorderReasonType getBackorderReason() {
        return backorderReason;
    }

    public void setBackorderReason(BackorderReasonType value) {
        this.backorderReason = value;
    }

    @ManyToOne(targetEntity = OutstandingQuantityType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "OUTSTANDINGQUANTITY_DESPATCH_0")
    public OutstandingQuantityType getOutstandingQuantity() {
        return outstandingQuantity;
    }

    public void setOutstandingQuantity(OutstandingQuantityType value) {
        this.outstandingQuantity = value;
    }

    @ManyToOne(targetEntity = OutstandingReasonType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "OUTSTANDINGREASON_DESPATCHLI_0")
    public OutstandingReasonType getOutstandingReason() {
        return outstandingReason;
    }

    public void setOutstandingReason(OutstandingReasonType value) {
        this.outstandingReason = value;
    }

    @ManyToOne(targetEntity = OversupplyQuantityType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "OVERSUPPLYQUANTITY_DESPATCHL_0")
    public OversupplyQuantityType getOversupplyQuantity() {
        return oversupplyQuantity;
    }

    public void setOversupplyQuantity(OversupplyQuantityType value) {
        this.oversupplyQuantity = value;
    }

    @OneToMany(targetEntity = OrderLineReferenceType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ORDERLINEREFERENCE_DESPATCHL_0")
    public List<OrderLineReferenceType> getOrderLineReference() {
        if (orderLineReference == null) {
            orderLineReference = new ArrayList<OrderLineReferenceType>();
        }
        return this.orderLineReference;
    }

    public void setOrderLineReference(List<OrderLineReferenceType> orderLineReference) {
        this.orderLineReference = orderLineReference;
    }

    @OneToMany(targetEntity = DocumentReferenceEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DOCUMENTREFERENCE_DESPATCHLI_0")
    public List<DocumentReferenceEntity> getDocumentReference() {
        if (documentReference == null) {
            documentReference = new ArrayList<DocumentReferenceEntity>();
        }
        return this.documentReference;
    }

    public void setDocumentReference(List<DocumentReferenceEntity> documentReference) {
        this.documentReference = documentReference;
    }

    @ManyToOne(targetEntity = ItemType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ITEM_DESPATCHLINETYPE_OFID")
    public ItemType getItem() {
        return item;
    }

    public void setItem(ItemType value) {
        this.item = value;
    }

    @OneToMany(targetEntity = ShipmentType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "SHIPMENT_DESPATCHLINETYPE_HJ_0")
    public List<ShipmentType> getShipment() {
        if (shipment == null) {
            shipment = new ArrayList<ShipmentType>();
        }
        return this.shipment;
    }

    public void setShipment(List<ShipmentType> shipment) {
        this.shipment = shipment;
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
