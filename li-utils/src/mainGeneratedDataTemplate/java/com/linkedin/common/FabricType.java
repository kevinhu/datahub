
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Fabric group type
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/FabricType.pdl.")
public enum FabricType {


    /**
     * Designates development fabrics
     * 
     */
    DEV,

    /**
     * Designates early-integration (staging) fabrics
     * 
     */
    EI,

    /**
     * Designates production fabrics
     * 
     */
    PROD,

    /**
     * Designates corporation fabrics
     * 
     */
    CORP,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}", SchemaFormatType.PDL));

}
