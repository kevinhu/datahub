
package com.linkedin.metadata.query.filter;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * The order used to sort the results
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/filter/SortOrder.pdl.")
public enum SortOrder {


    /**
     * If results need to be sorted in ascending order
     * 
     */
    ASCENDING,

    /**
     * If results need to be sorted in descending order
     * 
     */
    DESCENDING,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query.filter/**The order used to sort the results*/enum SortOrder{/**If results need to be sorted in ascending order*/ASCENDING/**If results need to be sorted in descending order*/DESCENDING}", SchemaFormatType.PDL));

}
