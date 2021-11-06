
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized azkaban job identifier.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/AzkabanJobUrn.pdl.")
public class AzkabanJobUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized azkaban job identifier.*/@java.class=\"com.linkedin.common.urn.AzkabanJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"azkabanJob\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"AzkabanJob\",\"doc\":\"Standardized azkaban job identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"flow\",\"doc\":\"Standardized azkaban flow urn representing the flow for the job\",\"type\":\"com.linkedin.common.urn.AzkabanFlowUrn\"},{\"name\":\"jobID\",\"doc\":\"Id or name of the azkaban job\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":464}typeref AzkabanJobUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.AzkabanJobUrn.class);
    }

    public AzkabanJobUrn() {
        super(SCHEMA);
    }

}
