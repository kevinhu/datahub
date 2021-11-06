
package com.linkedin.common;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Tag aspect used for applying tags to an entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/GlobalTags.pdl.")
public class GlobalTags
    extends RecordTemplate
{

    private final static GlobalTags.Fields _fields = new GlobalTags.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Tags = SCHEMA.getField("tags");

    public GlobalTags() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public GlobalTags(DataMap data) {
        super(data, SCHEMA);
    }

    public static GlobalTags.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for tags
     * 
     * @see GlobalTags.Fields#tags
     */
    public boolean hasTags() {
        return contains(FIELD_Tags);
    }

    /**
     * Remover for tags
     * 
     * @see GlobalTags.Fields#tags
     */
    public void removeTags() {
        remove(FIELD_Tags);
    }

    /**
     * Getter for tags
     * 
     * @see GlobalTags.Fields#tags
     */
    public TagAssociationArray getTags(GetMode mode) {
        return obtainWrapped(FIELD_Tags, TagAssociationArray.class, mode);
    }

    /**
     * Getter for tags
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlobalTags.Fields#tags
     */
    @Nonnull
    public TagAssociationArray getTags() {
        return obtainWrapped(FIELD_Tags, TagAssociationArray.class, GetMode.STRICT);
    }

    /**
     * Setter for tags
     * 
     * @see GlobalTags.Fields#tags
     */
    public GlobalTags setTags(TagAssociationArray value, SetMode mode) {
        putWrapped(FIELD_Tags, TagAssociationArray.class, value, mode);
        return this;
    }

    /**
     * Setter for tags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlobalTags.Fields#tags
     */
    public GlobalTags setTags(
        @Nonnull
        TagAssociationArray value) {
        putWrapped(FIELD_Tags, TagAssociationArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GlobalTags clone()
        throws CloneNotSupportedException
    {
        return ((GlobalTags) super.clone());
    }

    @Override
    public GlobalTags copy()
        throws CloneNotSupportedException
    {
        return ((GlobalTags) super.copy());
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
         * Tags associated with a given entity
         * 
         */
        public com.linkedin.common.TagAssociationArray.Fields tags() {
            return new com.linkedin.common.TagAssociationArray.Fields(getPathComponents(), "tags");
        }

        /**
         * Tags associated with a given entity
         * 
         */
        public PathSpec tags(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "tags");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

}
