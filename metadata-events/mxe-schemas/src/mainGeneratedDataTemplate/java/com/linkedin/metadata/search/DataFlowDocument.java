
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
 * Data model for DataFlow entity search
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/DataFlowDocument.pdl.")
public class DataFlowDocument
    extends RecordTemplate
{

    private final static DataFlowDocument.Fields _fields = new DataFlowDocument.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**Data model for DataFlow entity search*/record DataFlowDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{/**Urn for the DataFlow*/urn:{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataFlow\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataFlow\",\"doc\":\"Standardized data processing flow identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"orchestrator\",\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"type\":\"string\",\"maxLength\":50},{\"name\":\"flowId\",\"doc\":\"Unique Identifier of the data flow\",\"type\":\"string\",\"maxLength\":200},{\"name\":\"cluster\",\"doc\":\"Cluster where the flow is executed\",\"type\":\"string\",\"maxLength\":100}],\"maxLength\":373}typeref DataFlowUrn=string}/**Id of the flow*/flowId:optional string/**Name of the flow*/name:optional string/**Description of the flow*/description:optional string/**Workflow orchestrator ex: Azkaban, Airflow*/orchestrator:optional string/**Cluster of the flow*/cluster:optional string/**Project of the flow*/project:optional string/**LDAP usernames of corp users who are the owners of this flow*/owners:optional array[string]/**Flag to indicate if the flow has non empty corp users as owners or not.*/hasOwners:optional boolean/**List of tags for this dataset*/tags:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_BrowsePaths = SCHEMA.getField("browsePaths");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_FlowId = SCHEMA.getField("flowId");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Orchestrator = SCHEMA.getField("orchestrator");
    private final static RecordDataSchema.Field FIELD_Cluster = SCHEMA.getField("cluster");
    private final static RecordDataSchema.Field FIELD_Project = SCHEMA.getField("project");
    private final static RecordDataSchema.Field FIELD_Owners = SCHEMA.getField("owners");
    private final static RecordDataSchema.Field FIELD_HasOwners = SCHEMA.getField("hasOwners");
    private final static RecordDataSchema.Field FIELD_Tags = SCHEMA.getField("tags");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataFlowUrn.class);
    }

    public DataFlowDocument() {
        super(new DataMap(), SCHEMA, 4);
    }

    public DataFlowDocument(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataFlowDocument.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see DataFlowDocument.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see DataFlowDocument.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see DataFlowDocument.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowDocument.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see DataFlowDocument.Fields#removed
     */
    public DataFlowDocument setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowDocument.Fields#removed
     */
    public DataFlowDocument setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see DataFlowDocument.Fields#removed
     */
    public DataFlowDocument setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for browsePaths
     * 
     * @see DataFlowDocument.Fields#browsePaths
     */
    public boolean hasBrowsePaths() {
        return contains(FIELD_BrowsePaths);
    }

    /**
     * Remover for browsePaths
     * 
     * @see DataFlowDocument.Fields#browsePaths
     */
    public void removeBrowsePaths() {
        remove(FIELD_BrowsePaths);
    }

    /**
     * Getter for browsePaths
     * 
     * @see DataFlowDocument.Fields#browsePaths
     */
    public StringArray getBrowsePaths(GetMode mode) {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, mode);
    }

    /**
     * Getter for browsePaths
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowDocument.Fields#browsePaths
     */
    @Nullable
    public StringArray getBrowsePaths() {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for browsePaths
     * 
     * @see DataFlowDocument.Fields#browsePaths
     */
    public DataFlowDocument setBrowsePaths(StringArray value, SetMode mode) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for browsePaths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowDocument.Fields#browsePaths
     */
    public DataFlowDocument setBrowsePaths(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see DataFlowDocument.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DataFlowDocument.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DataFlowDocument.Fields#urn
     */
    public com.linkedin.common.urn.DataFlowUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataFlowUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataFlowDocument.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DataFlowUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataFlowUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DataFlowDocument.Fields#urn
     */
    public DataFlowDocument setUrn(com.linkedin.common.urn.DataFlowUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataFlowUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowDocument.Fields#urn
     */
    public DataFlowDocument setUrn(
        @Nonnull
        com.linkedin.common.urn.DataFlowUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataFlowUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for flowId
     * 
     * @see DataFlowDocument.Fields#flowId
     */
    public boolean hasFlowId() {
        return contains(FIELD_FlowId);
    }

    /**
     * Remover for flowId
     * 
     * @see DataFlowDocument.Fields#flowId
     */
    public void removeFlowId() {
        remove(FIELD_FlowId);
    }

    /**
     * Getter for flowId
     * 
     * @see DataFlowDocument.Fields#flowId
     */
    public String getFlowId(GetMode mode) {
        return obtainDirect(FIELD_FlowId, String.class, mode);
    }

    /**
     * Getter for flowId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowDocument.Fields#flowId
     */
    @Nullable
    public String getFlowId() {
        return obtainDirect(FIELD_FlowId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for flowId
     * 
     * @see DataFlowDocument.Fields#flowId
     */
    public DataFlowDocument setFlowId(String value, SetMode mode) {
        putDirect(FIELD_FlowId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for flowId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowDocument.Fields#flowId
     */
    public DataFlowDocument setFlowId(
        @Nonnull
        String value) {
        putDirect(FIELD_FlowId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see DataFlowDocument.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see DataFlowDocument.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see DataFlowDocument.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowDocument.Fields#name
     */
    @Nullable
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see DataFlowDocument.Fields#name
     */
    public DataFlowDocument setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowDocument.Fields#name
     */
    public DataFlowDocument setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DataFlowDocument.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see DataFlowDocument.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see DataFlowDocument.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowDocument.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see DataFlowDocument.Fields#description
     */
    public DataFlowDocument setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowDocument.Fields#description
     */
    public DataFlowDocument setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for orchestrator
     * 
     * @see DataFlowDocument.Fields#orchestrator
     */
    public boolean hasOrchestrator() {
        return contains(FIELD_Orchestrator);
    }

    /**
     * Remover for orchestrator
     * 
     * @see DataFlowDocument.Fields#orchestrator
     */
    public void removeOrchestrator() {
        remove(FIELD_Orchestrator);
    }

    /**
     * Getter for orchestrator
     * 
     * @see DataFlowDocument.Fields#orchestrator
     */
    public String getOrchestrator(GetMode mode) {
        return obtainDirect(FIELD_Orchestrator, String.class, mode);
    }

    /**
     * Getter for orchestrator
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowDocument.Fields#orchestrator
     */
    @Nullable
    public String getOrchestrator() {
        return obtainDirect(FIELD_Orchestrator, String.class, GetMode.STRICT);
    }

    /**
     * Setter for orchestrator
     * 
     * @see DataFlowDocument.Fields#orchestrator
     */
    public DataFlowDocument setOrchestrator(String value, SetMode mode) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for orchestrator
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowDocument.Fields#orchestrator
     */
    public DataFlowDocument setOrchestrator(
        @Nonnull
        String value) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for cluster
     * 
     * @see DataFlowDocument.Fields#cluster
     */
    public boolean hasCluster() {
        return contains(FIELD_Cluster);
    }

    /**
     * Remover for cluster
     * 
     * @see DataFlowDocument.Fields#cluster
     */
    public void removeCluster() {
        remove(FIELD_Cluster);
    }

    /**
     * Getter for cluster
     * 
     * @see DataFlowDocument.Fields#cluster
     */
    public String getCluster(GetMode mode) {
        return obtainDirect(FIELD_Cluster, String.class, mode);
    }

    /**
     * Getter for cluster
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowDocument.Fields#cluster
     */
    @Nullable
    public String getCluster() {
        return obtainDirect(FIELD_Cluster, String.class, GetMode.STRICT);
    }

    /**
     * Setter for cluster
     * 
     * @see DataFlowDocument.Fields#cluster
     */
    public DataFlowDocument setCluster(String value, SetMode mode) {
        putDirect(FIELD_Cluster, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for cluster
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowDocument.Fields#cluster
     */
    public DataFlowDocument setCluster(
        @Nonnull
        String value) {
        putDirect(FIELD_Cluster, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for project
     * 
     * @see DataFlowDocument.Fields#project
     */
    public boolean hasProject() {
        return contains(FIELD_Project);
    }

    /**
     * Remover for project
     * 
     * @see DataFlowDocument.Fields#project
     */
    public void removeProject() {
        remove(FIELD_Project);
    }

    /**
     * Getter for project
     * 
     * @see DataFlowDocument.Fields#project
     */
    public String getProject(GetMode mode) {
        return obtainDirect(FIELD_Project, String.class, mode);
    }

    /**
     * Getter for project
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowDocument.Fields#project
     */
    @Nullable
    public String getProject() {
        return obtainDirect(FIELD_Project, String.class, GetMode.STRICT);
    }

    /**
     * Setter for project
     * 
     * @see DataFlowDocument.Fields#project
     */
    public DataFlowDocument setProject(String value, SetMode mode) {
        putDirect(FIELD_Project, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for project
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowDocument.Fields#project
     */
    public DataFlowDocument setProject(
        @Nonnull
        String value) {
        putDirect(FIELD_Project, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for owners
     * 
     * @see DataFlowDocument.Fields#owners
     */
    public boolean hasOwners() {
        return contains(FIELD_Owners);
    }

    /**
     * Remover for owners
     * 
     * @see DataFlowDocument.Fields#owners
     */
    public void removeOwners() {
        remove(FIELD_Owners);
    }

    /**
     * Getter for owners
     * 
     * @see DataFlowDocument.Fields#owners
     */
    public StringArray getOwners(GetMode mode) {
        return obtainWrapped(FIELD_Owners, StringArray.class, mode);
    }

    /**
     * Getter for owners
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowDocument.Fields#owners
     */
    @Nullable
    public StringArray getOwners() {
        return obtainWrapped(FIELD_Owners, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for owners
     * 
     * @see DataFlowDocument.Fields#owners
     */
    public DataFlowDocument setOwners(StringArray value, SetMode mode) {
        putWrapped(FIELD_Owners, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for owners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowDocument.Fields#owners
     */
    public DataFlowDocument setOwners(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Owners, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for hasOwners
     * 
     * @see DataFlowDocument.Fields#hasOwners
     */
    public boolean hasHasOwners() {
        return contains(FIELD_HasOwners);
    }

    /**
     * Remover for hasOwners
     * 
     * @see DataFlowDocument.Fields#hasOwners
     */
    public void removeHasOwners() {
        remove(FIELD_HasOwners);
    }

    /**
     * Getter for hasOwners
     * 
     * @see DataFlowDocument.Fields#hasOwners
     */
    public Boolean isHasOwners(GetMode mode) {
        return obtainDirect(FIELD_HasOwners, Boolean.class, mode);
    }

    /**
     * Getter for hasOwners
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowDocument.Fields#hasOwners
     */
    @Nullable
    public Boolean isHasOwners() {
        return obtainDirect(FIELD_HasOwners, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for hasOwners
     * 
     * @see DataFlowDocument.Fields#hasOwners
     */
    public DataFlowDocument setHasOwners(Boolean value, SetMode mode) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for hasOwners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowDocument.Fields#hasOwners
     */
    public DataFlowDocument setHasOwners(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for hasOwners
     * 
     * @see DataFlowDocument.Fields#hasOwners
     */
    public DataFlowDocument setHasOwners(boolean value) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for tags
     * 
     * @see DataFlowDocument.Fields#tags
     */
    public boolean hasTags() {
        return contains(FIELD_Tags);
    }

    /**
     * Remover for tags
     * 
     * @see DataFlowDocument.Fields#tags
     */
    public void removeTags() {
        remove(FIELD_Tags);
    }

    /**
     * Getter for tags
     * 
     * @see DataFlowDocument.Fields#tags
     */
    public StringArray getTags(GetMode mode) {
        return obtainWrapped(FIELD_Tags, StringArray.class, mode);
    }

    /**
     * Getter for tags
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataFlowDocument.Fields#tags
     */
    @Nullable
    public StringArray getTags() {
        return obtainWrapped(FIELD_Tags, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for tags
     * 
     * @see DataFlowDocument.Fields#tags
     */
    public DataFlowDocument setTags(StringArray value, SetMode mode) {
        putWrapped(FIELD_Tags, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for tags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataFlowDocument.Fields#tags
     */
    public DataFlowDocument setTags(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Tags, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataFlowDocument clone()
        throws CloneNotSupportedException
    {
        return ((DataFlowDocument) super.clone());
    }

    @Override
    public DataFlowDocument copy()
        throws CloneNotSupportedException
    {
        return ((DataFlowDocument) super.copy());
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
         * Urn for the DataFlow
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Id of the flow
         * 
         */
        public PathSpec flowId() {
            return new PathSpec(getPathComponents(), "flowId");
        }

        /**
         * Name of the flow
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Description of the flow
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Workflow orchestrator ex: Azkaban, Airflow
         * 
         */
        public PathSpec orchestrator() {
            return new PathSpec(getPathComponents(), "orchestrator");
        }

        /**
         * Cluster of the flow
         * 
         */
        public PathSpec cluster() {
            return new PathSpec(getPathComponents(), "cluster");
        }

        /**
         * Project of the flow
         * 
         */
        public PathSpec project() {
            return new PathSpec(getPathComponents(), "project");
        }

        /**
         * LDAP usernames of corp users who are the owners of this flow
         * 
         */
        public PathSpec owners() {
            return new PathSpec(getPathComponents(), "owners");
        }

        /**
         * LDAP usernames of corp users who are the owners of this flow
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
         * Flag to indicate if the flow has non empty corp users as owners or not.
         * 
         */
        public PathSpec hasOwners() {
            return new PathSpec(getPathComponents(), "hasOwners");
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
