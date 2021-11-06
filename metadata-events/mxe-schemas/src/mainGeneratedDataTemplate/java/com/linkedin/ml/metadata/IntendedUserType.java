
package com.linkedin.ml.metadata;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/IntendedUserType.pdl.")
public enum IntendedUserType {

    ENTERPRISE,
    HOBBY,
    ENTERTAINMENT,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata,enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}", SchemaFormatType.PDL));

}
