
package com.linkedin.metadata.search;

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
import com.linkedin.data.template.StringArray;


/**
 * Data model for Corp Group entity search
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/CorpGroupDocument.pdl.")
public class CorpGroupDocument
    extends RecordTemplate
{

    private final static CorpGroupDocument.Fields _fields = new CorpGroupDocument.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**Data model for Corp Group entity search*/record CorpGroupDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{/**Urn for the Corp group.*/urn:{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpGroup\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"CorpGroup\",\"doc\":\"Corporate group's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"groupName\",\"doc\":\"The name of the AD/LDAP group.\",\"type\":\"string\",\"maxLength\":64}],\"maxLength\":81}typeref CorpGroupUrn=string}/**Email of the corp group*/email:optional string/**ldap usernames of corp users who are direct members of this group*/members:optional array[string]/**ldap usernames of corp users who are direct admins of this group*/admins:optional array[string]/**List of group names who are part of this group*/groups:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_BrowsePaths = SCHEMA.getField("browsePaths");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Email = SCHEMA.getField("email");
    private final static RecordDataSchema.Field FIELD_Members = SCHEMA.getField("members");
    private final static RecordDataSchema.Field FIELD_Admins = SCHEMA.getField("admins");
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpGroupUrn.class);
    }

    public CorpGroupDocument() {
        super(new DataMap(10, 0.75F), SCHEMA, 6);
    }

    public CorpGroupDocument(DataMap data) {
        super(data, SCHEMA);
    }

    public static CorpGroupDocument.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see CorpGroupDocument.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see CorpGroupDocument.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see CorpGroupDocument.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupDocument.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see CorpGroupDocument.Fields#removed
     */
    public CorpGroupDocument setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupDocument.Fields#removed
     */
    public CorpGroupDocument setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see CorpGroupDocument.Fields#removed
     */
    public CorpGroupDocument setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for browsePaths
     * 
     * @see CorpGroupDocument.Fields#browsePaths
     */
    public boolean hasBrowsePaths() {
        return contains(FIELD_BrowsePaths);
    }

    /**
     * Remover for browsePaths
     * 
     * @see CorpGroupDocument.Fields#browsePaths
     */
    public void removeBrowsePaths() {
        remove(FIELD_BrowsePaths);
    }

    /**
     * Getter for browsePaths
     * 
     * @see CorpGroupDocument.Fields#browsePaths
     */
    public StringArray getBrowsePaths(GetMode mode) {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, mode);
    }

    /**
     * Getter for browsePaths
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupDocument.Fields#browsePaths
     */
    @Nullable
    public StringArray getBrowsePaths() {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for browsePaths
     * 
     * @see CorpGroupDocument.Fields#browsePaths
     */
    public CorpGroupDocument setBrowsePaths(StringArray value, SetMode mode) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for browsePaths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupDocument.Fields#browsePaths
     */
    public CorpGroupDocument setBrowsePaths(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see CorpGroupDocument.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see CorpGroupDocument.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see CorpGroupDocument.Fields#urn
     */
    public com.linkedin.common.urn.CorpGroupUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.CorpGroupUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpGroupDocument.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.CorpGroupUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.CorpGroupUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see CorpGroupDocument.Fields#urn
     */
    public CorpGroupDocument setUrn(com.linkedin.common.urn.CorpGroupUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.CorpGroupUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupDocument.Fields#urn
     */
    public CorpGroupDocument setUrn(
        @Nonnull
        com.linkedin.common.urn.CorpGroupUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.CorpGroupUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for email
     * 
     * @see CorpGroupDocument.Fields#email
     */
    public boolean hasEmail() {
        return contains(FIELD_Email);
    }

    /**
     * Remover for email
     * 
     * @see CorpGroupDocument.Fields#email
     */
    public void removeEmail() {
        remove(FIELD_Email);
    }

    /**
     * Getter for email
     * 
     * @see CorpGroupDocument.Fields#email
     */
    public String getEmail(GetMode mode) {
        return obtainDirect(FIELD_Email, String.class, mode);
    }

    /**
     * Getter for email
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupDocument.Fields#email
     */
    @Nullable
    public String getEmail() {
        return obtainDirect(FIELD_Email, String.class, GetMode.STRICT);
    }

    /**
     * Setter for email
     * 
     * @see CorpGroupDocument.Fields#email
     */
    public CorpGroupDocument setEmail(String value, SetMode mode) {
        putDirect(FIELD_Email, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for email
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupDocument.Fields#email
     */
    public CorpGroupDocument setEmail(
        @Nonnull
        String value) {
        putDirect(FIELD_Email, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for members
     * 
     * @see CorpGroupDocument.Fields#members
     */
    public boolean hasMembers() {
        return contains(FIELD_Members);
    }

    /**
     * Remover for members
     * 
     * @see CorpGroupDocument.Fields#members
     */
    public void removeMembers() {
        remove(FIELD_Members);
    }

    /**
     * Getter for members
     * 
     * @see CorpGroupDocument.Fields#members
     */
    public StringArray getMembers(GetMode mode) {
        return obtainWrapped(FIELD_Members, StringArray.class, mode);
    }

    /**
     * Getter for members
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupDocument.Fields#members
     */
    @Nullable
    public StringArray getMembers() {
        return obtainWrapped(FIELD_Members, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for members
     * 
     * @see CorpGroupDocument.Fields#members
     */
    public CorpGroupDocument setMembers(StringArray value, SetMode mode) {
        putWrapped(FIELD_Members, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for members
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupDocument.Fields#members
     */
    public CorpGroupDocument setMembers(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Members, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for admins
     * 
     * @see CorpGroupDocument.Fields#admins
     */
    public boolean hasAdmins() {
        return contains(FIELD_Admins);
    }

    /**
     * Remover for admins
     * 
     * @see CorpGroupDocument.Fields#admins
     */
    public void removeAdmins() {
        remove(FIELD_Admins);
    }

    /**
     * Getter for admins
     * 
     * @see CorpGroupDocument.Fields#admins
     */
    public StringArray getAdmins(GetMode mode) {
        return obtainWrapped(FIELD_Admins, StringArray.class, mode);
    }

    /**
     * Getter for admins
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupDocument.Fields#admins
     */
    @Nullable
    public StringArray getAdmins() {
        return obtainWrapped(FIELD_Admins, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for admins
     * 
     * @see CorpGroupDocument.Fields#admins
     */
    public CorpGroupDocument setAdmins(StringArray value, SetMode mode) {
        putWrapped(FIELD_Admins, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for admins
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupDocument.Fields#admins
     */
    public CorpGroupDocument setAdmins(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Admins, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for groups
     * 
     * @see CorpGroupDocument.Fields#groups
     */
    public boolean hasGroups() {
        return contains(FIELD_Groups);
    }

    /**
     * Remover for groups
     * 
     * @see CorpGroupDocument.Fields#groups
     */
    public void removeGroups() {
        remove(FIELD_Groups);
    }

    /**
     * Getter for groups
     * 
     * @see CorpGroupDocument.Fields#groups
     */
    public StringArray getGroups(GetMode mode) {
        return obtainWrapped(FIELD_Groups, StringArray.class, mode);
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpGroupDocument.Fields#groups
     */
    @Nullable
    public StringArray getGroups() {
        return obtainWrapped(FIELD_Groups, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for groups
     * 
     * @see CorpGroupDocument.Fields#groups
     */
    public CorpGroupDocument setGroups(StringArray value, SetMode mode) {
        putWrapped(FIELD_Groups, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpGroupDocument.Fields#groups
     */
    public CorpGroupDocument setGroups(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Groups, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public CorpGroupDocument clone()
        throws CloneNotSupportedException
    {
        return ((CorpGroupDocument) super.clone());
    }

    @Override
    public CorpGroupDocument copy()
        throws CloneNotSupportedException
    {
        return ((CorpGroupDocument) super.copy());
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
         * All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.
         * 
         */
        public PathSpec browsePaths() {
            return new PathSpec(getPathComponents(), "browsePaths");
        }

        /**
         * All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.
         * 
         */
        public PathSpec browsePaths(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "browsePaths");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Urn for the Corp group.
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Email of the corp group
         * 
         */
        public PathSpec email() {
            return new PathSpec(getPathComponents(), "email");
        }

        /**
         * ldap usernames of corp users who are direct members of this group
         * 
         */
        public PathSpec members() {
            return new PathSpec(getPathComponents(), "members");
        }

        /**
         * ldap usernames of corp users who are direct members of this group
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
         * ldap usernames of corp users who are direct admins of this group
         * 
         */
        public PathSpec admins() {
            return new PathSpec(getPathComponents(), "admins");
        }

        /**
         * ldap usernames of corp users who are direct admins of this group
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
         * List of group names who are part of this group
         * 
         */
        public PathSpec groups() {
            return new PathSpec(getPathComponents(), "groups");
        }

        /**
         * List of group names who are part of this group
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

    }

}
