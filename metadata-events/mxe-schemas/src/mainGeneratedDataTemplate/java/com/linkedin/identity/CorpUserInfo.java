
package com.linkedin.identity;

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
 * Linkedin corp user information
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/CorpUserInfo.pdl.")
public class CorpUserInfo
    extends RecordTemplate
{

    private final static CorpUserInfo.Fields _fields = new CorpUserInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.identity/**Linkedin corp user information*/@Aspect={\"name\":\"corpUserInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"]}record CorpUserInfo{/**Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/@Searchable={\"weightsPerFieldValue\":{\"true\":2.0},\"fieldType\":\"BOOLEAN\"}active:boolean/**displayName of this user ,  e.g.  Hang Zhang(DataHQ)*/displayName:optional string/**email address of this user*/@Searchable={\"queryByDefault\":true,\"fieldType\":\"KEYWORD\"}email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**title of this user*/@Searchable={\"queryByDefault\":true,\"fieldType\":\"KEYWORD\"}title:optional string/**direct manager of this user*/@Relationship={\"name\":\"ReportsTo\",\"entityTypes\":[\"corpUser\"]}@Searchable={\"fieldName\":\"managerLdap\",\"queryByDefault\":true,\"fieldType\":\"URN\"}managerUrn:optional{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}/**department id this user belong to*/departmentId:optional long/**department name this user belong to*/departmentName:optional string/**first name of this user*/firstName:optional string/**last name of this user*/lastName:optional string/**Common name of this user, format is firstName + lastName (split by a whitespace)*/@Searchable={\"boostScore\":10.0,\"queryByDefault\":true,\"fieldType\":\"TEXT_PARTIAL\"}fullName:optional string/**two uppercase letters country code. e.g.  US*/countryCode:optional string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Active = SCHEMA.getField("active");
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Email = SCHEMA.getField("email");
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_ManagerUrn = SCHEMA.getField("managerUrn");
    private final static RecordDataSchema.Field FIELD_DepartmentId = SCHEMA.getField("departmentId");
    private final static RecordDataSchema.Field FIELD_DepartmentName = SCHEMA.getField("departmentName");
    private final static RecordDataSchema.Field FIELD_FirstName = SCHEMA.getField("firstName");
    private final static RecordDataSchema.Field FIELD_LastName = SCHEMA.getField("lastName");
    private final static RecordDataSchema.Field FIELD_FullName = SCHEMA.getField("fullName");
    private final static RecordDataSchema.Field FIELD_CountryCode = SCHEMA.getField("countryCode");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpuserUrn.class);
    }

    public CorpUserInfo() {
        super(new DataMap(15, 0.75F), SCHEMA);
    }

    public CorpUserInfo(DataMap data) {
        super(data, SCHEMA);
    }

    public static CorpUserInfo.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for active
     * 
     * @see CorpUserInfo.Fields#active
     */
    public boolean hasActive() {
        return contains(FIELD_Active);
    }

    /**
     * Remover for active
     * 
     * @see CorpUserInfo.Fields#active
     */
    public void removeActive() {
        remove(FIELD_Active);
    }

    /**
     * Getter for active
     * 
     * @see CorpUserInfo.Fields#active
     */
    public Boolean isActive(GetMode mode) {
        return obtainDirect(FIELD_Active, Boolean.class, mode);
    }

    /**
     * Getter for active
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see CorpUserInfo.Fields#active
     */
    @Nonnull
    public Boolean isActive() {
        return obtainDirect(FIELD_Active, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for active
     * 
     * @see CorpUserInfo.Fields#active
     */
    public CorpUserInfo setActive(Boolean value, SetMode mode) {
        putDirect(FIELD_Active, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for active
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#active
     */
    public CorpUserInfo setActive(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Active, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for active
     * 
     * @see CorpUserInfo.Fields#active
     */
    public CorpUserInfo setActive(boolean value) {
        putDirect(FIELD_Active, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see CorpUserInfo.Fields#displayName
     */
    public boolean hasDisplayName() {
        return contains(FIELD_DisplayName);
    }

    /**
     * Remover for displayName
     * 
     * @see CorpUserInfo.Fields#displayName
     */
    public void removeDisplayName() {
        remove(FIELD_DisplayName);
    }

    /**
     * Getter for displayName
     * 
     * @see CorpUserInfo.Fields#displayName
     */
    public String getDisplayName(GetMode mode) {
        return obtainDirect(FIELD_DisplayName, String.class, mode);
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName() {
        return obtainDirect(FIELD_DisplayName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for displayName
     * 
     * @see CorpUserInfo.Fields#displayName
     */
    public CorpUserInfo setDisplayName(String value, SetMode mode) {
        putDirect(FIELD_DisplayName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for displayName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#displayName
     */
    public CorpUserInfo setDisplayName(
        @Nonnull
        String value) {
        putDirect(FIELD_DisplayName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for email
     * 
     * @see CorpUserInfo.Fields#email
     */
    public boolean hasEmail() {
        return contains(FIELD_Email);
    }

    /**
     * Remover for email
     * 
     * @see CorpUserInfo.Fields#email
     */
    public void removeEmail() {
        remove(FIELD_Email);
    }

    /**
     * Getter for email
     * 
     * @see CorpUserInfo.Fields#email
     */
    public String getEmail(GetMode mode) {
        return obtainDirect(FIELD_Email, String.class, mode);
    }

    /**
     * Getter for email
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#email
     */
    @Nullable
    public String getEmail() {
        return obtainDirect(FIELD_Email, String.class, GetMode.STRICT);
    }

    /**
     * Setter for email
     * 
     * @see CorpUserInfo.Fields#email
     */
    public CorpUserInfo setEmail(String value, SetMode mode) {
        putDirect(FIELD_Email, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for email
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#email
     */
    public CorpUserInfo setEmail(
        @Nonnull
        String value) {
        putDirect(FIELD_Email, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for title
     * 
     * @see CorpUserInfo.Fields#title
     */
    public boolean hasTitle() {
        return contains(FIELD_Title);
    }

    /**
     * Remover for title
     * 
     * @see CorpUserInfo.Fields#title
     */
    public void removeTitle() {
        remove(FIELD_Title);
    }

    /**
     * Getter for title
     * 
     * @see CorpUserInfo.Fields#title
     */
    public String getTitle(GetMode mode) {
        return obtainDirect(FIELD_Title, String.class, mode);
    }

    /**
     * Getter for title
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#title
     */
    @Nullable
    public String getTitle() {
        return obtainDirect(FIELD_Title, String.class, GetMode.STRICT);
    }

    /**
     * Setter for title
     * 
     * @see CorpUserInfo.Fields#title
     */
    public CorpUserInfo setTitle(String value, SetMode mode) {
        putDirect(FIELD_Title, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#title
     */
    public CorpUserInfo setTitle(
        @Nonnull
        String value) {
        putDirect(FIELD_Title, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for managerUrn
     * 
     * @see CorpUserInfo.Fields#managerUrn
     */
    public boolean hasManagerUrn() {
        return contains(FIELD_ManagerUrn);
    }

    /**
     * Remover for managerUrn
     * 
     * @see CorpUserInfo.Fields#managerUrn
     */
    public void removeManagerUrn() {
        remove(FIELD_ManagerUrn);
    }

    /**
     * Getter for managerUrn
     * 
     * @see CorpUserInfo.Fields#managerUrn
     */
    public com.linkedin.common.urn.CorpuserUrn getManagerUrn(GetMode mode) {
        return obtainCustomType(FIELD_ManagerUrn, com.linkedin.common.urn.CorpuserUrn.class, mode);
    }

    /**
     * Getter for managerUrn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#managerUrn
     */
    @Nullable
    public com.linkedin.common.urn.CorpuserUrn getManagerUrn() {
        return obtainCustomType(FIELD_ManagerUrn, com.linkedin.common.urn.CorpuserUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for managerUrn
     * 
     * @see CorpUserInfo.Fields#managerUrn
     */
    public CorpUserInfo setManagerUrn(com.linkedin.common.urn.CorpuserUrn value, SetMode mode) {
        putCustomType(FIELD_ManagerUrn, com.linkedin.common.urn.CorpuserUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for managerUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#managerUrn
     */
    public CorpUserInfo setManagerUrn(
        @Nonnull
        com.linkedin.common.urn.CorpuserUrn value) {
        putCustomType(FIELD_ManagerUrn, com.linkedin.common.urn.CorpuserUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for departmentId
     * 
     * @see CorpUserInfo.Fields#departmentId
     */
    public boolean hasDepartmentId() {
        return contains(FIELD_DepartmentId);
    }

    /**
     * Remover for departmentId
     * 
     * @see CorpUserInfo.Fields#departmentId
     */
    public void removeDepartmentId() {
        remove(FIELD_DepartmentId);
    }

    /**
     * Getter for departmentId
     * 
     * @see CorpUserInfo.Fields#departmentId
     */
    public Long getDepartmentId(GetMode mode) {
        return obtainDirect(FIELD_DepartmentId, Long.class, mode);
    }

    /**
     * Getter for departmentId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#departmentId
     */
    @Nullable
    public Long getDepartmentId() {
        return obtainDirect(FIELD_DepartmentId, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for departmentId
     * 
     * @see CorpUserInfo.Fields#departmentId
     */
    public CorpUserInfo setDepartmentId(Long value, SetMode mode) {
        putDirect(FIELD_DepartmentId, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for departmentId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#departmentId
     */
    public CorpUserInfo setDepartmentId(
        @Nonnull
        Long value) {
        putDirect(FIELD_DepartmentId, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for departmentId
     * 
     * @see CorpUserInfo.Fields#departmentId
     */
    public CorpUserInfo setDepartmentId(long value) {
        putDirect(FIELD_DepartmentId, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for departmentName
     * 
     * @see CorpUserInfo.Fields#departmentName
     */
    public boolean hasDepartmentName() {
        return contains(FIELD_DepartmentName);
    }

    /**
     * Remover for departmentName
     * 
     * @see CorpUserInfo.Fields#departmentName
     */
    public void removeDepartmentName() {
        remove(FIELD_DepartmentName);
    }

    /**
     * Getter for departmentName
     * 
     * @see CorpUserInfo.Fields#departmentName
     */
    public String getDepartmentName(GetMode mode) {
        return obtainDirect(FIELD_DepartmentName, String.class, mode);
    }

    /**
     * Getter for departmentName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#departmentName
     */
    @Nullable
    public String getDepartmentName() {
        return obtainDirect(FIELD_DepartmentName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for departmentName
     * 
     * @see CorpUserInfo.Fields#departmentName
     */
    public CorpUserInfo setDepartmentName(String value, SetMode mode) {
        putDirect(FIELD_DepartmentName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for departmentName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#departmentName
     */
    public CorpUserInfo setDepartmentName(
        @Nonnull
        String value) {
        putDirect(FIELD_DepartmentName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for firstName
     * 
     * @see CorpUserInfo.Fields#firstName
     */
    public boolean hasFirstName() {
        return contains(FIELD_FirstName);
    }

    /**
     * Remover for firstName
     * 
     * @see CorpUserInfo.Fields#firstName
     */
    public void removeFirstName() {
        remove(FIELD_FirstName);
    }

    /**
     * Getter for firstName
     * 
     * @see CorpUserInfo.Fields#firstName
     */
    public String getFirstName(GetMode mode) {
        return obtainDirect(FIELD_FirstName, String.class, mode);
    }

    /**
     * Getter for firstName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#firstName
     */
    @Nullable
    public String getFirstName() {
        return obtainDirect(FIELD_FirstName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for firstName
     * 
     * @see CorpUserInfo.Fields#firstName
     */
    public CorpUserInfo setFirstName(String value, SetMode mode) {
        putDirect(FIELD_FirstName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for firstName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#firstName
     */
    public CorpUserInfo setFirstName(
        @Nonnull
        String value) {
        putDirect(FIELD_FirstName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for lastName
     * 
     * @see CorpUserInfo.Fields#lastName
     */
    public boolean hasLastName() {
        return contains(FIELD_LastName);
    }

    /**
     * Remover for lastName
     * 
     * @see CorpUserInfo.Fields#lastName
     */
    public void removeLastName() {
        remove(FIELD_LastName);
    }

    /**
     * Getter for lastName
     * 
     * @see CorpUserInfo.Fields#lastName
     */
    public String getLastName(GetMode mode) {
        return obtainDirect(FIELD_LastName, String.class, mode);
    }

    /**
     * Getter for lastName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#lastName
     */
    @Nullable
    public String getLastName() {
        return obtainDirect(FIELD_LastName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for lastName
     * 
     * @see CorpUserInfo.Fields#lastName
     */
    public CorpUserInfo setLastName(String value, SetMode mode) {
        putDirect(FIELD_LastName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for lastName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#lastName
     */
    public CorpUserInfo setLastName(
        @Nonnull
        String value) {
        putDirect(FIELD_LastName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for fullName
     * 
     * @see CorpUserInfo.Fields#fullName
     */
    public boolean hasFullName() {
        return contains(FIELD_FullName);
    }

    /**
     * Remover for fullName
     * 
     * @see CorpUserInfo.Fields#fullName
     */
    public void removeFullName() {
        remove(FIELD_FullName);
    }

    /**
     * Getter for fullName
     * 
     * @see CorpUserInfo.Fields#fullName
     */
    public String getFullName(GetMode mode) {
        return obtainDirect(FIELD_FullName, String.class, mode);
    }

    /**
     * Getter for fullName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#fullName
     */
    @Nullable
    public String getFullName() {
        return obtainDirect(FIELD_FullName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for fullName
     * 
     * @see CorpUserInfo.Fields#fullName
     */
    public CorpUserInfo setFullName(String value, SetMode mode) {
        putDirect(FIELD_FullName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for fullName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#fullName
     */
    public CorpUserInfo setFullName(
        @Nonnull
        String value) {
        putDirect(FIELD_FullName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for countryCode
     * 
     * @see CorpUserInfo.Fields#countryCode
     */
    public boolean hasCountryCode() {
        return contains(FIELD_CountryCode);
    }

    /**
     * Remover for countryCode
     * 
     * @see CorpUserInfo.Fields#countryCode
     */
    public void removeCountryCode() {
        remove(FIELD_CountryCode);
    }

    /**
     * Getter for countryCode
     * 
     * @see CorpUserInfo.Fields#countryCode
     */
    public String getCountryCode(GetMode mode) {
        return obtainDirect(FIELD_CountryCode, String.class, mode);
    }

    /**
     * Getter for countryCode
     * 
     * @return
     *     Optional field. Always check for null.
     * @see CorpUserInfo.Fields#countryCode
     */
    @Nullable
    public String getCountryCode() {
        return obtainDirect(FIELD_CountryCode, String.class, GetMode.STRICT);
    }

    /**
     * Setter for countryCode
     * 
     * @see CorpUserInfo.Fields#countryCode
     */
    public CorpUserInfo setCountryCode(String value, SetMode mode) {
        putDirect(FIELD_CountryCode, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for countryCode
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see CorpUserInfo.Fields#countryCode
     */
    public CorpUserInfo setCountryCode(
        @Nonnull
        String value) {
        putDirect(FIELD_CountryCode, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public CorpUserInfo clone()
        throws CloneNotSupportedException
    {
        return ((CorpUserInfo) super.clone());
    }

    @Override
    public CorpUserInfo copy()
        throws CloneNotSupportedException
    {
        return ((CorpUserInfo) super.copy());
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
         * Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools
         * 
         */
        public PathSpec active() {
            return new PathSpec(getPathComponents(), "active");
        }

        /**
         * displayName of this user ,  e.g.  Hang Zhang(DataHQ)
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * email address of this user
         * 
         */
        public PathSpec email() {
            return new PathSpec(getPathComponents(), "email");
        }

        /**
         * title of this user
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * direct manager of this user
         * 
         */
        public PathSpec managerUrn() {
            return new PathSpec(getPathComponents(), "managerUrn");
        }

        /**
         * department id this user belong to
         * 
         */
        public PathSpec departmentId() {
            return new PathSpec(getPathComponents(), "departmentId");
        }

        /**
         * department name this user belong to
         * 
         */
        public PathSpec departmentName() {
            return new PathSpec(getPathComponents(), "departmentName");
        }

        /**
         * first name of this user
         * 
         */
        public PathSpec firstName() {
            return new PathSpec(getPathComponents(), "firstName");
        }

        /**
         * last name of this user
         * 
         */
        public PathSpec lastName() {
            return new PathSpec(getPathComponents(), "lastName");
        }

        /**
         * Common name of this user, format is firstName + lastName (split by a whitespace)
         * 
         */
        public PathSpec fullName() {
            return new PathSpec(getPathComponents(), "fullName");
        }

        /**
         * two uppercase letters country code. e.g.  US
         * 
         */
        public PathSpec countryCode() {
            return new PathSpec(getPathComponents(), "countryCode");
        }

    }

}
