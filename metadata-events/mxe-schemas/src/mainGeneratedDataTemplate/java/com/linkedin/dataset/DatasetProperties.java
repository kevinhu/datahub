
package com.linkedin.dataset;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * Properties associated with a Dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetProperties.pdl.")
public class DatasetProperties
    extends RecordTemplate
{

    private final static DatasetProperties.Fields _fields = new DatasetProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Properties associated with a Dataset*/@Aspect.name=\"datasetProperties\"record DatasetProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Documentation of the dataset*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).*/uri:optional{namespace com.linkedin.common@java.class=\"java.net.URI\"typeref Uri=string}/**[Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.*/tags:array[string]=[]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Uri = SCHEMA.getField("uri");
    private final static RecordDataSchema.Field FIELD_Tags = SCHEMA.getField("tags");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        Custom.initializeCustomClass(java.net.URI.class);
    }

    public DatasetProperties() {
        super(new DataMap(7, 0.75F), SCHEMA, 3);
    }

    public DatasetProperties(DataMap data) {
        super(data, SCHEMA);
    }

    public static DatasetProperties.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see DatasetProperties.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        return contains(FIELD_CustomProperties);
    }

    /**
     * Remover for customProperties
     * 
     * @see DatasetProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        remove(FIELD_CustomProperties);
    }

    /**
     * Getter for customProperties
     * 
     * @see DatasetProperties.Fields#customProperties
     */
    public StringMap getCustomProperties(GetMode mode) {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, mode);
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetProperties.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        return obtainWrapped(FIELD_CustomProperties, StringMap.class, GetMode.STRICT);
    }

    /**
     * Setter for customProperties
     * 
     * @see DatasetProperties.Fields#customProperties
     */
    public DatasetProperties setCustomProperties(StringMap value, SetMode mode) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, mode);
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetProperties.Fields#customProperties
     */
    public DatasetProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        putWrapped(FIELD_CustomProperties, StringMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see DatasetProperties.Fields#externalUrl
     */
    public boolean hasExternalUrl() {
        return contains(FIELD_ExternalUrl);
    }

    /**
     * Remover for externalUrl
     * 
     * @see DatasetProperties.Fields#externalUrl
     */
    public void removeExternalUrl() {
        remove(FIELD_ExternalUrl);
    }

    /**
     * Getter for externalUrl
     * 
     * @see DatasetProperties.Fields#externalUrl
     */
    public com.linkedin.common.url.Url getExternalUrl(GetMode mode) {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetProperties.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl() {
        return obtainCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for externalUrl
     * 
     * @see DatasetProperties.Fields#externalUrl
     */
    public DatasetProperties setExternalUrl(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for externalUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetProperties.Fields#externalUrl
     */
    public DatasetProperties setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_ExternalUrl, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DatasetProperties.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see DatasetProperties.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see DatasetProperties.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetProperties.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see DatasetProperties.Fields#description
     */
    public DatasetProperties setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetProperties.Fields#description
     */
    public DatasetProperties setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for uri
     * 
     * @see DatasetProperties.Fields#uri
     */
    public boolean hasUri() {
        return contains(FIELD_Uri);
    }

    /**
     * Remover for uri
     * 
     * @see DatasetProperties.Fields#uri
     */
    public void removeUri() {
        remove(FIELD_Uri);
    }

    /**
     * Getter for uri
     * 
     * @see DatasetProperties.Fields#uri
     */
    public java.net.URI getUri(GetMode mode) {
        return obtainCustomType(FIELD_Uri, java.net.URI.class, mode);
    }

    /**
     * Getter for uri
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetProperties.Fields#uri
     */
    @Nullable
    public java.net.URI getUri() {
        return obtainCustomType(FIELD_Uri, java.net.URI.class, GetMode.STRICT);
    }

    /**
     * Setter for uri
     * 
     * @see DatasetProperties.Fields#uri
     */
    public DatasetProperties setUri(java.net.URI value, SetMode mode) {
        putCustomType(FIELD_Uri, java.net.URI.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for uri
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetProperties.Fields#uri
     */
    public DatasetProperties setUri(
        @Nonnull
        java.net.URI value) {
        putCustomType(FIELD_Uri, java.net.URI.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for tags
     * 
     * @see DatasetProperties.Fields#tags
     */
    public boolean hasTags() {
        return contains(FIELD_Tags);
    }

    /**
     * Remover for tags
     * 
     * @see DatasetProperties.Fields#tags
     */
    public void removeTags() {
        remove(FIELD_Tags);
    }

    /**
     * Getter for tags
     * 
     * @see DatasetProperties.Fields#tags
     */
    public StringArray getTags(GetMode mode) {
        return obtainWrapped(FIELD_Tags, StringArray.class, mode);
    }

    /**
     * Getter for tags
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetProperties.Fields#tags
     */
    @Nonnull
    public StringArray getTags() {
        return obtainWrapped(FIELD_Tags, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for tags
     * 
     * @see DatasetProperties.Fields#tags
     */
    public DatasetProperties setTags(StringArray value, SetMode mode) {
        putWrapped(FIELD_Tags, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for tags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetProperties.Fields#tags
     */
    public DatasetProperties setTags(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Tags, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DatasetProperties clone()
        throws CloneNotSupportedException
    {
        return ((DatasetProperties) super.clone());
    }

    @Override
    public DatasetProperties copy()
        throws CloneNotSupportedException
    {
        return ((DatasetProperties) super.copy());
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
         * Documentation of the dataset
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * The abstracted URI such as hdfs:///data/tracking/PageViewEvent, file:///dir/file_name. Uri should not include any environment specific properties. Some datasets might not have a standardized uri, which makes this field optional (i.e. kafka topic).
         * 
         */
        public PathSpec uri() {
            return new PathSpec(getPathComponents(), "uri");
        }

        /**
         * [Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.
         * 
         */
        public PathSpec tags() {
            return new PathSpec(getPathComponents(), "tags");
        }

        /**
         * [Legacy] Unstructured tags for the dataset. Structured tags can be applied via the `GlobalTags` aspect.
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
