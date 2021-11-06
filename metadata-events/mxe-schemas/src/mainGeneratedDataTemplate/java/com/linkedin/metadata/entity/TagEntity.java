
package com.linkedin.metadata.entity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * Data model for a tag entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/entity/TagEntity.pdl.")
public class TagEntity
    extends RecordTemplate
{

    private final static TagEntity.Fields _fields = new TagEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.entity/**Data model for a tag entity*/record TagEntity includes/**Common fields that apply to all entities*/record BaseEntity{/**Whether the entity has been removed or not*/removed:optional boolean=false}{/**Urn for the tag*/urn:{namespace com.linkedin.common/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}/**Name of the tag*/name:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.TagUrn.class);
    }

    public TagEntity() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public TagEntity(DataMap data) {
        super(data, SCHEMA);
    }

    public static TagEntity.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see TagEntity.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see TagEntity.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see TagEntity.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see TagEntity.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see TagEntity.Fields#removed
     */
    public TagEntity setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TagEntity.Fields#removed
     */
    public TagEntity setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see TagEntity.Fields#removed
     */
    public TagEntity setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see TagEntity.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see TagEntity.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see TagEntity.Fields#urn
     */
    public com.linkedin.common.urn.TagUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.TagUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TagEntity.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.TagUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.TagUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see TagEntity.Fields#urn
     */
    public TagEntity setUrn(com.linkedin.common.urn.TagUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.TagUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TagEntity.Fields#urn
     */
    public TagEntity setUrn(
        @Nonnull
        com.linkedin.common.urn.TagUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.TagUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see TagEntity.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see TagEntity.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see TagEntity.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see TagEntity.Fields#name
     */
    @Nullable
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see TagEntity.Fields#name
     */
    public TagEntity setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TagEntity.Fields#name
     */
    public TagEntity setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public TagEntity clone()
        throws CloneNotSupportedException
    {
        return ((TagEntity) super.clone());
    }

    @Override
    public TagEntity copy()
        throws CloneNotSupportedException
    {
        return ((TagEntity) super.copy());
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
         * Whether the entity has been removed or not
         * 
         */
        public PathSpec removed() {
            return new PathSpec(getPathComponents(), "removed");
        }

        /**
         * Urn for the tag
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Name of the tag
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

    }

}
