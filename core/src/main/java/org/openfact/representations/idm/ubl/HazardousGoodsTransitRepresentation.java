package org.openfact.representations.idm.ubl;

import org.openfact.representations.idm.ubl.type.CodeRepresentation;

/**
 * A class to describe hazardous goods in transit.
 * 
 * @author Erik
 * @version 2.0
 * @created 07-Set.-2016 9:15:27 a. m.
 */
public class HazardousGoodsTransitRepresentation {

    /**
     * A code signifying the set of legal regulations governing the
     * transportation of the hazardous goods.
     */
    private CodeRepresentation hazardousRegulationCode;
    /**
     * A code signifying the Inhalation Toxicity Hazard Zone for the hazardous
     * goods, as defined by the US Department of Transportation.
     */
    private CodeRepresentation inhalationToxicityZoneCode;
    /**
     * A code signifying the packaging requirement for transportation of the
     * hazardous goods as assigned by IATA, IMDB, ADR, RID etc.
     */
    private CodeRepresentation packingCriteriaCode;
    /**
     * A code signifying authorization for the transportation of hazardous
     * cargo.
     */
    private CodeRepresentation transportAuthorizationCode;
    /**
     * An identifier for a transport emergency card describing the actions to be
     * taken in an emergency in transporting the hazardous goods. It may be the
     * identity number of a hazardous emergency response plan assigned by the
     * appropriate authority.
     */
    private CodeRepresentation transportEmergencyCardCode;
    private TemperatureRepresentation minimumTemperature;
    private TemperatureRepresentation maximumTemperature;

}