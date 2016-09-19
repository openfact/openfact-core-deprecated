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

@Entity(name = "TransportEquipmentType")
@Table(name = "TRANSPORTEQUIPMENTTYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class TransportEquipmentType {

    protected IDType ID;
    protected TransportEquipmentTypeCodeTypeCommBas transportEquipmentTypeCode;
    protected ProviderTypeCodeType providerTypeCode;
    protected OwnerTypeCodeType ownerTypeCode;
    protected SizeTypeCodeType sizeTypeCode;
    protected DispositionCodeType dispositionCode;
    protected FullnessIndicationCodeType fullnessIndicationCode;
    protected RefrigerationOnIndicatorType refrigerationOnIndicator;
    protected InformationType information;
    protected ReturnabilityIndicatorType returnabilityIndicator;
    protected LegalStatusIndicatorType legalStatusIndicator;
    protected List<DimensionEntity> measurementDimension;
    protected List<TransportEquipmentSealType> transportEquipmentSeal;
    protected TemperatureEntity minimumTemperature;
    protected TemperatureEntity maximumTemperature;
    protected PartyEntity providerParty;
    protected PartyEntity loadingProofParty;
    protected LocationTypeCommAgg loadingLocation;
    protected String id;

    @ManyToOne(targetEntity = IDType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ID_TRANSPORTEQUIPMENTTYPE_HJ_0")
    public IDType getID() {
        return ID;
    }

    public void setID(IDType value) {
        this.ID = value;
    }

    @ManyToOne(targetEntity = TransportEquipmentTypeCodeTypeCommBas.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TRANSPORTEQUIPMENTTYPECODE_T_0")
    public TransportEquipmentTypeCodeTypeCommBas getTransportEquipmentTypeCode() {
        return transportEquipmentTypeCode;
    }

    public void setTransportEquipmentTypeCode(TransportEquipmentTypeCodeTypeCommBas value) {
        this.transportEquipmentTypeCode = value;
    }

    @ManyToOne(targetEntity = ProviderTypeCodeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PROVIDERTYPECODE_TRANSPORTEQ_0")
    public ProviderTypeCodeType getProviderTypeCode() {
        return providerTypeCode;
    }

    public void setProviderTypeCode(ProviderTypeCodeType value) {
        this.providerTypeCode = value;
    }

    @ManyToOne(targetEntity = OwnerTypeCodeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "OWNERTYPECODE_TRANSPORTEQUIP_0")
    public OwnerTypeCodeType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    public void setOwnerTypeCode(OwnerTypeCodeType value) {
        this.ownerTypeCode = value;
    }

    @ManyToOne(targetEntity = SizeTypeCodeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "SIZETYPECODE_TRANSPORTEQUIPM_0")
    public SizeTypeCodeType getSizeTypeCode() {
        return sizeTypeCode;
    }

    public void setSizeTypeCode(SizeTypeCodeType value) {
        this.sizeTypeCode = value;
    }

    @ManyToOne(targetEntity = DispositionCodeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "DISPOSITIONCODE_TRANSPORTEQU_0")
    public DispositionCodeType getDispositionCode() {
        return dispositionCode;
    }

    public void setDispositionCode(DispositionCodeType value) {
        this.dispositionCode = value;
    }

    @ManyToOne(targetEntity = FullnessIndicationCodeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "FULLNESSINDICATIONCODE_TRANS_0")
    public FullnessIndicationCodeType getFullnessIndicationCode() {
        return fullnessIndicationCode;
    }

    public void setFullnessIndicationCode(FullnessIndicationCodeType value) {
        this.fullnessIndicationCode = value;
    }

    @ManyToOne(targetEntity = RefrigerationOnIndicatorType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "REFRIGERATIONONINDICATOR_TRA_0")
    public RefrigerationOnIndicatorType getRefrigerationOnIndicator() {
        return refrigerationOnIndicator;
    }

    public void setRefrigerationOnIndicator(RefrigerationOnIndicatorType value) {
        this.refrigerationOnIndicator = value;
    }

    @ManyToOne(targetEntity = InformationType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "INFORMATION_TRANSPORTEQUIPME_0")
    public InformationType getInformation() {
        return information;
    }

    public void setInformation(InformationType value) {
        this.information = value;
    }

    @ManyToOne(targetEntity = ReturnabilityIndicatorType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "RETURNABILITYINDICATOR_TRANS_0")
    public ReturnabilityIndicatorType getReturnabilityIndicator() {
        return returnabilityIndicator;
    }

    public void setReturnabilityIndicator(ReturnabilityIndicatorType value) {
        this.returnabilityIndicator = value;
    }

    @ManyToOne(targetEntity = LegalStatusIndicatorType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LEGALSTATUSINDICATOR_TRANSPO_0")
    public LegalStatusIndicatorType getLegalStatusIndicator() {
        return legalStatusIndicator;
    }

    public void setLegalStatusIndicator(LegalStatusIndicatorType value) {
        this.legalStatusIndicator = value;
    }

    @OneToMany(targetEntity = DimensionEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "MEASUREMENTDIMENSION_TRANSPO_1")
    public List<DimensionEntity> getMeasurementDimension() {
        if (measurementDimension == null) {
            measurementDimension = new ArrayList<DimensionEntity>();
        }
        return this.measurementDimension;
    }

    public void setMeasurementDimension(List<DimensionEntity> measurementDimension) {
        this.measurementDimension = measurementDimension;
    }

    @OneToMany(targetEntity = TransportEquipmentSealType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TRANSPORTEQUIPMENTSEAL_TRANS_0")
    public List<TransportEquipmentSealType> getTransportEquipmentSeal() {
        if (transportEquipmentSeal == null) {
            transportEquipmentSeal = new ArrayList<TransportEquipmentSealType>();
        }
        return this.transportEquipmentSeal;
    }

    public void setTransportEquipmentSeal(List<TransportEquipmentSealType> transportEquipmentSeal) {
        this.transportEquipmentSeal = transportEquipmentSeal;
    }

    @ManyToOne(targetEntity = TemperatureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "MINIMUMTEMPERATURE_TRANSPORT_1")
    public TemperatureEntity getMinimumTemperature() {
        return minimumTemperature;
    }

    public void setMinimumTemperature(TemperatureEntity value) {
        this.minimumTemperature = value;
    }

    @ManyToOne(targetEntity = TemperatureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "MAXIMUMTEMPERATURE_TRANSPORT_1")
    public TemperatureEntity getMaximumTemperature() {
        return maximumTemperature;
    }

    public void setMaximumTemperature(TemperatureEntity value) {
        this.maximumTemperature = value;
    }

    @ManyToOne(targetEntity = PartyEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PROVIDERPARTY_TRANSPORTEQUIP_0")
    public PartyEntity getProviderParty() {
        return providerParty;
    }

    public void setProviderParty(PartyEntity value) {
        this.providerParty = value;
    }

    @ManyToOne(targetEntity = PartyEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LOADINGPROOFPARTY_TRANSPORTE_0")
    public PartyEntity getLoadingProofParty() {
        return loadingProofParty;
    }

    public void setLoadingProofParty(PartyEntity value) {
        this.loadingProofParty = value;
    }

    @ManyToOne(targetEntity = LocationTypeCommAgg.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LOADINGLOCATION_TRANSPORTEQU_0")
    public LocationTypeCommAgg getLoadingLocation() {
        return loadingLocation;
    }

    public void setLoadingLocation(LocationTypeCommAgg value) {
        this.loadingLocation = value;
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
