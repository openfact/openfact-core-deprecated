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


import org.openfact.models.ubl.common.AdditionalStreetNameType;
import org.openfact.models.ubl.common.AddressFormatCodeType;
import org.openfact.models.ubl.common.AddressLineType;
import org.openfact.models.ubl.common.AddressTypeCodeType;
import org.openfact.models.ubl.common.BlockNameType;
import org.openfact.models.ubl.common.BuildingNameType;
import org.openfact.models.ubl.common.BuildingNumberType;
import org.openfact.models.ubl.common.CityNameType;
import org.openfact.models.ubl.common.CitySubdivisionNameType;
import org.openfact.models.ubl.common.CountrySubentityCodeType;
import org.openfact.models.ubl.common.CountrySubentityType;
import org.openfact.models.ubl.common.CountryType;
import org.openfact.models.ubl.common.DepartmentType;
import org.openfact.models.ubl.common.DistrictType;
import org.openfact.models.ubl.common.FloorType;
import org.openfact.models.ubl.common.IDType;
import org.openfact.models.ubl.common.InhouseMailType;
import org.openfact.models.ubl.common.LocationCoordinateType;
import org.openfact.models.ubl.common.MarkAttentionType;
import org.openfact.models.ubl.common.MarkCareType;
import org.openfact.models.ubl.common.PlotIdentificationType;
import org.openfact.models.ubl.common.PostalZoneType;
import org.openfact.models.ubl.common.PostboxType;
import org.openfact.models.ubl.common.RegionType;
import org.openfact.models.ubl.common.RoomType;
import org.openfact.models.ubl.common.StreetNameType;
import org.openfact.models.ubl.common.TimezoneOffsetType;

public class AddressType {

    protected IDType ID;
    protected AddressTypeCodeType addressTypeCode;
    protected AddressFormatCodeType addressFormatCode;
    protected PostboxType postbox;
    protected FloorType floor;
    protected RoomType room;
    protected StreetNameType streetName;
    protected AdditionalStreetNameType additionalStreetName;
    protected BlockNameType blockName;
    protected BuildingNameType buildingName;
    protected BuildingNumberType buildingNumber;
    protected InhouseMailType inhouseMail;
    protected DepartmentType department;
    protected MarkAttentionType markAttention;
    protected MarkCareType markCare;
    protected PlotIdentificationType plotIdentification;
    protected CitySubdivisionNameType citySubdivisionName;
    protected CityNameType cityName;
    protected PostalZoneType postalZone;
    protected CountrySubentityType countrySubentity;
    protected CountrySubentityCodeType countrySubentityCode;
    protected RegionType region;
    protected DistrictType district;
    protected TimezoneOffsetType timezoneOffset;
    protected List<AddressLineType> addressLine;
    protected CountryType country;
    protected LocationCoordinateType locationCoordinate;
    protected String id;

    public IDType getID() {
        return ID;
    }

    public void setID(IDType value) {
        this.ID = value;
    }

    public AddressTypeCodeType getAddressTypeCode() {
        return addressTypeCode;
    }

    public void setAddressTypeCode(AddressTypeCodeType value) {
        this.addressTypeCode = value;
    }

    public AddressFormatCodeType getAddressFormatCode() {
        return addressFormatCode;
    }

    public void setAddressFormatCode(AddressFormatCodeType value) {
        this.addressFormatCode = value;
    }

    public PostboxType getPostbox() {
        return postbox;
    }

    public void setPostbox(PostboxType value) {
        this.postbox = value;
    }

    public FloorType getFloor() {
        return floor;
    }

    public void setFloor(FloorType value) {
        this.floor = value;
    }

    public RoomType getRoom() {
        return room;
    }

    public void setRoom(RoomType value) {
        this.room = value;
    }

    public StreetNameType getStreetName() {
        return streetName;
    }

    public void setStreetName(StreetNameType value) {
        this.streetName = value;
    }

    public AdditionalStreetNameType getAdditionalStreetName() {
        return additionalStreetName;
    }

    public void setAdditionalStreetName(AdditionalStreetNameType value) {
        this.additionalStreetName = value;
    }

    public BlockNameType getBlockName() {
        return blockName;
    }

    public void setBlockName(BlockNameType value) {
        this.blockName = value;
    }

    public BuildingNameType getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(BuildingNameType value) {
        this.buildingName = value;
    }

    public BuildingNumberType getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(BuildingNumberType value) {
        this.buildingNumber = value;
    }

    public InhouseMailType getInhouseMail() {
        return inhouseMail;
    }

    public void setInhouseMail(InhouseMailType value) {
        this.inhouseMail = value;
    }

    public DepartmentType getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentType value) {
        this.department = value;
    }

    public MarkAttentionType getMarkAttention() {
        return markAttention;
    }

    public void setMarkAttention(MarkAttentionType value) {
        this.markAttention = value;
    }

    public MarkCareType getMarkCare() {
        return markCare;
    }

    public void setMarkCare(MarkCareType value) {
        this.markCare = value;
    }

    public PlotIdentificationType getPlotIdentification() {
        return plotIdentification;
    }

    public void setPlotIdentification(PlotIdentificationType value) {
        this.plotIdentification = value;
    }

    public CitySubdivisionNameType getCitySubdivisionName() {
        return citySubdivisionName;
    }

    public void setCitySubdivisionName(CitySubdivisionNameType value) {
        this.citySubdivisionName = value;
    }

    public CityNameType getCityName() {
        return cityName;
    }

    public void setCityName(CityNameType value) {
        this.cityName = value;
    }

    public PostalZoneType getPostalZone() {
        return postalZone;
    }

    public void setPostalZone(PostalZoneType value) {
        this.postalZone = value;
    }

    public CountrySubentityType getCountrySubentity() {
        return countrySubentity;
    }

    public void setCountrySubentity(CountrySubentityType value) {
        this.countrySubentity = value;
    }

    public CountrySubentityCodeType getCountrySubentityCode() {
        return countrySubentityCode;
    }

    public void setCountrySubentityCode(CountrySubentityCodeType value) {
        this.countrySubentityCode = value;
    }

    public RegionType getRegion() {
        return region;
    }

    public void setRegion(RegionType value) {
        this.region = value;
    }

    public DistrictType getDistrict() {
        return district;
    }

    public void setDistrict(DistrictType value) {
        this.district = value;
    }

    public TimezoneOffsetType getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(TimezoneOffsetType value) {
        this.timezoneOffset = value;
    }

    public List<AddressLineType> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<AddressLineType>();
        }
        return this.addressLine;
    }

    public void setAddressLine(List<AddressLineType> addressLine) {
        this.addressLine = addressLine;
    }

    public CountryType getCountry() {
        return country;
    }

    public void setCountry(CountryType value) {
        this.country = value;
    }

    public LocationCoordinateType getLocationCoordinate() {
        return locationCoordinate;
    }

    public void setLocationCoordinate(LocationCoordinateType value) {
        this.locationCoordinate = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

}