
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
 * Data model for a CorpGroup entity(go/groupId)
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/entity/CorpGroupEntity.pdl.")
public class CorpGroupEntity
    extends RecordTemplate
{

    private final static CorpGroupEntity.Fields _fields = new CorpGroupEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.entity/**Data model for a CorpGroup entity(go/groupId)*/record CorpGroupEntity includes/**Common fields that apply to all entities*/record BaseEntity{/**Whether the entity has been removed or not*/removed:optional boolean=false}{/**Urn for the LDAP Group*/urn:{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpGroup\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"CorpGroup\",\"doc\":\"Corporate group's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"groupName\",\"doc\":\"The name of the AD/LDAP group.\",\"type\":\"string\",\"maxLength\":64}],\"maxLength\":81}typeref CorpGroupUrn=string}/**name of the group, e.g. wherehows-dev, ask_metadata*/name:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpGroupUrn.class);
    }

    public CorpGroupEntity() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public CorpGroupEntity(DataMap data) {
        super(data, SCHEMA);
    }

    public static CorpGroupEntity.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see CorpGroupEntity.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see CorpGroupEntity.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see CorpGroupEntity.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupEntity.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see CorpGroupEntity.Fields#removed
     */
    public CorpGroupEntity setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupEntity.Fields#removed
     */
    public CorpGroupEntity setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see CorpGroupEntity.Fields#removed
     */
    public CorpGroupEntity setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see CorpGroupEntity.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see CorpGroupEntity.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see CorpGroupEntity.Fields#urn
     */
    public com.linkedin.common.urn.CorpGroupUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.CorpGroupUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpGroupEntity.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.CorpGroupUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.CorpGroupUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see CorpGroupEntity.Fields#urn
     */
    public CorpGroupEntity setUrn(com.linkedin.common.urn.CorpGroupUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.CorpGroupUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupEntity.Fields#urn
     */
    public CorpGroupEntity setUrn(
        @Nonnull
        com.linkedin.common.urn.CorpGroupUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.CorpGroupUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see CorpGroupEntity.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see CorpGroupEntity.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see CorpGroupEntity.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupEntity.Fields#name
     */
    @Nullable
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see CorpGroupEntity.Fields#name
     */
    public CorpGroupEntity setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupEntity.Fields#name
     */
    public CorpGroupEntity setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public CorpGroupEntity clone()
        throws CloneNotSupportedException
    {
        return ((CorpGroupEntity) super.clone());
    }

    @Override
    public CorpGroupEntity copy()
        throws CloneNotSupportedException
    {
        return ((CorpGroupEntity) super.copy());
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
         * Urn for the LDAP Group
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * name of the group, e.g. wherehows-dev, ask_metadata
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

    }

}
