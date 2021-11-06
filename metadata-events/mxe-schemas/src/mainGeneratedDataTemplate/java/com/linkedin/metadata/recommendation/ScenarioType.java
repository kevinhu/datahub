
package com.linkedin.metadata.recommendation;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Type of the scenario requesting recommendation
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/ScenarioType.pdl.")
public enum ScenarioType {


    /**
     * Recommendations to show on the users home page
     * 
     */
    HOME,

    /**
     * Recommendations to show on the search results page
     * 
     */
    SEARCH_RESULTS,

    /**
     * Recommendations to show on an Entity Profile page
     * 
     */
    ENTITY_PROFILE,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Type of the scenario requesting recommendation*/enum ScenarioType{/**Recommendations to show on the users home page*/HOME/**Recommendations to show on the search results page*/SEARCH_RESULTS/**Recommendations to show on an Entity Profile page*/ENTITY_PROFILE}", SchemaFormatType.PDL));

}
