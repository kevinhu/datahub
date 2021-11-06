
package com.linkedin.metadata.search;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.DatasetUrnArray;
import com.linkedin.common.FabricType;
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
 * Data model for data process entity search
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/DataProcessDocument.pdl.")
public class DataProcessDocument
    extends RecordTemplate
{

    private final static DataProcessDocument.Fields _fields = new DataProcessDocument.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**Data model for data process entity search*/record DataProcessDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{/**Urn for the data process*/urn:{namespace com.linkedin.common/**Standardized process identifier.*/@java.class=\"com.linkedin.common.urn.DataProcessUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataProcess\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataProcess\",\"doc\":\"Standardized process identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"process name i.e. an ETL job name\",\"type\":\"string\",\"maxLength\":25},{\"name\":\"orchestrator\",\"doc\":\"Standardized Orchestrator where data process is defined.\",\"type\":\"string\",\"maxLength\":100},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DataProcessUrn=string}/**Process native name e.g. a ETL script name*/name:optional string/**Orchestrator name for this process, such as Azure Data Factory*/orchestrator:optional string/**Fabric type where data process belongs to or where it was generated*/origin:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}/**LDAP usernames of corp users who are the owners of this process*/owners:optional array[string]/**Flag to indicate if the process has non empty corp users as owners or not.*/hasOwners:optional boolean/**Lineage information represented by the number of immediate input datasets of this process.*/numInputDatasets:optional long/**Lineage information represented by the number of immediate output datasets of this process.*/numOutputDatasets:optional long/**List of inputs for this process*/inputs:optional array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]/**List of outputs for this process*/outputs:optional array[com.linkedin.common.DatasetUrn]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_BrowsePaths = SCHEMA.getField("browsePaths");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Orchestrator = SCHEMA.getField("orchestrator");
    private final static RecordDataSchema.Field FIELD_Origin = SCHEMA.getField("origin");
    private final static RecordDataSchema.Field FIELD_Owners = SCHEMA.getField("owners");
    private final static RecordDataSchema.Field FIELD_HasOwners = SCHEMA.getField("hasOwners");
    private final static RecordDataSchema.Field FIELD_NumInputDatasets = SCHEMA.getField("numInputDatasets");
    private final static RecordDataSchema.Field FIELD_NumOutputDatasets = SCHEMA.getField("numOutputDatasets");
    private final static RecordDataSchema.Field FIELD_Inputs = SCHEMA.getField("inputs");
    private final static RecordDataSchema.Field FIELD_Outputs = SCHEMA.getField("outputs");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataProcessUrn.class);
    }

    public DataProcessDocument() {
        super(new DataMap(), SCHEMA, 6);
    }

    public DataProcessDocument(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataProcessDocument.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see DataProcessDocument.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see DataProcessDocument.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see DataProcessDocument.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessDocument.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see DataProcessDocument.Fields#removed
     */
    public DataProcessDocument setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessDocument.Fields#removed
     */
    public DataProcessDocument setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see DataProcessDocument.Fields#removed
     */
    public DataProcessDocument setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for browsePaths
     * 
     * @see DataProcessDocument.Fields#browsePaths
     */
    public boolean hasBrowsePaths() {
        return contains(FIELD_BrowsePaths);
    }

    /**
     * Remover for browsePaths
     * 
     * @see DataProcessDocument.Fields#browsePaths
     */
    public void removeBrowsePaths() {
        remove(FIELD_BrowsePaths);
    }

    /**
     * Getter for browsePaths
     * 
     * @see DataProcessDocument.Fields#browsePaths
     */
    public StringArray getBrowsePaths(GetMode mode) {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, mode);
    }

    /**
     * Getter for browsePaths
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessDocument.Fields#browsePaths
     */
    @Nullable
    public StringArray getBrowsePaths() {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for browsePaths
     * 
     * @see DataProcessDocument.Fields#browsePaths
     */
    public DataProcessDocument setBrowsePaths(StringArray value, SetMode mode) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for browsePaths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessDocument.Fields#browsePaths
     */
    public DataProcessDocument setBrowsePaths(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see DataProcessDocument.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DataProcessDocument.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DataProcessDocument.Fields#urn
     */
    public com.linkedin.common.urn.DataProcessUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataProcessUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessDocument.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DataProcessUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataProcessUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DataProcessDocument.Fields#urn
     */
    public DataProcessDocument setUrn(com.linkedin.common.urn.DataProcessUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataProcessUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessDocument.Fields#urn
     */
    public DataProcessDocument setUrn(
        @Nonnull
        com.linkedin.common.urn.DataProcessUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataProcessUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see DataProcessDocument.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see DataProcessDocument.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see DataProcessDocument.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessDocument.Fields#name
     */
    @Nullable
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see DataProcessDocument.Fields#name
     */
    public DataProcessDocument setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessDocument.Fields#name
     */
    public DataProcessDocument setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for orchestrator
     * 
     * @see DataProcessDocument.Fields#orchestrator
     */
    public boolean hasOrchestrator() {
        return contains(FIELD_Orchestrator);
    }

    /**
     * Remover for orchestrator
     * 
     * @see DataProcessDocument.Fields#orchestrator
     */
    public void removeOrchestrator() {
        remove(FIELD_Orchestrator);
    }

    /**
     * Getter for orchestrator
     * 
     * @see DataProcessDocument.Fields#orchestrator
     */
    public String getOrchestrator(GetMode mode) {
        return obtainDirect(FIELD_Orchestrator, String.class, mode);
    }

    /**
     * Getter for orchestrator
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessDocument.Fields#orchestrator
     */
    @Nullable
    public String getOrchestrator() {
        return obtainDirect(FIELD_Orchestrator, String.class, GetMode.STRICT);
    }

    /**
     * Setter for orchestrator
     * 
     * @see DataProcessDocument.Fields#orchestrator
     */
    public DataProcessDocument setOrchestrator(String value, SetMode mode) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for orchestrator
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessDocument.Fields#orchestrator
     */
    public DataProcessDocument setOrchestrator(
        @Nonnull
        String value) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for origin
     * 
     * @see DataProcessDocument.Fields#origin
     */
    public boolean hasOrigin() {
        return contains(FIELD_Origin);
    }

    /**
     * Remover for origin
     * 
     * @see DataProcessDocument.Fields#origin
     */
    public void removeOrigin() {
        remove(FIELD_Origin);
    }

    /**
     * Getter for origin
     * 
     * @see DataProcessDocument.Fields#origin
     */
    public FabricType getOrigin(GetMode mode) {
        return obtainDirect(FIELD_Origin, FabricType.class, mode);
    }

    /**
     * Getter for origin
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessDocument.Fields#origin
     */
    @Nullable
    public FabricType getOrigin() {
        return obtainDirect(FIELD_Origin, FabricType.class, GetMode.STRICT);
    }

    /**
     * Setter for origin
     * 
     * @see DataProcessDocument.Fields#origin
     */
    public DataProcessDocument setOrigin(FabricType value, SetMode mode) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for origin
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessDocument.Fields#origin
     */
    public DataProcessDocument setOrigin(
        @Nonnull
        FabricType value) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for owners
     * 
     * @see DataProcessDocument.Fields#owners
     */
    public boolean hasOwners() {
        return contains(FIELD_Owners);
    }

    /**
     * Remover for owners
     * 
     * @see DataProcessDocument.Fields#owners
     */
    public void removeOwners() {
        remove(FIELD_Owners);
    }

    /**
     * Getter for owners
     * 
     * @see DataProcessDocument.Fields#owners
     */
    public StringArray getOwners(GetMode mode) {
        return obtainWrapped(FIELD_Owners, StringArray.class, mode);
    }

    /**
     * Getter for owners
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessDocument.Fields#owners
     */
    @Nullable
    public StringArray getOwners() {
        return obtainWrapped(FIELD_Owners, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for owners
     * 
     * @see DataProcessDocument.Fields#owners
     */
    public DataProcessDocument setOwners(StringArray value, SetMode mode) {
        putWrapped(FIELD_Owners, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for owners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessDocument.Fields#owners
     */
    public DataProcessDocument setOwners(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Owners, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for hasOwners
     * 
     * @see DataProcessDocument.Fields#hasOwners
     */
    public boolean hasHasOwners() {
        return contains(FIELD_HasOwners);
    }

    /**
     * Remover for hasOwners
     * 
     * @see DataProcessDocument.Fields#hasOwners
     */
    public void removeHasOwners() {
        remove(FIELD_HasOwners);
    }

    /**
     * Getter for hasOwners
     * 
     * @see DataProcessDocument.Fields#hasOwners
     */
    public Boolean isHasOwners(GetMode mode) {
        return obtainDirect(FIELD_HasOwners, Boolean.class, mode);
    }

    /**
     * Getter for hasOwners
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessDocument.Fields#hasOwners
     */
    @Nullable
    public Boolean isHasOwners() {
        return obtainDirect(FIELD_HasOwners, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for hasOwners
     * 
     * @see DataProcessDocument.Fields#hasOwners
     */
    public DataProcessDocument setHasOwners(Boolean value, SetMode mode) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for hasOwners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessDocument.Fields#hasOwners
     */
    public DataProcessDocument setHasOwners(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for hasOwners
     * 
     * @see DataProcessDocument.Fields#hasOwners
     */
    public DataProcessDocument setHasOwners(boolean value) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for numInputDatasets
     * 
     * @see DataProcessDocument.Fields#numInputDatasets
     */
    public boolean hasNumInputDatasets() {
        return contains(FIELD_NumInputDatasets);
    }

    /**
     * Remover for numInputDatasets
     * 
     * @see DataProcessDocument.Fields#numInputDatasets
     */
    public void removeNumInputDatasets() {
        remove(FIELD_NumInputDatasets);
    }

    /**
     * Getter for numInputDatasets
     * 
     * @see DataProcessDocument.Fields#numInputDatasets
     */
    public Long getNumInputDatasets(GetMode mode) {
        return obtainDirect(FIELD_NumInputDatasets, Long.class, mode);
    }

    /**
     * Getter for numInputDatasets
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessDocument.Fields#numInputDatasets
     */
    @Nullable
    public Long getNumInputDatasets() {
        return obtainDirect(FIELD_NumInputDatasets, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for numInputDatasets
     * 
     * @see DataProcessDocument.Fields#numInputDatasets
     */
    public DataProcessDocument setNumInputDatasets(Long value, SetMode mode) {
        putDirect(FIELD_NumInputDatasets, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for numInputDatasets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessDocument.Fields#numInputDatasets
     */
    public DataProcessDocument setNumInputDatasets(
        @Nonnull
        Long value) {
        putDirect(FIELD_NumInputDatasets, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for numInputDatasets
     * 
     * @see DataProcessDocument.Fields#numInputDatasets
     */
    public DataProcessDocument setNumInputDatasets(long value) {
        putDirect(FIELD_NumInputDatasets, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for numOutputDatasets
     * 
     * @see DataProcessDocument.Fields#numOutputDatasets
     */
    public boolean hasNumOutputDatasets() {
        return contains(FIELD_NumOutputDatasets);
    }

    /**
     * Remover for numOutputDatasets
     * 
     * @see DataProcessDocument.Fields#numOutputDatasets
     */
    public void removeNumOutputDatasets() {
        remove(FIELD_NumOutputDatasets);
    }

    /**
     * Getter for numOutputDatasets
     * 
     * @see DataProcessDocument.Fields#numOutputDatasets
     */
    public Long getNumOutputDatasets(GetMode mode) {
        return obtainDirect(FIELD_NumOutputDatasets, Long.class, mode);
    }

    /**
     * Getter for numOutputDatasets
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessDocument.Fields#numOutputDatasets
     */
    @Nullable
    public Long getNumOutputDatasets() {
        return obtainDirect(FIELD_NumOutputDatasets, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for numOutputDatasets
     * 
     * @see DataProcessDocument.Fields#numOutputDatasets
     */
    public DataProcessDocument setNumOutputDatasets(Long value, SetMode mode) {
        putDirect(FIELD_NumOutputDatasets, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for numOutputDatasets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessDocument.Fields#numOutputDatasets
     */
    public DataProcessDocument setNumOutputDatasets(
        @Nonnull
        Long value) {
        putDirect(FIELD_NumOutputDatasets, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for numOutputDatasets
     * 
     * @see DataProcessDocument.Fields#numOutputDatasets
     */
    public DataProcessDocument setNumOutputDatasets(long value) {
        putDirect(FIELD_NumOutputDatasets, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for inputs
     * 
     * @see DataProcessDocument.Fields#inputs
     */
    public boolean hasInputs() {
        return contains(FIELD_Inputs);
    }

    /**
     * Remover for inputs
     * 
     * @see DataProcessDocument.Fields#inputs
     */
    public void removeInputs() {
        remove(FIELD_Inputs);
    }

    /**
     * Getter for inputs
     * 
     * @see DataProcessDocument.Fields#inputs
     */
    public DatasetUrnArray getInputs(GetMode mode) {
        return obtainWrapped(FIELD_Inputs, DatasetUrnArray.class, mode);
    }

    /**
     * Getter for inputs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessDocument.Fields#inputs
     */
    @Nullable
    public DatasetUrnArray getInputs() {
        return obtainWrapped(FIELD_Inputs, DatasetUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for inputs
     * 
     * @see DataProcessDocument.Fields#inputs
     */
    public DataProcessDocument setInputs(DatasetUrnArray value, SetMode mode) {
        putWrapped(FIELD_Inputs, DatasetUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for inputs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessDocument.Fields#inputs
     */
    public DataProcessDocument setInputs(
        @Nonnull
        DatasetUrnArray value) {
        putWrapped(FIELD_Inputs, DatasetUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for outputs
     * 
     * @see DataProcessDocument.Fields#outputs
     */
    public boolean hasOutputs() {
        return contains(FIELD_Outputs);
    }

    /**
     * Remover for outputs
     * 
     * @see DataProcessDocument.Fields#outputs
     */
    public void removeOutputs() {
        remove(FIELD_Outputs);
    }

    /**
     * Getter for outputs
     * 
     * @see DataProcessDocument.Fields#outputs
     */
    public DatasetUrnArray getOutputs(GetMode mode) {
        return obtainWrapped(FIELD_Outputs, DatasetUrnArray.class, mode);
    }

    /**
     * Getter for outputs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataProcessDocument.Fields#outputs
     */
    @Nullable
    public DatasetUrnArray getOutputs() {
        return obtainWrapped(FIELD_Outputs, DatasetUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for outputs
     * 
     * @see DataProcessDocument.Fields#outputs
     */
    public DataProcessDocument setOutputs(DatasetUrnArray value, SetMode mode) {
        putWrapped(FIELD_Outputs, DatasetUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for outputs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessDocument.Fields#outputs
     */
    public DataProcessDocument setOutputs(
        @Nonnull
        DatasetUrnArray value) {
        putWrapped(FIELD_Outputs, DatasetUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataProcessDocument clone()
        throws CloneNotSupportedException
    {
        return ((DataProcessDocument) super.clone());
    }

    @Override
    public DataProcessDocument copy()
        throws CloneNotSupportedException
    {
        return ((DataProcessDocument) super.copy());
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
         * Urn for the data process
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Process native name e.g. a ETL script name
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Orchestrator name for this process, such as Azure Data Factory
         * 
         */
        public PathSpec orchestrator() {
            return new PathSpec(getPathComponents(), "orchestrator");
        }

        /**
         * Fabric type where data process belongs to or where it was generated
         * 
         */
        public PathSpec origin() {
            return new PathSpec(getPathComponents(), "origin");
        }

        /**
         * LDAP usernames of corp users who are the owners of this process
         * 
         */
        public PathSpec owners() {
            return new PathSpec(getPathComponents(), "owners");
        }

        /**
         * LDAP usernames of corp users who are the owners of this process
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
         * Flag to indicate if the process has non empty corp users as owners or not.
         * 
         */
        public PathSpec hasOwners() {
            return new PathSpec(getPathComponents(), "hasOwners");
        }

        /**
         * Lineage information represented by the number of immediate input datasets of this process.
         * 
         */
        public PathSpec numInputDatasets() {
            return new PathSpec(getPathComponents(), "numInputDatasets");
        }

        /**
         * Lineage information represented by the number of immediate output datasets of this process.
         * 
         */
        public PathSpec numOutputDatasets() {
            return new PathSpec(getPathComponents(), "numOutputDatasets");
        }

        /**
         * List of inputs for this process
         * 
         */
        public PathSpec inputs() {
            return new PathSpec(getPathComponents(), "inputs");
        }

        /**
         * List of inputs for this process
         * 
         */
        public PathSpec inputs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "inputs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of outputs for this process
         * 
         */
        public PathSpec outputs() {
            return new PathSpec(getPathComponents(), "outputs");
        }

        /**
         * List of outputs for this process
         * 
         */
        public PathSpec outputs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "outputs");
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
