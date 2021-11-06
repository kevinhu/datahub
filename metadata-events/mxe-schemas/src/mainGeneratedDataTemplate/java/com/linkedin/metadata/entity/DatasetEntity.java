
package com.linkedin.metadata.entity;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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


/**
 * Data model for a dataset entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/entity/DatasetEntity.pdl.")
public class DatasetEntity
    extends RecordTemplate
{

    private final static DatasetEntity.Fields _fields = new DatasetEntity.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.entity/**Data model for a dataset entity*/record DatasetEntity includes/**Common fields that apply to all entities*/record BaseEntity{/**Whether the entity has been removed or not*/removed:optional boolean=false}{/**Urn for the dataset*/urn:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Dataset native name e.g. {db}.{table}, /dir/subdir/{name}, or {name}*/name:optional string/**Platform urn for the dataset in the form of urn:li:platform:{platform_name}*/platform:optional{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataPlatform\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataPlatform\",\"doc\":\"Standardized data platforms available\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platformName\",\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"type\":\"string\",\"maxLength\":25}],\"maxLength\":45}typeref DataPlatformUrn=string}/**Fabric type where dataset belongs to or where it was generated.*/origin:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Origin = SCHEMA.getField("origin");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
        Custom.initializeCustomClass(com.linkedin.common.urn.DataPlatformUrn.class);
    }

    public DatasetEntity() {
        super(new DataMap(7, 0.75F), SCHEMA);
    }

    public DatasetEntity(DataMap data) {
        super(data, SCHEMA);
    }

    public static DatasetEntity.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see DatasetEntity.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see DatasetEntity.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see DatasetEntity.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetEntity.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see DatasetEntity.Fields#removed
     */
    public DatasetEntity setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetEntity.Fields#removed
     */
    public DatasetEntity setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see DatasetEntity.Fields#removed
     */
    public DatasetEntity setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see DatasetEntity.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DatasetEntity.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DatasetEntity.Fields#urn
     */
    public com.linkedin.common.urn.DatasetUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DatasetUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetEntity.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DatasetUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DatasetUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DatasetEntity.Fields#urn
     */
    public DatasetEntity setUrn(com.linkedin.common.urn.DatasetUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DatasetUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetEntity.Fields#urn
     */
    public DatasetEntity setUrn(
        @Nonnull
        com.linkedin.common.urn.DatasetUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DatasetUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see DatasetEntity.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see DatasetEntity.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see DatasetEntity.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetEntity.Fields#name
     */
    @Nullable
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see DatasetEntity.Fields#name
     */
    public DatasetEntity setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetEntity.Fields#name
     */
    public DatasetEntity setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for platform
     * 
     * @see DatasetEntity.Fields#platform
     */
    public boolean hasPlatform() {
        return contains(FIELD_Platform);
    }

    /**
     * Remover for platform
     * 
     * @see DatasetEntity.Fields#platform
     */
    public void removePlatform() {
        remove(FIELD_Platform);
    }

    /**
     * Getter for platform
     * 
     * @see DatasetEntity.Fields#platform
     */
    public com.linkedin.common.urn.DataPlatformUrn getPlatform(GetMode mode) {
        return obtainCustomType(FIELD_Platform, com.linkedin.common.urn.DataPlatformUrn.class, mode);
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetEntity.Fields#platform
     */
    @Nullable
    public com.linkedin.common.urn.DataPlatformUrn getPlatform() {
        return obtainCustomType(FIELD_Platform, com.linkedin.common.urn.DataPlatformUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for platform
     * 
     * @see DatasetEntity.Fields#platform
     */
    public DatasetEntity setPlatform(com.linkedin.common.urn.DataPlatformUrn value, SetMode mode) {
        putCustomType(FIELD_Platform, com.linkedin.common.urn.DataPlatformUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetEntity.Fields#platform
     */
    public DatasetEntity setPlatform(
        @Nonnull
        com.linkedin.common.urn.DataPlatformUrn value) {
        putCustomType(FIELD_Platform, com.linkedin.common.urn.DataPlatformUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for origin
     * 
     * @see DatasetEntity.Fields#origin
     */
    public boolean hasOrigin() {
        return contains(FIELD_Origin);
    }

    /**
     * Remover for origin
     * 
     * @see DatasetEntity.Fields#origin
     */
    public void removeOrigin() {
        remove(FIELD_Origin);
    }

    /**
     * Getter for origin
     * 
     * @see DatasetEntity.Fields#origin
     */
    public FabricType getOrigin(GetMode mode) {
        return obtainDirect(FIELD_Origin, FabricType.class, mode);
    }

    /**
     * Getter for origin
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetEntity.Fields#origin
     */
    @Nullable
    public FabricType getOrigin() {
        return obtainDirect(FIELD_Origin, FabricType.class, GetMode.STRICT);
    }

    /**
     * Setter for origin
     * 
     * @see DatasetEntity.Fields#origin
     */
    public DatasetEntity setOrigin(FabricType value, SetMode mode) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for origin
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetEntity.Fields#origin
     */
    public DatasetEntity setOrigin(
        @Nonnull
        FabricType value) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DatasetEntity clone()
        throws CloneNotSupportedException
    {
        return ((DatasetEntity) super.clone());
    }

    @Override
    public DatasetEntity copy()
        throws CloneNotSupportedException
    {
        return ((DatasetEntity) super.copy());
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
         * Urn for the dataset
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * Dataset native name e.g. {db}.{table}, /dir/subdir/{name}, or {name}
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

        /**
         * Platform urn for the dataset in the form of urn:li:platform:{platform_name}
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Fabric type where dataset belongs to or where it was generated.
         * 
         */
        public PathSpec origin() {
            return new PathSpec(getPathComponents(), "origin");
        }

    }

}
