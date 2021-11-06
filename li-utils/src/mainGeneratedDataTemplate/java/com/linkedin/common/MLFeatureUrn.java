
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized MLFeature identifier.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/MLFeatureUrn.pdl.")
public class MLFeatureUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"mlFeature\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"MLFeature\",\"doc\":\"Standardized MLFeature identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"mlFeatureNamespace\",\"doc\":\"Namespace for the MLFeature\",\"type\":\"string\"},{\"name\":\"mlFeatureName\",\"doc\":\"Name of the MLFeature\",\"type\":\"string\",\"maxLength\":210}],\"maxLength\":284}typeref MLFeatureUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.MLFeatureUrn.class);
    }

    public MLFeatureUrn() {
        super(SCHEMA);
    }

}
