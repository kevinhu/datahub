
package com.linkedin.chart;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * The various types of charts
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/chart/ChartType.pdl.")
public enum ChartType {


    /**
     * Chart showing a Bar chart
     * 
     */
    BAR,

    /**
     * Chart showing a Pie chart
     * 
     */
    PIE,

    /**
     * Chart showing a Scatter plot
     * 
     */
    SCATTER,

    /**
     * Chart showing a table
     * 
     */
    TABLE,

    /**
     * Chart showing Markdown formatted text
     * 
     */
    TEXT,
    LINE,
    AREA,
    HISTOGRAM,
    BOX_PLOT,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.chart/**The various types of charts*/enum ChartType{/**Chart showing a Bar chart*/BAR/**Chart showing a Pie chart*/PIE/**Chart showing a Scatter plot*/SCATTER/**Chart showing a table*/TABLE/**Chart showing Markdown formatted text*/TEXT,LINE,AREA,HISTOGRAM,BOX_PLOT}", SchemaFormatType.PDL));

}
