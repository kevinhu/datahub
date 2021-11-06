
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/GroupMembership.pdl.")
public class UrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.Urn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public UrnArray() {
        this(new DataList());
    }

    public UrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public UrnArray(Collection<com.linkedin.common.urn.Urn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public UrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.Urn.class, String.class);
    }

    public UrnArray(com.linkedin.common.urn.Urn first, com.linkedin.common.urn.Urn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public UrnArray clone()
        throws CloneNotSupportedException
    {
        return ((UrnArray) super.clone());
    }

    @Override
    public UrnArray copy()
        throws CloneNotSupportedException
    {
        return ((UrnArray) super.copy());
    }

}
