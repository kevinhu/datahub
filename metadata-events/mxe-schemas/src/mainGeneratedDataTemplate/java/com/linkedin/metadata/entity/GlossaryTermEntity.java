
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
 * Data model for a GlossaryTerm entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/entity/GlossaryTermEntity.pdl.")
public class GlossaryTermEntity
    extends RecordTemplate
{

    private final static GlossaryTermEntity.Fields _fields = new GlossaryTermEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.entity/**Data model for a GlossaryTerm entity*/record GlossaryTermEntity includes/**Common fields that apply to all entities*/record BaseEntity{/**Whether the entity has been removed or not*/removed:optional boolean=false}{/**Urn for the GlossaryTerm*/urn:{namespace com.linkedin.common/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}/**Business term name*/name:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.GlossaryTermUrn.class);
    }

    public GlossaryTermEntity() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public GlossaryTermEntity(DataMap data) {
        super(data, SCHEMA);
    }

    public static GlossaryTermEntity.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see GlossaryTermEntity.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see GlossaryTermEntity.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see GlossaryTermEntity.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermEntity.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see GlossaryTermEntity.Fields#removed
     */
    public GlossaryTermEntity setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermEntity.Fields#removed
     */
    public GlossaryTermEntity setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see GlossaryTermEntity.Fields#removed
     */
    public GlossaryTermEntity setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see GlossaryTermEntity.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see GlossaryTermEntity.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see GlossaryTermEntity.Fields#urn
     */
    public com.linkedin.common.urn.GlossaryTermUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlossaryTermEntity.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.GlossaryTermUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see GlossaryTermEntity.Fields#urn
     */
    public GlossaryTermEntity setUrn(com.linkedin.common.urn.GlossaryTermUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermEntity.Fields#urn
     */
    public GlossaryTermEntity setUrn(
        @Nonnull
        com.linkedin.common.urn.GlossaryTermUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.GlossaryTermUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see GlossaryTermEntity.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see GlossaryTermEntity.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see GlossaryTermEntity.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GlossaryTermEntity.Fields#name
     */
    @Nullable
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see GlossaryTermEntity.Fields#name
     */
    public GlossaryTermEntity setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlossaryTermEntity.Fields#name
     */
    public GlossaryTermEntity setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public GlossaryTermEntity clone()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermEntity) super.clone());
    }

    @Override
    public GlossaryTermEntity copy()
        throws CloneNotSupportedException
    {
        return ((GlossaryTermEntity) super.copy());
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
         * Urn for the GlossaryTerm
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Business term name
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

    }

}
