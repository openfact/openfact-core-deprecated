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

@Entity(name = "LocationCoordinateType")
@Table(name = "LOCATIONCOORDINATETYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class LocationCoordinateEntity {

    protected String coordinateSystemCode;
    protected MeasureEntity latitudeDegreesMeasure;
    protected MeasureEntity latitudeMinutesMeasure;
    protected String latitudeDirectionCode;
    protected MeasureEntity longitudeDegreesMeasure;
    protected MeasureEntity longitudeMinutesMeasure;
    protected String longitudeDirectionCode;
    protected String id;

    @Column(name = "COORDINATE_SYSTEM_CODE")
    public String getCoordinateSystemCode() {
        return coordinateSystemCode;
    }

    public void setCoordinateSystemCode(String value) {
        this.coordinateSystemCode = value;
    }

    @ManyToOne(targetEntity = MeasureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LATITUDEDEGREESMEASURE")
    public MeasureEntity getLatitudeDegreesMeasure() {
        return latitudeDegreesMeasure;
    }

    public void setLatitudeDegreesMeasure(MeasureEntity value) {
        this.latitudeDegreesMeasure = value;
    }

    @ManyToOne(targetEntity = MeasureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LATITUDEMINUTESMEASURE")
    public MeasureEntity getLatitudeMinutesMeasure() {
        return latitudeMinutesMeasure;
    }

    public void setLatitudeMinutesMeasure(MeasureEntity value) {
        this.latitudeMinutesMeasure = value;
    }

    @Column(name = "LATITUDE_DIRECTION_CODE")
    public String getLatitudeDirectionCode() {
        return latitudeDirectionCode;
    }

    public void setLatitudeDirectionCode(String value) {
        this.latitudeDirectionCode = value;
    }

    @ManyToOne(targetEntity = MeasureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LONGITUDEDEGREESMEASURE")
    public MeasureEntity getLongitudeDegreesMeasure() {
        return longitudeDegreesMeasure;
    }

    public void setLongitudeDegreesMeasure(MeasureEntity value) {
        this.longitudeDegreesMeasure = value;
    }

    @ManyToOne(targetEntity = MeasureEntity.class, cascade = { CascadeType.ALL })
    @JoinColumn(name = "LONGITUDEMINUTESMEASURE")
    public MeasureEntity getLongitudeMinutesMeasure() {
        return longitudeMinutesMeasure;
    }

    public void setLongitudeMinutesMeasure(MeasureEntity value) {
        this.longitudeMinutesMeasure = value;
    }

    @Column(name = "LONGITUDE_DIRECTION_CODE")
    public String getLongitudeDirectionCode() {
        return longitudeDirectionCode;
    }

    public void setLongitudeDirectionCode(String value) {
        this.longitudeDirectionCode = value;
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
