
package com.linkedin.usage;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 *  The range of data buckets that should be returned 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/UsageTimeRange.pdl.")
public enum UsageTimeRange {

    HOUR,
    DAY,
    WEEK,
    MONTH,
    QUARTER,
    YEAR,
    ALL,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.usage/** The range of data buckets that should be returned */enum UsageTimeRange{HOUR,DAY,WEEK,MONTH,QUARTER,YEAR,ALL}", SchemaFormatType.PDL));

}
