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
import org.openfact.models.ubl.common.AllowanceChargeType;
import org.openfact.models.ubl.common.BaseQuantityType;
import org.openfact.models.ubl.common.OrderableUnitFactorRateType;
import org.openfact.models.ubl.common.PeriodType;
import org.openfact.models.ubl.common.PriceAmountType;
import org.openfact.models.ubl.common.PriceChangeReasonType;
import org.openfact.models.ubl.common.PriceListType;
import org.openfact.models.ubl.common.PriceTypeCodeType;
import org.openfact.models.ubl.common.PriceTypeType;

@Entity(name = "PriceType")
@Table(name = "PRICETYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class PriceType {

    protected PriceAmountType priceAmount;
    protected BaseQuantityType baseQuantity;
    protected List<PriceChangeReasonType> priceChangeReason;
    protected PriceTypeCodeType priceTypeCode;
    protected PriceTypeType priceType;
    protected OrderableUnitFactorRateType orderableUnitFactorRate;
    protected List<PeriodType> validityPeriod;
    protected PriceListType priceList;
    protected List<AllowanceChargeType> allowanceCharge;
    protected String id;

    @ManyToOne(targetEntity = PriceAmountType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PRICEAMOUNT_PRICETYPE_OFID")
    public PriceAmountType getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(PriceAmountType value) {
        this.priceAmount = value;
    }

    @ManyToOne(targetEntity = BaseQuantityType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "BASEQUANTITY_PRICETYPE_OFID")
    public BaseQuantityType getBaseQuantity() {
        return baseQuantity;
    }

    public void setBaseQuantity(BaseQuantityType value) {
        this.baseQuantity = value;
    }

    @OneToMany(targetEntity = PriceChangeReasonType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PRICECHANGEREASON_PRICETYPE__0")
    public List<PriceChangeReasonType> getPriceChangeReason() {
        if (priceChangeReason == null) {
            priceChangeReason = new ArrayList<PriceChangeReasonType>();
        }
        return this.priceChangeReason;
    }

    public void setPriceChangeReason(List<PriceChangeReasonType> priceChangeReason) {
        this.priceChangeReason = priceChangeReason;
    }

    @ManyToOne(targetEntity = PriceTypeCodeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PRICETYPECODE_PRICETYPE_OFID")
    public PriceTypeCodeType getPriceTypeCode() {
        return priceTypeCode;
    }

    public void setPriceTypeCode(PriceTypeCodeType value) {
        this.priceTypeCode = value;
    }

    @ManyToOne(targetEntity = PriceTypeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PRICETYPE_PRICETYPE_OFID")
    public PriceTypeType getPriceType() {
        return priceType;
    }

    public void setPriceType(PriceTypeType value) {
        this.priceType = value;
    }

    @ManyToOne(targetEntity = OrderableUnitFactorRateType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ORDERABLEUNITFACTORRATE_PRIC_0")
    public OrderableUnitFactorRateType getOrderableUnitFactorRate() {
        return orderableUnitFactorRate;
    }

    public void setOrderableUnitFactorRate(OrderableUnitFactorRateType value) {
        this.orderableUnitFactorRate = value;
    }

    @OneToMany(targetEntity = PeriodType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "VALIDITYPERIOD_PRICETYPE_OFID")
    public List<PeriodType> getValidityPeriod() {
        if (validityPeriod == null) {
            validityPeriod = new ArrayList<PeriodType>();
        }
        return this.validityPeriod;
    }

    public void setValidityPeriod(List<PeriodType> validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    @ManyToOne(targetEntity = PriceListType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PRICELIST_PRICETYPE_OFID")
    public PriceListType getPriceList() {
        return priceList;
    }

    public void setPriceList(PriceListType value) {
        this.priceList = value;
    }

    @OneToMany(targetEntity = AllowanceChargeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ALLOWANCECHARGE_PRICETYPE_HJ_0")
    public List<AllowanceChargeType> getAllowanceCharge() {
        if (allowanceCharge == null) {
            allowanceCharge = new ArrayList<AllowanceChargeType>();
        }
        return this.allowanceCharge;
    }

    public void setAllowanceCharge(List<AllowanceChargeType> allowanceCharge) {
        this.allowanceCharge = allowanceCharge;
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