
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized dashboard identifier
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/TestEntityUrn.pdl.")
public class TestEntityUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized dashboard identifier*/@java.class=\"com.linkedin.common.urn.TestEntityUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"testEntity\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"TestEntity\",\"doc\":\"Standardized dashboard identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"keyPart1\",\"doc\":\"First key part.\",\"type\":\"string\",\"maxLength\":20},{\"name\":\"keyPart2\",\"doc\":\"Second key part\",\"type\":\"string\",\"maxLength\":200},{\"name\":\"keyPart2\",\"doc\":\"Third key part\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":240}typeref TestEntityUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.TestEntityUrn.class);
    }

    public TestEntityUrn() {
        super(SCHEMA);
    }

}
