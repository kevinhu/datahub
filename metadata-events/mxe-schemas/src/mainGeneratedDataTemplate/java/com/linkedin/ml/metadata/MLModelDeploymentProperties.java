
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
import com.linkedin.data.template.StringMap;


/**
 * Properties associated with an ML Model Deployment
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelDeploymentProperties.pdl.")
public class MLModelDeploymentProperties
    extends RecordTemplate
{

    private final static MLModelDeploymentProperties.Fields _fields = new MLModelDeploymentProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Properties associated with an ML Model Deployment*/@Aspect.name=\"mlModelDeploymentProperties\"record MLModelDeploymentProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Documentation of the MLModelDeployment*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Date when the MLModelDeployment was developed*/createdAt:optional{namespace com.linkedin.common/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long}/**Version of the MLModelDeployment*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}}/**Status of the deployment*/status:optional/**Model endpoint statuses*/enum DeploymentStatus{/**Deployments out of service.*/OUT_OF_SERVICE/**Deployments being created.*/CREATING/**Deployments being updated.*/UPDATING/**Deployments being reverted to a previous version.*/ROLLING_BACK/**Deployments that are active.*/IN_SERVICE/**Deployments being deleted.*/DELETING/**Deployments with an error state.*/FAILED/**Deployments with unknown/unmappable state.*/UNKNOWN}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_CreatedAt = SCHEMA.getField("createdAt");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_Status = SCHEMA.getField("status");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public MLModelDeploymentProperties() {
        super(new DataMap(8, 0.75F), SCHEMA, 3);
    }

    public MLModelDeploymentProperties(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLModelDeploymentProperties.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see MLModelDeploymentProperties.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        return contains(FIELD_CustomProperties);
    }

    /**
     * Remover for customProperties
     * 
     * @see MLModelDeploymentProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        remove(FIELD_CustomProperties);
    }

    /**
     * Getter for customProperties
     * 
     * @see MLModelDeploymentProperties.Fields#customProperties
     */
    public StringMap getCustomProperties(GetMode mode) {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, mode);
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLModelDeploymentProperties.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, GetMode.STRICT);
    }

    /**
     * Setter for customProperties
     * 
     * @see MLModelDeploymentProperties.Fields#customProperties
     */
    public MLModelDeploymentProperties setCustomProperties(StringMap value, SetMode mode) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, mode);
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentProperties.Fields#customProperties
     */
    public MLModelDeploymentProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see MLModelDeploymentProperties.Fields#externalUrl
     */
    public boolean hasExternalUrl() {
        return contains(FIELD_ExternalUrl);
    }

    /**
     * Remover for externalUrl
     * 
     * @see MLModelDeploymentProperties.Fields#externalUrl
     */
    public void removeExternalUrl() {
        remove(FIELD_ExternalUrl);
    }

    /**
     * Getter for externalUrl
     * 
     * @see MLModelDeploymentProperties.Fields#externalUrl
     */
    public com.linkedin.common.url.Url getExternalUrl(GetMode mode) {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDeploymentProperties.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl() {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for externalUrl
     * 
     * @see MLModelDeploymentProperties.Fields#externalUrl
     */
    public MLModelDeploymentProperties setExternalUrl(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for externalUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentProperties.Fields#externalUrl
     */
    public MLModelDeploymentProperties setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see MLModelDeploymentProperties.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see MLModelDeploymentProperties.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see MLModelDeploymentProperties.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDeploymentProperties.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see MLModelDeploymentProperties.Fields#description
     */
    public MLModelDeploymentProperties setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentProperties.Fields#description
     */
    public MLModelDeploymentProperties setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for createdAt
     * 
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    public boolean hasCreatedAt() {
        return contains(FIELD_CreatedAt);
    }

    /**
     * Remover for createdAt
     * 
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    public void removeCreatedAt() {
        remove(FIELD_CreatedAt);
    }

    /**
     * Getter for createdAt
     * 
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    public Long getCreatedAt(GetMode mode) {
        return obtainDirect(FIELD_CreatedAt, Long.class, mode);
    }

    /**
     * Getter for createdAt
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    @Nullable
    public Long getCreatedAt() {
        return obtainDirect(FIELD_CreatedAt, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for createdAt
     * 
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    public MLModelDeploymentProperties setCreatedAt(Long value, SetMode mode) {
        putDirect(FIELD_CreatedAt, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    public MLModelDeploymentProperties setCreatedAt(
        @Nonnull
        Long value) {
        putDirect(FIELD_CreatedAt, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    public MLModelDeploymentProperties setCreatedAt(long value) {
        putDirect(FIELD_CreatedAt, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see MLModelDeploymentProperties.Fields#version
     */
    public boolean hasVersion() {
        return contains(FIELD_Version);
    }

    /**
     * Remover for version
     * 
     * @see MLModelDeploymentProperties.Fields#version
     */
    public void removeVersion() {
        remove(FIELD_Version);
    }

    /**
     * Getter for version
     * 
     * @see MLModelDeploymentProperties.Fields#version
     */
    public VersionTag getVersion(GetMode mode) {
        return obtainWrapped(FIELD_Version, VersionTag.class, mode);
    }

    /**
     * Getter for version
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDeploymentProperties.Fields#version
     */
    @Nullable
    public VersionTag getVersion() {
        return obtainWrapped(FIELD_Version, VersionTag.class, GetMode.STRICT);
    }

    /**
     * Setter for version
     * 
     * @see MLModelDeploymentProperties.Fields#version
     */
    public MLModelDeploymentProperties setVersion(VersionTag value, SetMode mode) {
        putWrapped(FIELD_Version, VersionTag.class, value, mode);
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentProperties.Fields#version
     */
    public MLModelDeploymentProperties setVersion(
        @Nonnull
        VersionTag value) {
        putWrapped(FIELD_Version, VersionTag.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for status
     * 
     * @see MLModelDeploymentProperties.Fields#status
     */
    public boolean hasStatus() {
        return contains(FIELD_Status);
    }

    /**
     * Remover for status
     * 
     * @see MLModelDeploymentProperties.Fields#status
     */
    public void removeStatus() {
        remove(FIELD_Status);
    }

    /**
     * Getter for status
     * 
     * @see MLModelDeploymentProperties.Fields#status
     */
    public DeploymentStatus getStatus(GetMode mode) {
        return obtainDirect(FIELD_Status, DeploymentStatus.class, mode);
    }

    /**
     * Getter for status
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDeploymentProperties.Fields#status
     */
    @Nullable
    public DeploymentStatus getStatus() {
        return obtainDirect(FIELD_Status, DeploymentStatus.class, GetMode.STRICT);
    }

    /**
     * Setter for status
     * 
     * @see MLModelDeploymentProperties.Fields#status
     */
    public MLModelDeploymentProperties setStatus(DeploymentStatus value, SetMode mode) {
        putDirect(FIELD_Status, DeploymentStatus.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for status
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentProperties.Fields#status
     */
    public MLModelDeploymentProperties setStatus(
        @Nonnull
        DeploymentStatus value) {
        putDirect(FIELD_Status, DeploymentStatus.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLModelDeploymentProperties clone()
        throws CloneNotSupportedException
    {
        return ((MLModelDeploymentProperties) super.clone());
    }

    @Override
    public MLModelDeploymentProperties copy()
        throws CloneNotSupportedException
    {
        return ((MLModelDeploymentProperties) super.copy());
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
         * Documentation of the MLModelDeployment
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Date when the MLModelDeployment was developed
         * 
         */
        public PathSpec createdAt() {
            return new PathSpec(getPathComponents(), "createdAt");
        }

        /**
         * Version of the MLModelDeployment
         * 
         */
        public com.linkedin.common.VersionTag.Fields version() {
            return new com.linkedin.common.VersionTag.Fields(getPathComponents(), "version");
        }

        /**
         * Status of the deployment
         * 
         */
        public PathSpec status() {
            return new PathSpec(getPathComponents(), "status");
        }

    }

}
