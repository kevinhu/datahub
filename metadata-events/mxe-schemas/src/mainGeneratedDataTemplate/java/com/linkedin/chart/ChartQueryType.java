
package com.linkedin.chart;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/chart/ChartQueryType.pdl.")
public enum ChartQueryType {


    /**
     * LookML queries
     * 
     */
    LOOKML,

    /**
     * SQL type queries
     * 
     */
    SQL,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.chart,enum ChartQueryType{/**LookML queries*/LOOKML/**SQL type queries*/SQL}", SchemaFormatType.PDL));

}
