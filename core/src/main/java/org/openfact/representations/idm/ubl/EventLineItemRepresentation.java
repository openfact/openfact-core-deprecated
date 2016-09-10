package org.openfact.representations.idm.ubl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * A class to define a line item describing the expected impacts associated with
 * a retail event involving a specific product at a specific location.
 * 
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:14:56 a. m.
 */
public class EventLineItemRepresentation {

    /**
     * The number of this event line item.
     */
    private BigDecimal lineNumberNumeric;
    private ItemRepresentation supplyItem;
    private LocationRepresentation participatingLocationsLocation;
    private List<RetailPlannedImpactRepresentation> retailPlannedImpacts = new ArrayList<>();

}
