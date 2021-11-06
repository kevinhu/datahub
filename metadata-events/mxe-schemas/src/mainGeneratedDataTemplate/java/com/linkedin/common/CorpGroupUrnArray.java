
package com.linkedin.common;

import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DirectArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/CorpGroupInfo.pdl.")
public class CorpGroupUrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.CorpGroupUrn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpGroup\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"CorpGroup\",\"doc\":\"Corporate group's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"groupName\",\"doc\":\"The name of the AD/LDAP group.\",\"type\":\"string\",\"maxLength\":64}],\"maxLength\":81}typeref CorpGroupUrn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpGroupUrn.class);
    }

    public CorpGroupUrnArray() {
        this(new DataList());
    }

    public CorpGroupUrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public CorpGroupUrnArray(Collection<com.linkedin.common.urn.CorpGroupUrn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public CorpGroupUrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.CorpGroupUrn.class, String.class);
    }

    public CorpGroupUrnArray(com.linkedin.common.urn.CorpGroupUrn first, com.linkedin.common.urn.CorpGroupUrn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public CorpGroupUrnArray clone()
        throws CloneNotSupportedException
    {
        return ((CorpGroupUrnArray) super.clone());
    }

    @Override
    public CorpGroupUrnArray copy()
        throws CloneNotSupportedException
    {
        return ((CorpGroupUrnArray) super.copy());
    }

}
