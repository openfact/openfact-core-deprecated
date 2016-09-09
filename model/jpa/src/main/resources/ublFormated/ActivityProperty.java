package org.openfact.models.jpa.entities.ubl;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * A class to define a name/value pair for a property of an inventory planning
 * activity.
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:12:36 a. m.
 */
public class ActivityProperty{

	/**
	 * The name of this activity property.
	 */
	private NameType Name;
	/**
	 * The value of this activity property.
	 */
	private TextType Value;

}