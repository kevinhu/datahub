
package com.linkedin.identity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.CorpGroupUrnArray;
import com.linkedin.common.CorpuserUrnArray;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * group of corpUser, it may contains nested group
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/CorpGroupInfo.pdl.")
public class CorpGroupInfo
    extends RecordTemplate
{

    private final static CorpGroupInfo.Fields _fields = new CorpGroupInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**group of corpUser, it may contains nested group*/@Aspect={\"name\":\"corpGroupInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"]}record CorpGroupInfo{/**The name to use when displaying the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group*/@Relationship.`/*`={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\"]}admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}]/**List of ldap urn in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpUser\"]}members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpGroup\"]}groups:array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpGroup\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"CorpGroup\",\"doc\":\"Corporate group's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"groupName\",\"doc\":\"The name of the AD/LDAP group.\",\"type\":\"string\",\"maxLength\":64}],\"maxLength\":81}typeref CorpGroupUrn=string}]/**A description of the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"description:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Email = SCHEMA.getField("email");
    private final static RecordDataSchema.Field FIELD_Admins = SCHEMA.getField("admins");
    private final static RecordDataSchema.Field FIELD_Members = SCHEMA.getField("members");
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");

    public CorpGroupInfo() {
        super(new DataMap(8, 0.75F), SCHEMA, 4);
    }

    public CorpGroupInfo(DataMap data) {
        super(data, SCHEMA);
    }

    public static CorpGroupInfo.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for displayName
     * 
     * @see CorpGroupInfo.Fields#displayName
     */
    public boolean hasDisplayName() {
        return contains(FIELD_DisplayName);
    }

    /**
     * Remover for displayName
     * 
     * @see CorpGroupInfo.Fields#displayName
     */
    public void removeDisplayName() {
        remove(FIELD_DisplayName);
    }

    /**
     * Getter for displayName
     * 
     * @see CorpGroupInfo.Fields#displayName
     */
    public String getDisplayName(GetMode mode) {
        return obtainDirect(FIELD_DisplayName, String.class, mode);
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName() {
        return obtainDirect(FIELD_DisplayName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for displayName
     * 
     * @see CorpGroupInfo.Fields#displayName
     */
    public CorpGroupInfo setDisplayName(String value, SetMode mode) {
        putDirect(FIELD_DisplayName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for displayName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupInfo.Fields#displayName
     */
    public CorpGroupInfo setDisplayName(
        @Nonnull
        String value) {
        putDirect(FIELD_DisplayName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for email
     * 
     * @see CorpGroupInfo.Fields#email
     */
    public boolean hasEmail() {
        return contains(FIELD_Email);
    }

    /**
     * Remover for email
     * 
     * @see CorpGroupInfo.Fields#email
     */
    public void removeEmail() {
        remove(FIELD_Email);
    }

    /**
     * Getter for email
     * 
     * @see CorpGroupInfo.Fields#email
     */
    public String getEmail(GetMode mode) {
        return obtainDirect(FIELD_Email, String.class, mode);
    }

    /**
     * Getter for email
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupInfo.Fields#email
     */
    @Nullable
    public String getEmail() {
        return obtainDirect(FIELD_Email, String.class, GetMode.STRICT);
    }

    /**
     * Setter for email
     * 
     * @see CorpGroupInfo.Fields#email
     */
    public CorpGroupInfo setEmail(String value, SetMode mode) {
        putDirect(FIELD_Email, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for email
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupInfo.Fields#email
     */
    public CorpGroupInfo setEmail(
        @Nonnull
        String value) {
        putDirect(FIELD_Email, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for admins
     * 
     * @see CorpGroupInfo.Fields#admins
     */
    public boolean hasAdmins() {
        return contains(FIELD_Admins);
    }

    /**
     * Remover for admins
     * 
     * @see CorpGroupInfo.Fields#admins
     */
    public void removeAdmins() {
        remove(FIELD_Admins);
    }

    /**
     * Getter for admins
     * 
     * @see CorpGroupInfo.Fields#admins
     */
    public CorpuserUrnArray getAdmins(GetMode mode) {
        return obtainWrapped(FIELD_Admins, CorpuserUrnArray.class, mode);
    }

    /**
     * Getter for admins
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpGroupInfo.Fields#admins
     */
    @Nonnull
    public CorpuserUrnArray getAdmins() {
        return obtainWrapped(FIELD_Admins, CorpuserUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for admins
     * 
     * @see CorpGroupInfo.Fields#admins
     */
    public CorpGroupInfo setAdmins(CorpuserUrnArray value, SetMode mode) {
        putWrapped(FIELD_Admins, CorpuserUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for admins
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupInfo.Fields#admins
     */
    public CorpGroupInfo setAdmins(
        @Nonnull
        CorpuserUrnArray value) {
        putWrapped(FIELD_Admins, CorpuserUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for members
     * 
     * @see CorpGroupInfo.Fields#members
     */
    public boolean hasMembers() {
        return contains(FIELD_Members);
    }

    /**
     * Remover for members
     * 
     * @see CorpGroupInfo.Fields#members
     */
    public void removeMembers() {
        remove(FIELD_Members);
    }

    /**
     * Getter for members
     * 
     * @see CorpGroupInfo.Fields#members
     */
    public CorpuserUrnArray getMembers(GetMode mode) {
        return obtainWrapped(FIELD_Members, CorpuserUrnArray.class, mode);
    }

    /**
     * Getter for members
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpGroupInfo.Fields#members
     */
    @Nonnull
    public CorpuserUrnArray getMembers() {
        return obtainWrapped(FIELD_Members, CorpuserUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for members
     * 
     * @see CorpGroupInfo.Fields#members
     */
    public CorpGroupInfo setMembers(CorpuserUrnArray value, SetMode mode) {
        putWrapped(FIELD_Members, CorpuserUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for members
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupInfo.Fields#members
     */
    public CorpGroupInfo setMembers(
        @Nonnull
        CorpuserUrnArray value) {
        putWrapped(FIELD_Members, CorpuserUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for groups
     * 
     * @see CorpGroupInfo.Fields#groups
     */
    public boolean hasGroups() {
        return contains(FIELD_Groups);
    }

    /**
     * Remover for groups
     * 
     * @see CorpGroupInfo.Fields#groups
     */
    public void removeGroups() {
        remove(FIELD_Groups);
    }

    /**
     * Getter for groups
     * 
     * @see CorpGroupInfo.Fields#groups
     */
    public CorpGroupUrnArray getGroups(GetMode mode) {
        return obtainWrapped(FIELD_Groups, CorpGroupUrnArray.class, mode);
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpGroupInfo.Fields#groups
     */
    @Nonnull
    public CorpGroupUrnArray getGroups() {
        return obtainWrapped(FIELD_Groups, CorpGroupUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for groups
     * 
     * @see CorpGroupInfo.Fields#groups
     */
    public CorpGroupInfo setGroups(CorpGroupUrnArray value, SetMode mode) {
        putWrapped(FIELD_Groups, CorpGroupUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupInfo.Fields#groups
     */
    public CorpGroupInfo setGroups(
        @Nonnull
        CorpGroupUrnArray value) {
        putWrapped(FIELD_Groups, CorpGroupUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see CorpGroupInfo.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see CorpGroupInfo.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see CorpGroupInfo.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupInfo.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see CorpGroupInfo.Fields#description
     */
    public CorpGroupInfo setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupInfo.Fields#description
     */
    public CorpGroupInfo setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public CorpGroupInfo clone()
        throws CloneNotSupportedException
    {
        return ((CorpGroupInfo) super.clone());
    }

    @Override
    public CorpGroupInfo copy()
        throws CloneNotSupportedException
    {
        return ((CorpGroupInfo) super.copy());
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
         * The name to use when displaying the group.
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * email of this group
         * 
         */
        public PathSpec email() {
            return new PathSpec(getPathComponents(), "email");
        }

        /**
         * owners of this group
         * 
         */
        public PathSpec admins() {
            return new PathSpec(getPathComponents(), "admins");
        }

        /**
         * owners of this group
         * 
         */
        public PathSpec admins(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "admins");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of ldap urn in this group.
         * 
         */
        public PathSpec members() {
            return new PathSpec(getPathComponents(), "members");
        }

        /**
         * List of ldap urn in this group.
         * 
         */
        public PathSpec members(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "members");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of groups in this group.
         * 
         */
        public PathSpec groups() {
            return new PathSpec(getPathComponents(), "groups");
        }

        /**
         * List of groups in this group.
         * 
         */
        public PathSpec groups(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "groups");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A description of the group.
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

    }

}
