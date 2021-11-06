
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized azkaban flow identifier.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/AzkabanFlowUrn.pdl.")
public class AzkabanFlowUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized azkaban flow identifier.*/@java.class=\"com.linkedin.common.urn.AzkabanFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"azkabanFlow\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"AzkabanFlow\",\"doc\":\"Standardized azkaban flow identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"cluster\",\"doc\":\"Cluster on which the azkaban flow is deployed\",\"type\":\"string\",\"maxLength\":20},{\"name\":\"project\",\"doc\":\"Azkaban project name which is unique per cluster\",\"type\":\"string\",\"maxLength\":100},{\"name\":\"flowId\",\"doc\":\"Id or name of the azkaban flow\",\"type\":\"string\",\"maxLength\":100}],\"maxLength\":243}typeref AzkabanFlowUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.AzkabanFlowUrn.class);
    }

    public AzkabanFlowUrn() {
        super(SCHEMA);
    }

}
