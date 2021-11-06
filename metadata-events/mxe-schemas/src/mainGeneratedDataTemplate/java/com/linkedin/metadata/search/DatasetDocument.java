
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
 * Data model for dataset entity search
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/DatasetDocument.pdl.")
public class DatasetDocument
    extends RecordTemplate
{

    private final static DatasetDocument.Fields _fields = new DatasetDocument.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**Data model for dataset entity search*/record DatasetDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{/**Urn for the dataset*/urn:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Dataset native name e.g. {db}.{table}, /dir/subdir/{name}, or {name}*/name:optional string/**Platform name for the dataset*/platform:optional string/**Fabric type where dataset belongs to or where it was generated*/origin:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}/**LDAP usernames of corp users who are the owners of this dataset*/owners:optional array[string]/**Flag to indicate if the dataset is deprecated.*/deprecated:optional boolean/**Documentation of the dataset.*/description:optional string/**Field paths of the dataset*/fieldPaths:optional array[string]/**Flag to indicate if the dataset has non empty corp users as owners or not.*/hasOwners:optional boolean/**Flag to indicate if the dataset has non-empty schema or not.*/hasSchema:optional boolean/**Lineage information represented by the number of immediate downstream datasets of this dataset.*/numDownstreamDatasets:optional long/**List of upstreams for this dataset*/upstreams:optional array[com.linkedin.common.DatasetUrn]/**List of tags for this dataset*/tags:optional array[string]/**List of field descriptions*/fieldDescriptions:optional array[string]/**List of tags applied to fields*/fieldTags:optional array[string]/**List of field descriptions*/editedFieldDescriptions:optional array[string]/**List of tags applied to fields*/editedFieldTags:optional array[string]/**List of terms for this dataset*/glossaryTerms:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Removed = SCHEMA.getField("removed");
    private final static RecordDataSchema.Field FIELD_BrowsePaths = SCHEMA.getField("browsePaths");
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Origin = SCHEMA.getField("origin");
    private final static RecordDataSchema.Field FIELD_Owners = SCHEMA.getField("owners");
    private final static RecordDataSchema.Field FIELD_Deprecated = SCHEMA.getField("deprecated");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_FieldPaths = SCHEMA.getField("fieldPaths");
    private final static RecordDataSchema.Field FIELD_HasOwners = SCHEMA.getField("hasOwners");
    private final static RecordDataSchema.Field FIELD_HasSchema = SCHEMA.getField("hasSchema");
    private final static RecordDataSchema.Field FIELD_NumDownstreamDatasets = SCHEMA.getField("numDownstreamDatasets");
    private final static RecordDataSchema.Field FIELD_Upstreams = SCHEMA.getField("upstreams");
    private final static RecordDataSchema.Field FIELD_Tags = SCHEMA.getField("tags");
    private final static RecordDataSchema.Field FIELD_FieldDescriptions = SCHEMA.getField("fieldDescriptions");
    private final static RecordDataSchema.Field FIELD_FieldTags = SCHEMA.getField("fieldTags");
    private final static RecordDataSchema.Field FIELD_EditedFieldDescriptions = SCHEMA.getField("editedFieldDescriptions");
    private final static RecordDataSchema.Field FIELD_EditedFieldTags = SCHEMA.getField("editedFieldTags");
    private final static RecordDataSchema.Field FIELD_GlossaryTerms = SCHEMA.getField("glossaryTerms");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
    }

    public DatasetDocument() {
        super(new DataMap(), SCHEMA, 14);
    }

    public DatasetDocument(DataMap data) {
        super(data, SCHEMA);
    }

    public static DatasetDocument.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for removed
     * 
     * @see DatasetDocument.Fields#removed
     */
    public boolean hasRemoved() {
        return contains(FIELD_Removed);
    }

    /**
     * Remover for removed
     * 
     * @see DatasetDocument.Fields#removed
     */
    public void removeRemoved() {
        remove(FIELD_Removed);
    }

    /**
     * Getter for removed
     * 
     * @see DatasetDocument.Fields#removed
     */
    public Boolean isRemoved(GetMode mode) {
        return obtainDirect(FIELD_Removed, Boolean.class, mode);
    }

    /**
     * Getter for removed
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#removed
     */
    @Nullable
    public Boolean isRemoved() {
        return obtainDirect(FIELD_Removed, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for removed
     * 
     * @see DatasetDocument.Fields#removed
     */
    public DatasetDocument setRemoved(Boolean value, SetMode mode) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#removed
     */
    public DatasetDocument setRemoved(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for removed
     * 
     * @see DatasetDocument.Fields#removed
     */
    public DatasetDocument setRemoved(boolean value) {
        putDirect(FIELD_Removed, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for browsePaths
     * 
     * @see DatasetDocument.Fields#browsePaths
     */
    public boolean hasBrowsePaths() {
        return contains(FIELD_BrowsePaths);
    }

    /**
     * Remover for browsePaths
     * 
     * @see DatasetDocument.Fields#browsePaths
     */
    public void removeBrowsePaths() {
        remove(FIELD_BrowsePaths);
    }

    /**
     * Getter for browsePaths
     * 
     * @see DatasetDocument.Fields#browsePaths
     */
    public StringArray getBrowsePaths(GetMode mode) {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, mode);
    }

    /**
     * Getter for browsePaths
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#browsePaths
     */
    @Nullable
    public StringArray getBrowsePaths() {
        return obtainWrapped(FIELD_BrowsePaths, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for browsePaths
     * 
     * @see DatasetDocument.Fields#browsePaths
     */
    public DatasetDocument setBrowsePaths(StringArray value, SetMode mode) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for browsePaths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#browsePaths
     */
    public DatasetDocument setBrowsePaths(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_BrowsePaths, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for urn
     * 
     * @see DatasetDocument.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DatasetDocument.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DatasetDocument.Fields#urn
     */
    public com.linkedin.common.urn.DatasetUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DatasetUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetDocument.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DatasetUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DatasetUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DatasetDocument.Fields#urn
     */
    public DatasetDocument setUrn(com.linkedin.common.urn.DatasetUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DatasetUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#urn
     */
    public DatasetDocument setUrn(
        @Nonnull
        com.linkedin.common.urn.DatasetUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DatasetUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see DatasetDocument.Fields#name
     */
    public boolean hasName() {
        return contains(FIELD_Name);
    }

    /**
     * Remover for name
     * 
     * @see DatasetDocument.Fields#name
     */
    public void removeName() {
        remove(FIELD_Name);
    }

    /**
     * Getter for name
     * 
     * @see DatasetDocument.Fields#name
     */
    public String getName(GetMode mode) {
        return obtainDirect(FIELD_Name, String.class, mode);
    }

    /**
     * Getter for name
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#name
     */
    @Nullable
    public String getName() {
        return obtainDirect(FIELD_Name, String.class, GetMode.STRICT);
    }

    /**
     * Setter for name
     * 
     * @see DatasetDocument.Fields#name
     */
    public DatasetDocument setName(String value, SetMode mode) {
        putDirect(FIELD_Name, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#name
     */
    public DatasetDocument setName(
        @Nonnull
        String value) {
        putDirect(FIELD_Name, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for platform
     * 
     * @see DatasetDocument.Fields#platform
     */
    public boolean hasPlatform() {
        return contains(FIELD_Platform);
    }

    /**
     * Remover for platform
     * 
     * @see DatasetDocument.Fields#platform
     */
    public void removePlatform() {
        remove(FIELD_Platform);
    }

    /**
     * Getter for platform
     * 
     * @see DatasetDocument.Fields#platform
     */
    public String getPlatform(GetMode mode) {
        return obtainDirect(FIELD_Platform, String.class, mode);
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#platform
     */
    @Nullable
    public String getPlatform() {
        return obtainDirect(FIELD_Platform, String.class, GetMode.STRICT);
    }

    /**
     * Setter for platform
     * 
     * @see DatasetDocument.Fields#platform
     */
    public DatasetDocument setPlatform(String value, SetMode mode) {
        putDirect(FIELD_Platform, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#platform
     */
    public DatasetDocument setPlatform(
        @Nonnull
        String value) {
        putDirect(FIELD_Platform, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for origin
     * 
     * @see DatasetDocument.Fields#origin
     */
    public boolean hasOrigin() {
        return contains(FIELD_Origin);
    }

    /**
     * Remover for origin
     * 
     * @see DatasetDocument.Fields#origin
     */
    public void removeOrigin() {
        remove(FIELD_Origin);
    }

    /**
     * Getter for origin
     * 
     * @see DatasetDocument.Fields#origin
     */
    public FabricType getOrigin(GetMode mode) {
        return obtainDirect(FIELD_Origin, FabricType.class, mode);
    }

    /**
     * Getter for origin
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#origin
     */
    @Nullable
    public FabricType getOrigin() {
        return obtainDirect(FIELD_Origin, FabricType.class, GetMode.STRICT);
    }

    /**
     * Setter for origin
     * 
     * @see DatasetDocument.Fields#origin
     */
    public DatasetDocument setOrigin(FabricType value, SetMode mode) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for origin
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#origin
     */
    public DatasetDocument setOrigin(
        @Nonnull
        FabricType value) {
        putDirect(FIELD_Origin, FabricType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for owners
     * 
     * @see DatasetDocument.Fields#owners
     */
    public boolean hasOwners() {
        return contains(FIELD_Owners);
    }

    /**
     * Remover for owners
     * 
     * @see DatasetDocument.Fields#owners
     */
    public void removeOwners() {
        remove(FIELD_Owners);
    }

    /**
     * Getter for owners
     * 
     * @see DatasetDocument.Fields#owners
     */
    public StringArray getOwners(GetMode mode) {
        return obtainWrapped(FIELD_Owners, StringArray.class, mode);
    }

    /**
     * Getter for owners
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#owners
     */
    @Nullable
    public StringArray getOwners() {
        return obtainWrapped(FIELD_Owners, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for owners
     * 
     * @see DatasetDocument.Fields#owners
     */
    public DatasetDocument setOwners(StringArray value, SetMode mode) {
        putWrapped(FIELD_Owners, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for owners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#owners
     */
    public DatasetDocument setOwners(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Owners, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for deprecated
     * 
     * @see DatasetDocument.Fields#deprecated
     */
    public boolean hasDeprecated() {
        return contains(FIELD_Deprecated);
    }

    /**
     * Remover for deprecated
     * 
     * @see DatasetDocument.Fields#deprecated
     */
    public void removeDeprecated() {
        remove(FIELD_Deprecated);
    }

    /**
     * Getter for deprecated
     * 
     * @see DatasetDocument.Fields#deprecated
     */
    public Boolean isDeprecated(GetMode mode) {
        return obtainDirect(FIELD_Deprecated, Boolean.class, mode);
    }

    /**
     * Getter for deprecated
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#deprecated
     */
    @Nullable
    public Boolean isDeprecated() {
        return obtainDirect(FIELD_Deprecated, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for deprecated
     * 
     * @see DatasetDocument.Fields#deprecated
     */
    public DatasetDocument setDeprecated(Boolean value, SetMode mode) {
        putDirect(FIELD_Deprecated, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for deprecated
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#deprecated
     */
    public DatasetDocument setDeprecated(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Deprecated, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for deprecated
     * 
     * @see DatasetDocument.Fields#deprecated
     */
    public DatasetDocument setDeprecated(boolean value) {
        putDirect(FIELD_Deprecated, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see DatasetDocument.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see DatasetDocument.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see DatasetDocument.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see DatasetDocument.Fields#description
     */
    public DatasetDocument setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#description
     */
    public DatasetDocument setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for fieldPaths
     * 
     * @see DatasetDocument.Fields#fieldPaths
     */
    public boolean hasFieldPaths() {
        return contains(FIELD_FieldPaths);
    }

    /**
     * Remover for fieldPaths
     * 
     * @see DatasetDocument.Fields#fieldPaths
     */
    public void removeFieldPaths() {
        remove(FIELD_FieldPaths);
    }

    /**
     * Getter for fieldPaths
     * 
     * @see DatasetDocument.Fields#fieldPaths
     */
    public StringArray getFieldPaths(GetMode mode) {
        return obtainWrapped(FIELD_FieldPaths, StringArray.class, mode);
    }

    /**
     * Getter for fieldPaths
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#fieldPaths
     */
    @Nullable
    public StringArray getFieldPaths() {
        return obtainWrapped(FIELD_FieldPaths, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldPaths
     * 
     * @see DatasetDocument.Fields#fieldPaths
     */
    public DatasetDocument setFieldPaths(StringArray value, SetMode mode) {
        putWrapped(FIELD_FieldPaths, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldPaths
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#fieldPaths
     */
    public DatasetDocument setFieldPaths(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_FieldPaths, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for hasOwners
     * 
     * @see DatasetDocument.Fields#hasOwners
     */
    public boolean hasHasOwners() {
        return contains(FIELD_HasOwners);
    }

    /**
     * Remover for hasOwners
     * 
     * @see DatasetDocument.Fields#hasOwners
     */
    public void removeHasOwners() {
        remove(FIELD_HasOwners);
    }

    /**
     * Getter for hasOwners
     * 
     * @see DatasetDocument.Fields#hasOwners
     */
    public Boolean isHasOwners(GetMode mode) {
        return obtainDirect(FIELD_HasOwners, Boolean.class, mode);
    }

    /**
     * Getter for hasOwners
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#hasOwners
     */
    @Nullable
    public Boolean isHasOwners() {
        return obtainDirect(FIELD_HasOwners, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for hasOwners
     * 
     * @see DatasetDocument.Fields#hasOwners
     */
    public DatasetDocument setHasOwners(Boolean value, SetMode mode) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for hasOwners
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#hasOwners
     */
    public DatasetDocument setHasOwners(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for hasOwners
     * 
     * @see DatasetDocument.Fields#hasOwners
     */
    public DatasetDocument setHasOwners(boolean value) {
        putDirect(FIELD_HasOwners, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for hasSchema
     * 
     * @see DatasetDocument.Fields#hasSchema
     */
    public boolean hasHasSchema() {
        return contains(FIELD_HasSchema);
    }

    /**
     * Remover for hasSchema
     * 
     * @see DatasetDocument.Fields#hasSchema
     */
    public void removeHasSchema() {
        remove(FIELD_HasSchema);
    }

    /**
     * Getter for hasSchema
     * 
     * @see DatasetDocument.Fields#hasSchema
     */
    public Boolean isHasSchema(GetMode mode) {
        return obtainDirect(FIELD_HasSchema, Boolean.class, mode);
    }

    /**
     * Getter for hasSchema
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#hasSchema
     */
    @Nullable
    public Boolean isHasSchema() {
        return obtainDirect(FIELD_HasSchema, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for hasSchema
     * 
     * @see DatasetDocument.Fields#hasSchema
     */
    public DatasetDocument setHasSchema(Boolean value, SetMode mode) {
        putDirect(FIELD_HasSchema, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for hasSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#hasSchema
     */
    public DatasetDocument setHasSchema(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_HasSchema, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for hasSchema
     * 
     * @see DatasetDocument.Fields#hasSchema
     */
    public DatasetDocument setHasSchema(boolean value) {
        putDirect(FIELD_HasSchema, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for numDownstreamDatasets
     * 
     * @see DatasetDocument.Fields#numDownstreamDatasets
     */
    public boolean hasNumDownstreamDatasets() {
        return contains(FIELD_NumDownstreamDatasets);
    }

    /**
     * Remover for numDownstreamDatasets
     * 
     * @see DatasetDocument.Fields#numDownstreamDatasets
     */
    public void removeNumDownstreamDatasets() {
        remove(FIELD_NumDownstreamDatasets);
    }

    /**
     * Getter for numDownstreamDatasets
     * 
     * @see DatasetDocument.Fields#numDownstreamDatasets
     */
    public Long getNumDownstreamDatasets(GetMode mode) {
        return obtainDirect(FIELD_NumDownstreamDatasets, Long.class, mode);
    }

    /**
     * Getter for numDownstreamDatasets
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#numDownstreamDatasets
     */
    @Nullable
    public Long getNumDownstreamDatasets() {
        return obtainDirect(FIELD_NumDownstreamDatasets, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for numDownstreamDatasets
     * 
     * @see DatasetDocument.Fields#numDownstreamDatasets
     */
    public DatasetDocument setNumDownstreamDatasets(Long value, SetMode mode) {
        putDirect(FIELD_NumDownstreamDatasets, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for numDownstreamDatasets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#numDownstreamDatasets
     */
    public DatasetDocument setNumDownstreamDatasets(
        @Nonnull
        Long value) {
        putDirect(FIELD_NumDownstreamDatasets, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for numDownstreamDatasets
     * 
     * @see DatasetDocument.Fields#numDownstreamDatasets
     */
    public DatasetDocument setNumDownstreamDatasets(long value) {
        putDirect(FIELD_NumDownstreamDatasets, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for upstreams
     * 
     * @see DatasetDocument.Fields#upstreams
     */
    public boolean hasUpstreams() {
        return contains(FIELD_Upstreams);
    }

    /**
     * Remover for upstreams
     * 
     * @see DatasetDocument.Fields#upstreams
     */
    public void removeUpstreams() {
        remove(FIELD_Upstreams);
    }

    /**
     * Getter for upstreams
     * 
     * @see DatasetDocument.Fields#upstreams
     */
    public DatasetUrnArray getUpstreams(GetMode mode) {
        return obtainWrapped(FIELD_Upstreams, DatasetUrnArray.class, mode);
    }

    /**
     * Getter for upstreams
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#upstreams
     */
    @Nullable
    public DatasetUrnArray getUpstreams() {
        return obtainWrapped(FIELD_Upstreams, DatasetUrnArray.class, GetMode.STRICT);
    }

    /**
     * Setter for upstreams
     * 
     * @see DatasetDocument.Fields#upstreams
     */
    public DatasetDocument setUpstreams(DatasetUrnArray value, SetMode mode) {
        putWrapped(FIELD_Upstreams, DatasetUrnArray.class, value, mode);
        return this;
    }

    /**
     * Setter for upstreams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#upstreams
     */
    public DatasetDocument setUpstreams(
        @Nonnull
        DatasetUrnArray value) {
        putWrapped(FIELD_Upstreams, DatasetUrnArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for tags
     * 
     * @see DatasetDocument.Fields#tags
     */
    public boolean hasTags() {
        return contains(FIELD_Tags);
    }

    /**
     * Remover for tags
     * 
     * @see DatasetDocument.Fields#tags
     */
    public void removeTags() {
        remove(FIELD_Tags);
    }

    /**
     * Getter for tags
     * 
     * @see DatasetDocument.Fields#tags
     */
    public StringArray getTags(GetMode mode) {
        return obtainWrapped(FIELD_Tags, StringArray.class, mode);
    }

    /**
     * Getter for tags
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#tags
     */
    @Nullable
    public StringArray getTags() {
        return obtainWrapped(FIELD_Tags, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for tags
     * 
     * @see DatasetDocument.Fields#tags
     */
    public DatasetDocument setTags(StringArray value, SetMode mode) {
        putWrapped(FIELD_Tags, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for tags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#tags
     */
    public DatasetDocument setTags(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Tags, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for fieldDescriptions
     * 
     * @see DatasetDocument.Fields#fieldDescriptions
     */
    public boolean hasFieldDescriptions() {
        return contains(FIELD_FieldDescriptions);
    }

    /**
     * Remover for fieldDescriptions
     * 
     * @see DatasetDocument.Fields#fieldDescriptions
     */
    public void removeFieldDescriptions() {
        remove(FIELD_FieldDescriptions);
    }

    /**
     * Getter for fieldDescriptions
     * 
     * @see DatasetDocument.Fields#fieldDescriptions
     */
    public StringArray getFieldDescriptions(GetMode mode) {
        return obtainWrapped(FIELD_FieldDescriptions, StringArray.class, mode);
    }

    /**
     * Getter for fieldDescriptions
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#fieldDescriptions
     */
    @Nullable
    public StringArray getFieldDescriptions() {
        return obtainWrapped(FIELD_FieldDescriptions, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldDescriptions
     * 
     * @see DatasetDocument.Fields#fieldDescriptions
     */
    public DatasetDocument setFieldDescriptions(StringArray value, SetMode mode) {
        putWrapped(FIELD_FieldDescriptions, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldDescriptions
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#fieldDescriptions
     */
    public DatasetDocument setFieldDescriptions(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_FieldDescriptions, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for fieldTags
     * 
     * @see DatasetDocument.Fields#fieldTags
     */
    public boolean hasFieldTags() {
        return contains(FIELD_FieldTags);
    }

    /**
     * Remover for fieldTags
     * 
     * @see DatasetDocument.Fields#fieldTags
     */
    public void removeFieldTags() {
        remove(FIELD_FieldTags);
    }

    /**
     * Getter for fieldTags
     * 
     * @see DatasetDocument.Fields#fieldTags
     */
    public StringArray getFieldTags(GetMode mode) {
        return obtainWrapped(FIELD_FieldTags, StringArray.class, mode);
    }

    /**
     * Getter for fieldTags
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#fieldTags
     */
    @Nullable
    public StringArray getFieldTags() {
        return obtainWrapped(FIELD_FieldTags, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldTags
     * 
     * @see DatasetDocument.Fields#fieldTags
     */
    public DatasetDocument setFieldTags(StringArray value, SetMode mode) {
        putWrapped(FIELD_FieldTags, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldTags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#fieldTags
     */
    public DatasetDocument setFieldTags(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_FieldTags, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for editedFieldDescriptions
     * 
     * @see DatasetDocument.Fields#editedFieldDescriptions
     */
    public boolean hasEditedFieldDescriptions() {
        return contains(FIELD_EditedFieldDescriptions);
    }

    /**
     * Remover for editedFieldDescriptions
     * 
     * @see DatasetDocument.Fields#editedFieldDescriptions
     */
    public void removeEditedFieldDescriptions() {
        remove(FIELD_EditedFieldDescriptions);
    }

    /**
     * Getter for editedFieldDescriptions
     * 
     * @see DatasetDocument.Fields#editedFieldDescriptions
     */
    public StringArray getEditedFieldDescriptions(GetMode mode) {
        return obtainWrapped(FIELD_EditedFieldDescriptions, StringArray.class, mode);
    }

    /**
     * Getter for editedFieldDescriptions
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#editedFieldDescriptions
     */
    @Nullable
    public StringArray getEditedFieldDescriptions() {
        return obtainWrapped(FIELD_EditedFieldDescriptions, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for editedFieldDescriptions
     * 
     * @see DatasetDocument.Fields#editedFieldDescriptions
     */
    public DatasetDocument setEditedFieldDescriptions(StringArray value, SetMode mode) {
        putWrapped(FIELD_EditedFieldDescriptions, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for editedFieldDescriptions
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#editedFieldDescriptions
     */
    public DatasetDocument setEditedFieldDescriptions(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_EditedFieldDescriptions, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for editedFieldTags
     * 
     * @see DatasetDocument.Fields#editedFieldTags
     */
    public boolean hasEditedFieldTags() {
        return contains(FIELD_EditedFieldTags);
    }

    /**
     * Remover for editedFieldTags
     * 
     * @see DatasetDocument.Fields#editedFieldTags
     */
    public void removeEditedFieldTags() {
        remove(FIELD_EditedFieldTags);
    }

    /**
     * Getter for editedFieldTags
     * 
     * @see DatasetDocument.Fields#editedFieldTags
     */
    public StringArray getEditedFieldTags(GetMode mode) {
        return obtainWrapped(FIELD_EditedFieldTags, StringArray.class, mode);
    }

    /**
     * Getter for editedFieldTags
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#editedFieldTags
     */
    @Nullable
    public StringArray getEditedFieldTags() {
        return obtainWrapped(FIELD_EditedFieldTags, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for editedFieldTags
     * 
     * @see DatasetDocument.Fields#editedFieldTags
     */
    public DatasetDocument setEditedFieldTags(StringArray value, SetMode mode) {
        putWrapped(FIELD_EditedFieldTags, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for editedFieldTags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#editedFieldTags
     */
    public DatasetDocument setEditedFieldTags(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_EditedFieldTags, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for glossaryTerms
     * 
     * @see DatasetDocument.Fields#glossaryTerms
     */
    public boolean hasGlossaryTerms() {
        return contains(FIELD_GlossaryTerms);
    }

    /**
     * Remover for glossaryTerms
     * 
     * @see DatasetDocument.Fields#glossaryTerms
     */
    public void removeGlossaryTerms() {
        remove(FIELD_GlossaryTerms);
    }

    /**
     * Getter for glossaryTerms
     * 
     * @see DatasetDocument.Fields#glossaryTerms
     */
    public StringArray getGlossaryTerms(GetMode mode) {
        return obtainWrapped(FIELD_GlossaryTerms, StringArray.class, mode);
    }

    /**
     * Getter for glossaryTerms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetDocument.Fields#glossaryTerms
     */
    @Nullable
    public StringArray getGlossaryTerms() {
        return obtainWrapped(FIELD_GlossaryTerms, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for glossaryTerms
     * 
     * @see DatasetDocument.Fields#glossaryTerms
     */
    public DatasetDocument setGlossaryTerms(StringArray value, SetMode mode) {
        putWrapped(FIELD_GlossaryTerms, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for glossaryTerms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetDocument.Fields#glossaryTerms
     */
    public DatasetDocument setGlossaryTerms(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_GlossaryTerms, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DatasetDocument clone()
        throws CloneNotSupportedException
    {
        return ((DatasetDocument) super.clone());
    }

    @Override
    public DatasetDocument copy()
        throws CloneNotSupportedException
    {
        return ((DatasetDocument) super.copy());
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
         * Platform name for the dataset
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Fabric type where dataset belongs to or where it was generated
         * 
         */
        public PathSpec origin() {
            return new PathSpec(getPathComponents(), "origin");
        }

        /**
         * LDAP usernames of corp users who are the owners of this dataset
         * 
         */
        public PathSpec owners() {
            return new PathSpec(getPathComponents(), "owners");
        }

        /**
         * LDAP usernames of corp users who are the owners of this dataset
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
         * Flag to indicate if the dataset is deprecated.
         * 
         */
        public PathSpec deprecated() {
            return new PathSpec(getPathComponents(), "deprecated");
        }

        /**
         * Documentation of the dataset.
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Field paths of the dataset
         * 
         */
        public PathSpec fieldPaths() {
            return new PathSpec(getPathComponents(), "fieldPaths");
        }

        /**
         * Field paths of the dataset
         * 
         */
        public PathSpec fieldPaths(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fieldPaths");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Flag to indicate if the dataset has non empty corp users as owners or not.
         * 
         */
        public PathSpec hasOwners() {
            return new PathSpec(getPathComponents(), "hasOwners");
        }

        /**
         * Flag to indicate if the dataset has non-empty schema or not.
         * 
         */
        public PathSpec hasSchema() {
            return new PathSpec(getPathComponents(), "hasSchema");
        }

        /**
         * Lineage information represented by the number of immediate downstream datasets of this dataset.
         * 
         */
        public PathSpec numDownstreamDatasets() {
            return new PathSpec(getPathComponents(), "numDownstreamDatasets");
        }

        /**
         * List of upstreams for this dataset
         * 
         */
        public PathSpec upstreams() {
            return new PathSpec(getPathComponents(), "upstreams");
        }

        /**
         * List of upstreams for this dataset
         * 
         */
        public PathSpec upstreams(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "upstreams");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
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

        /**
         * List of field descriptions
         * 
         */
        public PathSpec fieldDescriptions() {
            return new PathSpec(getPathComponents(), "fieldDescriptions");
        }

        /**
         * List of field descriptions
         * 
         */
        public PathSpec fieldDescriptions(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fieldDescriptions");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of tags applied to fields
         * 
         */
        public PathSpec fieldTags() {
            return new PathSpec(getPathComponents(), "fieldTags");
        }

        /**
         * List of tags applied to fields
         * 
         */
        public PathSpec fieldTags(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fieldTags");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of field descriptions
         * 
         */
        public PathSpec editedFieldDescriptions() {
            return new PathSpec(getPathComponents(), "editedFieldDescriptions");
        }

        /**
         * List of field descriptions
         * 
         */
        public PathSpec editedFieldDescriptions(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "editedFieldDescriptions");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of tags applied to fields
         * 
         */
        public PathSpec editedFieldTags() {
            return new PathSpec(getPathComponents(), "editedFieldTags");
        }

        /**
         * List of tags applied to fields
         * 
         */
        public PathSpec editedFieldTags(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "editedFieldTags");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of terms for this dataset
         * 
         */
        public PathSpec glossaryTerms() {
            return new PathSpec(getPathComponents(), "glossaryTerms");
        }

        /**
         * List of terms for this dataset
         * 
         */
        public PathSpec glossaryTerms(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "glossaryTerms");
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
