
package com.linkedin.common;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/GlossaryTerms.pdl.")
public class GlossaryTermAssociationArray
    extends WrappingArrayTemplate<GlossaryTermAssociation>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Searchable={\"fieldName\":\"glossaryTerms\",\"filterNameOverride\":\"Glossary Term\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}}]", SchemaFormatType.PDL));

    public GlossaryTermAssociationArray() {
        this(new DataList());
    }

    public GlossaryTermAssociationArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public GlossaryTermAssociationArray(Collection<GlossaryTermAssociation> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public GlossaryTermAssociationArray(DataList data) {
        super(data, SCHEMA, GlossaryTermAssociation.class);
    }

    public GlossaryTermAssociationArray(GlossaryTermAssociation first, GlossaryTermAssociation... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public GlossaryTermAssociationArray clone()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermAssociationArray) super.clone());
    }

    @Override
    public GlossaryTermAssociationArray copy()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermAssociationArray) super.copy());
    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        public com.linkedin.common.GlossaryTermAssociation.Fields items() {
            return new com.linkedin.common.GlossaryTermAssociation.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
