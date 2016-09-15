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
import org.openfact.models.ubl.common.BaseUnitMeasureType;
import org.openfact.models.ubl.common.CalculationSequenceNumericType;
import org.openfact.models.ubl.common.PerUnitAmountType;
import org.openfact.models.ubl.common.PercentType;
import org.openfact.models.ubl.common.TaxAmountType;
import org.openfact.models.ubl.common.TaxCategoryType;
import org.openfact.models.ubl.common.TaxableAmountType;
import org.openfact.models.ubl.common.TierRangeType;
import org.openfact.models.ubl.common.TierRatePercentType;
import org.openfact.models.ubl.common.TransactionCurrencyTaxAmountType;

@Entity(name = "TaxSubtotalType")
@Table(name = "TAXSUBTOTALTYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class TaxSubtotalType {

    protected TaxableAmountType taxableAmount;
    protected TaxAmountType taxAmount;
    protected CalculationSequenceNumericType calculationSequenceNumeric;
    protected TransactionCurrencyTaxAmountType transactionCurrencyTaxAmount;
    protected PercentType percent;
    protected BaseUnitMeasureType baseUnitMeasure;
    protected PerUnitAmountType perUnitAmount;
    protected TierRangeType tierRange;
    protected TierRatePercentType tierRatePercent;
    protected TaxCategoryType taxCategory;
    protected String id;

    @ManyToOne(targetEntity = TaxableAmountType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TAXABLEAMOUNT_TAXSUBTOTALTYP_0")
    public TaxableAmountType getTaxableAmount() {
        return taxableAmount;
    }

    public void setTaxableAmount(TaxableAmountType value) {
        this.taxableAmount = value;
    }

    @ManyToOne(targetEntity = TaxAmountType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TAXAMOUNT_TAXSUBTOTALTYPE_HJ_0")
    public TaxAmountType getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(TaxAmountType value) {
        this.taxAmount = value;
    }

    @ManyToOne(targetEntity = CalculationSequenceNumericType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "CALCULATIONSEQUENCENUMERIC_T_0")
    public CalculationSequenceNumericType getCalculationSequenceNumeric() {
        return calculationSequenceNumeric;
    }

    public void setCalculationSequenceNumeric(CalculationSequenceNumericType value) {
        this.calculationSequenceNumeric = value;
    }

    @ManyToOne(targetEntity = TransactionCurrencyTaxAmountType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TRANSACTIONCURRENCYTAXAMOUNT_1")
    public TransactionCurrencyTaxAmountType getTransactionCurrencyTaxAmount() {
        return transactionCurrencyTaxAmount;
    }

    public void setTransactionCurrencyTaxAmount(TransactionCurrencyTaxAmountType value) {
        this.transactionCurrencyTaxAmount = value;
    }

    @ManyToOne(targetEntity = PercentType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PERCENT_TAXSUBTOTALTYPE_OFID")
    public PercentType getPercent() {
        return percent;
    }

    public void setPercent(PercentType value) {
        this.percent = value;
    }

    @ManyToOne(targetEntity = BaseUnitMeasureType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "BASEUNITMEASURE_TAXSUBTOTALT_0")
    public BaseUnitMeasureType getBaseUnitMeasure() {
        return baseUnitMeasure;
    }

    public void setBaseUnitMeasure(BaseUnitMeasureType value) {
        this.baseUnitMeasure = value;
    }

    @ManyToOne(targetEntity = PerUnitAmountType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "PERUNITAMOUNT_TAXSUBTOTALTYP_0")
    public PerUnitAmountType getPerUnitAmount() {
        return perUnitAmount;
    }

    public void setPerUnitAmount(PerUnitAmountType value) {
        this.perUnitAmount = value;
    }

    @ManyToOne(targetEntity = TierRangeType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TIERRANGE_TAXSUBTOTALTYPE_HJ_0")
    public TierRangeType getTierRange() {
        return tierRange;
    }

    public void setTierRange(TierRangeType value) {
        this.tierRange = value;
    }

    @ManyToOne(targetEntity = TierRatePercentType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TIERRATEPERCENT_TAXSUBTOTALT_0")
    public TierRatePercentType getTierRatePercent() {
        return tierRatePercent;
    }

    public void setTierRatePercent(TierRatePercentType value) {
        this.tierRatePercent = value;
    }

    @ManyToOne(targetEntity = TaxCategoryType.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "TAXCATEGORY_TAXSUBTOTALTYPE__0")
    public TaxCategoryType getTaxCategory() {
        return taxCategory;
    }

    public void setTaxCategory(TaxCategoryType value) {
        this.taxCategory = value;
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