
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
public class CorpuserUrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.CorpuserUrn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpuserUrn.class);
    }

    public CorpuserUrnArray() {
        this(new DataList());
    }

    public CorpuserUrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public CorpuserUrnArray(Collection<com.linkedin.common.urn.CorpuserUrn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public CorpuserUrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.CorpuserUrn.class, String.class);
    }

    public CorpuserUrnArray(com.linkedin.common.urn.CorpuserUrn first, com.linkedin.common.urn.CorpuserUrn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public CorpuserUrnArray clone()
        throws CloneNotSupportedException
    {
        return ((CorpuserUrnArray) super.clone());
    }

    @Override
    public CorpuserUrnArray copy()
        throws CloneNotSupportedException
    {
        return ((CorpuserUrnArray) super.copy());
    }

}
