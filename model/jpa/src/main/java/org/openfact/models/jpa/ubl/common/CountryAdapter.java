package org.openfact.models.jpa.ubl.common;

import javax.persistence.EntityManager;

import org.openfact.models.OpenfactSession;
import org.jboss.logging.Logger;
import org.openfact.models.jpa.JpaModel;
import org.openfact.models.jpa.entities.ubl.common.CountryEntity;
import org.openfact.models.ubl.common.CountryModel;

public class CountryAdapter implements CountryModel, JpaModel<CountryEntity> {

    protected static final Logger logger = Logger.getLogger(CountryAdapter.class);
    protected CountryEntity country;
    protected EntityManager em;
    protected OpenfactSession session;

    public CountryAdapter(OpenfactSession session, EntityManager em, CountryEntity country) {
        this.session = session;
        this.em = em;
        this.country = country;
    }

    @Override
    public String getIdentificationCode() {
        return this.country.getIdentificationCode();
    }

    @Override
    public void setIdentificationCode(String value) {
        this.country.setIdentificationCode(value);
    }

    @Override
    public String getName() {
        return this.country.getName();
    }

    @Override
    public void setName(String value) {
        this.country.setName(value);
    }

    @Override
    public String getId() {
        return this.country.getId();
    }

    @Override
    public void setId(String value) {
        this.country.setId(value);
    }

    @Override
    public CountryEntity getEntity() {
        // TODO Auto-generated method stub
        return null;
    }

    public static CountryEntity toEntity(CountryModel value) {
        // TODO Auto-generated method stub
        return null;
    }

}
