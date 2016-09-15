//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.14 at 11:44:49 AM PET 
//

package org.openfact.models.ubl.common;

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


import org.openfact.models.ubl.common.AccountingCostCodeType;
import org.openfact.models.ubl.common.AccountingCostType;
import org.openfact.models.ubl.common.AllowanceChargeReasonCodeTypeCommBas;
import org.openfact.models.ubl.common.AllowanceChargeReasonType;
import org.openfact.models.ubl.common.AmountTypeCommBas;
import org.openfact.models.ubl.common.BaseAmountType;
import org.openfact.models.ubl.common.ChargeIndicatorType;
import org.openfact.models.ubl.common.IDType;
import org.openfact.models.ubl.common.MultiplierFactorNumericType;
import org.openfact.models.ubl.common.PaymentMeansType;
import org.openfact.models.ubl.common.PrepaidIndicatorType;
import org.openfact.models.ubl.common.SequenceNumericType;
import org.openfact.models.ubl.common.TaxCategoryType;
import org.openfact.models.ubl.common.TaxTotalType;

public class AllowanceChargeType {

    protected IDType ID;
    protected ChargeIndicatorType chargeIndicator;
    protected AllowanceChargeReasonCodeTypeCommBas allowanceChargeReasonCode;
    protected AllowanceChargeReasonType allowanceChargeReason;
    protected MultiplierFactorNumericType multiplierFactorNumeric;
    protected PrepaidIndicatorType prepaidIndicator;
    protected SequenceNumericType sequenceNumeric;
    protected AmountTypeCommBas amount;
    protected BaseAmountType baseAmount;
    protected AccountingCostCodeType accountingCostCode;
    protected AccountingCostType accountingCost;
    protected List<TaxCategoryType> taxCategory;
    protected TaxTotalType taxTotal;
    protected List<PaymentMeansType> paymentMeans;
    protected String id;

    public IDType getID() {
        return ID;
    }

    public void setID(IDType value) {
        this.ID = value;
    }

    public ChargeIndicatorType getChargeIndicator() {
        return chargeIndicator;
    }

    public void setChargeIndicator(ChargeIndicatorType value) {
        this.chargeIndicator = value;
    }

    public AllowanceChargeReasonCodeTypeCommBas getAllowanceChargeReasonCode() {
        return allowanceChargeReasonCode;
    }

    public void setAllowanceChargeReasonCode(AllowanceChargeReasonCodeTypeCommBas value) {
        this.allowanceChargeReasonCode = value;
    }

    public AllowanceChargeReasonType getAllowanceChargeReason() {
        return allowanceChargeReason;
    }

    public void setAllowanceChargeReason(AllowanceChargeReasonType value) {
        this.allowanceChargeReason = value;
    }

    public MultiplierFactorNumericType getMultiplierFactorNumeric() {
        return multiplierFactorNumeric;
    }

    public void setMultiplierFactorNumeric(MultiplierFactorNumericType value) {
        this.multiplierFactorNumeric = value;
    }

    public PrepaidIndicatorType getPrepaidIndicator() {
        return prepaidIndicator;
    }

    public void setPrepaidIndicator(PrepaidIndicatorType value) {
        this.prepaidIndicator = value;
    }

    public SequenceNumericType getSequenceNumeric() {
        return sequenceNumeric;
    }

    public void setSequenceNumeric(SequenceNumericType value) {
        this.sequenceNumeric = value;
    }

    public AmountTypeCommBas getAmount() {
        return amount;
    }

    public void setAmount(AmountTypeCommBas value) {
        this.amount = value;
    }

    public BaseAmountType getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(BaseAmountType value) {
        this.baseAmount = value;
    }

    public AccountingCostCodeType getAccountingCostCode() {
        return accountingCostCode;
    }

    public void setAccountingCostCode(AccountingCostCodeType value) {
        this.accountingCostCode = value;
    }

    public AccountingCostType getAccountingCost() {
        return accountingCost;
    }

    public void setAccountingCost(AccountingCostType value) {
        this.accountingCost = value;
    }

    public List<TaxCategoryType> getTaxCategory() {
        if (taxCategory == null) {
            taxCategory = new ArrayList<TaxCategoryType>();
        }
        return this.taxCategory;
    }

    public void setTaxCategory(List<TaxCategoryType> taxCategory) {
        this.taxCategory = taxCategory;
    }

    public TaxTotalType getTaxTotal() {
        return taxTotal;
    }

    public void setTaxTotal(TaxTotalType value) {
        this.taxTotal = value;
    }

    public List<PaymentMeansType> getPaymentMeans() {
        if (paymentMeans == null) {
            paymentMeans = new ArrayList<PaymentMeansType>();
        }
        return this.paymentMeans;
    }

    public void setPaymentMeans(List<PaymentMeansType> paymentMeans) {
        this.paymentMeans = paymentMeans;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

}