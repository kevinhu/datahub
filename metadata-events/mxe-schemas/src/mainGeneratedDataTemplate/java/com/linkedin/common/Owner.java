
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
 * Ownership information
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/Owner.pdl.")
public class Owner
    extends RecordTemplate
{

    private final static Owner.Fields _fields = new Owner.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Owner = SCHEMA.getField("owner");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Source = SCHEMA.getField("source");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public Owner() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public Owner(DataMap data) {
        super(data, SCHEMA);
    }

    public static Owner.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for owner
     * 
     * @see Owner.Fields#owner
     */
    public boolean hasOwner() {
        return contains(FIELD_Owner);
    }

    /**
     * Remover for owner
     * 
     * @see Owner.Fields#owner
     */
    public void removeOwner() {
        remove(FIELD_Owner);
    }

    /**
     * Getter for owner
     * 
     * @see Owner.Fields#owner
     */
    public com.linkedin.common.urn.Urn getOwner(GetMode mode) {
        return obtainCustomType(FIELD_Owner, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for owner
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Owner.Fields#owner
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getOwner() {
        return obtainCustomType(FIELD_Owner, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for owner
     * 
     * @see Owner.Fields#owner
     */
    public Owner setOwner(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Owner, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for owner
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Owner.Fields#owner
     */
    public Owner setOwner(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Owner, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see Owner.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see Owner.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see Owner.Fields#type
     */
    public OwnershipType getType(GetMode mode) {
        return obtainDirect(FIELD_Type, OwnershipType.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Owner.Fields#type
     */
    @Nonnull
    public OwnershipType getType() {
        return obtainDirect(FIELD_Type, OwnershipType.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see Owner.Fields#type
     */
    public Owner setType(OwnershipType value, SetMode mode) {
        putDirect(FIELD_Type, OwnershipType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Owner.Fields#type
     */
    public Owner setType(
        @Nonnull
        OwnershipType value) {
        putDirect(FIELD_Type, OwnershipType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for source
     * 
     * @see Owner.Fields#source
     */
    public boolean hasSource() {
        return contains(FIELD_Source);
    }

    /**
     * Remover for source
     * 
     * @see Owner.Fields#source
     */
    public void removeSource() {
        remove(FIELD_Source);
    }

    /**
     * Getter for source
     * 
     * @see Owner.Fields#source
     */
    public OwnershipSource getSource(GetMode mode) {
        return obtainWrapped(FIELD_Source, OwnershipSource.class, mode);
    }

    /**
     * Getter for source
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Owner.Fields#source
     */
    @Nullable
    public OwnershipSource getSource() {
        return obtainWrapped(FIELD_Source, OwnershipSource.class, GetMode.STRICT);
    }

    /**
     * Setter for source
     * 
     * @see Owner.Fields#source
     */
    public Owner setSource(OwnershipSource value, SetMode mode) {
        putWrapped(FIELD_Source, OwnershipSource.class, value, mode);
        return this;
    }

    /**
     * Setter for source
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Owner.Fields#source
     */
    public Owner setSource(
        @Nonnull
        OwnershipSource value) {
        putWrapped(FIELD_Source, OwnershipSource.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Owner clone()
        throws CloneNotSupportedException
    {
        return ((Owner) super.clone());
    }

    @Override
    public Owner copy()
        throws CloneNotSupportedException
    {
        return ((Owner) super.copy());
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
         * Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name
         * (Caveat: only corpuser is currently supported in the frontend.)
         * 
         */
        public PathSpec owner() {
            return new PathSpec(getPathComponents(), "owner");
        }

        /**
         * The type of the ownership
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Source information for the ownership
         * 
         */
        public com.linkedin.common.OwnershipSource.Fields source() {
            return new com.linkedin.common.OwnershipSource.Fields(getPathComponents(), "source");
        }

    }

}
