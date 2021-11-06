
package com.linkedin.schema;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.GlobalTags;
import com.linkedin.common.GlossaryTerms;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * SchemaField to describe metadata related to dataset schema. Schema normalization rules: http://go/tms-schema
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaField.pdl.")
public class SchemaField
    extends RecordTemplate
{

    private final static SchemaField.Fields _fields = new SchemaField.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**SchemaField to describe metadata related to dataset schema. Schema normalization rules: http://go/tms-schema*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field. For data translation rules refer to wiki page above.*/@Searchable={\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT_PARTIAL\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"fieldName\":\"fieldDescriptions\",\"boostScore\":0.1,\"fieldType\":\"TEXT\"}description:optional string/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Searchable.`/tags/*/tag`={\"fieldName\":\"fieldTags\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}/**Glossary terms associated with the field*/@Searchable.`/terms/*/urn`={\"fieldName\":\"fieldGlossaryTerms\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Searchable={\"fieldName\":\"glossaryTerms\",\"filterNameOverride\":\"Glossary Term\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}]/**Audit stamp containing who reported the related business term*/auditStamp:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_FieldPath = SCHEMA.getField("fieldPath");
    private final static RecordDataSchema.Field FIELD_JsonPath = SCHEMA.getField("jsonPath");
    private final static RecordDataSchema.Field FIELD_Nullable = SCHEMA.getField("nullable");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_NativeDataType = SCHEMA.getField("nativeDataType");
    private final static RecordDataSchema.Field FIELD_Recursive = SCHEMA.getField("recursive");
    private final static RecordDataSchema.Field FIELD_GlobalTags = SCHEMA.getField("globalTags");
    private final static RecordDataSchema.Field FIELD_GlossaryTerms = SCHEMA.getField("glossaryTerms");
    private final static RecordDataSchema.Field FIELD_IsPartOfKey = SCHEMA.getField("isPartOfKey");

    public SchemaField() {
        super(new DataMap(14, 0.75F), SCHEMA, 4);
    }

    public SchemaField(DataMap data) {
        super(data, SCHEMA);
    }

    public static SchemaField.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for fieldPath
     * 
     * @see SchemaField.Fields#fieldPath
     */
    public boolean hasFieldPath() {
        return contains(FIELD_FieldPath);
    }

    /**
     * Remover for fieldPath
     * 
     * @see SchemaField.Fields#fieldPath
     */
    public void removeFieldPath() {
        remove(FIELD_FieldPath);
    }

    /**
     * Getter for fieldPath
     * 
     * @see SchemaField.Fields#fieldPath
     */
    public String getFieldPath(GetMode mode) {
        return obtainDirect(FIELD_FieldPath, String.class, mode);
    }

    /**
     * Getter for fieldPath
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaField.Fields#fieldPath
     */
    @Nonnull
    public String getFieldPath() {
        return obtainDirect(FIELD_FieldPath, String.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldPath
     * 
     * @see SchemaField.Fields#fieldPath
     */
    public SchemaField setFieldPath(String value, SetMode mode) {
        putDirect(FIELD_FieldPath, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#fieldPath
     */
    public SchemaField setFieldPath(
        @Nonnull
        String value) {
        putDirect(FIELD_FieldPath, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for jsonPath
     * 
     * @see SchemaField.Fields#jsonPath
     */
    public boolean hasJsonPath() {
        return contains(FIELD_JsonPath);
    }

    /**
     * Remover for jsonPath
     * 
     * @see SchemaField.Fields#jsonPath
     */
    public void removeJsonPath() {
        remove(FIELD_JsonPath);
    }

    /**
     * Getter for jsonPath
     * 
     * @see SchemaField.Fields#jsonPath
     */
    public String getJsonPath(GetMode mode) {
        return obtainDirect(FIELD_JsonPath, String.class, mode);
    }

    /**
     * Getter for jsonPath
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaField.Fields#jsonPath
     */
    @Nullable
    public String getJsonPath() {
        return obtainDirect(FIELD_JsonPath, String.class, GetMode.STRICT);
    }

    /**
     * Setter for jsonPath
     * 
     * @see SchemaField.Fields#jsonPath
     */
    public SchemaField setJsonPath(String value, SetMode mode) {
        putDirect(FIELD_JsonPath, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for jsonPath
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#jsonPath
     */
    public SchemaField setJsonPath(
        @Nonnull
        String value) {
        putDirect(FIELD_JsonPath, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for nullable
     * 
     * @see SchemaField.Fields#nullable
     */
    public boolean hasNullable() {
        return contains(FIELD_Nullable);
    }

    /**
     * Remover for nullable
     * 
     * @see SchemaField.Fields#nullable
     */
    public void removeNullable() {
        remove(FIELD_Nullable);
    }

    /**
     * Getter for nullable
     * 
     * @see SchemaField.Fields#nullable
     */
    public Boolean isNullable(GetMode mode) {
        return obtainDirect(FIELD_Nullable, Boolean.class, mode);
    }

    /**
     * Getter for nullable
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaField.Fields#nullable
     */
    @Nonnull
    public Boolean isNullable() {
        return obtainDirect(FIELD_Nullable, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for nullable
     * 
     * @see SchemaField.Fields#nullable
     */
    public SchemaField setNullable(Boolean value, SetMode mode) {
        putDirect(FIELD_Nullable, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for nullable
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#nullable
     */
    public SchemaField setNullable(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Nullable, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for nullable
     * 
     * @see SchemaField.Fields#nullable
     */
    public SchemaField setNullable(boolean value) {
        putDirect(FIELD_Nullable, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see SchemaField.Fields#description
     */
    public boolean hasDescription() {
        return contains(FIELD_Description);
    }

    /**
     * Remover for description
     * 
     * @see SchemaField.Fields#description
     */
    public void removeDescription() {
        remove(FIELD_Description);
    }

    /**
     * Getter for description
     * 
     * @see SchemaField.Fields#description
     */
    public String getDescription(GetMode mode) {
        return obtainDirect(FIELD_Description, String.class, mode);
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaField.Fields#description
     */
    @Nullable
    public String getDescription() {
        return obtainDirect(FIELD_Description, String.class, GetMode.STRICT);
    }

    /**
     * Setter for description
     * 
     * @see SchemaField.Fields#description
     */
    public SchemaField setDescription(String value, SetMode mode) {
        putDirect(FIELD_Description, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#description
     */
    public SchemaField setDescription(
        @Nonnull
        String value) {
        putDirect(FIELD_Description, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see SchemaField.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see SchemaField.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see SchemaField.Fields#type
     */
    public SchemaFieldDataType getType(GetMode mode) {
        return obtainWrapped(FIELD_Type, SchemaFieldDataType.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaField.Fields#type
     */
    @Nonnull
    public SchemaFieldDataType getType() {
        return obtainWrapped(FIELD_Type, SchemaFieldDataType.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see SchemaField.Fields#type
     */
    public SchemaField setType(SchemaFieldDataType value, SetMode mode) {
        putWrapped(FIELD_Type, SchemaFieldDataType.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#type
     */
    public SchemaField setType(
        @Nonnull
        SchemaFieldDataType value) {
        putWrapped(FIELD_Type, SchemaFieldDataType.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for nativeDataType
     * 
     * @see SchemaField.Fields#nativeDataType
     */
    public boolean hasNativeDataType() {
        return contains(FIELD_NativeDataType);
    }

    /**
     * Remover for nativeDataType
     * 
     * @see SchemaField.Fields#nativeDataType
     */
    public void removeNativeDataType() {
        remove(FIELD_NativeDataType);
    }

    /**
     * Getter for nativeDataType
     * 
     * @see SchemaField.Fields#nativeDataType
     */
    public String getNativeDataType(GetMode mode) {
        return obtainDirect(FIELD_NativeDataType, String.class, mode);
    }

    /**
     * Getter for nativeDataType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaField.Fields#nativeDataType
     */
    @Nonnull
    public String getNativeDataType() {
        return obtainDirect(FIELD_NativeDataType, String.class, GetMode.STRICT);
    }

    /**
     * Setter for nativeDataType
     * 
     * @see SchemaField.Fields#nativeDataType
     */
    public SchemaField setNativeDataType(String value, SetMode mode) {
        putDirect(FIELD_NativeDataType, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for nativeDataType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#nativeDataType
     */
    public SchemaField setNativeDataType(
        @Nonnull
        String value) {
        putDirect(FIELD_NativeDataType, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for recursive
     * 
     * @see SchemaField.Fields#recursive
     */
    public boolean hasRecursive() {
        return contains(FIELD_Recursive);
    }

    /**
     * Remover for recursive
     * 
     * @see SchemaField.Fields#recursive
     */
    public void removeRecursive() {
        remove(FIELD_Recursive);
    }

    /**
     * Getter for recursive
     * 
     * @see SchemaField.Fields#recursive
     */
    public Boolean isRecursive(GetMode mode) {
        return obtainDirect(FIELD_Recursive, Boolean.class, mode);
    }

    /**
     * Getter for recursive
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaField.Fields#recursive
     */
    @Nonnull
    public Boolean isRecursive() {
        return obtainDirect(FIELD_Recursive, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for recursive
     * 
     * @see SchemaField.Fields#recursive
     */
    public SchemaField setRecursive(Boolean value, SetMode mode) {
        putDirect(FIELD_Recursive, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for recursive
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#recursive
     */
    public SchemaField setRecursive(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_Recursive, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for recursive
     * 
     * @see SchemaField.Fields#recursive
     */
    public SchemaField setRecursive(boolean value) {
        putDirect(FIELD_Recursive, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for globalTags
     * 
     * @see SchemaField.Fields#globalTags
     */
    public boolean hasGlobalTags() {
        return contains(FIELD_GlobalTags);
    }

    /**
     * Remover for globalTags
     * 
     * @see SchemaField.Fields#globalTags
     */
    public void removeGlobalTags() {
        remove(FIELD_GlobalTags);
    }

    /**
     * Getter for globalTags
     * 
     * @see SchemaField.Fields#globalTags
     */
    public GlobalTags getGlobalTags(GetMode mode) {
        return obtainWrapped(FIELD_GlobalTags, GlobalTags.class, mode);
    }

    /**
     * Getter for globalTags
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaField.Fields#globalTags
     */
    @Nullable
    public GlobalTags getGlobalTags() {
        return obtainWrapped(FIELD_GlobalTags, GlobalTags.class, GetMode.STRICT);
    }

    /**
     * Setter for globalTags
     * 
     * @see SchemaField.Fields#globalTags
     */
    public SchemaField setGlobalTags(GlobalTags value, SetMode mode) {
        putWrapped(FIELD_GlobalTags, GlobalTags.class, value, mode);
        return this;
    }

    /**
     * Setter for globalTags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#globalTags
     */
    public SchemaField setGlobalTags(
        @Nonnull
        GlobalTags value) {
        putWrapped(FIELD_GlobalTags, GlobalTags.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for glossaryTerms
     * 
     * @see SchemaField.Fields#glossaryTerms
     */
    public boolean hasGlossaryTerms() {
        return contains(FIELD_GlossaryTerms);
    }

    /**
     * Remover for glossaryTerms
     * 
     * @see SchemaField.Fields#glossaryTerms
     */
    public void removeGlossaryTerms() {
        remove(FIELD_GlossaryTerms);
    }

    /**
     * Getter for glossaryTerms
     * 
     * @see SchemaField.Fields#glossaryTerms
     */
    public GlossaryTerms getGlossaryTerms(GetMode mode) {
        return obtainWrapped(FIELD_GlossaryTerms, GlossaryTerms.class, mode);
    }

    /**
     * Getter for glossaryTerms
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SchemaField.Fields#glossaryTerms
     */
    @Nullable
    public GlossaryTerms getGlossaryTerms() {
        return obtainWrapped(FIELD_GlossaryTerms, GlossaryTerms.class, GetMode.STRICT);
    }

    /**
     * Setter for glossaryTerms
     * 
     * @see SchemaField.Fields#glossaryTerms
     */
    public SchemaField setGlossaryTerms(GlossaryTerms value, SetMode mode) {
        putWrapped(FIELD_GlossaryTerms, GlossaryTerms.class, value, mode);
        return this;
    }

    /**
     * Setter for glossaryTerms
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#glossaryTerms
     */
    public SchemaField setGlossaryTerms(
        @Nonnull
        GlossaryTerms value) {
        putWrapped(FIELD_GlossaryTerms, GlossaryTerms.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for isPartOfKey
     * 
     * @see SchemaField.Fields#isPartOfKey
     */
    public boolean hasIsPartOfKey() {
        return contains(FIELD_IsPartOfKey);
    }

    /**
     * Remover for isPartOfKey
     * 
     * @see SchemaField.Fields#isPartOfKey
     */
    public void removeIsPartOfKey() {
        remove(FIELD_IsPartOfKey);
    }

    /**
     * Getter for isPartOfKey
     * 
     * @see SchemaField.Fields#isPartOfKey
     */
    public Boolean isIsPartOfKey(GetMode mode) {
        return obtainDirect(FIELD_IsPartOfKey, Boolean.class, mode);
    }

    /**
     * Getter for isPartOfKey
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaField.Fields#isPartOfKey
     */
    @Nonnull
    public Boolean isIsPartOfKey() {
        return obtainDirect(FIELD_IsPartOfKey, Boolean.class, GetMode.STRICT);
    }

    /**
     * Setter for isPartOfKey
     * 
     * @see SchemaField.Fields#isPartOfKey
     */
    public SchemaField setIsPartOfKey(Boolean value, SetMode mode) {
        putDirect(FIELD_IsPartOfKey, Boolean.class, Boolean.class, value, mode);
        return this;
    }

    /**
     * Setter for isPartOfKey
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaField.Fields#isPartOfKey
     */
    public SchemaField setIsPartOfKey(
        @Nonnull
        Boolean value) {
        putDirect(FIELD_IsPartOfKey, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Setter for isPartOfKey
     * 
     * @see SchemaField.Fields#isPartOfKey
     */
    public SchemaField setIsPartOfKey(boolean value) {
        putDirect(FIELD_IsPartOfKey, Boolean.class, Boolean.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SchemaField clone()
        throws CloneNotSupportedException
    {
        return ((SchemaField) super.clone());
    }

    @Override
    public SchemaField copy()
        throws CloneNotSupportedException
    {
        return ((SchemaField) super.copy());
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
         * Flattened name of the field. Field is computed from jsonPath field. For data translation rules refer to wiki page above.
         * 
         */
        public PathSpec fieldPath() {
            return new PathSpec(getPathComponents(), "fieldPath");
        }

        /**
         * Flattened name of a field in JSON Path notation.
         * 
         */
        public PathSpec jsonPath() {
            return new PathSpec(getPathComponents(), "jsonPath");
        }

        /**
         * Indicates if this field is optional or nullable
         * 
         */
        public PathSpec nullable() {
            return new PathSpec(getPathComponents(), "nullable");
        }

        /**
         * Description
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Platform independent field type of the field.
         * 
         */
        public com.linkedin.schema.SchemaFieldDataType.Fields type() {
            return new com.linkedin.schema.SchemaFieldDataType.Fields(getPathComponents(), "type");
        }

        /**
         * The native type of the field in the dataset's platform as declared by platform schema.
         * 
         */
        public PathSpec nativeDataType() {
            return new PathSpec(getPathComponents(), "nativeDataType");
        }

        /**
         * There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.
         * 
         */
        public PathSpec recursive() {
            return new PathSpec(getPathComponents(), "recursive");
        }

        /**
         * Tags associated with the field
         * 
         */
        public com.linkedin.common.GlobalTags.Fields globalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "globalTags");
        }

        /**
         * Glossary terms associated with the field
         * 
         */
        public com.linkedin.common.GlossaryTerms.Fields glossaryTerms() {
            return new com.linkedin.common.GlossaryTerms.Fields(getPathComponents(), "glossaryTerms");
        }

        /**
         * For schema fields that are part of complex keys, set this field to true
         * We do this to easily distinguish between value and key fields
         * 
         */
        public PathSpec isPartOfKey() {
            return new PathSpec(getPathComponents(), "isPartOfKey");
        }

    }

}
