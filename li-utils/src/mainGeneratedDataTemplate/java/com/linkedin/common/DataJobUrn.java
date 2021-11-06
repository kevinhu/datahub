
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized data processing job identifier.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/DataJobUrn.pdl.")
public class DataJobUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataJob\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataJob\",\"doc\":\"Standardized data processing job identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"flow\",\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"name\":\"jobID\",\"doc\":\"Unique identifier of the data job\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":594}typeref DataJobUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataJobUrn.class);
    }

    public DataJobUrn() {
        super(SCHEMA);
    }

}
