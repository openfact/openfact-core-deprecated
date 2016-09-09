package org.openfact.models.jpa.entities.ubl;
import java.util.List; 
import java.util.ArrayList; 
import org.openfact.models.jpa.entities.ublType.*;


/**
 * As explained in ExceptionCriteriaEntity Line: Three types of exception criteria can
 * be defined, Operational, Metric or ForecastExceptions. This class provides
 * criteria for forecast exception type: the identification of the purpose of the
 * forecast, the source
 * @author Erik
 * @version 2.1
 * @created 07-Set.-2016 9:15:16 a. m.
 */
public class ForecastExceptionEntity{

	/**
	 * A code signifying the partner providing the information in this forecast
	 * exception.
	 */
	private CodeType comparisonDataCode; 
	/**
	 * The date on which this comparison forecast was issued.
	 */
	private DateType comparisonForecastIssueDate; 
	/**
	 * The time at which this comparison forecast was issued.
	 */
	private TimeType comparisonForecastIssueTime; 
	/**
	 * A code signifying the partner who provides this information.
	 */
	private CodeType dataSourceCode; 
	/**
	 * It is either Sales forecast or OrderEntity Forecast. Definition can be changed like:
	 * "The purpose of the ForecastEntity (either sales or order), about which an exception
	 * criteria is being defined".
	 */
	private CodeType forecastPurposeCode; 
	/**
	 * A code signifying the type of forecast. Example of values are:BASE PROMOTIONAL
	 * SEASONAL TOTAL
	 */
	private CodeType forecastTypeCode; 
	/**
	 * The date on which the forecast was issued.
	 */
	private DateType issueDate; 
	/**
	 * The time at which the forecast was issued.
	 */
	private TimeType issueTime; 

}