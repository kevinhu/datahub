
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.VersionTag;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Properties associated with an ML Model Group
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelGroupProperties.pdl.")
public class MLModelGroupProperties
    extends RecordTemplate
{

    private final static MLModelGroupProperties.Fields _fields = new MLModelGroupProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Properties associated with an ML Model Group*/@Aspect.name=\"mlModelGroupProperties\"record MLModelGroupProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{/**Documentation of the MLModelGroup*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Date when the MLModelGroup was developed*/createdAt:optional{namespace com.linkedin.common/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long}/**Version of the MLModelGroup*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_CreatedAt = SCHEMA.getField("createdAt");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");

    public MLModelGroupProperties() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
    }

    public MLModelGroupProperties(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLModelGroupProperties.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see MLModelGroupProperties.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        return contains(FIELD_CustomProperties);
    }

    /**
     * Remover for customProperties
     * 
     * @see MLModelGroupProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        remove(FIELD_CustomProperties);
    }

    /**
     * Getter for customProperties
     * 
     * @see MLModelGroupProperties.Fields#customProperties
     */
    public StringMap getCustomProperties(GetMode mode) {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, mode);
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLModelGroupProperties.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, GetMode.STRICT);
    }

    /**
     * Setter for customProperties
     * 
     * @see MLModelGroupProperties.Fields#customProperties
     */
    public MLModelGroupProperties setCustomProperties(StringMap value, SetMode mode) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, mode);
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelGroupProperties.Fields#customProperties
     */
    public MLModelGroupProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see MLModelGroupProperties.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see MLModelGroupProperties.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see MLModelGroupProperties.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelGroupProperties.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see MLModelGroupProperties.Fields#description
     */
    public MLModelGroupProperties setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelGroupProperties.Fields#description
     */
    public MLModelGroupProperties setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for createdAt
     * 
     * @see MLModelGroupProperties.Fields#createdAt
     */
    public boolean hasCreatedAt() {
        return contains(FIELD_CreatedAt);
    }

    /**
     * Remover for createdAt
     * 
     * @see MLModelGroupProperties.Fields#createdAt
     */
    public void removeCreatedAt() {
        remove(FIELD_CreatedAt);
    }

    /**
     * Getter for createdAt
     * 
     * @see MLModelGroupProperties.Fields#createdAt
     */
    public Long getCreatedAt(GetMode mode) {
        return obtainDirect(FIELD_CreatedAt, Long.class, mode);
    }

    /**
     * Getter for createdAt
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelGroupProperties.Fields#createdAt
     */
    @Nullable
    public Long getCreatedAt() {
        return obtainDirect(FIELD_CreatedAt, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for createdAt
     * 
     * @see MLModelGroupProperties.Fields#createdAt
     */
    public MLModelGroupProperties setCreatedAt(Long value, SetMode mode) {
        putDirect(FIELD_CreatedAt, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelGroupProperties.Fields#createdAt
     */
    public MLModelGroupProperties setCreatedAt(
        @Nonnull
        Long value) {
        putDirect(FIELD_CreatedAt, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @see MLModelGroupProperties.Fields#createdAt
     */
    public MLModelGroupProperties setCreatedAt(long value) {
        putDirect(FIELD_CreatedAt, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see MLModelGroupProperties.Fields#version
     */
    public boolean hasVersion() {
        return contains(FIELD_Version);
    }

    /**
     * Remover for version
     * 
     * @see MLModelGroupProperties.Fields#version
     */
    public void removeVersion() {
        remove(FIELD_Version);
    }

    /**
     * Getter for version
     * 
     * @see MLModelGroupProperties.Fields#version
     */
    public VersionTag getVersion(GetMode mode) {
        return obtainWrapped(FIELD_Version, VersionTag.class, mode);
    }

    /**
     * Getter for version
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelGroupProperties.Fields#version
     */
    @Nullable
    public VersionTag getVersion() {
        return obtainWrapped(FIELD_Version, VersionTag.class, GetMode.STRICT);
    }

    /**
     * Setter for version
     * 
     * @see MLModelGroupProperties.Fields#version
     */
    public MLModelGroupProperties setVersion(VersionTag value, SetMode mode) {
        putWrapped(FIELD_Version, VersionTag.class, value, mode);
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelGroupProperties.Fields#version
     */
    public MLModelGroupProperties setVersion(
        @Nonnull
        VersionTag value) {
        putWrapped(FIELD_Version, VersionTag.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLModelGroupProperties clone()
        throws CloneNotSupportedException
    {
        return ((MLModelGroupProperties) super.clone());
    }

    @Override
    public MLModelGroupProperties copy()
        throws CloneNotSupportedException
    {
        return ((MLModelGroupProperties) super.copy());
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
         * Documentation of the MLModelGroup
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Date when the MLModelGroup was developed
         * 
         */
        public PathSpec createdAt() {
            return new PathSpec(getPathComponents(), "createdAt");
        }

        /**
         * Version of the MLModelGroup
         * 
         */
        public com.linkedin.common.VersionTag.Fields version() {
            return new com.linkedin.common.VersionTag.Fields(getPathComponents(), "version");
        }

    }

}
