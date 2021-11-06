
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.MLFeatureUrnArray;
import com.linkedin.common.UrnArray;
import com.linkedin.common.VersionTag;
import com.linkedin.common.url.UrlCoercer;
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
import com.linkedin.data.template.StringMap;


/**
 * Properties associated with a ML Model
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelProperties.pdl.")
public class MLModelProperties
    extends RecordTemplate
{

    private final static MLModelProperties.Fields _fields = new MLModelProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Properties associated with a ML Model*/@Aspect.name=\"mlModelProperties\"record MLModelProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Documentation of the MLModel*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Date when the MLModel was developed*/date:optional{namespace com.linkedin.common/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long}/**Version of the MLModel*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}}/**Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc*/@Searchable.fieldType=\"TEXT_PARTIAL\"type:optional string/**Hyper Parameters of the MLModel\n\nNOTE: these are deprecated in favor of hyperParams*/hyperParameters:optional map[string/**A union of all supported metadata aspects for HyperParameter Value*/typeref HyperParameterValueType=union[string,int,float,double,boolean]]/**Hyperparameters of the MLModel*/hyperParams:optional array[/**Properties associated with an ML Hyper Param*/@Aspect.name=\"mlHyperParam\"record MLHyperParam{/**Name of the MLHyperParam*/name:string/**Documentation of the MLHyperParam*/description:optional string/**The value of the MLHyperParam*/value:optional string/**Date when the MLHyperParam was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in training*/trainingMetrics:optional array[/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in production*/onlineMetrics:optional array[MLMetric]/**List of features used for MLModel training*/mlFeatures:optional array[{namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"mlFeature\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"MLFeature\",\"doc\":\"Standardized MLFeature identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"mlFeatureNamespace\",\"doc\":\"Namespace for the MLFeature\",\"type\":\"string\"},{\"name\":\"mlFeatureName\",\"doc\":\"Name of the MLFeature\",\"type\":\"string\",\"maxLength\":210}],\"maxLength\":284}typeref MLFeatureUrn=string}]/**Tags for the MLModel*/tags:array[string]=[]/**Deployments for the MLModel*/@Relationship.`/*`={\"name\":\"DeployedTo\",\"entityTypes\":[\"mlModelDeployment\"]}deployments:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**List of jobs (if any) used to train the model*/@Relationship.`/*`={\"name\":\"TrainedBy\",\"entityTypes\":[\"dataJob\"]}trainingJobs:optional array[com.linkedin.common.Urn]/**List of jobs (if any) that use the model*/@Relationship.`/*`={\"name\":\"UsedBy\",\"entityTypes\":[\"dataJob\"]}downstreamJobs:optional array[com.linkedin.common.Urn]/**Groups the model belongs to*/@Relationship.`/*`={\"name\":\"MemberOf\",\"entityTypes\":[\"mlModelGroup\"]}groups:optional array[com.linkedin.common.Urn]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Date = SCHEMA.getField("date");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_HyperParameters = SCHEMA.getField("hyperParameters");
    private final static RecordDataSchema.Field FIELD_HyperParams = SCHEMA.getField("hyperParams");
    private final static RecordDataSchema.Field FIELD_TrainingMetrics = SCHEMA.getField("trainingMetrics");
    private final static RecordDataSchema.Field FIELD_OnlineMetrics = SCHEMA.getField("onlineMetrics");
    private final static RecordDataSchema.Field FIELD_MlFeatures = SCHEMA.getField("mlFeatures");
    private final static RecordDataSchema.Field FIELD_Tags = SCHEMA.getField("tags");
    private final static RecordDataSchema.Field FIELD_Deployments = SCHEMA.getField("deployments");
    private final static RecordDataSchema.Field FIELD_TrainingJobs = SCHEMA.getField("trainingJobs");
    private final static RecordDataSchema.Field FIELD_DownstreamJobs = SCHEMA.getField("downstreamJobs");
    private final static RecordDataSchema.Field FIELD_Groups = SCHEMA.getField("groups");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public MLModelProperties() {
        super(new DataMap(), SCHEMA);
    }

    public MLModelProperties(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLModelProperties.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see MLModelProperties.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        return contains(FIELD_CustomProperties);
    }

    /**
     * Remover for customProperties
     * 
     * @see MLModelProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        remove(FIELD_CustomProperties);
    }

    /**
     * Getter for customProperties
     * 
     * @see MLModelProperties.Fields#customProperties
     */
    public StringMap getCustomProperties(GetMode mode) {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, mode);
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLModelProperties.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, GetMode.STRICT);
    }

    /**
     * Setter for customProperties
     * 
     * @see MLModelProperties.Fields#customProperties
     */
    public MLModelProperties setCustomProperties(StringMap value, SetMode mode) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, mode);
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#customProperties
     */
    public MLModelProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see MLModelProperties.Fields#externalUrl
     */
    public boolean hasExternalUrl() {
        return contains(FIELD_ExternalUrl);
    }

    /**
     * Remover for externalUrl
     * 
     * @see MLModelProperties.Fields#externalUrl
     */
    public void removeExternalUrl() {
        remove(FIELD_ExternalUrl);
    }

    /**
     * Getter for externalUrl
     * 
     * @see MLModelProperties.Fields#externalUrl
     */
    public com.linkedin.common.url.Url getExternalUrl(GetMode mode) {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl() {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for externalUrl
     * 
     * @see MLModelProperties.Fields#externalUrl
     */
    public MLModelProperties setExternalUrl(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for externalUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#externalUrl
     */
    public MLModelProperties setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see MLModelProperties.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see MLModelProperties.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see MLModelProperties.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see MLModelProperties.Fields#description
     */
    public MLModelProperties setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#description
     */
    public MLModelProperties setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for date
     * 
     * @see MLModelProperties.Fields#date
     */
    public boolean hasDate() {
        return contains(FIELD_Date);
    }

    /**
     * Remover for date
     * 
     * @see MLModelProperties.Fields#date
     */
    public void removeDate() {
        remove(FIELD_Date);
    }

    /**
     * Getter for date
     * 
     * @see MLModelProperties.Fields#date
     */
    public Long getDate(GetMode mode) {
        return obtainDirect(FIELD_Date, Long.class, mode);
    }

    /**
     * Getter for date
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#date
     */
    @Nullable
    public Long getDate() {
        return obtainDirect(FIELD_Date, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for date
     * 
     * @see MLModelProperties.Fields#date
     */
    public MLModelProperties setDate(Long value, SetMode mode) {
        putDirect(FIELD_Date, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for date
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#date
     */
    public MLModelProperties setDate(
        @Nonnull
        Long value) {
        putDirect(FIELD_Date, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for date
     * 
     * @see MLModelProperties.Fields#date
     */
    public MLModelProperties setDate(long value) {
        putDirect(FIELD_Date, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see MLModelProperties.Fields#version
     */
    public boolean hasVersion() {
        return contains(FIELD_Version);
    }

    /**
     * Remover for version
     * 
     * @see MLModelProperties.Fields#version
     */
    public void removeVersion() {
        remove(FIELD_Version);
    }

    /**
     * Getter for version
     * 
     * @see MLModelProperties.Fields#version
     */
    public VersionTag getVersion(GetMode mode) {
        return obtainWrapped(FIELD_Version, VersionTag.class, mode);
    }

    /**
     * Getter for version
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#version
     */
    @Nullable
    public VersionTag getVersion() {
        return obtainWrapped(FIELD_Version, VersionTag.class, GetMode.STRICT);
    }

    /**
     * Setter for version
     * 
     * @see MLModelProperties.Fields#version
     */
    public MLModelProperties setVersion(VersionTag value, SetMode mode) {
        putWrapped(FIELD_Version, VersionTag.class, value, mode);
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#version
     */
    public MLModelProperties setVersion(
        @Nonnull
        VersionTag value) {
        putWrapped(FIELD_Version, VersionTag.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see MLModelProperties.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see MLModelProperties.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see MLModelProperties.Fields#type
     */
    public String getType(GetMode mode) {
        return obtainDirect(FIELD_Type, String.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#type
     */
    @Nullable
    public String getType() {
        return obtainDirect(FIELD_Type, String.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see MLModelProperties.Fields#type
     */
    public MLModelProperties setType(String value, SetMode mode) {
        putDirect(FIELD_Type, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#type
     */
    public MLModelProperties setType(
        @Nonnull
        String value) {
        putDirect(FIELD_Type, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for hyperParameters
     * 
     * @see MLModelProperties.Fields#hyperParameters
     */
    public boolean hasHyperParameters() {
        return contains(FIELD_HyperParameters);
    }

    /**
     * Remover for hyperParameters
     * 
     * @see MLModelProperties.Fields#hyperParameters
     */
    public void removeHyperParameters() {
        remove(FIELD_HyperParameters);
    }

    /**
     * Getter for hyperParameters
     * 
     * @see MLModelProperties.Fields#hyperParameters
     */
    public HyperParameterValueTypeMap getHyperParameters(GetMode mode) {
        return obtainWrapped(FIELD_HyperParameters, HyperParameterValueTypeMap.class, mode);
    }

    /**
     * Getter for hyperParameters
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#hyperParameters
     */
    @Nullable
    public HyperParameterValueTypeMap getHyperParameters() {
        return obtainWrapped(FIELD_HyperParameters, HyperParameterValueTypeMap.class, GetMode.STRICT);
    }

    /**
     * Setter for hyperParameters
     * 
     * @see MLModelProperties.Fields#hyperParameters
     */
    public MLModelProperties setHyperParameters(HyperParameterValueTypeMap value, SetMode mode) {
        putWrapped(FIELD_HyperParameters, HyperParameterValueTypeMap.class, value, mode);
        return this;
    }

    /**
     * Setter for hyperParameters
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#hyperParameters
     */
    public MLModelProperties setHyperParameters(
        @Nonnull
        HyperParameterValueTypeMap value) {
        putWrapped(FIELD_HyperParameters, HyperParameterValueTypeMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for hyperParams
     * 
     * @see MLModelProperties.Fields#hyperParams
     */
    public boolean hasHyperParams() {
        return contains(FIELD_HyperParams);
    }

    /**
     * Remover for hyperParams
     * 
     * @see MLModelProperties.Fields#hyperParams
     */
    public void removeHyperParams() {
        remove(FIELD_HyperParams);
    }

    /**
     * Getter for hyperParams
     * 
     * @see MLModelProperties.Fields#hyperParams
     */
    public MLHyperParamArray getHyperParams(GetMode mode) {
        return obtainWrapped(FIELD_HyperParams, MLHyperParamArray.class, mode);
    }

    /**
     * Getter for hyperParams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#hyperParams
     */
    @Nullable
    public MLHyperParamArray getHyperParams() {
        return obtainWrapped(FIELD_HyperParams, MLHyperParamArray.class, GetMode.STRICT);
    }

    /**
     * Setter for hyperParams
     * 
     * @see MLModelProperties.Fields#hyperParams
     */
    public MLModelProperties setHyperParams(MLHyperParamArray value, SetMode mode) {
        putWrapped(FIELD_HyperParams, MLHyperParamArray.class, value, mode);
        return this;
    }

    /**
     * Setter for hyperParams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#hyperParams
     */
    public MLModelProperties setHyperParams(
        @Nonnull
        MLHyperParamArray value) {
        putWrapped(FIELD_HyperParams, MLHyperParamArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for trainingMetrics
     * 
     * @see MLModelProperties.Fields#trainingMetrics
     */
    public boolean hasTrainingMetrics() {
        return contains(FIELD_TrainingMetrics);
    }

    /**
     * Remover for trainingMetrics
     * 
     * @see MLModelProperties.Fields#trainingMetrics
     */
    public void removeTrainingMetrics() {
        remove(FIELD_TrainingMetrics);
    }

    /**
     * Getter for trainingMetrics
     * 
     * @see MLModelProperties.Fields#trainingMetrics
     */
    public MLMetricArray getTrainingMetrics(GetMode mode) {
        return obtainWrapped(FIELD_TrainingMetrics, MLMetricArray.class, mode);
    }

    /**
     * Getter for trainingMetrics
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#trainingMetrics
     */
    @Nullable
    public MLMetricArray getTrainingMetrics() {
        return obtainWrapped(FIELD_TrainingMetrics, MLMetricArray.class, GetMode.STRICT);
    }

    /**
     * Setter for trainingMetrics
     * 
     * @see MLModelProperties.Fields#trainingMetrics
     */
    public MLModelProperties setTrainingMetrics(MLMetricArray value, SetMode mode) {
        putWrapped(FIELD_TrainingMetrics, MLMetricArray.class, value, mode);
        return this;
    }

    /**
     * Setter for trainingMetrics
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#trainingMetrics
     */
    public MLModelProperties setTrainingMetrics(
        @Nonnull
        MLMetricArray value) {
        putWrapped(FIELD_TrainingMetrics, MLMetricArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for onlineMetrics
     * 
     * @see MLModelProperties.Fields#onlineMetrics
     */
    public boolean hasOnlineMetrics() {
        return contains(FIELD_OnlineMetrics);
    }

    /**
     * Remover for onlineMetrics
     * 
     * @see MLModelProperties.Fields#onlineMetrics
     */
    public void removeOnlineMetrics() {
        remove(FIELD_OnlineMetrics);
    }

    /**
     * Getter for onlineMetrics
     * 
     * @see MLModelProperties.Fields#onlineMetrics
     */
    public MLMetricArray getOnlineMetrics(GetMode mode) {
        return obtainWrapped(FIELD_OnlineMetrics, MLMetricArray.class, mode);
    }

    /**
     * Getter for onlineMetrics
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#onlineMetrics
     */
    @Nullable
    public MLMetricArray getOnlineMetrics() {
        return obtainWrapped(FIELD_OnlineMetrics, MLMetricArray.class, GetMode.STRICT);
    }

    /**
     * Setter for onlineMetrics
     * 
     * @see MLModelProperties.Fields#onlineMetrics
     */
    public MLModelProperties setOnlineMetrics(MLMetricArray value, SetMode mode) {
        putWrapped(FIELD_OnlineMetrics, MLMetricArray.class, value, mode);
        return this;
    }

    /**
     * Setter for onlineMetrics
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#onlineMetrics
     */
    public MLModelProperties setOnlineMetrics(
        @Nonnull
        MLMetricArray value) {
        putWrapped(FIELD_OnlineMetrics, MLMetricArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for mlFeatures
     * 
     * @see MLModelProperties.Fields#mlFeatures
     */
    public boolean hasMlFeatures() {
        return contains(FIELD_MlFeatures);
    }

    /**
     * Remover for mlFeatures
     * 
     * @see MLModelProperties.Fields#mlFeatures
     */
    public void removeMlFeatures() {
        remove(FIELD_MlFeatures);
    }

    /**
     * Getter for mlFeatures
     * 
     * @see MLModelProperties.Fields#mlFeatures
     */
    public MLFeatureUrnArray getMlFeatures(GetMode mode) {
        return obtainWrapped(FIELD_MlFeatures, MLFeatureUrnArray.class, mode);
    }

    /**
     * Getter for mlFeatures
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#mlFeatures
     */
    @Nullable
    public MLFeatureUrnArray getMlFeatures() {
        return obtainWrapped(FIELD_MlFeatures, MLFeatureUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for mlFeatures
     * 
     * @see MLModelProperties.Fields#mlFeatures
     */
    public MLModelProperties setMlFeatures(MLFeatureUrnArray value, SetMode mode) {
        putWrapped(FIELD_MlFeatures, MLFeatureUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for mlFeatures
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#mlFeatures
     */
    public MLModelProperties setMlFeatures(
        @Nonnull
        MLFeatureUrnArray value) {
        putWrapped(FIELD_MlFeatures, MLFeatureUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for tags
     * 
     * @see MLModelProperties.Fields#tags
     */
    public boolean hasTags() {
        return contains(FIELD_Tags);
    }

    /**
     * Remover for tags
     * 
     * @see MLModelProperties.Fields#tags
     */
    public void removeTags() {
        remove(FIELD_Tags);
    }

    /**
     * Getter for tags
     * 
     * @see MLModelProperties.Fields#tags
     */
    public StringArray getTags(GetMode mode) {
        return obtainWrapped(FIELD_Tags, StringArray.class, mode);
    }

    /**
     * Getter for tags
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLModelProperties.Fields#tags
     */
    @Nonnull
    public StringArray getTags() {
        return obtainWrapped(FIELD_Tags, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for tags
     * 
     * @see MLModelProperties.Fields#tags
     */
    public MLModelProperties setTags(StringArray value, SetMode mode) {
        putWrapped(FIELD_Tags, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for tags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#tags
     */
    public MLModelProperties setTags(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Tags, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for deployments
     * 
     * @see MLModelProperties.Fields#deployments
     */
    public boolean hasDeployments() {
        return contains(FIELD_Deployments);
    }

    /**
     * Remover for deployments
     * 
     * @see MLModelProperties.Fields#deployments
     */
    public void removeDeployments() {
        remove(FIELD_Deployments);
    }

    /**
     * Getter for deployments
     * 
     * @see MLModelProperties.Fields#deployments
     */
    public UrnArray getDeployments(GetMode mode) {
        return obtainWrapped(FIELD_Deployments, UrnArray.class, mode);
    }

    /**
     * Getter for deployments
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#deployments
     */
    @Nullable
    public UrnArray getDeployments() {
        return obtainWrapped(FIELD_Deployments, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for deployments
     * 
     * @see MLModelProperties.Fields#deployments
     */
    public MLModelProperties setDeployments(UrnArray value, SetMode mode) {
        putWrapped(FIELD_Deployments, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for deployments
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#deployments
     */
    public MLModelProperties setDeployments(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_Deployments, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for trainingJobs
     * 
     * @see MLModelProperties.Fields#trainingJobs
     */
    public boolean hasTrainingJobs() {
        return contains(FIELD_TrainingJobs);
    }

    /**
     * Remover for trainingJobs
     * 
     * @see MLModelProperties.Fields#trainingJobs
     */
    public void removeTrainingJobs() {
        remove(FIELD_TrainingJobs);
    }

    /**
     * Getter for trainingJobs
     * 
     * @see MLModelProperties.Fields#trainingJobs
     */
    public UrnArray getTrainingJobs(GetMode mode) {
        return obtainWrapped(FIELD_TrainingJobs, UrnArray.class, mode);
    }

    /**
     * Getter for trainingJobs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#trainingJobs
     */
    @Nullable
    public UrnArray getTrainingJobs() {
        return obtainWrapped(FIELD_TrainingJobs, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for trainingJobs
     * 
     * @see MLModelProperties.Fields#trainingJobs
     */
    public MLModelProperties setTrainingJobs(UrnArray value, SetMode mode) {
        putWrapped(FIELD_TrainingJobs, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for trainingJobs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#trainingJobs
     */
    public MLModelProperties setTrainingJobs(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_TrainingJobs, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for downstreamJobs
     * 
     * @see MLModelProperties.Fields#downstreamJobs
     */
    public boolean hasDownstreamJobs() {
        return contains(FIELD_DownstreamJobs);
    }

    /**
     * Remover for downstreamJobs
     * 
     * @see MLModelProperties.Fields#downstreamJobs
     */
    public void removeDownstreamJobs() {
        remove(FIELD_DownstreamJobs);
    }

    /**
     * Getter for downstreamJobs
     * 
     * @see MLModelProperties.Fields#downstreamJobs
     */
    public UrnArray getDownstreamJobs(GetMode mode) {
        return obtainWrapped(FIELD_DownstreamJobs, UrnArray.class, mode);
    }

    /**
     * Getter for downstreamJobs
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#downstreamJobs
     */
    @Nullable
    public UrnArray getDownstreamJobs() {
        return obtainWrapped(FIELD_DownstreamJobs, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for downstreamJobs
     * 
     * @see MLModelProperties.Fields#downstreamJobs
     */
    public MLModelProperties setDownstreamJobs(UrnArray value, SetMode mode) {
        putWrapped(FIELD_DownstreamJobs, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for downstreamJobs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#downstreamJobs
     */
    public MLModelProperties setDownstreamJobs(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_DownstreamJobs, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for groups
     * 
     * @see MLModelProperties.Fields#groups
     */
    public boolean hasGroups() {
        return contains(FIELD_Groups);
    }

    /**
     * Remover for groups
     * 
     * @see MLModelProperties.Fields#groups
     */
    public void removeGroups() {
        remove(FIELD_Groups);
    }

    /**
     * Getter for groups
     * 
     * @see MLModelProperties.Fields#groups
     */
    public UrnArray getGroups(GetMode mode) {
        return obtainWrapped(FIELD_Groups, UrnArray.class, mode);
    }

    /**
     * Getter for groups
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelProperties.Fields#groups
     */
    @Nullable
    public UrnArray getGroups() {
        return obtainWrapped(FIELD_Groups, UrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for groups
     * 
     * @see MLModelProperties.Fields#groups
     */
    public MLModelProperties setGroups(UrnArray value, SetMode mode) {
        putWrapped(FIELD_Groups, UrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for groups
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelProperties.Fields#groups
     */
    public MLModelProperties setGroups(
        @Nonnull
        UrnArray value) {
        putWrapped(FIELD_Groups, UrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLModelProperties clone()
        throws CloneNotSupportedException
    {
        return ((MLModelProperties) super.clone());
    }

    @Override
    public MLModelProperties copy()
        throws CloneNotSupportedException
    {
        return ((MLModelProperties) super.copy());
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
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * URL where the reference exist
         * 
         */
        public PathSpec externalUrl() {
            return new PathSpec(getPathComponents(), "externalUrl");
        }

        /**
         * Documentation of the MLModel
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Date when the MLModel was developed
         * 
         */
        public PathSpec date() {
            return new PathSpec(getPathComponents(), "date");
        }

        /**
         * Version of the MLModel
         * 
         */
        public com.linkedin.common.VersionTag.Fields version() {
            return new com.linkedin.common.VersionTag.Fields(getPathComponents(), "version");
        }

        /**
         * Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Hyper Parameters of the MLModel
         * 
         * NOTE: these are deprecated in favor of hyperParams
         * 
         */
        public com.linkedin.ml.metadata.HyperParameterValueTypeMap.Fields hyperParameters() {
            return new com.linkedin.ml.metadata.HyperParameterValueTypeMap.Fields(getPathComponents(), "hyperParameters");
        }

        /**
         * Hyperparameters of the MLModel
         * 
         */
        public com.linkedin.ml.metadata.MLHyperParamArray.Fields hyperParams() {
            return new com.linkedin.ml.metadata.MLHyperParamArray.Fields(getPathComponents(), "hyperParams");
        }

        /**
         * Hyperparameters of the MLModel
         * 
         */
        public PathSpec hyperParams(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "hyperParams");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Metrics of the MLModel used in training
         * 
         */
        public com.linkedin.ml.metadata.MLMetricArray.Fields trainingMetrics() {
            return new com.linkedin.ml.metadata.MLMetricArray.Fields(getPathComponents(), "trainingMetrics");
        }

        /**
         * Metrics of the MLModel used in training
         * 
         */
        public PathSpec trainingMetrics(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "trainingMetrics");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Metrics of the MLModel used in production
         * 
         */
        public com.linkedin.ml.metadata.MLMetricArray.Fields onlineMetrics() {
            return new com.linkedin.ml.metadata.MLMetricArray.Fields(getPathComponents(), "onlineMetrics");
        }

        /**
         * Metrics of the MLModel used in production
         * 
         */
        public PathSpec onlineMetrics(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "onlineMetrics");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of features used for MLModel training
         * 
         */
        public PathSpec mlFeatures() {
            return new PathSpec(getPathComponents(), "mlFeatures");
        }

        /**
         * List of features used for MLModel training
         * 
         */
        public PathSpec mlFeatures(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "mlFeatures");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Tags for the MLModel
         * 
         */
        public PathSpec tags() {
            return new PathSpec(getPathComponents(), "tags");
        }

        /**
         * Tags for the MLModel
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

        /**
         * Deployments for the MLModel
         * 
         */
        public PathSpec deployments() {
            return new PathSpec(getPathComponents(), "deployments");
        }

        /**
         * Deployments for the MLModel
         * 
         */
        public PathSpec deployments(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "deployments");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of jobs (if any) used to train the model
         * 
         */
        public PathSpec trainingJobs() {
            return new PathSpec(getPathComponents(), "trainingJobs");
        }

        /**
         * List of jobs (if any) used to train the model
         * 
         */
        public PathSpec trainingJobs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "trainingJobs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of jobs (if any) that use the model
         * 
         */
        public PathSpec downstreamJobs() {
            return new PathSpec(getPathComponents(), "downstreamJobs");
        }

        /**
         * List of jobs (if any) that use the model
         * 
         */
        public PathSpec downstreamJobs(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "downstreamJobs");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Groups the model belongs to
         * 
         */
        public PathSpec groups() {
            return new PathSpec(getPathComponents(), "groups");
        }

        /**
         * Groups the model belongs to
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
