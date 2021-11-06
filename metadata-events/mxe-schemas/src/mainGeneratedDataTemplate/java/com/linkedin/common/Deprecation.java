
package com.linkedin.common;

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
 * Deprecation status of an entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Deprecation.pdl.")
public class Deprecation
    extends RecordTemplate
{

    private final static Deprecation.Fields _fields = new Deprecation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Deprecation status of an entity*/@Aspect.name=\"deprecation\"record Deprecation{/**Whether the entity is deprecated.*/@Searchable={\"weightsPerFieldValue\":{\"true\":0.5},\"fieldType\":\"BOOLEAN\"}deprecated:boolean/**The time user plan to decommission this entity.*/decommissionTime:optional/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**Additional information about the entity deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Deprecated = SCHEMA.getField("deprecated");
    private final static RecordDataSchema.Field FIELD_DecommissionTime = SCHEMA.getField("decommissionTime");
    private final static RecordDataSchema.Field FIELD_Note = SCHEMA.getField("note");
    private final static RecordDataSchema.Field FIELD_Actor = SCHEMA.getField("actor");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpuserUrn.class);
    }

    public Deprecation() {
        super(new DataMap(6, 0.75F), SCHEMA);
    }

    public Deprecation(DataMap data) {
        super(data, SCHEMA);
    }

    public static Deprecation.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for deprecated
     * 
     * @see Deprecation.Fields#deprecated
     */
    public boolean hasDeprecated() {
        return contains(FIELD_Deprecated);
    }

    /**
     * Remover for deprecated
     * 
     * @see Deprecation.Fields#deprecated
     */
    public void removeDeprecated() {
        remove(FIELD_Deprecated);
    }

    /**
     * Getter for deprecated
     * 
     * @see Deprecation.Fields#deprecated
     */
    public Boolean isDeprecated(GetMode mode) {
        return obtainDirect(FIELD_Deprecated, Boolean.class, mode);
    }

    /**
     * Getter for deprecated
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Deprecation.Fields#deprecated
     */
    @Nonnull
    public Boolean isDeprecated() {
        return obtainDirect(FIELD_Deprecated, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for deprecated
     * 
     * @see Deprecation.Fields#deprecated
     */
    public Deprecation setDeprecated(Boolean value, SetMode mode) {
        putDirect(FIELD_Deprecated, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for deprecated
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Deprecation.Fields#deprecated
     */
    public Deprecation setDeprecated(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Deprecated, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for deprecated
     * 
     * @see Deprecation.Fields#deprecated
     */
    public Deprecation setDeprecated(boolean value) {
        putDirect(FIELD_Deprecated, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for decommissionTime
     * 
     * @see Deprecation.Fields#decommissionTime
     */
    public boolean hasDecommissionTime() {
        return contains(FIELD_DecommissionTime);
    }

    /**
     * Remover for decommissionTime
     * 
     * @see Deprecation.Fields#decommissionTime
     */
    public void removeDecommissionTime() {
        remove(FIELD_DecommissionTime);
    }

    /**
     * Getter for decommissionTime
     * 
     * @see Deprecation.Fields#decommissionTime
     */
    public Long getDecommissionTime(GetMode mode) {
        return obtainDirect(FIELD_DecommissionTime, Long.class, mode);
    }

    /**
     * Getter for decommissionTime
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Deprecation.Fields#decommissionTime
     */
    @Nullable
    public Long getDecommissionTime() {
        return obtainDirect(FIELD_DecommissionTime, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for decommissionTime
     * 
     * @see Deprecation.Fields#decommissionTime
     */
    public Deprecation setDecommissionTime(Long value, SetMode mode) {
        putDirect(FIELD_DecommissionTime, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for decommissionTime
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Deprecation.Fields#decommissionTime
     */
    public Deprecation setDecommissionTime(
        @Nonnull
        Long value) {
        putDirect(FIELD_DecommissionTime, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for decommissionTime
     * 
     * @see Deprecation.Fields#decommissionTime
     */
    public Deprecation setDecommissionTime(long value) {
        putDirect(FIELD_DecommissionTime, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for note
     * 
     * @see Deprecation.Fields#note
     */
    public boolean hasNote() {
        return contains(FIELD_Note);
    }

    /**
     * Remover for note
     * 
     * @see Deprecation.Fields#note
     */
    public void removeNote() {
        remove(FIELD_Note);
    }

    /**
     * Getter for note
     * 
     * @see Deprecation.Fields#note
     */
    public String getNote(GetMode mode) {
        return obtainDirect(FIELD_Note, String.class, mode);
    }

    /**
     * Getter for note
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Deprecation.Fields#note
     */
    @Nonnull
    public String getNote() {
        return obtainDirect(FIELD_Note, String.class, GetMode.STRICT);
    }

    /**
     * Setter for note
     * 
     * @see Deprecation.Fields#note
     */
    public Deprecation setNote(String value, SetMode mode) {
        putDirect(FIELD_Note, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for note
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Deprecation.Fields#note
     */
    public Deprecation setNote(
        @Nonnull
        String value) {
        putDirect(FIELD_Note, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for actor
     * 
     * @see Deprecation.Fields#actor
     */
    public boolean hasActor() {
        return contains(FIELD_Actor);
    }

    /**
     * Remover for actor
     * 
     * @see Deprecation.Fields#actor
     */
    public void removeActor() {
        remove(FIELD_Actor);
    }

    /**
     * Getter for actor
     * 
     * @see Deprecation.Fields#actor
     */
    public com.linkedin.common.urn.CorpuserUrn getActor(GetMode mode) {
        return obtainCustomType(FIELD_Actor, com.linkedin.common.urn.CorpuserUrn.class, mode);
    }

    /**
     * Getter for actor
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Deprecation.Fields#actor
     */
    @Nonnull
    public com.linkedin.common.urn.CorpuserUrn getActor() {
        return obtainCustomType(FIELD_Actor, com.linkedin.common.urn.CorpuserUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for actor
     * 
     * @see Deprecation.Fields#actor
     */
    public Deprecation setActor(com.linkedin.common.urn.CorpuserUrn value, SetMode mode) {
        putCustomType(FIELD_Actor, com.linkedin.common.urn.CorpuserUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for actor
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Deprecation.Fields#actor
     */
    public Deprecation setActor(
        @Nonnull
        com.linkedin.common.urn.CorpuserUrn value) {
        putCustomType(FIELD_Actor, com.linkedin.common.urn.CorpuserUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Deprecation clone()
        throws CloneNotSupportedException
    {
        return ((Deprecation) super.clone());
    }

    @Override
    public Deprecation copy()
        throws CloneNotSupportedException
    {
        return ((Deprecation) super.copy());
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
         * Whether the entity is deprecated.
         * 
         */
        public PathSpec deprecated() {
            return new PathSpec(getPathComponents(), "deprecated");
        }

        /**
         * The time user plan to decommission this entity.
         * 
         */
        public PathSpec decommissionTime() {
            return new PathSpec(getPathComponents(), "decommissionTime");
        }

        /**
         * Additional information about the entity deprecation plan, such as the wiki, doc, RB.
         * 
         */
        public PathSpec note() {
            return new PathSpec(getPathComponents(), "note");
        }

        /**
         * The corpuser URN which will be credited for modifying this deprecation content.
         * 
         */
        public PathSpec actor() {
            return new PathSpec(getPathComponents(), "actor");
        }

    }

}
