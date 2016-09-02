package org.openfact.models.utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.jboss.logging.Logger;
import org.openfact.actions.RequiredActionProvider;
import org.openfact.models.ComposedDocumentModel;
import org.openfact.models.CurrencyModel;
import org.openfact.models.CustomerModel;
import org.openfact.models.DocumentModel;
import org.openfact.models.DocumentSnapshotModel;
import org.openfact.models.InvoiceLineModel;
import org.openfact.models.InvoiceModel;
import org.openfact.models.InvoiceTaxTotalModel;
import org.openfact.models.OpenfactSession;
import org.openfact.models.OrganizationModel;
import org.openfact.models.SimpleDocumentModel;
import org.openfact.models.enums.DocumentType;
import org.openfact.provider.ProviderFactory;
import org.openfact.representations.idm.*;

public class RepresentationToModel {

	private static Logger logger = Logger.getLogger(RepresentationToModel.class);

    public static void importOrganization(OpenfactSession session, OrganizationRepresentation rep, OrganizationModel newOrganization) {              
           
        newOrganization.setName(rep.getName());
        
        /**
         * General information
         */               
        if (rep.getDescription() != null) {
            newOrganization.setDescription(rep.getDescription());
        }
        if (rep.getAssignedIdentificationId() != null) {
            newOrganization.setAssignedIdentificationId(rep.getAssignedIdentificationId());
        }
        if (rep.getSupplierName() != null) {
            newOrganization.setSupplierName(rep.getSupplierName());
        }
        if (rep.getRegistrationName() != null) {
            newOrganization.setRegistrationName(rep.getRegistrationName());
        }
        if (rep.getEnabled() != null) {
            newOrganization.setEnabled(rep.getEnabled());
        }
        
        /**
         * Certificate
         */
        if (rep.getCertificate() != null) {

            CertificateRepresentation certificateRep = rep.getCertificate();
            if (certificateRep.getPrivateKey() == null || certificateRep.getPublicKey() == null) {
                OpenfactModelUtils.generateOrganizationKeys(newOrganization);
            } else {
                newOrganization.setPrivateKeyPem(certificateRep.getPrivateKey());
                newOrganization.setPublicKeyPem(certificateRep.getPublicKey());
            }
            if (rep.getCertificate() == null) {
                OpenfactModelUtils.generateOrganizationCertificate(newOrganization);
            } else {
                newOrganization.setCertificatePem(certificateRep.getCertificate());
            }
            if (certificateRep.getCodeSecret() == null) {
                newOrganization.setCodeSecret(OpenfactModelUtils.generateCodeSecret());
            } else {
                newOrganization.setCodeSecret(certificateRep.getCodeSecret());
            }
        } else {
            OpenfactModelUtils.generateOrganizationKeys(newOrganization);
        }
        
        /**
         * Postal address
         */
        if (rep.getPostalAddress() != null) {
            PostalAddressRepresentation postalAddressRep = rep.getPostalAddress();
            if (postalAddressRep.getCountryIdentificationCode() != null) {
                newOrganization.setCountryIdentificationCode(postalAddressRep.getCountryIdentificationCode());
            }
            if (postalAddressRep.getCountrySubentity() != null) {
                newOrganization.setCountrySubentity(postalAddressRep.getCountrySubentity());
            }
            if (postalAddressRep.getCityName() != null) {
                newOrganization.setCityName(postalAddressRep.getCityName());
            }
            if (postalAddressRep.getCitySubdivisionName() != null) {
                newOrganization.setCitySubdivisionName(postalAddressRep.getCitySubdivisionName());
            }
            if (postalAddressRep.getDistrict() != null) {
                newOrganization.setDistrict(postalAddressRep.getDistrict());
            }
            if (postalAddressRep.getStreetName() != null) {
                newOrganization.setStreetName(postalAddressRep.getStreetName());
            }
        }
        
        /**
         * Tasks schedule
         */
        if (rep.getTasksSchedule() != null) {
            TasksScheduleRepresentation tasksScheduleRep = rep.getTasksSchedule();
            if (tasksScheduleRep.getAttempNumber() != null) {
                newOrganization.setAttempNumber(tasksScheduleRep.getAttempNumber());
            } else {
            	newOrganization.setAttempNumber(5);
            }
            if (tasksScheduleRep.getLapseTime() != null) {
                newOrganization.setLapseTime(tasksScheduleRep.getLapseTime());
            } else {
            	newOrganization.setAttempNumber(5);
            }
            if (tasksScheduleRep.getOnErrorAttempNumber() != null) {
                newOrganization.setOnErrorAttempNumber(tasksScheduleRep.getOnErrorAttempNumber());
            } else {
            	newOrganization.setOnErrorAttempNumber(2);
            }
            if (tasksScheduleRep.getOnErrorLapseTime() != null) {
                newOrganization.setOnErrorLapseTime(tasksScheduleRep.getOnErrorLapseTime());
            } else {
            	newOrganization.setOnErrorLapseTime(5);
            }
            if (tasksScheduleRep.getDelayTime() != null) {
                newOrganization.setDelayTime(tasksScheduleRep.getDelayTime());
            } else {
            	newOrganization.setDelayTime(0);
            }
            if (tasksScheduleRep.getSubmitTime() != null) {
                newOrganization.setSubmitTime(tasksScheduleRep.getSubmitTime());
            } else {
            	newOrganization.setSubmitTime(LocalTime.MIDNIGHT);
            }
            if (tasksScheduleRep.getSubmitDays() != null) {
                newOrganization.setSubmitDays(tasksScheduleRep.getSubmitDays());
            } else {
            	newOrganization.setSubmitDays(new HashSet<DayOfWeek>(Arrays.asList(DayOfWeek.values())));
            }            
        }
        
        /**
         * Currencies
         */
        if (rep.getCurrencies() != null && !rep.getCurrencies().isEmpty()) {
            rep.getCurrencies().stream()
                    .forEach(f -> newOrganization.addCurrency(f.getCode(), f.getPriority()));
        } else {
            Currency currency = Currency.getInstance(Locale.getDefault());
            newOrganization.addCurrency(currency.getCurrencyCode());
        }
        
        /**
         * Smtp server
         */
        if (rep.getSmtpServer() != null) {
            newOrganization.setSmtpConfig(new HashMap<String, String>(rep.getSmtpServer()));
        }
        
        /**
         * Documents
         */
        Set<DocumentModel> documentsModel = new HashSet<>();
        if (rep.getDocuments() != null) {                        
            for (DocumentRepresentation documentRep : rep.getDocuments()) {
                DocumentType type = DocumentType.valueOf(documentRep.getType());                
                if (type.isChecked()) {
                    DocumentModel documentModel = newOrganization.addCheckableDocument(
                            DocumentType.valueOf(documentRep.getType()), documentRep.getName(),
                            documentRep.getDocumentId(), documentRep.getChecked());
                    documentsModel.add(documentModel);
                } else if (type.isValuable()) {
                    DocumentModel documentModel = newOrganization.addValuableDocument(
                            DocumentType.valueOf(documentRep.getType()), documentRep.getName(),
                            documentRep.getDocumentId(), documentRep.getValue());
                    documentsModel.add(documentModel);
                } else if (type.isComposed()) {
                    DocumentModel documentModel = newOrganization.addComposedDocument(
                            DocumentType.valueOf(documentRep.getType()), documentRep.getName(),
                            documentRep.getDocumentId());
                    documentsModel.add(documentModel);
                } else {
                    DocumentModel documentModel = newOrganization.addSimpleDocument(
                            DocumentType.valueOf(documentRep.getType()), documentRep.getName(),
                            documentRep.getDocumentId());
                    documentsModel.add(documentModel);
                }
            }
            

            Set<DocumentRepresentation> childrenDocuments = rep.getDocuments().stream().filter(p -> p.getParent() != null).collect(Collectors.toSet());
            for (DocumentRepresentation documentRep : childrenDocuments) {
                ComposedDocumentModel parentModel = (ComposedDocumentModel) documentsModel.stream()
                        .filter(p -> p.getName().equals(documentRep.getParent().getName())).findAny().get();
                DocumentModel childrenModel = documentsModel.stream()
                        .filter(p -> p.getName().equals(documentRep.getName())).findAny().get();
                parentModel.addChildren(childrenModel);
            }
        }
        
        /**
         * Additional assigned id*/
        if(rep.getAdditionalAccountId() != null) {
            SimpleDocumentModel document = (SimpleDocumentModel) documentsModel.stream().filter(p -> p.getName().equals(rep.getAdditionalAccountId())).findAny().get();
            newOrganization.setAdditionalAccountId(document);
        }
        
        // create invoices and their lines
        if (rep.getInvoices() != null) {
            for (InvoiceRepresentation invoiceRep : rep.getInvoices()) {
                createInvoiceOnImport(session, newOrganization, invoiceRep, documentsModel);
            }
        }
    }
    
    private static InvoiceModel createInvoiceOnImport(OpenfactSession session, OrganizationModel organization, InvoiceRepresentation rep, Set<DocumentModel> documents) {
        InvoiceModel invoice;
        if (rep.getInvoiceSeries() == null || rep.getInvoiceNumber() == null) {
            invoice = session.invoices().addInvoice(organization);
        } else {
            invoice = session.invoices().addInvoice(organization, rep.getInvoiceSeries(), rep.getInvoiceNumber());
        }

        if (rep.getType() != null) {
            DocumentModel type = documents.stream().filter(f -> f.getName().equals(rep.getType())).findAny().get();
            invoice.setType(type.getName(), type.getDocumentId());
        }

        if (rep.getCurrencyCode() != null) {
            invoice.setCurrencyCode(rep.getCurrencyCode());
        }

        if (rep.getIssueDate() != null) {
            invoice.setIssueDate(rep.getIssueDate());
        } else {
            invoice.setIssueDate(LocalDate.now());
        }

        if (rep.getAllowanceTotalAmount() != null) {
            invoice.setAllowanceTotalAmount(rep.getAllowanceTotalAmount());
        }
        if (rep.getChargeTotalAmount() != null) {
            invoice.setChargeTotalAmount(rep.getChargeTotalAmount());
        }
        if (rep.getPayableAmount() != null) {
            invoice.setPayableAmount(rep.getPayableAmount());
        }

        if (rep.getCustomer() != null) {
            CustomerRepresentation customerRep = rep.getCustomer();
            CustomerModel customer = invoice.setCustomer(customerRep.getRegistrationName());

            DocumentModel additionalIdentificationId = documents.stream()
                    .filter(f -> f.getName().equals(customerRep.getAdditionalIdentificationId())).findAny()
                    .get();

            customer.setAdditionalAccountId(additionalIdentificationId.getName(),
                    additionalIdentificationId.getDocumentId());
            customer.setAssignedIdentificationId(customerRep.getAssignedIdentificationId());
            customer.setEmail(customerRep.getEmail());
        }

        if (rep.getAdditionalInformation() != null && !rep.getAdditionalInformation().isEmpty()) {
            for (InvoiceAdditionalInformationRepresentation additionalInformationRep : rep
                    .getAdditionalInformation()) {
                DocumentModel document = documents.stream()
                        .filter(f -> f.getName().equals(additionalInformationRep.getName())).findAny().get();
                invoice.addAdditionalInformation(document.getName(), document.getDocumentId(),
                        additionalInformationRep.getAmount());
            }
        }
        if (rep.getTotalTaxs() != null && !rep.getTotalTaxs().isEmpty()) {
            for (InvoiceTaxTotalRepresentation totalTaxRep : rep.getTotalTaxs()) {
                DocumentModel document = documents.stream()
                        .filter(f -> f.getName().equals(totalTaxRep.getName())).findAny().get();

                InvoiceTaxTotalModel totalTaxModel = invoice.addTaxTotal(document.getName(),
                        document.getDocumentId(), totalTaxRep.getAmount());
                if (totalTaxRep.getValue() != null) {
                    totalTaxModel.setValue(totalTaxRep.getValue());
                }
            }
        }

        updateInvoiceLineOnImport(rep.getLines(), invoice, documents);

        return invoice;
    }
    
    private static void updateInvoiceLineOnImport(List<InvoiceLineRepresentation> invoiceLines, InvoiceModel invoice, Set<DocumentModel> documents) {
        // Remove previous lines
        for (InvoiceLineModel invoiceLine : invoice.getInvoiceLines()) {
            invoice.removeInvoiceLine(invoiceLine);
        }

        // Add new lines
        for (int i = 0; i < invoiceLines.size(); i++) {
            InvoiceLineRepresentation invoiceLineRep = invoiceLines.get(i);

            InvoiceLineModel invoiceLine = invoice.addInvoiceLine();
            invoiceLine.setAllowanceCharge(invoiceLineRep.getAllowanceCharge());
            invoiceLine.setAmount(invoiceLineRep.getAmount());
            invoiceLine.setItemDescription(invoiceLineRep.getItemDescription());
            invoiceLine.setItemIdentification(invoiceLineRep.getItemIdentification());
            invoiceLine
                    .setOrderNumber(invoiceLineRep.getOrderNumber() != null ? invoiceLineRep.getOrderNumber() : i + 1);
            invoiceLine.setPrice(invoiceLineRep.getPrice());
            invoiceLine.setQuantity(invoiceLineRep.getQuantity());
            invoiceLine.setUnitCode(invoiceLineRep.getUnitCode());

            for (InvoiceLineTotalTaxRepresentation invoiceLineTotalTaxRep : invoiceLineRep.getTotalTaxs()) {
                DocumentModel document = documents.stream()
                        .filter(f -> f.getName().equals(invoiceLineTotalTaxRep.getDocument())).findAny().get();

                DocumentModel reason = documents.stream()
                        .filter(f -> f.getName().equals(invoiceLineTotalTaxRep.getReason())).findAny().get();
                invoiceLine.addTotalTax(document.getName(), document.getId(), reason.getName(), reason.getId(),
                        invoiceLineTotalTaxRep.getAmount());
            }

            logger.debug("Invoice line created with id " + invoiceLine.getId());
        }
    }
    
    public static void updateOrganization(OrganizationRepresentation rep, OrganizationModel organization) {
        if (rep.getName() != null) {
            organization.setName(rep.getName());
        }
        if (rep.getDescription() != null) {
            organization.setDescription(rep.getDescription());
        }
        if (rep.getAssignedIdentificationId() != null) {
            organization.setAssignedIdentificationId(rep.getAssignedIdentificationId());
        }
        if (rep.getAdditionalAccountId() != null && !rep.getAdditionalAccountId().isEmpty()) {
            DocumentModel additionalAccount = organization
                    .getDocuments(DocumentType.ADDITIONAL_IDENTIFICATION_ID).stream()
                    .filter(f -> f.getName().equals(rep.getAdditionalAccountId())).findAny()
                    .get();
            
            organization.setAdditionalAccountId((SimpleDocumentModel) additionalAccount);
        }
        if (rep.getSupplierName() != null) {
            organization.setSupplierName(rep.getSupplierName());
        }
        if (rep.getRegistrationName() != null) {
            organization.setRegistrationName(rep.getRegistrationName());
        }
        if (rep.getEnabled() != null) {
            organization.setEnabled(rep.getEnabled());
        }
        if (rep.getPostalAddress() != null) {
            PostalAddressRepresentation postalAddressRep = rep.getPostalAddress();
            if (postalAddressRep.getCountryIdentificationCode() != null) {
                organization.setCountryIdentificationCode(postalAddressRep.getCountryIdentificationCode());
            }
            if (postalAddressRep.getCountrySubentity() != null) {
                organization.setCountrySubentity(postalAddressRep.getCountrySubentity());
            }
            if (postalAddressRep.getCityName() != null) {
                organization.setCityName(postalAddressRep.getCityName());
            }
            if (postalAddressRep.getCitySubdivisionName() != null) {
                organization.setCitySubdivisionName(postalAddressRep.getCitySubdivisionName());
            }
            if (postalAddressRep.getDistrict() != null) {
                organization.setDistrict(postalAddressRep.getDistrict());
            }
            if (postalAddressRep.getStreetName() != null) {
                organization.setStreetName(postalAddressRep.getStreetName());
            }
        }
        if (rep.getCertificate() != null) {

            CertificateRepresentation certificateRep = rep.getCertificate();
            if (certificateRep.getPrivateKey() == null || certificateRep.getPublicKey() == null) {
                OpenfactModelUtils.generateOrganizationKeys(organization);
            } else {
                organization.setPrivateKeyPem(certificateRep.getPrivateKey());
                organization.setPublicKeyPem(certificateRep.getPublicKey());
            }
            if (rep.getCertificate() == null) {
                OpenfactModelUtils.generateOrganizationCertificate(organization);
            } else {
                organization.setCertificatePem(certificateRep.getCertificate());
            }
            if (certificateRep.getCodeSecret() == null) {
                organization.setCodeSecret(OpenfactModelUtils.generateCodeSecret());
            } else {
                organization.setCodeSecret(certificateRep.getCodeSecret());
            }
        } else {
            OpenfactModelUtils.generateOrganizationKeys(organization);
        }
        if (rep.getTasksSchedule() != null) {
            TasksScheduleRepresentation tasksScheduleRep = rep.getTasksSchedule();
            if (tasksScheduleRep.getAttempNumber() != null) {
                organization.setAttempNumber(tasksScheduleRep.getAttempNumber());
            }
            if (tasksScheduleRep.getLapseTime() != null) {
                organization.setLapseTime(tasksScheduleRep.getLapseTime());
            }
            if (tasksScheduleRep.getOnErrorAttempNumber() != null) {
                organization.setOnErrorAttempNumber(tasksScheduleRep.getOnErrorAttempNumber());
            }
            if (tasksScheduleRep.getOnErrorLapseTime() != null) {
                organization.setOnErrorLapseTime(tasksScheduleRep.getOnErrorLapseTime());
            }
            if (tasksScheduleRep.getDelayTime() != null) {
                organization.setDelayTime(tasksScheduleRep.getDelayTime());
            }
            if (tasksScheduleRep.getSubmitTime() != null) {
                organization.setSubmitTime(tasksScheduleRep.getSubmitTime());
            }
            if (tasksScheduleRep.getSubmitDays() != null) {
                organization.setSubmitDays(tasksScheduleRep.getSubmitDays());
            }
        }
        if(rep.getCurrencies() != null && !rep.getCurrencies().isEmpty()) {
            Set<CurrencyModel> actualCurrencties = organization.getCurrencies();
            rep.getCurrencies().stream().forEach(f -> organization.addCurrency(f.getCode(), f.getPriority()));
            actualCurrencties.stream().forEach(f -> organization.removeCurrency(f.getCode()));
        }
        
        if (rep.getSmtpServer() != null) {
            organization.setSmtpConfig(new HashMap<String, String>(rep.getSmtpServer()));
        }
    }
    
    public static DocumentModel createDocument(OpenfactSession session, OrganizationModel organization, DocumentRepresentation rep) { 
        DocumentModel document = null;
        
        if(rep.getValue() != null) {
            document = organization.addValuableDocument(DocumentType.valueOf(rep.getType()), rep.getName(), rep.getDocumentId(), rep.getValue());        
            document.setDescription(rep.getDescription());
        } else if(rep.getChildrens() != null) {
            document = organization.addComposedDocument(DocumentType.valueOf(rep.getType()), rep.getName(), rep.getDocumentId());        
            document.setDescription(rep.getDescription());
        } else {
            document = organization.addSimpleDocument(DocumentType.valueOf(rep.getType()), rep.getName(), rep.getDocumentId());        
            document.setDescription(rep.getDescription());
        }        
        return document;
    }
    
    public static void updateDocument(DocumentRepresentation rep, DocumentModel taxType) {
        if (rep.getName() != null){
            taxType.setName(rep.getName());
        }
        if (rep.getDocumentId() != null){
            taxType.setDocumentId(rep.getDocumentId());
        }
    }
    
    public static InvoiceModel createInvoice(OpenfactSession session, OrganizationModel organization, InvoiceRepresentation rep) {
        InvoiceModel invoice;
        if(rep.getInvoiceSeries() == null || rep.getInvoiceNumber() == null) {
            invoice = session.invoices().addInvoice(organization);                
        } else {
            invoice = session.invoices().addInvoice(organization, rep.getInvoiceSeries(), rep.getInvoiceNumber());
        }
                
        if (rep.getType() != null) {
            DocumentModel type = invoice.getOrganization()
                    .getDocuments(DocumentType.INVOICE_TYPE).stream()
                    .filter(f -> f.getName().equals(rep.getType())).findAny()
                    .get();             
            invoice.setType(type.getName(), type.getDocumentId());
        }
        
        if (rep.getCurrencyCode() != null) {
            invoice.setCurrencyCode(rep.getCurrencyCode());
        }
        
        if (rep.getIssueDate() != null) {
            invoice.setIssueDate(rep.getIssueDate());
        } else {
            invoice.setIssueDate(LocalDate.now());
        }
        
        if (rep.getAllowanceTotalAmount() != null) {
            invoice.setAllowanceTotalAmount(rep.getAllowanceTotalAmount());
        }
        if (rep.getChargeTotalAmount() != null) {
            invoice.setChargeTotalAmount(rep.getChargeTotalAmount());
        }
        if (rep.getPayableAmount() != null) {
            invoice.setPayableAmount(rep.getPayableAmount());
        }
        
        if(rep.getCustomer() != null) {            
            CustomerRepresentation customerRep = rep.getCustomer();
            CustomerModel customer = invoice.setCustomer(customerRep.getRegistrationName());
            
            DocumentModel additionalIdentificationId = invoice.getOrganization()
                    .getDocuments(DocumentType.ADDITIONAL_IDENTIFICATION_ID).stream()
                    .filter(f -> f.getName().equals(customerRep.getAdditionalIdentificationId())).findAny()
                    .get();
            
            customer.setAdditionalAccountId(additionalIdentificationId.getName(), additionalIdentificationId.getDocumentId());
            customer.setAssignedIdentificationId(customerRep.getAssignedIdentificationId());
            customer.setEmail(customerRep.getEmail());
        }       
        
        if(rep.getAdditionalInformation() != null && !rep.getAdditionalInformation().isEmpty()) {
            for (InvoiceAdditionalInformationRepresentation additionalInformationRep : rep.getAdditionalInformation()) {
                DocumentModel document = invoice.getOrganization()
                        .getDocuments(DocumentType.ADDITIONAL_INFORMATION).stream()
                        .filter(f -> f.getName().equals(additionalInformationRep.getName())).findAny()
                        .get();
                invoice.addAdditionalInformation(document.getName(), document.getDocumentId(), additionalInformationRep.getAmount());                
            }
        }
        if(rep.getTotalTaxs() != null && !rep.getTotalTaxs().isEmpty()) {
            for (InvoiceTaxTotalRepresentation totalTaxRep : rep.getTotalTaxs()) {
                DocumentModel document = invoice.getOrganization()
                        .getDocuments(DocumentType.TOTAL_TAX).stream()
                        .filter(f -> f.getName().equals(totalTaxRep.getName())).findAny()
                        .get();
                
                InvoiceTaxTotalModel totalTaxModel = invoice.addTaxTotal(document.getName(), document.getDocumentId(), totalTaxRep.getAmount());
                if(totalTaxRep.getValue() != null) {
                    totalTaxModel.setValue(totalTaxRep.getValue());    
                }                
            }
        }
        
        updateInvoiceLine(rep.getLines(), invoice);
        
        return invoice;
    }

	public static void updateInvoice(InvoiceRepresentation rep, Set<String> attrsToRemove, InvoiceModel invoice, OpenfactSession session, boolean removeMissingRequiredActions) {
		logger.info("Updating invoice data from representation. " + invoice.getId() + " from organization " + invoice.getOrganization().getId());

		if (rep.getType() != null) {
			DocumentModel type = invoice.getOrganization().getDocuments(DocumentType.INVOICE_TYPE).stream()
					.filter(f -> f.getName().equals(rep.getType())).findAny().get();
			invoice.setType(type.getName(), type.getDocumentId());
		}

		if (rep.getCurrencyCode() != null) {
			invoice.setCurrencyCode(rep.getCurrencyCode());
		}

		if (rep.getIssueDate() != null) {
			invoice.setIssueDate(rep.getIssueDate());
		} else {
			invoice.setIssueDate(LocalDate.now());
		}

		if (rep.getAllowanceTotalAmount() != null) {
			invoice.setAllowanceTotalAmount(rep.getAllowanceTotalAmount());
		}
		if (rep.getChargeTotalAmount() != null) {
			invoice.setChargeTotalAmount(rep.getChargeTotalAmount());
		}
		if (rep.getPayableAmount() != null) {
			invoice.setPayableAmount(rep.getPayableAmount());
		}

		if (rep.getCustomer() != null) {
			CustomerRepresentation customerRep = rep.getCustomer();
			CustomerModel customer = invoice.setCustomer(customerRep.getRegistrationName());

			DocumentModel additionalIdentificationId = invoice.getOrganization()
					.getDocuments(DocumentType.ADDITIONAL_IDENTIFICATION_ID).stream()
					.filter(f -> f.getName().equals(customerRep.getAdditionalIdentificationId())).findAny().get();

			customer.setAdditionalAccountId(additionalIdentificationId.getName(),
					additionalIdentificationId.getDocumentId());
			customer.setAssignedIdentificationId(customerRep.getAssignedIdentificationId());
			customer.setEmail(customerRep.getEmail());
		}

		if (rep.getAdditionalInformation() != null && !rep.getAdditionalInformation().isEmpty()) {
			for (InvoiceAdditionalInformationRepresentation additionalInformationRep : rep.getAdditionalInformation()) {
				DocumentModel document = invoice.getOrganization().getDocuments(DocumentType.ADDITIONAL_INFORMATION)
						.stream().filter(f -> f.getName().equals(additionalInformationRep.getName())).findAny().get();
				invoice.addAdditionalInformation(document.getName(), document.getDocumentId(),
						additionalInformationRep.getAmount());
			}
		}
		if (rep.getTotalTaxs() != null && !rep.getTotalTaxs().isEmpty()) {
			for (InvoiceTaxTotalRepresentation totalTaxRep : rep.getTotalTaxs()) {
				DocumentModel document = invoice.getOrganization().getDocuments(DocumentType.TOTAL_TAX).stream()
						.filter(f -> f.getName().equals(totalTaxRep.getName())).findAny().get();

				InvoiceTaxTotalModel totalTaxModel = invoice.addTaxTotal(document.getName(), document.getDocumentId(),
						totalTaxRep.getAmount());
				if (totalTaxRep.getValue() != null) {
					totalTaxModel.setValue(totalTaxRep.getValue());
				}
			}
		}

		// Required actions
		List<String> reqActions = rep.getRequiredActions();
		if (reqActions != null) {
			Set<String> allActions = new HashSet<>();
			for (ProviderFactory factory : session.getOpenfactSessionFactory()
					.getProviderFactories(RequiredActionProvider.class)) {
				allActions.add(factory.getId());
			}
			for (String action : allActions) {
				if (reqActions.contains(action)) {
					invoice.addRequiredAction(action);
				} else if (removeMissingRequiredActions) {
					invoice.removeRequiredAction(action);
				}
			}
		}

		// Attributes
		if (rep.getAttributes() != null) {
			for (Map.Entry<String, List<String>> attr : rep.getAttributes().entrySet()) {
				invoice.setAttribute(attr.getKey(), attr.getValue());
			}

			for (String attr : attrsToRemove) {
				invoice.removeAttribute(attr);
			}
		}

		updateInvoiceLine(rep.getLines(), invoice);
	}

	public static void updateInvoiceLine(List<InvoiceLineRepresentation> invoiceLines, InvoiceModel invoice) {
		// Remove previous lines
		for (InvoiceLineModel invoiceLine : invoice.getInvoiceLines()) {
			invoice.removeInvoiceLine(invoiceLine);
		}

		// Add new lines
		for (int i = 0; i < invoiceLines.size(); i++) {
			InvoiceLineRepresentation invoiceLineRep = invoiceLines.get(i);

			InvoiceLineModel invoiceLine = invoice.addInvoiceLine();
			invoiceLine.setAllowanceCharge(invoiceLineRep.getAllowanceCharge());
			invoiceLine.setAmount(invoiceLineRep.getAmount());
			invoiceLine.setItemDescription(invoiceLineRep.getItemDescription());
			invoiceLine.setItemIdentification(invoiceLineRep.getItemIdentification());
			invoiceLine
					.setOrderNumber(invoiceLineRep.getOrderNumber() != null ? invoiceLineRep.getOrderNumber() : i + 1);
			invoiceLine.setPrice(invoiceLineRep.getPrice());
			invoiceLine.setQuantity(invoiceLineRep.getQuantity());
			invoiceLine.setUnitCode(invoiceLineRep.getUnitCode());

			for (InvoiceLineTotalTaxRepresentation invoiceLineTotalTaxRep : invoiceLineRep.getTotalTaxs()) {
				DocumentModel document = invoice.getOrganization().getDocuments(DocumentType.TOTAL_TAX).stream()
						.filter(f -> f.getName().equals(invoiceLineTotalTaxRep.getDocument())).findAny().get();

				DocumentModel reason = invoice.getOrganization().getDocuments().stream()
						.filter(f -> f.getName().equals(invoiceLineTotalTaxRep.getReason())).findAny().get();
				invoiceLine.addTotalTax(document.getName(), document.getId(), reason.getName(), reason.getId(),
						invoiceLineTotalTaxRep.getAmount());
			}

			logger.debug("Invoice line created with id " + invoiceLine.getId());
		}
	}	

}