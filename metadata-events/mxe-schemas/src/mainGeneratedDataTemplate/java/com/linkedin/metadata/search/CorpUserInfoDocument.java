
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
 * Data model for CorpUserInfo entity search
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/CorpUserInfoDocument.pdl.")
public class CorpUserInfoDocument
    extends RecordTemplate
{

    private final static CorpUserInfoDocument.Fields _fields = new CorpUserInfoDocument.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**Data model for CorpUserInfo entity search*/record CorpUserInfoDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{/**Urn for the CorpUser.*/urn:{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}/**ldap of the CorpUser*/ldap:optional string/**title of the CorpUser*/title:optional string/**direct manager's ldap of the CorpUser*/managerLdap:optional string/**Common name of the CorpUser, format is firstName + lastName (split by a whitespace)*/fullName:optional string/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/teams:optional array[string]/**Skills that the user possesses e.g. Machine Learning*/skills:optional array[string]/**Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/active:optional boolean/**The user's full email(s).*/emails:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_BrowsePaths = SCHEMA.getField("browsePaths");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Ldap = SCHEMA.getField("ldap");
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_ManagerLdap = SCHEMA.getField("managerLdap");
    private final static RecordDataSchema.Field FIELD_FullName = SCHEMA.getField("fullName");
    private final static RecordDataSchema.Field FIELD_AboutMe = SCHEMA.getField("aboutMe");
    private final static RecordDataSchema.Field FIELD_Teams = SCHEMA.getField("teams");
    private final static RecordDataSchema.Field FIELD_Skills = SCHEMA.getField("skills");
    private final static RecordDataSchema.Field FIELD_Active = SCHEMA.getField("active");
    private final static RecordDataSchema.Field FIELD_Emails = SCHEMA.getField("emails");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpuserUrn.class);
    }

    public CorpUserInfoDocument() {
        super(new DataMap(), SCHEMA, 6);
    }

    public CorpUserInfoDocument(DataMap data) {
        super(data, SCHEMA);
    }

    public static CorpUserInfoDocument.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see CorpUserInfoDocument.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see CorpUserInfoDocument.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see CorpUserInfoDocument.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfoDocument.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see CorpUserInfoDocument.Fields#removed
     */
    public CorpUserInfoDocument setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfoDocument.Fields#removed
     */
    public CorpUserInfoDocument setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see CorpUserInfoDocument.Fields#removed
     */
    public CorpUserInfoDocument setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for browsePaths
     * 
     * @see CorpUserInfoDocument.Fields#browsePaths
     */
    public boolean hasBrowsePaths() {
        return contains(FIELD_BrowsePaths);
    }

    /**
     * Remover for browsePaths
     * 
     * @see CorpUserInfoDocument.Fields#browsePaths
     */
    public void removeBrowsePaths() {
        remove(FIELD_BrowsePaths);
    }

    /**
     * Getter for browsePaths
     * 
     * @see CorpUserInfoDocument.Fields#browsePaths
     */
    public StringArray getBrowsePaths(GetMode mode) {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, mode);
    }

    /**
     * Getter for browsePaths
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfoDocument.Fields#browsePaths
     */
    @Nullable
    public StringArray getBrowsePaths() {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for browsePaths
     * 
     * @see CorpUserInfoDocument.Fields#browsePaths
     */
    public CorpUserInfoDocument setBrowsePaths(StringArray value, SetMode mode) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for browsePaths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfoDocument.Fields#browsePaths
     */
    public CorpUserInfoDocument setBrowsePaths(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see CorpUserInfoDocument.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see CorpUserInfoDocument.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see CorpUserInfoDocument.Fields#urn
     */
    public com.linkedin.common.urn.CorpuserUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.CorpuserUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserInfoDocument.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.CorpuserUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.CorpuserUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see CorpUserInfoDocument.Fields#urn
     */
    public CorpUserInfoDocument setUrn(com.linkedin.common.urn.CorpuserUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.CorpuserUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfoDocument.Fields#urn
     */
    public CorpUserInfoDocument setUrn(
        @Nonnull
        com.linkedin.common.urn.CorpuserUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.CorpuserUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for ldap
     * 
     * @see CorpUserInfoDocument.Fields#ldap
     */
    public boolean hasLdap() {
        return contains(FIELD_Ldap);
    }

    /**
     * Remover for ldap
     * 
     * @see CorpUserInfoDocument.Fields#ldap
     */
    public void removeLdap() {
        remove(FIELD_Ldap);
    }

    /**
     * Getter for ldap
     * 
     * @see CorpUserInfoDocument.Fields#ldap
     */
    public String getLdap(GetMode mode) {
        return obtainDirect(FIELD_Ldap, String.class, mode);
    }

    /**
     * Getter for ldap
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfoDocument.Fields#ldap
     */
    @Nullable
    public String getLdap() {
        return obtainDirect(FIELD_Ldap, String.class, GetMode.STRICT);
    }

    /**
     * Setter for ldap
     * 
     * @see CorpUserInfoDocument.Fields#ldap
     */
    public CorpUserInfoDocument setLdap(String value, SetMode mode) {
        putDirect(FIELD_Ldap, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for ldap
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfoDocument.Fields#ldap
     */
    public CorpUserInfoDocument setLdap(
        @Nonnull
        String value) {
        putDirect(FIELD_Ldap, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for title
     * 
     * @see CorpUserInfoDocument.Fields#title
     */
    public boolean hasTitle() {
        return contains(FIELD_Title);
    }

    /**
     * Remover for title
     * 
     * @see CorpUserInfoDocument.Fields#title
     */
    public void removeTitle() {
        remove(FIELD_Title);
    }

    /**
     * Getter for title
     * 
     * @see CorpUserInfoDocument.Fields#title
     */
    public String getTitle(GetMode mode) {
        return obtainDirect(FIELD_Title, String.class, mode);
    }

    /**
     * Getter for title
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfoDocument.Fields#title
     */
    @Nullable
    public String getTitle() {
        return obtainDirect(FIELD_Title, String.class, GetMode.STRICT);
    }

    /**
     * Setter for title
     * 
     * @see CorpUserInfoDocument.Fields#title
     */
    public CorpUserInfoDocument setTitle(String value, SetMode mode) {
        putDirect(FIELD_Title, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfoDocument.Fields#title
     */
    public CorpUserInfoDocument setTitle(
        @Nonnull
        String value) {
        putDirect(FIELD_Title, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for managerLdap
     * 
     * @see CorpUserInfoDocument.Fields#managerLdap
     */
    public boolean hasManagerLdap() {
        return contains(FIELD_ManagerLdap);
    }

    /**
     * Remover for managerLdap
     * 
     * @see CorpUserInfoDocument.Fields#managerLdap
     */
    public void removeManagerLdap() {
        remove(FIELD_ManagerLdap);
    }

    /**
     * Getter for managerLdap
     * 
     * @see CorpUserInfoDocument.Fields#managerLdap
     */
    public String getManagerLdap(GetMode mode) {
        return obtainDirect(FIELD_ManagerLdap, String.class, mode);
    }

    /**
     * Getter for managerLdap
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfoDocument.Fields#managerLdap
     */
    @Nullable
    public String getManagerLdap() {
        return obtainDirect(FIELD_ManagerLdap, String.class, GetMode.STRICT);
    }

    /**
     * Setter for managerLdap
     * 
     * @see CorpUserInfoDocument.Fields#managerLdap
     */
    public CorpUserInfoDocument setManagerLdap(String value, SetMode mode) {
        putDirect(FIELD_ManagerLdap, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for managerLdap
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfoDocument.Fields#managerLdap
     */
    public CorpUserInfoDocument setManagerLdap(
        @Nonnull
        String value) {
        putDirect(FIELD_ManagerLdap, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for fullName
     * 
     * @see CorpUserInfoDocument.Fields#fullName
     */
    public boolean hasFullName() {
        return contains(FIELD_FullName);
    }

    /**
     * Remover for fullName
     * 
     * @see CorpUserInfoDocument.Fields#fullName
     */
    public void removeFullName() {
        remove(FIELD_FullName);
    }

    /**
     * Getter for fullName
     * 
     * @see CorpUserInfoDocument.Fields#fullName
     */
    public String getFullName(GetMode mode) {
        return obtainDirect(FIELD_FullName, String.class, mode);
    }

    /**
     * Getter for fullName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfoDocument.Fields#fullName
     */
    @Nullable
    public String getFullName() {
        return obtainDirect(FIELD_FullName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for fullName
     * 
     * @see CorpUserInfoDocument.Fields#fullName
     */
    public CorpUserInfoDocument setFullName(String value, SetMode mode) {
        putDirect(FIELD_FullName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for fullName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfoDocument.Fields#fullName
     */
    public CorpUserInfoDocument setFullName(
        @Nonnull
        String value) {
        putDirect(FIELD_FullName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aboutMe
     * 
     * @see CorpUserInfoDocument.Fields#aboutMe
     */
    public boolean hasAboutMe() {
        return contains(FIELD_AboutMe);
    }

    /**
     * Remover for aboutMe
     * 
     * @see CorpUserInfoDocument.Fields#aboutMe
     */
    public void removeAboutMe() {
        remove(FIELD_AboutMe);
    }

    /**
     * Getter for aboutMe
     * 
     * @see CorpUserInfoDocument.Fields#aboutMe
     */
    public String getAboutMe(GetMode mode) {
        return obtainDirect(FIELD_AboutMe, String.class, mode);
    }

    /**
     * Getter for aboutMe
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfoDocument.Fields#aboutMe
     */
    @Nullable
    public String getAboutMe() {
        return obtainDirect(FIELD_AboutMe, String.class, GetMode.STRICT);
    }

    /**
     * Setter for aboutMe
     * 
     * @see CorpUserInfoDocument.Fields#aboutMe
     */
    public CorpUserInfoDocument setAboutMe(String value, SetMode mode) {
        putDirect(FIELD_AboutMe, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for aboutMe
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfoDocument.Fields#aboutMe
     */
    public CorpUserInfoDocument setAboutMe(
        @Nonnull
        String value) {
        putDirect(FIELD_AboutMe, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for teams
     * 
     * @see CorpUserInfoDocument.Fields#teams
     */
    public boolean hasTeams() {
        return contains(FIELD_Teams);
    }

    /**
     * Remover for teams
     * 
     * @see CorpUserInfoDocument.Fields#teams
     */
    public void removeTeams() {
        remove(FIELD_Teams);
    }

    /**
     * Getter for teams
     * 
     * @see CorpUserInfoDocument.Fields#teams
     */
    public StringArray getTeams(GetMode mode) {
        return obtainWrapped(FIELD_Teams, StringArray.class, mode);
    }

    /**
     * Getter for teams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfoDocument.Fields#teams
     */
    @Nullable
    public StringArray getTeams() {
        return obtainWrapped(FIELD_Teams, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for teams
     * 
     * @see CorpUserInfoDocument.Fields#teams
     */
    public CorpUserInfoDocument setTeams(StringArray value, SetMode mode) {
        putWrapped(FIELD_Teams, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for teams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfoDocument.Fields#teams
     */
    public CorpUserInfoDocument setTeams(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Teams, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for skills
     * 
     * @see CorpUserInfoDocument.Fields#skills
     */
    public boolean hasSkills() {
        return contains(FIELD_Skills);
    }

    /**
     * Remover for skills
     * 
     * @see CorpUserInfoDocument.Fields#skills
     */
    public void removeSkills() {
        remove(FIELD_Skills);
    }

    /**
     * Getter for skills
     * 
     * @see CorpUserInfoDocument.Fields#skills
     */
    public StringArray getSkills(GetMode mode) {
        return obtainWrapped(FIELD_Skills, StringArray.class, mode);
    }

    /**
     * Getter for skills
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfoDocument.Fields#skills
     */
    @Nullable
    public StringArray getSkills() {
        return obtainWrapped(FIELD_Skills, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for skills
     * 
     * @see CorpUserInfoDocument.Fields#skills
     */
    public CorpUserInfoDocument setSkills(StringArray value, SetMode mode) {
        putWrapped(FIELD_Skills, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for skills
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfoDocument.Fields#skills
     */
    public CorpUserInfoDocument setSkills(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Skills, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for active
     * 
     * @see CorpUserInfoDocument.Fields#active
     */
    public boolean hasActive() {
        return contains(FIELD_Active);
    }

    /**
     * Remover for active
     * 
     * @see CorpUserInfoDocument.Fields#active
     */
    public void removeActive() {
        remove(FIELD_Active);
    }

    /**
     * Getter for active
     * 
     * @see CorpUserInfoDocument.Fields#active
     */
    public Boolean isActive(GetMode mode) {
        return obtainDirect(FIELD_Active, Boolean.class, mode);
    }

    /**
     * Getter for active
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfoDocument.Fields#active
     */
    @Nullable
    public Boolean isActive() {
        return obtainDirect(FIELD_Active, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for active
     * 
     * @see CorpUserInfoDocument.Fields#active
     */
    public CorpUserInfoDocument setActive(Boolean value, SetMode mode) {
        putDirect(FIELD_Active, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for active
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfoDocument.Fields#active
     */
    public CorpUserInfoDocument setActive(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Active, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for active
     * 
     * @see CorpUserInfoDocument.Fields#active
     */
    public CorpUserInfoDocument setActive(boolean value) {
        putDirect(FIELD_Active, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for emails
     * 
     * @see CorpUserInfoDocument.Fields#emails
     */
    public boolean hasEmails() {
        return contains(FIELD_Emails);
    }

    /**
     * Remover for emails
     * 
     * @see CorpUserInfoDocument.Fields#emails
     */
    public void removeEmails() {
        remove(FIELD_Emails);
    }

    /**
     * Getter for emails
     * 
     * @see CorpUserInfoDocument.Fields#emails
     */
    public StringArray getEmails(GetMode mode) {
        return obtainWrapped(FIELD_Emails, StringArray.class, mode);
    }

    /**
     * Getter for emails
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfoDocument.Fields#emails
     */
    @Nullable
    public StringArray getEmails() {
        return obtainWrapped(FIELD_Emails, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for emails
     * 
     * @see CorpUserInfoDocument.Fields#emails
     */
    public CorpUserInfoDocument setEmails(StringArray value, SetMode mode) {
        putWrapped(FIELD_Emails, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for emails
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfoDocument.Fields#emails
     */
    public CorpUserInfoDocument setEmails(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Emails, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public CorpUserInfoDocument clone()
        throws CloneNotSupportedException
    {
        return ((CorpUserInfoDocument) super.clone());
    }

    @Override
    public CorpUserInfoDocument copy()
        throws CloneNotSupportedException
    {
        return ((CorpUserInfoDocument) super.copy());
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
         * Urn for the CorpUser.
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * ldap of the CorpUser
         * 
         */
        public PathSpec ldap() {
            return new PathSpec(getPathComponents(), "ldap");
        }

        /**
         * title of the CorpUser
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * direct manager's ldap of the CorpUser
         * 
         */
        public PathSpec managerLdap() {
            return new PathSpec(getPathComponents(), "managerLdap");
        }

        /**
         * Common name of the CorpUser, format is firstName + lastName (split by a whitespace)
         * 
         */
        public PathSpec fullName() {
            return new PathSpec(getPathComponents(), "fullName");
        }

        /**
         * About me section of the user
         * 
         */
        public PathSpec aboutMe() {
            return new PathSpec(getPathComponents(), "aboutMe");
        }

        /**
         * Teams that the user belongs to e.g. Metadata
         * 
         */
        public PathSpec teams() {
            return new PathSpec(getPathComponents(), "teams");
        }

        /**
         * Teams that the user belongs to e.g. Metadata
         * 
         */
        public PathSpec teams(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "teams");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Skills that the user possesses e.g. Machine Learning
         * 
         */
        public PathSpec skills() {
            return new PathSpec(getPathComponents(), "skills");
        }

        /**
         * Skills that the user possesses e.g. Machine Learning
         * 
         */
        public PathSpec skills(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "skills");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools
         * 
         */
        public PathSpec active() {
            return new PathSpec(getPathComponents(), "active");
        }

        /**
         * The user's full email(s).
         * 
         */
        public PathSpec emails() {
            return new PathSpec(getPathComponents(), "emails");
        }

        /**
         * The user's full email(s).
         * 
         */
        public PathSpec emails(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "emails");
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
