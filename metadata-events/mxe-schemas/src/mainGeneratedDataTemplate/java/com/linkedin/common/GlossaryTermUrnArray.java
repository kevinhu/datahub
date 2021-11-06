
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/glossary/GlossaryRelatedTerms.pdl.")
public class GlossaryTermUrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.GlossaryTermUrn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.GlossaryTermUrn.class);
    }

    public GlossaryTermUrnArray() {
        this(new DataList());
    }

    public GlossaryTermUrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public GlossaryTermUrnArray(Collection<com.linkedin.common.urn.GlossaryTermUrn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public GlossaryTermUrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.GlossaryTermUrn.class, String.class);
    }

    public GlossaryTermUrnArray(com.linkedin.common.urn.GlossaryTermUrn first, com.linkedin.common.urn.GlossaryTermUrn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public GlossaryTermUrnArray clone()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermUrnArray) super.clone());
    }

    @Override
    public GlossaryTermUrnArray copy()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermUrnArray) super.copy());
    }

}
