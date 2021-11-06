
package com.linkedin.dataplatform;

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


/**
 * Information about a data platform
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataplatform/DataPlatformInfo.pdl.")
public class DataPlatformInfo
    extends RecordTemplate
{

    private final static DataPlatformInfo.Fields _fields = new DataPlatformInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataplatform/**Information about a data platform*/@Aspect.name=\"dataPlatformInfo\"record DataPlatformInfo{/**Name of the data platform*/@validate.strlen.max=15,name:string/**The name that will be used for displaying a platform type.*/displayName:optional string/**Platform type this data platform describes*/type:/**Platform types available at LinkedIn*/enum PlatformType{/**Value for a file system, e.g. hdfs*/FILE_SYSTEM/**Value for a key value store, e.g. espresso, voldemort*/KEY_VALUE_STORE/**Value for a message broker, e.g. kafka*/MESSAGE_BROKER/**Value for an object store, e.g. ambry*/OBJECT_STORE/**Value for an OLAP datastore, e.g. pinot*/OLAP_DATASTORE/**Value for other platforms, e.g salesforce, dovetail*/OTHERS/**Value for a query engine, e.g. presto*/QUERY_ENGINE/**Value for a relational database, e.g. oracle, mysql*/RELATIONAL_DB/**Value for a search engine, e.g seas*/SEARCH_ENGINE}/**The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle*/datasetNameDelimiter:string/**The URL for a logo associated with the platform*/logoUrl:optional{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_DisplayName = SCHEMA.getField("displayName");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_DatasetNameDelimiter = SCHEMA.getField("datasetNameDelimiter");
    private final static RecordDataSchema.Field FIELD_LogoUrl = SCHEMA.getField("logoUrl");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
    }

    public DataPlatformInfo() {
        super(new DataMap(7, 0.75F), SCHEMA);
    }

    public DataPlatformInfo(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataPlatformInfo.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for name
     * 
     * @see DataPlatformInfo.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see DataPlatformInfo.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see DataPlatformInfo.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformInfo.Fields#name
     */
    @Nonnull
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see DataPlatformInfo.Fields#name
     */
    public DataPlatformInfo setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformInfo.Fields#name
     */
    public DataPlatformInfo setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for displayName
     * 
     * @see DataPlatformInfo.Fields#displayName
     */
    public boolean hasDisplayName() {
        return contains(FIELD_DisplayName);
    }

    /**
     * Remover for displayName
     * 
     * @see DataPlatformInfo.Fields#displayName
     */
    public void removeDisplayName() {
        remove(FIELD_DisplayName);
    }

    /**
     * Getter for displayName
     * 
     * @see DataPlatformInfo.Fields#displayName
     */
    public String getDisplayName(GetMode mode) {
        return obtainDirect(FIELD_DisplayName, String.class, mode);
    }

    /**
     * Getter for displayName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataPlatformInfo.Fields#displayName
     */
    @Nullable
    public String getDisplayName() {
        return obtainDirect(FIELD_DisplayName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for displayName
     * 
     * @see DataPlatformInfo.Fields#displayName
     */
    public DataPlatformInfo setDisplayName(String value, SetMode mode) {
        putDirect(FIELD_DisplayName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for displayName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformInfo.Fields#displayName
     */
    public DataPlatformInfo setDisplayName(
        @Nonnull
        String value) {
        putDirect(FIELD_DisplayName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see DataPlatformInfo.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see DataPlatformInfo.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see DataPlatformInfo.Fields#type
     */
    public PlatformType getType(GetMode mode) {
        return obtainDirect(FIELD_Type, PlatformType.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformInfo.Fields#type
     */
    @Nonnull
    public PlatformType getType() {
        return obtainDirect(FIELD_Type, PlatformType.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see DataPlatformInfo.Fields#type
     */
    public DataPlatformInfo setType(PlatformType value, SetMode mode) {
        putDirect(FIELD_Type, PlatformType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformInfo.Fields#type
     */
    public DataPlatformInfo setType(
        @Nonnull
        PlatformType value) {
        putDirect(FIELD_Type, PlatformType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for datasetNameDelimiter
     * 
     * @see DataPlatformInfo.Fields#datasetNameDelimiter
     */
    public boolean hasDatasetNameDelimiter() {
        return contains(FIELD_DatasetNameDelimiter);
    }

    /**
     * Remover for datasetNameDelimiter
     * 
     * @see DataPlatformInfo.Fields#datasetNameDelimiter
     */
    public void removeDatasetNameDelimiter() {
        remove(FIELD_DatasetNameDelimiter);
    }

    /**
     * Getter for datasetNameDelimiter
     * 
     * @see DataPlatformInfo.Fields#datasetNameDelimiter
     */
    public String getDatasetNameDelimiter(GetMode mode) {
        return obtainDirect(FIELD_DatasetNameDelimiter, String.class, mode);
    }

    /**
     * Getter for datasetNameDelimiter
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformInfo.Fields#datasetNameDelimiter
     */
    @Nonnull
    public String getDatasetNameDelimiter() {
        return obtainDirect(FIELD_DatasetNameDelimiter, String.class, GetMode.STRICT);
    }

    /**
     * Setter for datasetNameDelimiter
     * 
     * @see DataPlatformInfo.Fields#datasetNameDelimiter
     */
    public DataPlatformInfo setDatasetNameDelimiter(String value, SetMode mode) {
        putDirect(FIELD_DatasetNameDelimiter, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for datasetNameDelimiter
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformInfo.Fields#datasetNameDelimiter
     */
    public DataPlatformInfo setDatasetNameDelimiter(
        @Nonnull
        String value) {
        putDirect(FIELD_DatasetNameDelimiter, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for logoUrl
     * 
     * @see DataPlatformInfo.Fields#logoUrl
     */
    public boolean hasLogoUrl() {
        return contains(FIELD_LogoUrl);
    }

    /**
     * Remover for logoUrl
     * 
     * @see DataPlatformInfo.Fields#logoUrl
     */
    public void removeLogoUrl() {
        remove(FIELD_LogoUrl);
    }

    /**
     * Getter for logoUrl
     * 
     * @see DataPlatformInfo.Fields#logoUrl
     */
    public com.linkedin.common.url.Url getLogoUrl(GetMode mode) {
        return obtainCustomType(FIELD_LogoUrl, com.linkedin.common.url.Url.class, mode);
    }

    /**
     * Getter for logoUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DataPlatformInfo.Fields#logoUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getLogoUrl() {
        return obtainCustomType(FIELD_LogoUrl, com.linkedin.common.url.Url.class, GetMode.STRICT);
    }

    /**
     * Setter for logoUrl
     * 
     * @see DataPlatformInfo.Fields#logoUrl
     */
    public DataPlatformInfo setLogoUrl(com.linkedin.common.url.Url value, SetMode mode) {
        putCustomType(FIELD_LogoUrl, com.linkedin.common.url.Url.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for logoUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformInfo.Fields#logoUrl
     */
    public DataPlatformInfo setLogoUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        putCustomType(FIELD_LogoUrl, com.linkedin.common.url.Url.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataPlatformInfo clone()
        throws CloneNotSupportedException
    {
        return ((DataPlatformInfo) super.clone());
    }

    @Override
    public DataPlatformInfo copy()
        throws CloneNotSupportedException
    {
        return ((DataPlatformInfo) super.copy());
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
         * Name of the data platform
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * The name that will be used for displaying a platform type.
         * 
         */
        public PathSpec displayName() {
            return new PathSpec(getPathComponents(), "displayName");
        }

        /**
         * Platform type this data platform describes
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle
         * 
         */
        public PathSpec datasetNameDelimiter() {
            return new PathSpec(getPathComponents(), "datasetNameDelimiter");
        }

        /**
         * The URL for a logo associated with the platform
         * 
         */
        public PathSpec logoUrl() {
            return new PathSpec(getPathComponents(), "logoUrl");
        }

    }

}
