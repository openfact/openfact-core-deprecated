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

@Entity(name = "LocationTypeCommAgg")
@Table(name = "LOCATIONTYPECOMMAGG")
@Inheritance(strategy = InheritanceType.JOINED)
public class LocationCommAggEntity {

    protected String ID;
    protected String description;
    protected String conditions;
    protected String countrySubentity;
    protected String countrySubentityCode;
    protected List<PeriodEntity> validityPeriod;
    protected AddressEntity address;
    protected String id;

    @Column(name = "ID")
    public String getID() {
        return ID;
    }

    public void setID(String value) {
        this.ID = value;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    @Column(name = "CONDITIONS")
    public String getConditions() {
        return conditions;
    }

    public void setConditions(String value) {
        this.conditions = value;
    }

    @Column(name = "COUNTRY_SUBENTITY")
    public String getCountrySubentity() {
        return countrySubentity;
    }

    public void setCountrySubentity(String value) {
        this.countrySubentity = value;
    }

    @Column(name = "COUNTRY_SUBENTITY_CODE")
    public String getCountrySubentityCode() {
        return countrySubentityCode;
    }

    public void setCountrySubentityCode(String value) {
        this.countrySubentityCode = value;
    }

    @OneToMany(targetEntity = PeriodEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "VALIDITYPERIOD")
    public List<PeriodEntity> getValidityPeriod() {
        if (validityPeriod == null) {
            validityPeriod = new ArrayList<PeriodEntity>();
        }
        return this.validityPeriod;
    }

    public void setValidityPeriod(List<PeriodEntity> validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    @ManyToOne(targetEntity = AddressEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "ADDRESS")
    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity value) {
        this.address = value;
    }

    @Id
    @Column(name = "ID_OFID")
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
