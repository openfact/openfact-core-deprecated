package org.openfact.models.ubl.common;

import java.util.List;

public interface TaxSchemeModel {

    String getID();

    void setID(String value);

    String getName();

    void setName(String value);

    String getTaxModelCode();

    void setTaxModelCode(String value);

    String getCurrencyCode();

    void setCurrencyCode(String value);

    List<AddressModel> getJurisdictionRegionAddress();

    void setJurisdictionRegionAddress(List<AddressModel> jurisdictionRegionAddress);

    String getId();

    void setId(String value);

}