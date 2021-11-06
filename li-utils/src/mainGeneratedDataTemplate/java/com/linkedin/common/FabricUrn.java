
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Should match the forms used in configs: envInfoFinder.envToEnvByteMap. PROD-ELA4, PROD-ECH3, EI, EI2, prod-lva1, etc
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/FabricUrn.pdl.")
public class FabricUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Should match the forms used in configs: envInfoFinder.envToEnvByteMap. PROD-ELA4, PROD-ECH3, EI, EI2, prod-lva1, etc*/@java.class=\"com.linkedin.common.urn.FabricUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"owningTeam\":\"urn:li:internalTeam:Tools\",\"entityType\":\"fabric\",\"namespace\":\"li\",\"name\":\"Fabric\",\"doc\":\"Should match the forms used in configs: envInfoFinder.envToEnvByteMap. PROD-ELA4, PROD-ECH3, EI, EI2, prod-lva1, etc\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"fabricName\",\"doc\":\"\",\"type\":\"string\",\"maxLength\":36}],\"maxLength\":50}typeref FabricUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.FabricUrn.class);
    }

    public FabricUrn() {
        super(SCHEMA);
    }

}
