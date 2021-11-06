
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
 * Data model for ML Model entity search
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/MLModelDocument.pdl.")
public class MLModelDocument
    extends RecordTemplate
{

    private final static MLModelDocument.Fields _fields = new MLModelDocument.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**Data model for ML Model entity search*/record MLModelDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{/**Urn for the model*/urn:{namespace com.linkedin.common/**Standardized MLModel identifier.*/@java.class=\"com.linkedin.common.urn.MLModelUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"mlModel\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"MlModel\",\"doc\":\"Standardized model identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn for the MLModel.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"mlModelName\",\"doc\":\"Name of the MLModel\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where model belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref MLModelUrn=string}/**Name of model*/name:optional string/**Platform name for the model*/platform:optional string/**Fabric type where model belongs to or where it was generated*/origin:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}/**Description of the model*/description:optional string/**Timestamp model was created*/createdTimestamp:optional long/**Whether or not the Model has owners*/hasOwners:optional boolean/**LDAP usernames of corp users who are the owners of this model*/owners:optional array[string]/**Type of Algorithm or Model such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc*/type:optional string/**What datasets were used to train the model?*/trainingDatasets:optional array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]/**What datasets were used to evaluate the model?*/evaluationDatasets:optional array[com.linkedin.common.DatasetUrn]/**Whether or not the model is currently active*/active:optional boolean}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_BrowsePaths = SCHEMA.getField("browsePaths");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Origin = SCHEMA.getField("origin");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_CreatedTimestamp = SCHEMA.getField("createdTimestamp");
    private final static RecordDataSchema.Field FIELD_HasOwners = SCHEMA.getField("hasOwners");
    private final static RecordDataSchema.Field FIELD_Owners = SCHEMA.getField("owners");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_TrainingDatasets = SCHEMA.getField("trainingDatasets");
    private final static RecordDataSchema.Field FIELD_EvaluationDatasets = SCHEMA.getField("evaluationDatasets");
    private final static RecordDataSchema.Field FIELD_Active = SCHEMA.getField("active");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.MLModelUrn.class);
    }

    public MLModelDocument() {
        super(new DataMap(), SCHEMA, 6);
    }

    public MLModelDocument(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLModelDocument.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see MLModelDocument.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see MLModelDocument.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see MLModelDocument.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see MLModelDocument.Fields#removed
     */
    public MLModelDocument setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#removed
     */
    public MLModelDocument setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see MLModelDocument.Fields#removed
     */
    public MLModelDocument setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for browsePaths
     * 
     * @see MLModelDocument.Fields#browsePaths
     */
    public boolean hasBrowsePaths() {
        return contains(FIELD_BrowsePaths);
    }

    /**
     * Remover for browsePaths
     * 
     * @see MLModelDocument.Fields#browsePaths
     */
    public void removeBrowsePaths() {
        remove(FIELD_BrowsePaths);
    }

    /**
     * Getter for browsePaths
     * 
     * @see MLModelDocument.Fields#browsePaths
     */
    public StringArray getBrowsePaths(GetMode mode) {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, mode);
    }

    /**
     * Getter for browsePaths
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#browsePaths
     */
    @Nullable
    public StringArray getBrowsePaths() {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for browsePaths
     * 
     * @see MLModelDocument.Fields#browsePaths
     */
    public MLModelDocument setBrowsePaths(StringArray value, SetMode mode) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for browsePaths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#browsePaths
     */
    public MLModelDocument setBrowsePaths(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see MLModelDocument.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see MLModelDocument.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see MLModelDocument.Fields#urn
     */
    public com.linkedin.common.urn.MLModelUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.MLModelUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLModelDocument.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.MLModelUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.MLModelUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see MLModelDocument.Fields#urn
     */
    public MLModelDocument setUrn(com.linkedin.common.urn.MLModelUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.MLModelUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#urn
     */
    public MLModelDocument setUrn(
        @Nonnull
        com.linkedin.common.urn.MLModelUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.MLModelUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see MLModelDocument.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see MLModelDocument.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see MLModelDocument.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#name
     */
    @Nullable
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see MLModelDocument.Fields#name
     */
    public MLModelDocument setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#name
     */
    public MLModelDocument setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for platform
     * 
     * @see MLModelDocument.Fields#platform
     */
    public boolean hasPlatform() {
        return contains(FIELD_Platform);
    }

    /**
     * Remover for platform
     * 
     * @see MLModelDocument.Fields#platform
     */
    public void removePlatform() {
        remove(FIELD_Platform);
    }

    /**
     * Getter for platform
     * 
     * @see MLModelDocument.Fields#platform
     */
    public String getPlatform(GetMode mode) {
        return obtainDirect(FIELD_Platform, String.class, mode);
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#platform
     */
    @Nullable
    public String getPlatform() {
        return obtainDirect(FIELD_Platform, String.class, GetMode.STRICT);
    }

    /**
     * Setter for platform
     * 
     * @see MLModelDocument.Fields#platform
     */
    public MLModelDocument setPlatform(String value, SetMode mode) {
        putDirect(FIELD_Platform, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#platform
     */
    public MLModelDocument setPlatform(
        @Nonnull
        String value) {
        putDirect(FIELD_Platform, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for origin
     * 
     * @see MLModelDocument.Fields#origin
     */
    public boolean hasOrigin() {
        return contains(FIELD_Origin);
    }

    /**
     * Remover for origin
     * 
     * @see MLModelDocument.Fields#origin
     */
    public void removeOrigin() {
        remove(FIELD_Origin);
    }

    /**
     * Getter for origin
     * 
     * @see MLModelDocument.Fields#origin
     */
    public FabricType getOrigin(GetMode mode) {
        return obtainDirect(FIELD_Origin, FabricType.class, mode);
    }

    /**
     * Getter for origin
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#origin
     */
    @Nullable
    public FabricType getOrigin() {
        return obtainDirect(FIELD_Origin, FabricType.class, GetMode.STRICT);
    }

    /**
     * Setter for origin
     * 
     * @see MLModelDocument.Fields#origin
     */
    public MLModelDocument setOrigin(FabricType value, SetMode mode) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for origin
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#origin
     */
    public MLModelDocument setOrigin(
        @Nonnull
        FabricType value) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see MLModelDocument.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see MLModelDocument.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see MLModelDocument.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see MLModelDocument.Fields#description
     */
    public MLModelDocument setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#description
     */
    public MLModelDocument setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for createdTimestamp
     * 
     * @see MLModelDocument.Fields#createdTimestamp
     */
    public boolean hasCreatedTimestamp() {
        return contains(FIELD_CreatedTimestamp);
    }

    /**
     * Remover for createdTimestamp
     * 
     * @see MLModelDocument.Fields#createdTimestamp
     */
    public void removeCreatedTimestamp() {
        remove(FIELD_CreatedTimestamp);
    }

    /**
     * Getter for createdTimestamp
     * 
     * @see MLModelDocument.Fields#createdTimestamp
     */
    public Long getCreatedTimestamp(GetMode mode) {
        return obtainDirect(FIELD_CreatedTimestamp, Long.class, mode);
    }

    /**
     * Getter for createdTimestamp
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#createdTimestamp
     */
    @Nullable
    public Long getCreatedTimestamp() {
        return obtainDirect(FIELD_CreatedTimestamp, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for createdTimestamp
     * 
     * @see MLModelDocument.Fields#createdTimestamp
     */
    public MLModelDocument setCreatedTimestamp(Long value, SetMode mode) {
        putDirect(FIELD_CreatedTimestamp, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for createdTimestamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#createdTimestamp
     */
    public MLModelDocument setCreatedTimestamp(
        @Nonnull
        Long value) {
        putDirect(FIELD_CreatedTimestamp, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for createdTimestamp
     * 
     * @see MLModelDocument.Fields#createdTimestamp
     */
    public MLModelDocument setCreatedTimestamp(long value) {
        putDirect(FIELD_CreatedTimestamp, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for hasOwners
     * 
     * @see MLModelDocument.Fields#hasOwners
     */
    public boolean hasHasOwners() {
        return contains(FIELD_HasOwners);
    }

    /**
     * Remover for hasOwners
     * 
     * @see MLModelDocument.Fields#hasOwners
     */
    public void removeHasOwners() {
        remove(FIELD_HasOwners);
    }

    /**
     * Getter for hasOwners
     * 
     * @see MLModelDocument.Fields#hasOwners
     */
    public Boolean isHasOwners(GetMode mode) {
        return obtainDirect(FIELD_HasOwners, Boolean.class, mode);
    }

    /**
     * Getter for hasOwners
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#hasOwners
     */
    @Nullable
    public Boolean isHasOwners() {
        return obtainDirect(FIELD_HasOwners, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for hasOwners
     * 
     * @see MLModelDocument.Fields#hasOwners
     */
    public MLModelDocument setHasOwners(Boolean value, SetMode mode) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for hasOwners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#hasOwners
     */
    public MLModelDocument setHasOwners(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for hasOwners
     * 
     * @see MLModelDocument.Fields#hasOwners
     */
    public MLModelDocument setHasOwners(boolean value) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for owners
     * 
     * @see MLModelDocument.Fields#owners
     */
    public boolean hasOwners() {
        return contains(FIELD_Owners);
    }

    /**
     * Remover for owners
     * 
     * @see MLModelDocument.Fields#owners
     */
    public void removeOwners() {
        remove(FIELD_Owners);
    }

    /**
     * Getter for owners
     * 
     * @see MLModelDocument.Fields#owners
     */
    public StringArray getOwners(GetMode mode) {
        return obtainWrapped(FIELD_Owners, StringArray.class, mode);
    }

    /**
     * Getter for owners
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#owners
     */
    @Nullable
    public StringArray getOwners() {
        return obtainWrapped(FIELD_Owners, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for owners
     * 
     * @see MLModelDocument.Fields#owners
     */
    public MLModelDocument setOwners(StringArray value, SetMode mode) {
        putWrapped(FIELD_Owners, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for owners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#owners
     */
    public MLModelDocument setOwners(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Owners, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see MLModelDocument.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see MLModelDocument.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see MLModelDocument.Fields#type
     */
    public String getType(GetMode mode) {
        return obtainDirect(FIELD_Type, String.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#type
     */
    @Nullable
    public String getType() {
        return obtainDirect(FIELD_Type, String.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see MLModelDocument.Fields#type
     */
    public MLModelDocument setType(String value, SetMode mode) {
        putDirect(FIELD_Type, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#type
     */
    public MLModelDocument setType(
        @Nonnull
        String value) {
        putDirect(FIELD_Type, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for trainingDatasets
     * 
     * @see MLModelDocument.Fields#trainingDatasets
     */
    public boolean hasTrainingDatasets() {
        return contains(FIELD_TrainingDatasets);
    }

    /**
     * Remover for trainingDatasets
     * 
     * @see MLModelDocument.Fields#trainingDatasets
     */
    public void removeTrainingDatasets() {
        remove(FIELD_TrainingDatasets);
    }

    /**
     * Getter for trainingDatasets
     * 
     * @see MLModelDocument.Fields#trainingDatasets
     */
    public DatasetUrnArray getTrainingDatasets(GetMode mode) {
        return obtainWrapped(FIELD_TrainingDatasets, DatasetUrnArray.class, mode);
    }

    /**
     * Getter for trainingDatasets
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#trainingDatasets
     */
    @Nullable
    public DatasetUrnArray getTrainingDatasets() {
        return obtainWrapped(FIELD_TrainingDatasets, DatasetUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for trainingDatasets
     * 
     * @see MLModelDocument.Fields#trainingDatasets
     */
    public MLModelDocument setTrainingDatasets(DatasetUrnArray value, SetMode mode) {
        putWrapped(FIELD_TrainingDatasets, DatasetUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for trainingDatasets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#trainingDatasets
     */
    public MLModelDocument setTrainingDatasets(
        @Nonnull
        DatasetUrnArray value) {
        putWrapped(FIELD_TrainingDatasets, DatasetUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for evaluationDatasets
     * 
     * @see MLModelDocument.Fields#evaluationDatasets
     */
    public boolean hasEvaluationDatasets() {
        return contains(FIELD_EvaluationDatasets);
    }

    /**
     * Remover for evaluationDatasets
     * 
     * @see MLModelDocument.Fields#evaluationDatasets
     */
    public void removeEvaluationDatasets() {
        remove(FIELD_EvaluationDatasets);
    }

    /**
     * Getter for evaluationDatasets
     * 
     * @see MLModelDocument.Fields#evaluationDatasets
     */
    public DatasetUrnArray getEvaluationDatasets(GetMode mode) {
        return obtainWrapped(FIELD_EvaluationDatasets, DatasetUrnArray.class, mode);
    }

    /**
     * Getter for evaluationDatasets
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#evaluationDatasets
     */
    @Nullable
    public DatasetUrnArray getEvaluationDatasets() {
        return obtainWrapped(FIELD_EvaluationDatasets, DatasetUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for evaluationDatasets
     * 
     * @see MLModelDocument.Fields#evaluationDatasets
     */
    public MLModelDocument setEvaluationDatasets(DatasetUrnArray value, SetMode mode) {
        putWrapped(FIELD_EvaluationDatasets, DatasetUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for evaluationDatasets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#evaluationDatasets
     */
    public MLModelDocument setEvaluationDatasets(
        @Nonnull
        DatasetUrnArray value) {
        putWrapped(FIELD_EvaluationDatasets, DatasetUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for active
     * 
     * @see MLModelDocument.Fields#active
     */
    public boolean hasActive() {
        return contains(FIELD_Active);
    }

    /**
     * Remover for active
     * 
     * @see MLModelDocument.Fields#active
     */
    public void removeActive() {
        remove(FIELD_Active);
    }

    /**
     * Getter for active
     * 
     * @see MLModelDocument.Fields#active
     */
    public Boolean isActive(GetMode mode) {
        return obtainDirect(FIELD_Active, Boolean.class, mode);
    }

    /**
     * Getter for active
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDocument.Fields#active
     */
    @Nullable
    public Boolean isActive() {
        return obtainDirect(FIELD_Active, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for active
     * 
     * @see MLModelDocument.Fields#active
     */
    public MLModelDocument setActive(Boolean value, SetMode mode) {
        putDirect(FIELD_Active, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for active
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDocument.Fields#active
     */
    public MLModelDocument setActive(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Active, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for active
     * 
     * @see MLModelDocument.Fields#active
     */
    public MLModelDocument setActive(boolean value) {
        putDirect(FIELD_Active, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLModelDocument clone()
        throws CloneNotSupportedException
    {
        return ((MLModelDocument) super.clone());
    }

    @Override
    public MLModelDocument copy()
        throws CloneNotSupportedException
    {
        return ((MLModelDocument) super.copy());
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
         * Urn for the model
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Name of model
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Platform name for the model
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Fabric type where model belongs to or where it was generated
         * 
         */
        public PathSpec origin() {
            return new PathSpec(getPathComponents(), "origin");
        }

        /**
         * Description of the model
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Timestamp model was created
         * 
         */
        public PathSpec createdTimestamp() {
            return new PathSpec(getPathComponents(), "createdTimestamp");
        }

        /**
         * Whether or not the Model has owners
         * 
         */
        public PathSpec hasOwners() {
            return new PathSpec(getPathComponents(), "hasOwners");
        }

        /**
         * LDAP usernames of corp users who are the owners of this model
         * 
         */
        public PathSpec owners() {
            return new PathSpec(getPathComponents(), "owners");
        }

        /**
         * LDAP usernames of corp users who are the owners of this model
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
         * Type of Algorithm or Model such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * What datasets were used to train the model?
         * 
         */
        public PathSpec trainingDatasets() {
            return new PathSpec(getPathComponents(), "trainingDatasets");
        }

        /**
         * What datasets were used to train the model?
         * 
         */
        public PathSpec trainingDatasets(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "trainingDatasets");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * What datasets were used to evaluate the model?
         * 
         */
        public PathSpec evaluationDatasets() {
            return new PathSpec(getPathComponents(), "evaluationDatasets");
        }

        /**
         * What datasets were used to evaluate the model?
         * 
         */
        public PathSpec evaluationDatasets(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "evaluationDatasets");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Whether or not the model is currently active
         * 
         */
        public PathSpec active() {
            return new PathSpec(getPathComponents(), "active");
        }

    }

}
