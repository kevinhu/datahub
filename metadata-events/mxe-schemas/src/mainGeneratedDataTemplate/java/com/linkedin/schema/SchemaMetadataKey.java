
package com.linkedin.schema;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
 * Key to retrieve schema metadata.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaMetadataKey.pdl.")
public class SchemaMetadataKey
    extends RecordTemplate
{

    private final static SchemaMetadataKey.Fields _fields = new SchemaMetadataKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Key to retrieve schema metadata.*/record SchemaMetadataKey{/**Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking*/@validate.strlen={\"min\":1,\"max\":500}schemaName:string/**Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})*/platform:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataPlatform\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataPlatform\",\"doc\":\"Standardized data platforms available\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platformName\",\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"type\":\"string\",\"maxLength\":25}],\"maxLength\":45}typeref DataPlatformUrn=string}/**Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.*/version:long}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_SchemaName = SCHEMA.getField("schemaName");
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataPlatformUrn.class);
    }

    public SchemaMetadataKey() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public SchemaMetadataKey(DataMap data) {
        super(data, SCHEMA);
    }

    public static SchemaMetadataKey.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for schemaName
     * 
     * @see SchemaMetadataKey.Fields#schemaName
     */
    public boolean hasSchemaName() {
        return contains(FIELD_SchemaName);
    }

    /**
     * Remover for schemaName
     * 
     * @see SchemaMetadataKey.Fields#schemaName
     */
    public void removeSchemaName() {
        remove(FIELD_SchemaName);
    }

    /**
     * Getter for schemaName
     * 
     * @see SchemaMetadataKey.Fields#schemaName
     */
    public String getSchemaName(GetMode mode) {
        return obtainDirect(FIELD_SchemaName, String.class, mode);
    }

    /**
     * Getter for schemaName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadataKey.Fields#schemaName
     */
    @Nonnull
    public String getSchemaName() {
        return obtainDirect(FIELD_SchemaName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for schemaName
     * 
     * @see SchemaMetadataKey.Fields#schemaName
     */
    public SchemaMetadataKey setSchemaName(String value, SetMode mode) {
        putDirect(FIELD_SchemaName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for schemaName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadataKey.Fields#schemaName
     */
    public SchemaMetadataKey setSchemaName(
        @Nonnull
        String value) {
        putDirect(FIELD_SchemaName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for platform
     * 
     * @see SchemaMetadataKey.Fields#platform
     */
    public boolean hasPlatform() {
        return contains(FIELD_Platform);
    }

    /**
     * Remover for platform
     * 
     * @see SchemaMetadataKey.Fields#platform
     */
    public void removePlatform() {
        remove(FIELD_Platform);
    }

    /**
     * Getter for platform
     * 
     * @see SchemaMetadataKey.Fields#platform
     */
    public com.linkedin.common.urn.DataPlatformUrn getPlatform(GetMode mode) {
        return obtainCustomType(FIELD_Platform, com.linkedin.common.urn.DataPlatformUrn.class, mode);
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadataKey.Fields#platform
     */
    @Nonnull
    public com.linkedin.common.urn.DataPlatformUrn getPlatform() {
        return obtainCustomType(FIELD_Platform, com.linkedin.common.urn.DataPlatformUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for platform
     * 
     * @see SchemaMetadataKey.Fields#platform
     */
    public SchemaMetadataKey setPlatform(com.linkedin.common.urn.DataPlatformUrn value, SetMode mode) {
        putCustomType(FIELD_Platform, com.linkedin.common.urn.DataPlatformUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadataKey.Fields#platform
     */
    public SchemaMetadataKey setPlatform(
        @Nonnull
        com.linkedin.common.urn.DataPlatformUrn value) {
        putCustomType(FIELD_Platform, com.linkedin.common.urn.DataPlatformUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see SchemaMetadataKey.Fields#version
     */
    public boolean hasVersion() {
        return contains(FIELD_Version);
    }

    /**
     * Remover for version
     * 
     * @see SchemaMetadataKey.Fields#version
     */
    public void removeVersion() {
        remove(FIELD_Version);
    }

    /**
     * Getter for version
     * 
     * @see SchemaMetadataKey.Fields#version
     */
    public Long getVersion(GetMode mode) {
        return obtainDirect(FIELD_Version, Long.class, mode);
    }

    /**
     * Getter for version
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadataKey.Fields#version
     */
    @Nonnull
    public Long getVersion() {
        return obtainDirect(FIELD_Version, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for version
     * 
     * @see SchemaMetadataKey.Fields#version
     */
    public SchemaMetadataKey setVersion(Long value, SetMode mode) {
        putDirect(FIELD_Version, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadataKey.Fields#version
     */
    public SchemaMetadataKey setVersion(
        @Nonnull
        Long value) {
        putDirect(FIELD_Version, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for version
     * 
     * @see SchemaMetadataKey.Fields#version
     */
    public SchemaMetadataKey setVersion(long value) {
        putDirect(FIELD_Version, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SchemaMetadataKey clone()
        throws CloneNotSupportedException
    {
        return ((SchemaMetadataKey) super.clone());
    }

    @Override
    public SchemaMetadataKey copy()
        throws CloneNotSupportedException
    {
        return ((SchemaMetadataKey) super.copy());
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
         * Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking
         * 
         */
        public PathSpec schemaName() {
            return new PathSpec(getPathComponents(), "schemaName");
        }

        /**
         * Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

    }

}
