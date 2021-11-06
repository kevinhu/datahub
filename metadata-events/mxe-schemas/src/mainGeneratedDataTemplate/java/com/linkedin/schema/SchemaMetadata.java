
package com.linkedin.schema;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.AuditStamp;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;
import com.linkedin.data.template.UnionTemplate;


/**
 * SchemaMetadata to describe metadata related to store schema
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaMetadata.pdl.")
public class SchemaMetadata
    extends RecordTemplate
{

    private final static SchemaMetadata.Fields _fields = new SchemaMetadata.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**SchemaMetadata to describe metadata related to store schema*/@Aspect.name=\"schemaMetadata\"record SchemaMetadata includes/**Key to retrieve schema metadata.*/record SchemaMetadataKey{/**Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking*/@validate.strlen={\"min\":1,\"max\":500}schemaName:string/**Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})*/platform:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataPlatform\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataPlatform\",\"doc\":\"Standardized data platforms available\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platformName\",\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"type\":\"string\",\"maxLength\":25}],\"maxLength\":45}typeref DataPlatformUrn=string}/**Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.*/version:long}{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into various lifecycle stages, and who acted to move it into those lifecycle stages. The recommended best practice is to include this record in your record schema, and annotate its fields as @readOnly in your resource. See https://github.com/linkedin/rest.li/wiki/Validation-in-Rest.li#restli-validation-annotations*/record ChangeAuditStamps{/**An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.*/lastModified:AuditStamp={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.*/deleted:optional AuditStamp}}{/**Dataset this schema metadata is associated with.*/dataset:optional{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**The cluster this schema metadata resides from*/cluster:optional string/**the SHA1 hash of the schema content*/hash:string/**The native schema in the dataset's platform.*/platformSchema:union[/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string}/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}/**Schema text of an ORC schema.*/record OrcSchema{/**The native schema for ORC file format.*/schema:string}/**The dataset has no specific schema associated with it*/record Schemaless{}/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}]/**Client provided a list of fields from document schema.*/fields:array[/**SchemaField to describe metadata related to dataset schema. Schema normalization rules: http://go/tms-schema*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field. For data translation rules refer to wiki page above.*/@Searchable={\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT_PARTIAL\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"fieldName\":\"fieldDescriptions\",\"boostScore\":0.1,\"fieldType\":\"TEXT\"}description:optional string/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Searchable.`/tags/*/tag`={\"fieldName\":\"fieldTags\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}/**Glossary terms associated with the field*/@Searchable.`/terms/*/urn`={\"fieldName\":\"fieldGlossaryTerms\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Searchable={\"fieldName\":\"glossaryTerms\",\"filterNameOverride\":\"Glossary Term\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}]/**Audit stamp containing who reported the related business term*/auditStamp:AuditStamp}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false}]/**Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.*/primaryKeys:optional array[com.linkedin.dataset.SchemaFieldPath]/**Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.*/@deprecated=\"Use foreignKeys instead.\"foreignKeysSpecs:optional map[string/**Description of a foreign key in a schema.*/record ForeignKeySpec{/**Foreign key definition in metadata schema.*/foreignKey:union[/**For non-urn based foregin keys.*/record DatasetFieldForeignKey{/**dataset that stores the resource.*/parentDataset:com.linkedin.common.DatasetUrn/**List of fields in hosting(current) SchemaMetadata that conform a foreign key. List can contain a single entry or multiple entries if several entries in hosting schema conform a foreign key in a single parent dataset.*/currentFieldPaths:array[com.linkedin.dataset.SchemaFieldPath]/**SchemaField@fieldPath that uniquely identify field in parent dataset that this field references.*/parentField:com.linkedin.dataset.SchemaFieldPath}/**If SchemaMetadata fields make any external references and references are of type com.linkedin.common.Urn or any children, this models can be used to mark it.*/record UrnForeignKey{/**Field in hosting(current) SchemaMetadata.*/currentFieldPath:com.linkedin.dataset.SchemaFieldPath}]}]/**List of foreign key constraints for the schema*/foreignKeys:optional array[/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"name\":\"ForeignKeyTo\",\"entityTypes\":[\"schemaField\"]}foreignFields:array[com.linkedin.common.Urn]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"name\":\"ForeignKeyToDataset\",\"entityTypes\":[\"dataset\"]}foreignDataset:com.linkedin.common.Urn}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_SchemaName = SCHEMA.getField("schemaName");
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_LastModified = SCHEMA.getField("lastModified");
    private final static RecordDataSchema.Field FIELD_Deleted = SCHEMA.getField("deleted");
    private final static RecordDataSchema.Field FIELD_Dataset = SCHEMA.getField("dataset");
    private final static RecordDataSchema.Field FIELD_Cluster = SCHEMA.getField("cluster");
    private final static RecordDataSchema.Field FIELD_Hash = SCHEMA.getField("hash");
    private final static RecordDataSchema.Field FIELD_PlatformSchema = SCHEMA.getField("platformSchema");
    private final static RecordDataSchema.Field FIELD_Fields = SCHEMA.getField("fields");
    private final static RecordDataSchema.Field FIELD_PrimaryKeys = SCHEMA.getField("primaryKeys");
    private final static RecordDataSchema.Field FIELD_ForeignKeysSpecs = SCHEMA.getField("foreignKeysSpecs");
    private final static RecordDataSchema.Field FIELD_ForeignKeys = SCHEMA.getField("foreignKeys");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataPlatformUrn.class);
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
    }

    public SchemaMetadata() {
        super(new DataMap(), SCHEMA, 11);
    }

    public SchemaMetadata(DataMap data) {
        super(data, SCHEMA);
    }

    public static SchemaMetadata.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for schemaName
     * 
     * @see SchemaMetadata.Fields#schemaName
     */
    public boolean hasSchemaName() {
        return contains(FIELD_SchemaName);
    }

    /**
     * Remover for schemaName
     * 
     * @see SchemaMetadata.Fields#schemaName
     */
    public void removeSchemaName() {
        remove(FIELD_SchemaName);
    }

    /**
     * Getter for schemaName
     * 
     * @see SchemaMetadata.Fields#schemaName
     */
    public String getSchemaName(GetMode mode) {
        return obtainDirect(FIELD_SchemaName, String.class, mode);
    }

    /**
     * Getter for schemaName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#schemaName
     */
    @Nonnull
    public String getSchemaName() {
        return obtainDirect(FIELD_SchemaName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for schemaName
     * 
     * @see SchemaMetadata.Fields#schemaName
     */
    public SchemaMetadata setSchemaName(String value, SetMode mode) {
        putDirect(FIELD_SchemaName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for schemaName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#schemaName
     */
    public SchemaMetadata setSchemaName(
        @Nonnull
        String value) {
        putDirect(FIELD_SchemaName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for platform
     * 
     * @see SchemaMetadata.Fields#platform
     */
    public boolean hasPlatform() {
        return contains(FIELD_Platform);
    }

    /**
     * Remover for platform
     * 
     * @see SchemaMetadata.Fields#platform
     */
    public void removePlatform() {
        remove(FIELD_Platform);
    }

    /**
     * Getter for platform
     * 
     * @see SchemaMetadata.Fields#platform
     */
    public com.linkedin.common.urn.DataPlatformUrn getPlatform(GetMode mode) {
        return obtainCustomType(FIELD_Platform, com.linkedin.common.urn.DataPlatformUrn.class, mode);
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#platform
     */
    @Nonnull
    public com.linkedin.common.urn.DataPlatformUrn getPlatform() {
        return obtainCustomType(FIELD_Platform, com.linkedin.common.urn.DataPlatformUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for platform
     * 
     * @see SchemaMetadata.Fields#platform
     */
    public SchemaMetadata setPlatform(com.linkedin.common.urn.DataPlatformUrn value, SetMode mode) {
        putCustomType(FIELD_Platform, com.linkedin.common.urn.DataPlatformUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#platform
     */
    public SchemaMetadata setPlatform(
        @Nonnull
        com.linkedin.common.urn.DataPlatformUrn value) {
        putCustomType(FIELD_Platform, com.linkedin.common.urn.DataPlatformUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see SchemaMetadata.Fields#version
     */
    public boolean hasVersion() {
        return contains(FIELD_Version);
    }

    /**
     * Remover for version
     * 
     * @see SchemaMetadata.Fields#version
     */
    public void removeVersion() {
        remove(FIELD_Version);
    }

    /**
     * Getter for version
     * 
     * @see SchemaMetadata.Fields#version
     */
    public Long getVersion(GetMode mode) {
        return obtainDirect(FIELD_Version, Long.class, mode);
    }

    /**
     * Getter for version
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#version
     */
    @Nonnull
    public Long getVersion() {
        return obtainDirect(FIELD_Version, Long.class, GetMode.STRICT);
    }

    /**
     * Setter for version
     * 
     * @see SchemaMetadata.Fields#version
     */
    public SchemaMetadata setVersion(Long value, SetMode mode) {
        putDirect(FIELD_Version, Long.class, Long.class, value, mode);
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#version
     */
    public SchemaMetadata setVersion(
        @Nonnull
        Long value) {
        putDirect(FIELD_Version, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for version
     * 
     * @see SchemaMetadata.Fields#version
     */
    public SchemaMetadata setVersion(long value) {
        putDirect(FIELD_Version, Long.class, Long.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for created
     * 
     * @see SchemaMetadata.Fields#created
     */
    public boolean hasCreated() {
        return contains(FIELD_Created);
    }

    /**
     * Remover for created
     * 
     * @see SchemaMetadata.Fields#created
     */
    public void removeCreated() {
        remove(FIELD_Created);
    }

    /**
     * Getter for created
     * 
     * @see SchemaMetadata.Fields#created
     */
    public AuditStamp getCreated(GetMode mode) {
        return obtainWrapped(FIELD_Created, AuditStamp.class, mode);
    }

    /**
     * Getter for created
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#created
     */
    @Nonnull
    public AuditStamp getCreated() {
        return obtainWrapped(FIELD_Created, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for created
     * 
     * @see SchemaMetadata.Fields#created
     */
    public SchemaMetadata setCreated(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_Created, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#created
     */
    public SchemaMetadata setCreated(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_Created, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for lastModified
     * 
     * @see SchemaMetadata.Fields#lastModified
     */
    public boolean hasLastModified() {
        return contains(FIELD_LastModified);
    }

    /**
     * Remover for lastModified
     * 
     * @see SchemaMetadata.Fields#lastModified
     */
    public void removeLastModified() {
        remove(FIELD_LastModified);
    }

    /**
     * Getter for lastModified
     * 
     * @see SchemaMetadata.Fields#lastModified
     */
    public AuditStamp getLastModified(GetMode mode) {
        return obtainWrapped(FIELD_LastModified, AuditStamp.class, mode);
    }

    /**
     * Getter for lastModified
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#lastModified
     */
    @Nonnull
    public AuditStamp getLastModified() {
        return obtainWrapped(FIELD_LastModified, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for lastModified
     * 
     * @see SchemaMetadata.Fields#lastModified
     */
    public SchemaMetadata setLastModified(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_LastModified, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for lastModified
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#lastModified
     */
    public SchemaMetadata setLastModified(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_LastModified, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for deleted
     * 
     * @see SchemaMetadata.Fields#deleted
     */
    public boolean hasDeleted() {
        return contains(FIELD_Deleted);
    }

    /**
     * Remover for deleted
     * 
     * @see SchemaMetadata.Fields#deleted
     */
    public void removeDeleted() {
        remove(FIELD_Deleted);
    }

    /**
     * Getter for deleted
     * 
     * @see SchemaMetadata.Fields#deleted
     */
    public AuditStamp getDeleted(GetMode mode) {
        return obtainWrapped(FIELD_Deleted, AuditStamp.class, mode);
    }

    /**
     * Getter for deleted
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaMetadata.Fields#deleted
     */
    @Nullable
    public AuditStamp getDeleted() {
        return obtainWrapped(FIELD_Deleted, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for deleted
     * 
     * @see SchemaMetadata.Fields#deleted
     */
    public SchemaMetadata setDeleted(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_Deleted, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for deleted
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#deleted
     */
    public SchemaMetadata setDeleted(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_Deleted, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for dataset
     * 
     * @see SchemaMetadata.Fields#dataset
     */
    public boolean hasDataset() {
        return contains(FIELD_Dataset);
    }

    /**
     * Remover for dataset
     * 
     * @see SchemaMetadata.Fields#dataset
     */
    public void removeDataset() {
        remove(FIELD_Dataset);
    }

    /**
     * Getter for dataset
     * 
     * @see SchemaMetadata.Fields#dataset
     */
    public com.linkedin.common.urn.DatasetUrn getDataset(GetMode mode) {
        return obtainCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, mode);
    }

    /**
     * Getter for dataset
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaMetadata.Fields#dataset
     */
    @Nullable
    public com.linkedin.common.urn.DatasetUrn getDataset() {
        return obtainCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for dataset
     * 
     * @see SchemaMetadata.Fields#dataset
     */
    public SchemaMetadata setDataset(com.linkedin.common.urn.DatasetUrn value, SetMode mode) {
        putCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dataset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#dataset
     */
    public SchemaMetadata setDataset(
        @Nonnull
        com.linkedin.common.urn.DatasetUrn value) {
        putCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for cluster
     * 
     * @see SchemaMetadata.Fields#cluster
     */
    public boolean hasCluster() {
        return contains(FIELD_Cluster);
    }

    /**
     * Remover for cluster
     * 
     * @see SchemaMetadata.Fields#cluster
     */
    public void removeCluster() {
        remove(FIELD_Cluster);
    }

    /**
     * Getter for cluster
     * 
     * @see SchemaMetadata.Fields#cluster
     */
    public String getCluster(GetMode mode) {
        return obtainDirect(FIELD_Cluster, String.class, mode);
    }

    /**
     * Getter for cluster
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaMetadata.Fields#cluster
     */
    @Nullable
    public String getCluster() {
        return obtainDirect(FIELD_Cluster, String.class, GetMode.STRICT);
    }

    /**
     * Setter for cluster
     * 
     * @see SchemaMetadata.Fields#cluster
     */
    public SchemaMetadata setCluster(String value, SetMode mode) {
        putDirect(FIELD_Cluster, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for cluster
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#cluster
     */
    public SchemaMetadata setCluster(
        @Nonnull
        String value) {
        putDirect(FIELD_Cluster, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for hash
     * 
     * @see SchemaMetadata.Fields#hash
     */
    public boolean hasHash() {
        return contains(FIELD_Hash);
    }

    /**
     * Remover for hash
     * 
     * @see SchemaMetadata.Fields#hash
     */
    public void removeHash() {
        remove(FIELD_Hash);
    }

    /**
     * Getter for hash
     * 
     * @see SchemaMetadata.Fields#hash
     */
    public String getHash(GetMode mode) {
        return obtainDirect(FIELD_Hash, String.class, mode);
    }

    /**
     * Getter for hash
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#hash
     */
    @Nonnull
    public String getHash() {
        return obtainDirect(FIELD_Hash, String.class, GetMode.STRICT);
    }

    /**
     * Setter for hash
     * 
     * @see SchemaMetadata.Fields#hash
     */
    public SchemaMetadata setHash(String value, SetMode mode) {
        putDirect(FIELD_Hash, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for hash
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#hash
     */
    public SchemaMetadata setHash(
        @Nonnull
        String value) {
        putDirect(FIELD_Hash, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for platformSchema
     * 
     * @see SchemaMetadata.Fields#platformSchema
     */
    public boolean hasPlatformSchema() {
        return contains(FIELD_PlatformSchema);
    }

    /**
     * Remover for platformSchema
     * 
     * @see SchemaMetadata.Fields#platformSchema
     */
    public void removePlatformSchema() {
        remove(FIELD_PlatformSchema);
    }

    /**
     * Getter for platformSchema
     * 
     * @see SchemaMetadata.Fields#platformSchema
     */
    public SchemaMetadata.PlatformSchema getPlatformSchema(GetMode mode) {
        return obtainWrapped(FIELD_PlatformSchema, SchemaMetadata.PlatformSchema.class, mode);
    }

    /**
     * Getter for platformSchema
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#platformSchema
     */
    @Nonnull
    public SchemaMetadata.PlatformSchema getPlatformSchema() {
        return obtainWrapped(FIELD_PlatformSchema, SchemaMetadata.PlatformSchema.class, GetMode.STRICT);
    }

    /**
     * Setter for platformSchema
     * 
     * @see SchemaMetadata.Fields#platformSchema
     */
    public SchemaMetadata setPlatformSchema(SchemaMetadata.PlatformSchema value, SetMode mode) {
        putWrapped(FIELD_PlatformSchema, SchemaMetadata.PlatformSchema.class, value, mode);
        return this;
    }

    /**
     * Setter for platformSchema
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#platformSchema
     */
    public SchemaMetadata setPlatformSchema(
        @Nonnull
        SchemaMetadata.PlatformSchema value) {
        putWrapped(FIELD_PlatformSchema, SchemaMetadata.PlatformSchema.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for fields
     * 
     * @see SchemaMetadata.Fields#fields
     */
    public boolean hasFields() {
        return contains(FIELD_Fields);
    }

    /**
     * Remover for fields
     * 
     * @see SchemaMetadata.Fields#fields
     */
    public void removeFields() {
        remove(FIELD_Fields);
    }

    /**
     * Getter for fields
     * 
     * @see SchemaMetadata.Fields#fields
     */
    public SchemaFieldArray getFields(GetMode mode) {
        return obtainWrapped(FIELD_Fields, SchemaFieldArray.class, mode);
    }

    /**
     * Getter for fields
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadata.Fields#fields
     */
    @Nonnull
    public SchemaFieldArray getFields() {
        return obtainWrapped(FIELD_Fields, SchemaFieldArray.class, GetMode.STRICT);
    }

    /**
     * Setter for fields
     * 
     * @see SchemaMetadata.Fields#fields
     */
    public SchemaMetadata setFields(SchemaFieldArray value, SetMode mode) {
        putWrapped(FIELD_Fields, SchemaFieldArray.class, value, mode);
        return this;
    }

    /**
     * Setter for fields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#fields
     */
    public SchemaMetadata setFields(
        @Nonnull
        SchemaFieldArray value) {
        putWrapped(FIELD_Fields, SchemaFieldArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for primaryKeys
     * 
     * @see SchemaMetadata.Fields#primaryKeys
     */
    public boolean hasPrimaryKeys() {
        return contains(FIELD_PrimaryKeys);
    }

    /**
     * Remover for primaryKeys
     * 
     * @see SchemaMetadata.Fields#primaryKeys
     */
    public void removePrimaryKeys() {
        remove(FIELD_PrimaryKeys);
    }

    /**
     * Getter for primaryKeys
     * 
     * @see SchemaMetadata.Fields#primaryKeys
     */
    public StringArray getPrimaryKeys(GetMode mode) {
        return obtainWrapped(FIELD_PrimaryKeys, StringArray.class, mode);
    }

    /**
     * Getter for primaryKeys
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaMetadata.Fields#primaryKeys
     */
    @Nullable
    public StringArray getPrimaryKeys() {
        return obtainWrapped(FIELD_PrimaryKeys, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for primaryKeys
     * 
     * @see SchemaMetadata.Fields#primaryKeys
     */
    public SchemaMetadata setPrimaryKeys(StringArray value, SetMode mode) {
        putWrapped(FIELD_PrimaryKeys, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for primaryKeys
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#primaryKeys
     */
    public SchemaMetadata setPrimaryKeys(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_PrimaryKeys, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for foreignKeysSpecs
     * 
     * @deprecated
     *     Use foreignKeys instead.
     * @see SchemaMetadata.Fields#foreignKeysSpecs
     */
    @Deprecated
    public boolean hasForeignKeysSpecs() {
        return contains(FIELD_ForeignKeysSpecs);
    }

    /**
     * Remover for foreignKeysSpecs
     * 
     * @deprecated
     *     Use foreignKeys instead.
     * @see SchemaMetadata.Fields#foreignKeysSpecs
     */
    @Deprecated
    public void removeForeignKeysSpecs() {
        remove(FIELD_ForeignKeysSpecs);
    }

    /**
     * Getter for foreignKeysSpecs
     * 
     * @deprecated
     *     Use foreignKeys instead.
     * @see SchemaMetadata.Fields#foreignKeysSpecs
     */
    @Deprecated
    public ForeignKeySpecMap getForeignKeysSpecs(GetMode mode) {
        return obtainWrapped(FIELD_ForeignKeysSpecs, ForeignKeySpecMap.class, mode);
    }

    /**
     * Getter for foreignKeysSpecs
     * 
     * @return
     *     Optional field. Always check for null.
     * @deprecated
     *     Use foreignKeys instead.
     * @see SchemaMetadata.Fields#foreignKeysSpecs
     */
    @Deprecated
    @Nullable
    public ForeignKeySpecMap getForeignKeysSpecs() {
        return obtainWrapped(FIELD_ForeignKeysSpecs, ForeignKeySpecMap.class, GetMode.STRICT);
    }

    /**
     * Setter for foreignKeysSpecs
     * 
     * @deprecated
     *     Use foreignKeys instead.
     * @see SchemaMetadata.Fields#foreignKeysSpecs
     */
    @Deprecated
    public SchemaMetadata setForeignKeysSpecs(ForeignKeySpecMap value, SetMode mode) {
        putWrapped(FIELD_ForeignKeysSpecs, ForeignKeySpecMap.class, value, mode);
        return this;
    }

    /**
     * Setter for foreignKeysSpecs
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @deprecated
     *     Use foreignKeys instead.
     * @see SchemaMetadata.Fields#foreignKeysSpecs
     */
    @Deprecated
    public SchemaMetadata setForeignKeysSpecs(
        @Nonnull
        ForeignKeySpecMap value) {
        putWrapped(FIELD_ForeignKeysSpecs, ForeignKeySpecMap.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for foreignKeys
     * 
     * @see SchemaMetadata.Fields#foreignKeys
     */
    public boolean hasForeignKeys() {
        return contains(FIELD_ForeignKeys);
    }

    /**
     * Remover for foreignKeys
     * 
     * @see SchemaMetadata.Fields#foreignKeys
     */
    public void removeForeignKeys() {
        remove(FIELD_ForeignKeys);
    }

    /**
     * Getter for foreignKeys
     * 
     * @see SchemaMetadata.Fields#foreignKeys
     */
    public ForeignKeyConstraintArray getForeignKeys(GetMode mode) {
        return obtainWrapped(FIELD_ForeignKeys, ForeignKeyConstraintArray.class, mode);
    }

    /**
     * Getter for foreignKeys
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaMetadata.Fields#foreignKeys
     */
    @Nullable
    public ForeignKeyConstraintArray getForeignKeys() {
        return obtainWrapped(FIELD_ForeignKeys, ForeignKeyConstraintArray.class, GetMode.STRICT);
    }

    /**
     * Setter for foreignKeys
     * 
     * @see SchemaMetadata.Fields#foreignKeys
     */
    public SchemaMetadata setForeignKeys(ForeignKeyConstraintArray value, SetMode mode) {
        putWrapped(FIELD_ForeignKeys, ForeignKeyConstraintArray.class, value, mode);
        return this;
    }

    /**
     * Setter for foreignKeys
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadata.Fields#foreignKeys
     */
    public SchemaMetadata setForeignKeys(
        @Nonnull
        ForeignKeyConstraintArray value) {
        putWrapped(FIELD_ForeignKeys, ForeignKeyConstraintArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SchemaMetadata clone()
        throws CloneNotSupportedException
    {
        return ((SchemaMetadata) super.clone());
    }

    @Override
    public SchemaMetadata copy()
        throws CloneNotSupportedException
    {
        return ((SchemaMetadata) super.copy());
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

        /**
         * An AuditStamp corresponding to the creation of this resource/association/sub-resource. A value of 0 for time indicates missing data.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * An AuditStamp corresponding to the last modification of this resource/association/sub-resource. If no modification has happened since creation, lastModified should be the same as created. A value of 0 for time indicates missing data.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields lastModified() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "lastModified");
        }

        /**
         * An AuditStamp corresponding to the deletion of this resource/association/sub-resource. Logically, deleted MUST have a later timestamp than creation. It may or may not have the same time as lastModified depending upon the resource/association/sub-resource semantics.
         * 
         */
        public com.linkedin.common.AuditStamp.Fields deleted() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "deleted");
        }

        /**
         * Dataset this schema metadata is associated with.
         * 
         */
        public PathSpec dataset() {
            return new PathSpec(getPathComponents(), "dataset");
        }

        /**
         * The cluster this schema metadata resides from
         * 
         */
        public PathSpec cluster() {
            return new PathSpec(getPathComponents(), "cluster");
        }

        /**
         * the SHA1 hash of the schema content
         * 
         */
        public PathSpec hash() {
            return new PathSpec(getPathComponents(), "hash");
        }

        /**
         * The native schema in the dataset's platform.
         * 
         */
        public com.linkedin.schema.SchemaMetadata.PlatformSchema.Fields platformSchema() {
            return new com.linkedin.schema.SchemaMetadata.PlatformSchema.Fields(getPathComponents(), "platformSchema");
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public com.linkedin.schema.SchemaFieldArray.Fields fields() {
            return new com.linkedin.schema.SchemaFieldArray.Fields(getPathComponents(), "fields");
        }

        /**
         * Client provided a list of fields from document schema.
         * 
         */
        public PathSpec fields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.
         * 
         */
        public PathSpec primaryKeys() {
            return new PathSpec(getPathComponents(), "primaryKeys");
        }

        /**
         * Client provided list of fields that define primary keys to access record. Field order defines hierarchical espresso keys. Empty lists indicates absence of primary key access patter. Value is a SchemaField@fieldPath.
         * 
         */
        public PathSpec primaryKeys(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "primaryKeys");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Map captures all the references schema makes to external datasets. Map key is ForeignKeySpecName typeref.
         * 
         * @deprecated
         *     Use foreignKeys instead.
         */
        @Deprecated
        public com.linkedin.schema.ForeignKeySpecMap.Fields foreignKeysSpecs() {
            return new com.linkedin.schema.ForeignKeySpecMap.Fields(getPathComponents(), "foreignKeysSpecs");
        }

        /**
         * List of foreign key constraints for the schema
         * 
         */
        public com.linkedin.schema.ForeignKeyConstraintArray.Fields foreignKeys() {
            return new com.linkedin.schema.ForeignKeyConstraintArray.Fields(getPathComponents(), "foreignKeys");
        }

        /**
         * List of foreign key constraints for the schema
         * 
         */
        public PathSpec foreignKeys(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "foreignKeys");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    @Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaMetadata.pdl.")
    public final static class PlatformSchema
        extends UnionTemplate
    {

        private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.schema/**Schema text of an espresso table schema.*/record EspressoSchema{/**The native espresso document schema.*/documentSchema:string/**The espresso table schema definition.*/tableSchema:string}}{namespace com.linkedin.schema/**Schema holder for oracle data definition language that describes an oracle table.*/record OracleDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}}{namespace com.linkedin.schema/**Schema holder for MySql data definition language that describes an MySql table.*/record MySqlDDL{/**The native schema in the dataset's platform. This is a human readable (json blob) table schema.*/tableSchema:string}}{namespace com.linkedin.schema/**Schema holder for presto data definition language that describes a presto view.*/record PrestoDDL{/**The raw schema in the dataset's platform. This includes the DDL and the columns extracted from DDL.*/rawSchema:string}}{namespace com.linkedin.schema/**Schema holder for kafka schema.*/record KafkaSchema{/**The native kafka document schema. This is a human readable avro document schema.*/documentSchema:string/**The native kafka key schema as retrieved from Schema Registry*/keySchema:optional string}}{namespace com.linkedin.schema/**Schema text of binary JSON schema.*/record BinaryJsonSchema{/**The native schema text for binary JSON file format.*/schema:string}}{namespace com.linkedin.schema/**Schema text of an ORC schema.*/record OrcSchema{/**The native schema for ORC file format.*/schema:string}}{namespace com.linkedin.schema/**The dataset has no specific schema associated with it*/record Schemaless{}}{namespace com.linkedin.schema/**Schema text of a key-value store schema.*/record KeyValueSchema{/**The raw schema for the key in the key-value store.*/keySchema:string/**The raw schema for the value in the key-value store.*/valueSchema:string}}{namespace com.linkedin.schema/**Schema holder for undefined schema types.*/record OtherSchema{/**The native schema in the dataset's platform.*/rawSchema:string}}]", SchemaFormatType.PDL));
        private final static DataSchema MEMBER_EspressoSchema = SCHEMA.getTypeByMemberKey("com.linkedin.schema.EspressoSchema");
        private final static DataSchema MEMBER_OracleDDL = SCHEMA.getTypeByMemberKey("com.linkedin.schema.OracleDDL");
        private final static DataSchema MEMBER_MySqlDDL = SCHEMA.getTypeByMemberKey("com.linkedin.schema.MySqlDDL");
        private final static DataSchema MEMBER_PrestoDDL = SCHEMA.getTypeByMemberKey("com.linkedin.schema.PrestoDDL");
        private final static DataSchema MEMBER_KafkaSchema = SCHEMA.getTypeByMemberKey("com.linkedin.schema.KafkaSchema");
        private final static DataSchema MEMBER_BinaryJsonSchema = SCHEMA.getTypeByMemberKey("com.linkedin.schema.BinaryJsonSchema");
        private final static DataSchema MEMBER_OrcSchema = SCHEMA.getTypeByMemberKey("com.linkedin.schema.OrcSchema");
        private final static DataSchema MEMBER_Schemaless = SCHEMA.getTypeByMemberKey("com.linkedin.schema.Schemaless");
        private final static DataSchema MEMBER_KeyValueSchema = SCHEMA.getTypeByMemberKey("com.linkedin.schema.KeyValueSchema");
        private final static DataSchema MEMBER_OtherSchema = SCHEMA.getTypeByMemberKey("com.linkedin.schema.OtherSchema");

        public PlatformSchema() {
            super(new DataMap(2, 0.75F), SCHEMA);
        }

        public PlatformSchema(Object data) {
            super(data, SCHEMA);
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.EspressoSchema value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setEspressoSchema(value);
            return newUnion;
        }

        public boolean isEspressoSchema() {
            return memberIs("com.linkedin.schema.EspressoSchema");
        }

        public com.linkedin.schema.EspressoSchema getEspressoSchema() {
            return obtainWrapped(MEMBER_EspressoSchema, com.linkedin.schema.EspressoSchema.class, "com.linkedin.schema.EspressoSchema");
        }

        public void setEspressoSchema(com.linkedin.schema.EspressoSchema value) {
            selectWrapped(MEMBER_EspressoSchema, com.linkedin.schema.EspressoSchema.class, "com.linkedin.schema.EspressoSchema", value);
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.OracleDDL value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setOracleDDL(value);
            return newUnion;
        }

        public boolean isOracleDDL() {
            return memberIs("com.linkedin.schema.OracleDDL");
        }

        public com.linkedin.schema.OracleDDL getOracleDDL() {
            return obtainWrapped(MEMBER_OracleDDL, com.linkedin.schema.OracleDDL.class, "com.linkedin.schema.OracleDDL");
        }

        public void setOracleDDL(com.linkedin.schema.OracleDDL value) {
            selectWrapped(MEMBER_OracleDDL, com.linkedin.schema.OracleDDL.class, "com.linkedin.schema.OracleDDL", value);
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.MySqlDDL value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setMySqlDDL(value);
            return newUnion;
        }

        public boolean isMySqlDDL() {
            return memberIs("com.linkedin.schema.MySqlDDL");
        }

        public com.linkedin.schema.MySqlDDL getMySqlDDL() {
            return obtainWrapped(MEMBER_MySqlDDL, com.linkedin.schema.MySqlDDL.class, "com.linkedin.schema.MySqlDDL");
        }

        public void setMySqlDDL(com.linkedin.schema.MySqlDDL value) {
            selectWrapped(MEMBER_MySqlDDL, com.linkedin.schema.MySqlDDL.class, "com.linkedin.schema.MySqlDDL", value);
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.PrestoDDL value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setPrestoDDL(value);
            return newUnion;
        }

        public boolean isPrestoDDL() {
            return memberIs("com.linkedin.schema.PrestoDDL");
        }

        public com.linkedin.schema.PrestoDDL getPrestoDDL() {
            return obtainWrapped(MEMBER_PrestoDDL, com.linkedin.schema.PrestoDDL.class, "com.linkedin.schema.PrestoDDL");
        }

        public void setPrestoDDL(com.linkedin.schema.PrestoDDL value) {
            selectWrapped(MEMBER_PrestoDDL, com.linkedin.schema.PrestoDDL.class, "com.linkedin.schema.PrestoDDL", value);
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.KafkaSchema value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setKafkaSchema(value);
            return newUnion;
        }

        public boolean isKafkaSchema() {
            return memberIs("com.linkedin.schema.KafkaSchema");
        }

        public com.linkedin.schema.KafkaSchema getKafkaSchema() {
            return obtainWrapped(MEMBER_KafkaSchema, com.linkedin.schema.KafkaSchema.class, "com.linkedin.schema.KafkaSchema");
        }

        public void setKafkaSchema(com.linkedin.schema.KafkaSchema value) {
            selectWrapped(MEMBER_KafkaSchema, com.linkedin.schema.KafkaSchema.class, "com.linkedin.schema.KafkaSchema", value);
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.BinaryJsonSchema value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setBinaryJsonSchema(value);
            return newUnion;
        }

        public boolean isBinaryJsonSchema() {
            return memberIs("com.linkedin.schema.BinaryJsonSchema");
        }

        public com.linkedin.schema.BinaryJsonSchema getBinaryJsonSchema() {
            return obtainWrapped(MEMBER_BinaryJsonSchema, com.linkedin.schema.BinaryJsonSchema.class, "com.linkedin.schema.BinaryJsonSchema");
        }

        public void setBinaryJsonSchema(com.linkedin.schema.BinaryJsonSchema value) {
            selectWrapped(MEMBER_BinaryJsonSchema, com.linkedin.schema.BinaryJsonSchema.class, "com.linkedin.schema.BinaryJsonSchema", value);
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.OrcSchema value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setOrcSchema(value);
            return newUnion;
        }

        public boolean isOrcSchema() {
            return memberIs("com.linkedin.schema.OrcSchema");
        }

        public com.linkedin.schema.OrcSchema getOrcSchema() {
            return obtainWrapped(MEMBER_OrcSchema, com.linkedin.schema.OrcSchema.class, "com.linkedin.schema.OrcSchema");
        }

        public void setOrcSchema(com.linkedin.schema.OrcSchema value) {
            selectWrapped(MEMBER_OrcSchema, com.linkedin.schema.OrcSchema.class, "com.linkedin.schema.OrcSchema", value);
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.Schemaless value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setSchemaless(value);
            return newUnion;
        }

        public boolean isSchemaless() {
            return memberIs("com.linkedin.schema.Schemaless");
        }

        public com.linkedin.schema.Schemaless getSchemaless() {
            return obtainWrapped(MEMBER_Schemaless, com.linkedin.schema.Schemaless.class, "com.linkedin.schema.Schemaless");
        }

        public void setSchemaless(com.linkedin.schema.Schemaless value) {
            selectWrapped(MEMBER_Schemaless, com.linkedin.schema.Schemaless.class, "com.linkedin.schema.Schemaless", value);
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.KeyValueSchema value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setKeyValueSchema(value);
            return newUnion;
        }

        public boolean isKeyValueSchema() {
            return memberIs("com.linkedin.schema.KeyValueSchema");
        }

        public com.linkedin.schema.KeyValueSchema getKeyValueSchema() {
            return obtainWrapped(MEMBER_KeyValueSchema, com.linkedin.schema.KeyValueSchema.class, "com.linkedin.schema.KeyValueSchema");
        }

        public void setKeyValueSchema(com.linkedin.schema.KeyValueSchema value) {
            selectWrapped(MEMBER_KeyValueSchema, com.linkedin.schema.KeyValueSchema.class, "com.linkedin.schema.KeyValueSchema", value);
        }

        public static SchemaMetadata.PlatformSchema create(com.linkedin.schema.OtherSchema value) {
            SchemaMetadata.PlatformSchema newUnion = new SchemaMetadata.PlatformSchema();
            newUnion.setOtherSchema(value);
            return newUnion;
        }

        public boolean isOtherSchema() {
            return memberIs("com.linkedin.schema.OtherSchema");
        }

        public com.linkedin.schema.OtherSchema getOtherSchema() {
            return obtainWrapped(MEMBER_OtherSchema, com.linkedin.schema.OtherSchema.class, "com.linkedin.schema.OtherSchema");
        }

        public void setOtherSchema(com.linkedin.schema.OtherSchema value) {
            selectWrapped(MEMBER_OtherSchema, com.linkedin.schema.OtherSchema.class, "com.linkedin.schema.OtherSchema", value);
        }

        @Override
        public SchemaMetadata.PlatformSchema clone()
            throws CloneNotSupportedException
        {
            return ((SchemaMetadata.PlatformSchema) super.clone());
        }

        @Override
        public SchemaMetadata.PlatformSchema copy()
            throws CloneNotSupportedException
        {
            return ((SchemaMetadata.PlatformSchema) super.copy());
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

            public com.linkedin.schema.EspressoSchema.Fields EspressoSchema() {
                return new com.linkedin.schema.EspressoSchema.Fields(getPathComponents(), "com.linkedin.schema.EspressoSchema");
            }

            public com.linkedin.schema.OracleDDL.Fields OracleDDL() {
                return new com.linkedin.schema.OracleDDL.Fields(getPathComponents(), "com.linkedin.schema.OracleDDL");
            }

            public com.linkedin.schema.MySqlDDL.Fields MySqlDDL() {
                return new com.linkedin.schema.MySqlDDL.Fields(getPathComponents(), "com.linkedin.schema.MySqlDDL");
            }

            public com.linkedin.schema.PrestoDDL.Fields PrestoDDL() {
                return new com.linkedin.schema.PrestoDDL.Fields(getPathComponents(), "com.linkedin.schema.PrestoDDL");
            }

            public com.linkedin.schema.KafkaSchema.Fields KafkaSchema() {
                return new com.linkedin.schema.KafkaSchema.Fields(getPathComponents(), "com.linkedin.schema.KafkaSchema");
            }

            public com.linkedin.schema.BinaryJsonSchema.Fields BinaryJsonSchema() {
                return new com.linkedin.schema.BinaryJsonSchema.Fields(getPathComponents(), "com.linkedin.schema.BinaryJsonSchema");
            }

            public com.linkedin.schema.OrcSchema.Fields OrcSchema() {
                return new com.linkedin.schema.OrcSchema.Fields(getPathComponents(), "com.linkedin.schema.OrcSchema");
            }

            public com.linkedin.schema.Schemaless.Fields Schemaless() {
                return new com.linkedin.schema.Schemaless.Fields(getPathComponents(), "com.linkedin.schema.Schemaless");
            }

            public com.linkedin.schema.KeyValueSchema.Fields KeyValueSchema() {
                return new com.linkedin.schema.KeyValueSchema.Fields(getPathComponents(), "com.linkedin.schema.KeyValueSchema");
            }

            public com.linkedin.schema.OtherSchema.Fields OtherSchema() {
                return new com.linkedin.schema.OtherSchema.Fields(getPathComponents(), "com.linkedin.schema.OtherSchema");
            }

        }

    }

}
