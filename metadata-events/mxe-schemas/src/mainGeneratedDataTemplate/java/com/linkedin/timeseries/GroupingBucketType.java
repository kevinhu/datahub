
package com.linkedin.timeseries;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Defines a grouping bucket type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/GroupingBucketType.pdl.")
public enum GroupingBucketType {

    DATE_GROUPING_BUCKET,
    STRING_GROUPING_BUCKET,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Defines a grouping bucket type.*/enum GroupingBucketType{DATE_GROUPING_BUCKET,STRING_GROUPING_BUCKET}", SchemaFormatType.PDL));

}
