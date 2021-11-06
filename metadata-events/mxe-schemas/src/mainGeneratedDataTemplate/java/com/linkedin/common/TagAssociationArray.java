
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/GlobalTags.pdl.")
public class TagAssociationArray
    extends WrappingArrayTemplate<TagAssociation>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}}]", SchemaFormatType.PDL));

    public TagAssociationArray() {
        this(new DataList());
    }

    public TagAssociationArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public TagAssociationArray(Collection<TagAssociation> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public TagAssociationArray(DataList data) {
        super(data, SCHEMA, TagAssociation.class);
    }

    public TagAssociationArray(TagAssociation first, TagAssociation... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public TagAssociationArray clone()
        throws CloneNotSupportedException
    {
        return ((TagAssociationArray) super.clone());
    }

    @Override
    public TagAssociationArray copy()
        throws CloneNotSupportedException
    {
        return ((TagAssociationArray) super.copy());
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

        public com.linkedin.common.TagAssociation.Fields items() {
            return new com.linkedin.common.TagAssociation.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
