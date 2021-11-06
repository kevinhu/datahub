
package com.linkedin.metadata.search;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AccessLevel;
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
 * Data model for Chart entity search
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/DashboardDocument.pdl.")
public class DashboardDocument
    extends RecordTemplate
{

    private final static DashboardDocument.Fields _fields = new DashboardDocument.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**Data model for Chart entity search*/record DashboardDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{/**Urn for the Dashboard*/urn:{namespace com.linkedin.common/**Standardized dashboard identifier*/@java.class=\"com.linkedin.common.urn.DashboardUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dashboard\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dashboard\",\"doc\":\"Standardized dashboard identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dashboardTool\",\"doc\":\"The name of the dashboard tool such as looker, redash etc.\",\"type\":\"string\",\"maxLength\":20},{\"name\":\"dashboardId\",\"doc\":\"Unique id for the dashboard. This id should be globally unique for a dashboarding tool even when there are multiple deployments of it. As an example, dashboard URL could be used here for Looker such as 'looker.linkedin.com/dashboards/1234'\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":240}typeref DashboardUrn=string}/**Title of the dashboard*/title:optional string/**Detailed description about the dashboard*/description:optional string/**Dashboard tool ex: Looker, Redash*/tool:optional string/**LDAP usernames of corp users who are the owners of this dashboard*/owners:optional array[string]/**Access level for the dashboard*/access:optional{namespace com.linkedin.common/**The various access levels*/enum AccessLevel{/**Publicly available access level*/PUBLIC/**Private availability to certain set of users*/PRIVATE}}/**List of tags for this dataset*/tags:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_BrowsePaths = SCHEMA.getField("browsePaths");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Tool = SCHEMA.getField("tool");
    private final static RecordDataSchema.Field FIELD_Owners = SCHEMA.getField("owners");
    private final static RecordDataSchema.Field FIELD_Access = SCHEMA.getField("access");
    private final static RecordDataSchema.Field FIELD_Tags = SCHEMA.getField("tags");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DashboardUrn.class);
    }

    public DashboardDocument() {
        super(new DataMap(12, 0.75F), SCHEMA, 4);
    }

    public DashboardDocument(DataMap data) {
        super(data, SCHEMA);
    }

    public static DashboardDocument.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see DashboardDocument.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see DashboardDocument.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see DashboardDocument.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardDocument.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see DashboardDocument.Fields#removed
     */
    public DashboardDocument setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardDocument.Fields#removed
     */
    public DashboardDocument setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see DashboardDocument.Fields#removed
     */
    public DashboardDocument setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for browsePaths
     * 
     * @see DashboardDocument.Fields#browsePaths
     */
    public boolean hasBrowsePaths() {
        return contains(FIELD_BrowsePaths);
    }

    /**
     * Remover for browsePaths
     * 
     * @see DashboardDocument.Fields#browsePaths
     */
    public void removeBrowsePaths() {
        remove(FIELD_BrowsePaths);
    }

    /**
     * Getter for browsePaths
     * 
     * @see DashboardDocument.Fields#browsePaths
     */
    public StringArray getBrowsePaths(GetMode mode) {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, mode);
    }

    /**
     * Getter for browsePaths
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardDocument.Fields#browsePaths
     */
    @Nullable
    public StringArray getBrowsePaths() {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for browsePaths
     * 
     * @see DashboardDocument.Fields#browsePaths
     */
    public DashboardDocument setBrowsePaths(StringArray value, SetMode mode) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for browsePaths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardDocument.Fields#browsePaths
     */
    public DashboardDocument setBrowsePaths(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see DashboardDocument.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DashboardDocument.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DashboardDocument.Fields#urn
     */
    public com.linkedin.common.urn.DashboardUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DashboardUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DashboardDocument.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DashboardUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DashboardUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DashboardDocument.Fields#urn
     */
    public DashboardDocument setUrn(com.linkedin.common.urn.DashboardUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DashboardUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardDocument.Fields#urn
     */
    public DashboardDocument setUrn(
        @Nonnull
        com.linkedin.common.urn.DashboardUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DashboardUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for title
     * 
     * @see DashboardDocument.Fields#title
     */
    public boolean hasTitle() {
        return contains(FIELD_Title);
    }

    /**
     * Remover for title
     * 
     * @see DashboardDocument.Fields#title
     */
    public void removeTitle() {
        remove(FIELD_Title);
    }

    /**
     * Getter for title
     * 
     * @see DashboardDocument.Fields#title
     */
    public String getTitle(GetMode mode) {
        return obtainDirect(FIELD_Title, String.class, mode);
    }

    /**
     * Getter for title
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardDocument.Fields#title
     */
    @Nullable
    public String getTitle() {
        return obtainDirect(FIELD_Title, String.class, GetMode.STRICT);
    }

    /**
     * Setter for title
     * 
     * @see DashboardDocument.Fields#title
     */
    public DashboardDocument setTitle(String value, SetMode mode) {
        putDirect(FIELD_Title, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardDocument.Fields#title
     */
    public DashboardDocument setTitle(
        @Nonnull
        String value) {
        putDirect(FIELD_Title, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DashboardDocument.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see DashboardDocument.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see DashboardDocument.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardDocument.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see DashboardDocument.Fields#description
     */
    public DashboardDocument setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardDocument.Fields#description
     */
    public DashboardDocument setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for tool
     * 
     * @see DashboardDocument.Fields#tool
     */
    public boolean hasTool() {
        return contains(FIELD_Tool);
    }

    /**
     * Remover for tool
     * 
     * @see DashboardDocument.Fields#tool
     */
    public void removeTool() {
        remove(FIELD_Tool);
    }

    /**
     * Getter for tool
     * 
     * @see DashboardDocument.Fields#tool
     */
    public String getTool(GetMode mode) {
        return obtainDirect(FIELD_Tool, String.class, mode);
    }

    /**
     * Getter for tool
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardDocument.Fields#tool
     */
    @Nullable
    public String getTool() {
        return obtainDirect(FIELD_Tool, String.class, GetMode.STRICT);
    }

    /**
     * Setter for tool
     * 
     * @see DashboardDocument.Fields#tool
     */
    public DashboardDocument setTool(String value, SetMode mode) {
        putDirect(FIELD_Tool, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for tool
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardDocument.Fields#tool
     */
    public DashboardDocument setTool(
        @Nonnull
        String value) {
        putDirect(FIELD_Tool, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for owners
     * 
     * @see DashboardDocument.Fields#owners
     */
    public boolean hasOwners() {
        return contains(FIELD_Owners);
    }

    /**
     * Remover for owners
     * 
     * @see DashboardDocument.Fields#owners
     */
    public void removeOwners() {
        remove(FIELD_Owners);
    }

    /**
     * Getter for owners
     * 
     * @see DashboardDocument.Fields#owners
     */
    public StringArray getOwners(GetMode mode) {
        return obtainWrapped(FIELD_Owners, StringArray.class, mode);
    }

    /**
     * Getter for owners
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardDocument.Fields#owners
     */
    @Nullable
    public StringArray getOwners() {
        return obtainWrapped(FIELD_Owners, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for owners
     * 
     * @see DashboardDocument.Fields#owners
     */
    public DashboardDocument setOwners(StringArray value, SetMode mode) {
        putWrapped(FIELD_Owners, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for owners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardDocument.Fields#owners
     */
    public DashboardDocument setOwners(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Owners, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for access
     * 
     * @see DashboardDocument.Fields#access
     */
    public boolean hasAccess() {
        return contains(FIELD_Access);
    }

    /**
     * Remover for access
     * 
     * @see DashboardDocument.Fields#access
     */
    public void removeAccess() {
        remove(FIELD_Access);
    }

    /**
     * Getter for access
     * 
     * @see DashboardDocument.Fields#access
     */
    public AccessLevel getAccess(GetMode mode) {
        return obtainDirect(FIELD_Access, AccessLevel.class, mode);
    }

    /**
     * Getter for access
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardDocument.Fields#access
     */
    @Nullable
    public AccessLevel getAccess() {
        return obtainDirect(FIELD_Access, AccessLevel.class, GetMode.STRICT);
    }

    /**
     * Setter for access
     * 
     * @see DashboardDocument.Fields#access
     */
    public DashboardDocument setAccess(AccessLevel value, SetMode mode) {
        putDirect(FIELD_Access, AccessLevel.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for access
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardDocument.Fields#access
     */
    public DashboardDocument setAccess(
        @Nonnull
        AccessLevel value) {
        putDirect(FIELD_Access, AccessLevel.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for tags
     * 
     * @see DashboardDocument.Fields#tags
     */
    public boolean hasTags() {
        return contains(FIELD_Tags);
    }

    /**
     * Remover for tags
     * 
     * @see DashboardDocument.Fields#tags
     */
    public void removeTags() {
        remove(FIELD_Tags);
    }

    /**
     * Getter for tags
     * 
     * @see DashboardDocument.Fields#tags
     */
    public StringArray getTags(GetMode mode) {
        return obtainWrapped(FIELD_Tags, StringArray.class, mode);
    }

    /**
     * Getter for tags
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DashboardDocument.Fields#tags
     */
    @Nullable
    public StringArray getTags() {
        return obtainWrapped(FIELD_Tags, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for tags
     * 
     * @see DashboardDocument.Fields#tags
     */
    public DashboardDocument setTags(StringArray value, SetMode mode) {
        putWrapped(FIELD_Tags, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for tags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DashboardDocument.Fields#tags
     */
    public DashboardDocument setTags(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Tags, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DashboardDocument clone()
        throws CloneNotSupportedException
    {
        return ((DashboardDocument) super.clone());
    }

    @Override
    public DashboardDocument copy()
        throws CloneNotSupportedException
    {
        return ((DashboardDocument) super.copy());
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
         * Urn for the Dashboard
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Title of the dashboard
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * Detailed description about the dashboard
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Dashboard tool ex: Looker, Redash
         * 
         */
        public PathSpec tool() {
            return new PathSpec(getPathComponents(), "tool");
        }

        /**
         * LDAP usernames of corp users who are the owners of this dashboard
         * 
         */
        public PathSpec owners() {
            return new PathSpec(getPathComponents(), "owners");
        }

        /**
         * LDAP usernames of corp users who are the owners of this dashboard
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

        /**
         * Access level for the dashboard
         * 
         */
        public PathSpec access() {
            return new PathSpec(getPathComponents(), "access");
        }

        /**
         * List of tags for this dataset
         * 
         */
        public PathSpec tags() {
            return new PathSpec(getPathComponents(), "tags");
        }

        /**
         * List of tags for this dataset
         * 
         */
        public PathSpec tags(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "tags");
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
