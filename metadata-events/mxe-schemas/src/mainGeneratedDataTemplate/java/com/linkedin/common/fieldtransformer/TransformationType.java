
package com.linkedin.common.fieldtransformer;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Type of the transformation involved in generating destination fields from source fields.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/fieldtransformer/TransformationType.pdl.")
public enum TransformationType {


    /**
     * Field transformation expressed as unknown black box function.
     * 
     */
    BLACKBOX,

    /**
     * Field transformation expressed as Identity function.
     * 
     */
    IDENTITY,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common.fieldtransformer/**Type of the transformation involved in generating destination fields from source fields.*/enum TransformationType{/**Field transformation expressed as unknown black box function.*/BLACKBOX/**Field transformation expressed as Identity function.*/IDENTITY}", SchemaFormatType.PDL));

}
