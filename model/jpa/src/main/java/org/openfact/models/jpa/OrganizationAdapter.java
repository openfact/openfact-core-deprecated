package org.openfact.models.jpa;

import java.math.BigDecimal;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.jboss.logging.Logger;
import org.openfact.jose.jwk.JWKBuilder;
import org.openfact.models.CheckableDocumentModel;
import org.openfact.models.CurrencyModel;
import org.openfact.models.DocumentModel;
import org.openfact.models.ComposedDocumentModel;
import org.openfact.models.SimpleDocumentModel;
import org.openfact.models.ValuableDocumentModel;
import org.openfact.models.OpenfactModelUtils;
import org.openfact.models.OpenfactSession;
import org.openfact.models.OrganizationModel;
import org.openfact.models.enums.DocumentType;
import org.openfact.models.jpa.entities.CurrencyEntity;
import org.openfact.models.jpa.entities.DocumentEntity;
import org.openfact.models.jpa.entities.CheckableDocumentEntity;
import org.openfact.models.jpa.entities.ComposedDocumentEntity;
import org.openfact.models.jpa.entities.SimpleDocumentEntity;
import org.openfact.models.jpa.entities.ValuableDocumentEntity;
import org.openfact.models.jpa.entities.OrganizationEntity;

public class OrganizationAdapter implements OrganizationModel, JpaModel<OrganizationEntity> {

    protected static final Logger logger = Logger.getLogger(OrganizationAdapter.class);
    
    protected OrganizationEntity organization;
    protected EntityManager em;
    protected OpenfactSession session;
    
    protected volatile transient PublicKey publicKey;
    protected volatile transient PrivateKey privateKey;
    protected volatile transient X509Certificate certificate;
    protected volatile transient Key codeSecretKey;

    public OrganizationAdapter(OpenfactSession session, EntityManager em, OrganizationEntity organization) {
        this.session = session;
        this.em = em;
        this.organization = organization;
    }

    @Override
    public OrganizationEntity getEntity() {
        return organization;
    }

    public static OrganizationEntity toEntity(OrganizationModel model, EntityManager em) {
        if (model instanceof OrganizationAdapter) {
            return ((OrganizationAdapter) model).getEntity();
        }
        return em.getReference(OrganizationEntity.class, model.getId());
    }

    @Override
    public String getId() {
        return organization.getId();
    }

    @Override
    public String getName() {
        return organization.getName();
    }

    @Override
    public void setName(String name) {
        organization.setName(name);
        em.flush();
    }

    @Override
    public String getDescription() {
        return organization.getDescription();
    }

    @Override
    public void setDescription(String description) {
        organization.setDescription(description);
    }

    @Override
    public boolean isEnabled() {
        return organization.isEnabled();
    }

    @Override
    public void setEnabled(boolean enabled) {
        organization.setEnabled(enabled);
    }

    @Override
    public String getAssignedIdentificationId() {
        return organization.getAssignedIdentificationId();
    }

    @Override
    public void setAssignedIdentificationId(String assignedIdentificationId) {
        organization.setAssignedIdentificationId(assignedIdentificationId);
    }

    @Override
    public SimpleDocumentModel getAdditionalAccountId() {
        SimpleDocumentEntity additionalAccount = organization.getAdditionalAccountId();
        if (additionalAccount == null) {
            return null;
        }
        return new SimpleDocumentAdapter(this, session, em, additionalAccount);
    }

    @Override
    public void setAdditionalAccountId(SimpleDocumentModel additionalAccount) {
        SimpleDocumentEntity enumTypeEntity = SimpleDocumentAdapter.toEntity(additionalAccount, em);
        organization.setAdditionalAccountId(enumTypeEntity);
    }

    @Override
    public String getSupplierName() {
        return organization.getSupplierName();
    }

    @Override
    public void setSupplierName(String supplierName) {
        organization.setSupplierName(supplierName);
    }

    @Override
    public String getRegistrationName() {
        return organization.getRegistrationName();
    }

    @Override
    public void setRegistrationName(String registrationName) {
        organization.setRegistrationName(registrationName);
    }

    @Override
    public String getStreetName() {
        return organization.getStreetName();
    }

    @Override
    public void setStreetName(String streetName) {
        organization.setStreetName(streetName);
    }

    @Override
    public String getCitySubdivisionName() {
        return organization.getCitySubdivisionName();
    }

    @Override
    public void setCitySubdivisionName(String citySubdivisionName) {
        organization.setCitySubdivisionName(citySubdivisionName);
    }

    @Override
    public String getCityName() {
        return organization.getCityName();
    }

    @Override
    public void setCityName(String cityName) {
        organization.setCityName(cityName);
    }

    @Override
    public String getCountrySubentity() {
        return organization.getCountrySubentity();
    }

    @Override
    public void setCountrySubentity(String countrySubentity) {
        organization.setCountrySubentity(countrySubentity);
    }

    @Override
    public String getDistrict() {
        return organization.getDistrict();
    }

    @Override
    public void setDistrict(String district) {
        organization.setDistrict(district);
    }

    @Override
    public String getCountryIdentificationCode() {
        return organization.getCountryIdentificationCode();
    }

    @Override
    public void setCountryIdentificationCode(String countryIdentificationCode) {
        organization.setCountryIdentificationCode(countryIdentificationCode);
    }

    @Override
	public int getMaxInvoiceNumber() {
		return organization.getMaxInvoiceNumber();
	}

	@Override
	public void setMaxInvoiceNumber(int maxInvoiceNumber) {
		organization.setMaxInvoiceNumber(maxInvoiceNumber);
	} 
	
    @Override
    public int getAttempNumber() {
        return organization.getAttempNumber();
    }

    @Override
    public void setAttempNumber(int attempNumber) {
        organization.setAttempNumber(attempNumber);
    }

    @Override
    public long getLapseTime() {
        return organization.getLapseTime();
    }

    @Override
    public void setLapseTime(long lapseTime) {
        organization.setLapseTime(lapseTime);
    }

    @Override
    public int getOnErrorAttempNumber() {
        return organization.getOnErrorAttempNumber();
    }

    @Override
    public void setOnErrorAttempNumber(int OnErrorAttempNumber) {
        organization.setOnErrorAttempNumber(OnErrorAttempNumber);
    }

    @Override
    public long getOnErrorLapseTime() {
        return organization.getOnErrorLapseTime();
    }

    @Override
    public void setOnErrorLapseTime(long onErrorlapseTime) {
        organization.setOnErrorLapseTime(onErrorlapseTime);
    }

    @Override
    public long getDelayTime() {
        return organization.getDelayTime();
    }

    @Override
    public void setDelayTime(long delayTime) {
        organization.setDelayTime(delayTime);
    }

    @Override
    public LocalTime getSubmitTime() {
        return organization.getSubmitTime();
    }

    @Override
    public void setSubmitTime(LocalTime submitTime) {
        organization.setSubmitTime(submitTime);
    }

    @Override
    public Set<DayOfWeek> getSubmitDays() {
        return organization.getSubmitDays();
    }

    @Override
    public void setSubmitDays(Set<DayOfWeek> submitDays) {
        organization.setSubmitDays(submitDays);
    }

    @Override
    public DocumentModel getDocumentById(String id) {
        DocumentEntity document = em.find(DocumentEntity.class, id);
        // Check if document belongs to this organization
        if (document == null || !organization.equals(document.getOrganization())) {
            return null;
        }

        return DocumentAdapter.toModel(document, this, session, em);
    }
    
    @Override
    public DocumentModel getDocumentByTymeAndName(DocumentType type, String documentName) {
        DocumentEntity documentEntity = organization.getDocuments().stream().filter(f -> {
            return f.getType().equals(type) && f.getName().equals(documentName);
        }).findAny().orElse(null);

        if(documentEntity == null) {
            return null;
        }
        return DocumentAdapter.toModel(documentEntity, this, session, em);
    }

    @Override
    public boolean removeDocument(DocumentModel document) {
        if (document == null) {
            return false;
        }

        DocumentEntity documentEntity = null;
        Iterator<DocumentEntity> it = organization.getDocuments().iterator();
        while (it.hasNext()) {
            DocumentEntity ae = it.next();
            if (ae.equals(document)) {
                documentEntity = ae;
                it.remove();
                break;
            }
        }
        if (documentEntity == null) {
            return false;
        }

        em.remove(documentEntity);
        em.flush();
        return true;
    }

    @Override
    public Set<DocumentModel> getDocuments() {
        return organization.getDocuments().stream()
                .map(f -> DocumentAdapter.toModel(f, this, session, em))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<DocumentModel> getDocuments(DocumentType type) {
        return organization.getDocuments().stream().filter(f -> f.getType().equals(type))
                .map(f -> DocumentAdapter.toModel(f, this, session, em))
                .collect(Collectors.toSet());
    }

    @Override
    public SimpleDocumentModel addSimpleDocument(DocumentType type, String name, String documentId) {
        SimpleDocumentEntity entity = new SimpleDocumentEntity();
        entity.setName(name);
        entity.setDocumentId(documentId);
        entity.setType(type);
        entity.setOrganization(organization);
        em.persist(entity);
        em.flush();
        final SimpleDocumentModel adapter = new SimpleDocumentAdapter(this, session, em, entity);
        return adapter;
    }

    @Override
    public ValuableDocumentModel addValuableDocument(DocumentType type, String name, String documentId,
            BigDecimal value) {
        ValuableDocumentEntity entity = new ValuableDocumentEntity();
        entity.setName(name);
        entity.setDocumentId(documentId);
        entity.setType(type);
        entity.setValue(value);
        entity.setOrganization(organization);
        em.persist(entity);
        em.flush();
        final ValuableDocumentModel adapter = new ValuableDocumentAdapter(this, session, em, entity);
        return adapter;
    }   
    
    @Override
    public CheckableDocumentModel addCheckableDocument(DocumentType type, String name, String documentId,
            boolean check) {
        CheckableDocumentEntity entity = new CheckableDocumentEntity();
        entity.setName(name);
        entity.setDocumentId(documentId);
        entity.setType(type);
        entity.setChecked(check);
        entity.setOrganization(organization);
        em.persist(entity);
        em.flush();
        final CheckableDocumentModel adapter = new CheckableDocumentAdapter(this, session, em, entity);
        return adapter;
    }  

    @Override
    public ComposedDocumentModel addComposedDocument(DocumentType type, String name, String documentId) {
        ComposedDocumentEntity entity = new ComposedDocumentEntity();
        entity.setName(name);
        entity.setDocumentId(documentId);
        entity.setType(type);
        entity.setOrganization(organization);
        em.persist(entity);
        em.flush();
        final ComposedDocumentModel adapter = new ComposedDocumentAdapter(this, session, em, entity);
        return adapter;
    }

    @Override
    public CurrencyModel addCurrency(String currencyCode) {		
    	removeDuplicateCurrencies(organization, currencyCode);    
		
    	CurrencyEntity entity = new CurrencyEntity();
        entity.setCode(currencyCode);
        
        entity.setOrganization(organization);
        em.persist(entity);
        em.flush();
        final CurrencyModel adapter = new CurrencyAdapter(this, session, em, entity);
        return adapter;
    }
    
    @Override
    public CurrencyModel addCurrency(String currencyCode, int priority) {
    	removeDuplicateCurrencies(organization, currencyCode);
    	
        CurrencyEntity entity = new CurrencyEntity();
        entity.setCode(currencyCode);
        entity.setPriority(priority);
        
        entity.setOrganization(organization);
        em.persist(entity);
        em.flush();
        final CurrencyModel adapter = new CurrencyAdapter(this, session, em, entity);
        return adapter;
    }
    
    private void removeDuplicateCurrencies(OrganizationEntity organization, String currencyCode) {
    	Iterator<CurrencyEntity> it = organization.getCurrencies().iterator();
        while (it.hasNext()) {
            CurrencyEntity ae = it.next();
            if (ae.getCode().equals(currencyCode)) {
                it.remove(); 
                em.remove(ae);
                em.flush();
            }
        }
    }

    @Override
    public boolean removeCurrency(String currencyCode) {
        if (currencyCode == null) {
            return false;
        }

        CurrencyEntity currencyEntity = null;
        Iterator<CurrencyEntity> it = organization.getCurrencies().iterator();
        while (it.hasNext()) {
            CurrencyEntity ae = it.next();
            if (ae.getCode().equals(currencyCode)) {
                currencyEntity = ae;
                it.remove();
                break;
            }
        }
        if (currencyEntity == null) {
            return false;
        }

        em.remove(currencyEntity);
        em.flush();
        return true;
    }

    @Override
    public Set<CurrencyModel> getCurrencies() {
		return organization.getCurrencies().stream().map(f -> new CurrencyAdapter(this, session, em, f))
				.collect(Collectors.toSet());
    } 

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((organization == null) ? 0 : organization.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrganizationAdapter other = (OrganizationAdapter) obj;
        if (organization == null) {
            if (other.organization != null)
                return false;
        } else if (!organization.equals(other.organization))
            return false;
        return true;
    }

    @Override
    public boolean isEventsEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setEventsEnabled(boolean enabled) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Set<String> getEventsListeners() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setEventsListeners(Set<String> listeners) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Set<String> getEnabledEventTypes() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setEnabledEventTypes(Set<String> enabledEventTypes) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isAdminEventsEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setAdminEventsEnabled(boolean enabled) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isAdminEventsDetailsEnabled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setAdminEventsDetailsEnabled(boolean enabled) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public int getAccessCodeLifespanUserAction() {
        return organization.getAccessCodeLifespanUserAction();
    }

    @Override
    public void setAccessCodeLifespanUserAction(int accessCodeLifespanUserAction) {
        organization.setAccessCodeLifespanUserAction(accessCodeLifespanUserAction);
    }  

    @Override
    public Map<String, String> getSmtpConfig() {
        Map<String, String> config = new HashMap<String, String>();
        config.putAll(organization.getSmtpConfig());
        return Collections.unmodifiableMap(config); 
    }

    @Override
    public void setSmtpConfig(Map<String, String> smtpConfig) {
        organization.setSmtpConfig(smtpConfig);
        em.flush();
    }

    @Override
    public String getKeyId() {
        PublicKey publicKey = getPublicKey();
        return publicKey != null ? JWKBuilder.create().rs256(publicKey).getKeyId() : null;
    }

    @Override
    public String getPublicKeyPem() {
        return organization.getPublicKeyPem();
    }

    @Override
    public void setPublicKeyPem(String publicKeyPem) {
        organization.setPublicKeyPem(publicKeyPem);
        em.flush();
    }

    @Override
    public String getPrivateKeyPem() {
        return organization.getPrivateKeyPem();
    }

    @Override
    public void setPrivateKeyPem(String privateKeyPem) {
        organization.setPrivateKeyPem(privateKeyPem);
        em.flush();
    }

    @Override
    public PublicKey getPublicKey() {
        if (publicKey != null) return publicKey;
        publicKey = OpenfactModelUtils.getPublicKey(getPublicKeyPem());
        return publicKey;
    }

    @Override
    public void setPublicKey(PublicKey publicKey) {
        this.publicKey = publicKey;
        String publicKeyPem = OpenfactModelUtils.getPemFromKey(publicKey);
        setPublicKeyPem(publicKeyPem);
    }

    @Override
    public String getCodeSecret() {
        return organization.getCodeSecret();
    }

    @Override
    public Key getCodeSecretKey() {
        if (codeSecretKey == null) {
            codeSecretKey = OpenfactModelUtils.getSecretKey(getCodeSecret());
        }
        return codeSecretKey;
    }

    @Override
    public void setCodeSecret(String codeSecret) {
        organization.setCodeSecret(codeSecret);
    }

    @Override
    public X509Certificate getCertificate() {
        if (certificate != null) return certificate;
        certificate = OpenfactModelUtils.getCertificate(getCertificatePem());
        return certificate;
    }

    @Override
    public void setCertificate(X509Certificate certificate) {
        this.certificate = certificate;
        String certificatePem = OpenfactModelUtils.getPemFromCertificate(certificate);
        setCertificatePem(certificatePem);
    }

    @Override
    public String getCertificatePem() {
        return organization.getCertificatePem();
    }

    @Override
    public void setCertificatePem(String certificate) {
        organization.setCertificatePem(certificate);
    }

    @Override
    public PrivateKey getPrivateKey() {
        if (privateKey != null) return privateKey;
        privateKey = OpenfactModelUtils.getPrivateKey(getPrivateKeyPem());
        return privateKey;
    }

    @Override
    public void setPrivateKey(PrivateKey privateKey) {
        this.privateKey = privateKey;
        String privateKeyPem = OpenfactModelUtils.getPemFromKey(privateKey);
        setPrivateKeyPem(privateKeyPem);
    }

    @Override
    public void setAttribute(String name, String value) {
    	organization.getAttributes().put(name, value);

    }

    @Override
    public void removeAttribute(String name) {
    	organization.getAttributes().remove(name);
    }

    @Override
    public String getAttribute(String name) {
        return organization.getAttributes().get(name);
    }

    @Override
    public Map<String, String> getAttributes() {
        Map<String, String> copy = new HashMap<>();
        copy.putAll(organization.getAttributes());
        return copy;
    }
	

}
