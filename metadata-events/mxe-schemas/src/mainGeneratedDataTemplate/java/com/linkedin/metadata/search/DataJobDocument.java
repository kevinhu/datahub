
package com.linkedin.metadata.search;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.DatasetUrnArray;
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
 * Data model for DataJob entity search
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/DataJobDocument.pdl.")
public class DataJobDocument
    extends RecordTemplate
{

    private final static DataJobDocument.Fields _fields = new DataJobDocument.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**Data model for DataJob entity search*/record DataJobDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{urn:{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataJob\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataJob\",\"doc\":\"Standardized data processing job identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"flow\",\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"name\":\"jobID\",\"doc\":\"Unique identifier of the data job\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":594}typeref DataJobUrn=string}/**Optional description of the job*/description:optional string/**Optional name of the job*/name:optional string/**Name of the associated data flow*/dataFlow:optional string/**Id of the job*/jobId:optional string/**LDAP usernames of corp users who are the owners of this job*/owners:optional array[string]/**Flag to indicate if the job has non empty corp users as owners or not.*/hasOwners:optional boolean/**Lineage information represented by the number of immediate input datasets of this job.*/numInputDatasets:optional long/**Lineage information represented by the number of immediate output datasets of this job.*/numOutputDatasets:optional long/**List of inputs for this job*/inputs:optional array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]/**List of outputs for this job*/outputs:optional array[com.linkedin.common.DatasetUrn]/**Workflow orchestrator ex: Azkaban, Airflow*/orchestrator:optional string/**List of tags for this dataset*/tags:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_BrowsePaths = SCHEMA.getField("browsePaths");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_DataFlow = SCHEMA.getField("dataFlow");
    private final static RecordDataSchema.Field FIELD_JobId = SCHEMA.getField("jobId");
    private final static RecordDataSchema.Field FIELD_Owners = SCHEMA.getField("owners");
    private final static RecordDataSchema.Field FIELD_HasOwners = SCHEMA.getField("hasOwners");
    private final static RecordDataSchema.Field FIELD_NumInputDatasets = SCHEMA.getField("numInputDatasets");
    private final static RecordDataSchema.Field FIELD_NumOutputDatasets = SCHEMA.getField("numOutputDatasets");
    private final static RecordDataSchema.Field FIELD_Inputs = SCHEMA.getField("inputs");
    private final static RecordDataSchema.Field FIELD_Outputs = SCHEMA.getField("outputs");
    private final static RecordDataSchema.Field FIELD_Orchestrator = SCHEMA.getField("orchestrator");
    private final static RecordDataSchema.Field FIELD_Tags = SCHEMA.getField("tags");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataJobUrn.class);
    }

    public DataJobDocument() {
        super(new DataMap(), SCHEMA, 7);
    }

    public DataJobDocument(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataJobDocument.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see DataJobDocument.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see DataJobDocument.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see DataJobDocument.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see DataJobDocument.Fields#removed
     */
    public DataJobDocument setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#removed
     */
    public DataJobDocument setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see DataJobDocument.Fields#removed
     */
    public DataJobDocument setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for browsePaths
     * 
     * @see DataJobDocument.Fields#browsePaths
     */
    public boolean hasBrowsePaths() {
        return contains(FIELD_BrowsePaths);
    }

    /**
     * Remover for browsePaths
     * 
     * @see DataJobDocument.Fields#browsePaths
     */
    public void removeBrowsePaths() {
        remove(FIELD_BrowsePaths);
    }

    /**
     * Getter for browsePaths
     * 
     * @see DataJobDocument.Fields#browsePaths
     */
    public StringArray getBrowsePaths(GetMode mode) {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, mode);
    }

    /**
     * Getter for browsePaths
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#browsePaths
     */
    @Nullable
    public StringArray getBrowsePaths() {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for browsePaths
     * 
     * @see DataJobDocument.Fields#browsePaths
     */
    public DataJobDocument setBrowsePaths(StringArray value, SetMode mode) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for browsePaths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#browsePaths
     */
    public DataJobDocument setBrowsePaths(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see DataJobDocument.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DataJobDocument.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DataJobDocument.Fields#urn
     */
    public com.linkedin.common.urn.DataJobUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataJobUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataJobDocument.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DataJobUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataJobUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DataJobDocument.Fields#urn
     */
    public DataJobDocument setUrn(com.linkedin.common.urn.DataJobUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataJobUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#urn
     */
    public DataJobDocument setUrn(
        @Nonnull
        com.linkedin.common.urn.DataJobUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataJobUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DataJobDocument.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see DataJobDocument.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see DataJobDocument.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see DataJobDocument.Fields#description
     */
    public DataJobDocument setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#description
     */
    public DataJobDocument setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see DataJobDocument.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see DataJobDocument.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see DataJobDocument.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#name
     */
    @Nullable
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see DataJobDocument.Fields#name
     */
    public DataJobDocument setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#name
     */
    public DataJobDocument setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for dataFlow
     * 
     * @see DataJobDocument.Fields#dataFlow
     */
    public boolean hasDataFlow() {
        return contains(FIELD_DataFlow);
    }

    /**
     * Remover for dataFlow
     * 
     * @see DataJobDocument.Fields#dataFlow
     */
    public void removeDataFlow() {
        remove(FIELD_DataFlow);
    }

    /**
     * Getter for dataFlow
     * 
     * @see DataJobDocument.Fields#dataFlow
     */
    public String getDataFlow(GetMode mode) {
        return obtainDirect(FIELD_DataFlow, String.class, mode);
    }

    /**
     * Getter for dataFlow
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#dataFlow
     */
    @Nullable
    public String getDataFlow() {
        return obtainDirect(FIELD_DataFlow, String.class, GetMode.STRICT);
    }

    /**
     * Setter for dataFlow
     * 
     * @see DataJobDocument.Fields#dataFlow
     */
    public DataJobDocument setDataFlow(String value, SetMode mode) {
        putDirect(FIELD_DataFlow, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dataFlow
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#dataFlow
     */
    public DataJobDocument setDataFlow(
        @Nonnull
        String value) {
        putDirect(FIELD_DataFlow, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for jobId
     * 
     * @see DataJobDocument.Fields#jobId
     */
    public boolean hasJobId() {
        return contains(FIELD_JobId);
    }

    /**
     * Remover for jobId
     * 
     * @see DataJobDocument.Fields#jobId
     */
    public void removeJobId() {
        remove(FIELD_JobId);
    }

    /**
     * Getter for jobId
     * 
     * @see DataJobDocument.Fields#jobId
     */
    public String getJobId(GetMode mode) {
        return obtainDirect(FIELD_JobId, String.class, mode);
    }

    /**
     * Getter for jobId
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#jobId
     */
    @Nullable
    public String getJobId() {
        return obtainDirect(FIELD_JobId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for jobId
     * 
     * @see DataJobDocument.Fields#jobId
     */
    public DataJobDocument setJobId(String value, SetMode mode) {
        putDirect(FIELD_JobId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for jobId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#jobId
     */
    public DataJobDocument setJobId(
        @Nonnull
        String value) {
        putDirect(FIELD_JobId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for owners
     * 
     * @see DataJobDocument.Fields#owners
     */
    public boolean hasOwners() {
        return contains(FIELD_Owners);
    }

    /**
     * Remover for owners
     * 
     * @see DataJobDocument.Fields#owners
     */
    public void removeOwners() {
        remove(FIELD_Owners);
    }

    /**
     * Getter for owners
     * 
     * @see DataJobDocument.Fields#owners
     */
    public StringArray getOwners(GetMode mode) {
        return obtainWrapped(FIELD_Owners, StringArray.class, mode);
    }

    /**
     * Getter for owners
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#owners
     */
    @Nullable
    public StringArray getOwners() {
        return obtainWrapped(FIELD_Owners, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for owners
     * 
     * @see DataJobDocument.Fields#owners
     */
    public DataJobDocument setOwners(StringArray value, SetMode mode) {
        putWrapped(FIELD_Owners, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for owners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#owners
     */
    public DataJobDocument setOwners(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Owners, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for hasOwners
     * 
     * @see DataJobDocument.Fields#hasOwners
     */
    public boolean hasHasOwners() {
        return contains(FIELD_HasOwners);
    }

    /**
     * Remover for hasOwners
     * 
     * @see DataJobDocument.Fields#hasOwners
     */
    public void removeHasOwners() {
        remove(FIELD_HasOwners);
    }

    /**
     * Getter for hasOwners
     * 
     * @see DataJobDocument.Fields#hasOwners
     */
    public Boolean isHasOwners(GetMode mode) {
        return obtainDirect(FIELD_HasOwners, Boolean.class, mode);
    }

    /**
     * Getter for hasOwners
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#hasOwners
     */
    @Nullable
    public Boolean isHasOwners() {
        return obtainDirect(FIELD_HasOwners, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for hasOwners
     * 
     * @see DataJobDocument.Fields#hasOwners
     */
    public DataJobDocument setHasOwners(Boolean value, SetMode mode) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for hasOwners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#hasOwners
     */
    public DataJobDocument setHasOwners(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for hasOwners
     * 
     * @see DataJobDocument.Fields#hasOwners
     */
    public DataJobDocument setHasOwners(boolean value) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for numInputDatasets
     * 
     * @see DataJobDocument.Fields#numInputDatasets
     */
    public boolean hasNumInputDatasets() {
        return contains(FIELD_NumInputDatasets);
    }

    /**
     * Remover for numInputDatasets
     * 
     * @see DataJobDocument.Fields#numInputDatasets
     */
    public void removeNumInputDatasets() {
        remove(FIELD_NumInputDatasets);
    }

    /**
     * Getter for numInputDatasets
     * 
     * @see DataJobDocument.Fields#numInputDatasets
     */
    public Long getNumInputDatasets(GetMode mode) {
        return obtainDirect(FIELD_NumInputDatasets, Long.class, mode);
    }

    /**
     * Getter for numInputDatasets
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#numInputDatasets
     */
    @Nullable
    public Long getNumInputDatasets() {
        return obtainDirect(FIELD_NumInputDatasets, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for numInputDatasets
     * 
     * @see DataJobDocument.Fields#numInputDatasets
     */
    public DataJobDocument setNumInputDatasets(Long value, SetMode mode) {
        putDirect(FIELD_NumInputDatasets, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for numInputDatasets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#numInputDatasets
     */
    public DataJobDocument setNumInputDatasets(
        @Nonnull
        Long value) {
        putDirect(FIELD_NumInputDatasets, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for numInputDatasets
     * 
     * @see DataJobDocument.Fields#numInputDatasets
     */
    public DataJobDocument setNumInputDatasets(long value) {
        putDirect(FIELD_NumInputDatasets, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for numOutputDatasets
     * 
     * @see DataJobDocument.Fields#numOutputDatasets
     */
    public boolean hasNumOutputDatasets() {
        return contains(FIELD_NumOutputDatasets);
    }

    /**
     * Remover for numOutputDatasets
     * 
     * @see DataJobDocument.Fields#numOutputDatasets
     */
    public void removeNumOutputDatasets() {
        remove(FIELD_NumOutputDatasets);
    }

    /**
     * Getter for numOutputDatasets
     * 
     * @see DataJobDocument.Fields#numOutputDatasets
     */
    public Long getNumOutputDatasets(GetMode mode) {
        return obtainDirect(FIELD_NumOutputDatasets, Long.class, mode);
    }

    /**
     * Getter for numOutputDatasets
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#numOutputDatasets
     */
    @Nullable
    public Long getNumOutputDatasets() {
        return obtainDirect(FIELD_NumOutputDatasets, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for numOutputDatasets
     * 
     * @see DataJobDocument.Fields#numOutputDatasets
     */
    public DataJobDocument setNumOutputDatasets(Long value, SetMode mode) {
        putDirect(FIELD_NumOutputDatasets, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for numOutputDatasets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#numOutputDatasets
     */
    public DataJobDocument setNumOutputDatasets(
        @Nonnull
        Long value) {
        putDirect(FIELD_NumOutputDatasets, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for numOutputDatasets
     * 
     * @see DataJobDocument.Fields#numOutputDatasets
     */
    public DataJobDocument setNumOutputDatasets(long value) {
        putDirect(FIELD_NumOutputDatasets, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for inputs
     * 
     * @see DataJobDocument.Fields#inputs
     */
    public boolean hasInputs() {
        return contains(FIELD_Inputs);
    }

    /**
     * Remover for inputs
     * 
     * @see DataJobDocument.Fields#inputs
     */
    public void removeInputs() {
        remove(FIELD_Inputs);
    }

    /**
     * Getter for inputs
     * 
     * @see DataJobDocument.Fields#inputs
     */
    public DatasetUrnArray getInputs(GetMode mode) {
        return obtainWrapped(FIELD_Inputs, DatasetUrnArray.class, mode);
    }

    /**
     * Getter for inputs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#inputs
     */
    @Nullable
    public DatasetUrnArray getInputs() {
        return obtainWrapped(FIELD_Inputs, DatasetUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for inputs
     * 
     * @see DataJobDocument.Fields#inputs
     */
    public DataJobDocument setInputs(DatasetUrnArray value, SetMode mode) {
        putWrapped(FIELD_Inputs, DatasetUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for inputs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#inputs
     */
    public DataJobDocument setInputs(
        @Nonnull
        DatasetUrnArray value) {
        putWrapped(FIELD_Inputs, DatasetUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for outputs
     * 
     * @see DataJobDocument.Fields#outputs
     */
    public boolean hasOutputs() {
        return contains(FIELD_Outputs);
    }

    /**
     * Remover for outputs
     * 
     * @see DataJobDocument.Fields#outputs
     */
    public void removeOutputs() {
        remove(FIELD_Outputs);
    }

    /**
     * Getter for outputs
     * 
     * @see DataJobDocument.Fields#outputs
     */
    public DatasetUrnArray getOutputs(GetMode mode) {
        return obtainWrapped(FIELD_Outputs, DatasetUrnArray.class, mode);
    }

    /**
     * Getter for outputs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#outputs
     */
    @Nullable
    public DatasetUrnArray getOutputs() {
        return obtainWrapped(FIELD_Outputs, DatasetUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for outputs
     * 
     * @see DataJobDocument.Fields#outputs
     */
    public DataJobDocument setOutputs(DatasetUrnArray value, SetMode mode) {
        putWrapped(FIELD_Outputs, DatasetUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for outputs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#outputs
     */
    public DataJobDocument setOutputs(
        @Nonnull
        DatasetUrnArray value) {
        putWrapped(FIELD_Outputs, DatasetUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for orchestrator
     * 
     * @see DataJobDocument.Fields#orchestrator
     */
    public boolean hasOrchestrator() {
        return contains(FIELD_Orchestrator);
    }

    /**
     * Remover for orchestrator
     * 
     * @see DataJobDocument.Fields#orchestrator
     */
    public void removeOrchestrator() {
        remove(FIELD_Orchestrator);
    }

    /**
     * Getter for orchestrator
     * 
     * @see DataJobDocument.Fields#orchestrator
     */
    public String getOrchestrator(GetMode mode) {
        return obtainDirect(FIELD_Orchestrator, String.class, mode);
    }

    /**
     * Getter for orchestrator
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#orchestrator
     */
    @Nullable
    public String getOrchestrator() {
        return obtainDirect(FIELD_Orchestrator, String.class, GetMode.STRICT);
    }

    /**
     * Setter for orchestrator
     * 
     * @see DataJobDocument.Fields#orchestrator
     */
    public DataJobDocument setOrchestrator(String value, SetMode mode) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for orchestrator
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#orchestrator
     */
    public DataJobDocument setOrchestrator(
        @Nonnull
        String value) {
        putDirect(FIELD_Orchestrator, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for tags
     * 
     * @see DataJobDocument.Fields#tags
     */
    public boolean hasTags() {
        return contains(FIELD_Tags);
    }

    /**
     * Remover for tags
     * 
     * @see DataJobDocument.Fields#tags
     */
    public void removeTags() {
        remove(FIELD_Tags);
    }

    /**
     * Getter for tags
     * 
     * @see DataJobDocument.Fields#tags
     */
    public StringArray getTags(GetMode mode) {
        return obtainWrapped(FIELD_Tags, StringArray.class, mode);
    }

    /**
     * Getter for tags
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataJobDocument.Fields#tags
     */
    @Nullable
    public StringArray getTags() {
        return obtainWrapped(FIELD_Tags, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for tags
     * 
     * @see DataJobDocument.Fields#tags
     */
    public DataJobDocument setTags(StringArray value, SetMode mode) {
        putWrapped(FIELD_Tags, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for tags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataJobDocument.Fields#tags
     */
    public DataJobDocument setTags(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Tags, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataJobDocument clone()
        throws CloneNotSupportedException
    {
        return ((DataJobDocument) super.clone());
    }

    @Override
    public DataJobDocument copy()
        throws CloneNotSupportedException
    {
        return ((DataJobDocument) super.copy());
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

        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Optional description of the job
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Optional name of the job
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Name of the associated data flow
         * 
         */
        public PathSpec dataFlow() {
            return new PathSpec(getPathComponents(), "dataFlow");
        }

        /**
         * Id of the job
         * 
         */
        public PathSpec jobId() {
            return new PathSpec(getPathComponents(), "jobId");
        }

        /**
         * LDAP usernames of corp users who are the owners of this job
         * 
         */
        public PathSpec owners() {
            return new PathSpec(getPathComponents(), "owners");
        }

        /**
         * LDAP usernames of corp users who are the owners of this job
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
         * Flag to indicate if the job has non empty corp users as owners or not.
         * 
         */
        public PathSpec hasOwners() {
            return new PathSpec(getPathComponents(), "hasOwners");
        }

        /**
         * Lineage information represented by the number of immediate input datasets of this job.
         * 
         */
        public PathSpec numInputDatasets() {
            return new PathSpec(getPathComponents(), "numInputDatasets");
        }

        /**
         * Lineage information represented by the number of immediate output datasets of this job.
         * 
         */
        public PathSpec numOutputDatasets() {
            return new PathSpec(getPathComponents(), "numOutputDatasets");
        }

        /**
         * List of inputs for this job
         * 
         */
        public PathSpec inputs() {
            return new PathSpec(getPathComponents(), "inputs");
        }

        /**
         * List of inputs for this job
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
         * List of outputs for this job
         * 
         */
        public PathSpec outputs() {
            return new PathSpec(getPathComponents(), "outputs");
        }

        /**
         * List of outputs for this job
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

        /**
         * Workflow orchestrator ex: Azkaban, Airflow
         * 
         */
        public PathSpec orchestrator() {
            return new PathSpec(getPathComponents(), "orchestrator");
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
