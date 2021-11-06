
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Type of Cost Code
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/CostType.pdl.")
public enum CostType {


    /**
     * Org Cost Type to which the Cost of this entity should be attributed to
     * 
     */
    ORG_COST_TYPE,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Type of Cost Code*/enum CostType{/**Org Cost Type to which the Cost of this entity should be attributed to*/ORG_COST_TYPE}", SchemaFormatType.PDL));

}
