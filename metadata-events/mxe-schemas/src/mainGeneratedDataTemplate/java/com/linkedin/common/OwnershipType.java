
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Owner category or owner role
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/OwnershipType.pdl.")
public enum OwnershipType {


    /**
     * A person or group that is in charge of developing the code
     * 
     */
    DEVELOPER,

    /**
     * A person or group that is owning the data
     * 
     */
    DATAOWNER,

    /**
     * A person or a group that overseas the operation, e.g. a DBA or SRE.
     * 
     */
    DELEGATE,

    /**
     * A person, group, or service that produces/generates the data
     * 
     */
    PRODUCER,

    /**
     * A person, group, or service that consumes the data
     * 
     */
    CONSUMER,

    /**
     * A person or a group that has direct business interest
     * 
     */
    STAKEHOLDER,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}", SchemaFormatType.PDL));

}
