
package com.linkedin.common;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.
 * propagation parameters.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/TagAssociation.pdl.")
public class TagAssociation
    extends RecordTemplate
{

    private final static TagAssociation.Fields _fields = new TagAssociation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Tag = SCHEMA.getField("tag");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.TagUrn.class);
    }

    public TagAssociation() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public TagAssociation(DataMap data) {
        super(data, SCHEMA);
    }

    public static TagAssociation.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for tag
     * 
     * @see TagAssociation.Fields#tag
     */
    public boolean hasTag() {
        return contains(FIELD_Tag);
    }

    /**
     * Remover for tag
     * 
     * @see TagAssociation.Fields#tag
     */
    public void removeTag() {
        remove(FIELD_Tag);
    }

    /**
     * Getter for tag
     * 
     * @see TagAssociation.Fields#tag
     */
    public com.linkedin.common.urn.TagUrn getTag(GetMode mode) {
        return obtainCustomType(FIELD_Tag, com.linkedin.common.urn.TagUrn.class, mode);
    }

    /**
     * Getter for tag
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TagAssociation.Fields#tag
     */
    @Nonnull
    public com.linkedin.common.urn.TagUrn getTag() {
        return obtainCustomType(FIELD_Tag, com.linkedin.common.urn.TagUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for tag
     * 
     * @see TagAssociation.Fields#tag
     */
    public TagAssociation setTag(com.linkedin.common.urn.TagUrn value, SetMode mode) {
        putCustomType(FIELD_Tag, com.linkedin.common.urn.TagUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for tag
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TagAssociation.Fields#tag
     */
    public TagAssociation setTag(
        @Nonnull
        com.linkedin.common.urn.TagUrn value) {
        putCustomType(FIELD_Tag, com.linkedin.common.urn.TagUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public TagAssociation clone()
        throws CloneNotSupportedException
    {
        return ((TagAssociation) super.clone());
    }

    @Override
    public TagAssociation copy()
        throws CloneNotSupportedException
    {
        return ((TagAssociation) super.copy());
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

        /**
         * Urn of the applied tag
         * 
         */
        public PathSpec tag() {
            return new PathSpec(getPathComponents(), "tag");
        }

    }

}
