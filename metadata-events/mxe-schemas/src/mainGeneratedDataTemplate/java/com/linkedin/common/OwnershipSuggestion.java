
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
 * Ownership information of an entity, suggested by source system or other services.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/OwnershipSuggestion.pdl.")
public class OwnershipSuggestion
    extends RecordTemplate
{

    private final static OwnershipSuggestion.Fields _fields = new OwnershipSuggestion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Ownership information of an entity, suggested by source system or other services.*/record OwnershipSuggestion{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Owners = SCHEMA.getField("owners");

    public OwnershipSuggestion() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public OwnershipSuggestion(DataMap data) {
        super(data, SCHEMA);
    }

    public static OwnershipSuggestion.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for owners
     * 
     * @see OwnershipSuggestion.Fields#owners
     */
    public boolean hasOwners() {
        return contains(FIELD_Owners);
    }

    /**
     * Remover for owners
     * 
     * @see OwnershipSuggestion.Fields#owners
     */
    public void removeOwners() {
        remove(FIELD_Owners);
    }

    /**
     * Getter for owners
     * 
     * @see OwnershipSuggestion.Fields#owners
     */
    public OwnerArray getOwners(GetMode mode) {
        return obtainWrapped(FIELD_Owners, OwnerArray.class, mode);
    }

    /**
     * Getter for owners
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see OwnershipSuggestion.Fields#owners
     */
    @Nonnull
    public OwnerArray getOwners() {
        return obtainWrapped(FIELD_Owners, OwnerArray.class, GetMode.STRICT);
    }

    /**
     * Setter for owners
     * 
     * @see OwnershipSuggestion.Fields#owners
     */
    public OwnershipSuggestion setOwners(OwnerArray value, SetMode mode) {
        putWrapped(FIELD_Owners, OwnerArray.class, value, mode);
        return this;
    }

    /**
     * Setter for owners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see OwnershipSuggestion.Fields#owners
     */
    public OwnershipSuggestion setOwners(
        @Nonnull
        OwnerArray value) {
        putWrapped(FIELD_Owners, OwnerArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public OwnershipSuggestion clone()
        throws CloneNotSupportedException
    {
        return ((OwnershipSuggestion) super.clone());
    }

    @Override
    public OwnershipSuggestion copy()
        throws CloneNotSupportedException
    {
        return ((OwnershipSuggestion) super.copy());
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
         * List of owners of the entity.
         * 
         */
        public com.linkedin.common.OwnerArray.Fields owners() {
            return new com.linkedin.common.OwnerArray.Fields(getPathComponents(), "owners");
        }

        /**
         * List of owners of the entity.
         * 
         */
        public PathSpec owners(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "owners");
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
