
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Enum to define the length of a bucket when doing aggregations
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/WindowDuration.pdl.")
public enum WindowDuration {

    YEAR,
    MONTH,
    WEEK,
    DAY,
    HOUR,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Enum to define the length of a bucket when doing aggregations*/enum WindowDuration{YEAR,MONTH,WEEK,DAY,HOUR}", SchemaFormatType.PDL));

}
