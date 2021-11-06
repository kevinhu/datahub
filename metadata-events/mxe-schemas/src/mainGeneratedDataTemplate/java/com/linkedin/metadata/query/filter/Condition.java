
package com.linkedin.metadata.query.filter;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * The matching condition in a filter criterion
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/filter/Condition.pdl.")
public enum Condition {


    /**
     * Represent the relation: String field contains value, e.g. name contains Profile
     * 
     */
    CONTAIN,

    /**
     * Represent the relation: String field ends with value, e.g. name ends with Event
     * 
     */
    END_WITH,

    /**
     * Represent the relation: field = value, e.g. platform = hdfs
     * 
     */
    EQUAL,

    /**
     * Represent the relation greater than, e.g. ownerCount > 5
     * 
     */
    GREATER_THAN,

    /**
     * Represent the relation greater than or equal to, e.g. ownerCount >= 5
     * 
     */
    GREATER_THAN_OR_EQUAL_TO,

    /**
     * Represent the relation: String field is one of the array values to, e.g. name in ["Profile", "Event"]
     * 
     */
    IN,

    /**
     * Represent the relation less than, e.g. ownerCount < 3
     * 
     */
    LESS_THAN,

    /**
     * Represent the relation less than or equal to, e.g. ownerCount <= 3
     * 
     */
    LESS_THAN_OR_EQUAL_TO,

    /**
     * Represent the relation: String field starts with value, e.g. name starts with PageView
     * 
     */
    START_WITH,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query.filter/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}", SchemaFormatType.PDL));

}
