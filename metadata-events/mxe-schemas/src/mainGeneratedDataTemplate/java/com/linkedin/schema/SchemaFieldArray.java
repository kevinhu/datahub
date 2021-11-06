
package com.linkedin.schema;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaMetadata.pdl.")
public class SchemaFieldArray
    extends WrappingArrayTemplate<SchemaField>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.schema/**SchemaField to describe metadata related to dataset schema. Schema normalization rules: http://go/tms-schema*/record SchemaField{/**Flattened name of the field. Field is computed from jsonPath field. For data translation rules refer to wiki page above.*/@Searchable={\"fieldName\":\"fieldPaths\",\"fieldType\":\"TEXT_PARTIAL\"}fieldPath:{namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string}/**Flattened name of a field in JSON Path notation.*/jsonPath:optional string/**Indicates if this field is optional or nullable*/nullable:boolean=false/**Description*/@Searchable={\"fieldName\":\"fieldDescriptions\",\"boostScore\":0.1,\"fieldType\":\"TEXT\"}description:optional string/**Platform independent field type of the field.*/type:/**Schema field data types*/record SchemaFieldDataType{/**Data platform specific types*/type:union[/**Boolean field type.*/record BooleanType{}/**Fixed field type.*/record FixedType{}/**String field type.*/record StringType{}/**Bytes field type.*/record BytesType{}/**Number data type: long, integer, short, etc..*/record NumberType{}/**Date field type.*/record DateType{}/**Time field type. This should also be used for datetimes.*/record TimeType{}/**Enum field type.*/record EnumType{}/**Null field type.*/record NullType{}/**Map field type.*/record MapType{/**Key type in a map*/keyType:optional string/**Type of the value in a map*/valueType:optional string}/**Array field type.*/record ArrayType{/**List of types this array holds.*/nestedType:optional array[string]}/**Union field type.*/record UnionType{/**List of types in union type.*/nestedTypes:optional array[string]}/**Record field type.*/record RecordType{}]}/**The native type of the field in the dataset's platform as declared by platform schema.*/nativeDataType:string/**There are use cases when a field in type B references type A. A field in A references field of type B. In such cases, we will mark the first field as recursive.*/recursive:boolean=false/**Tags associated with the field*/@Searchable.`/tags/*/tag`={\"fieldName\":\"fieldTags\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}globalTags:optional{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}/**Glossary terms associated with the field*/@Searchable.`/terms/*/urn`={\"fieldName\":\"fieldGlossaryTerms\",\"boostScore\":0.5,\"fieldType\":\"URN_PARTIAL\"}glossaryTerms:optional{namespace com.linkedin.common/**Related business terms information*/@Aspect.name=\"glossaryTerms\"record GlossaryTerms{/**The related business terms*/terms:array[/**Properties of an applied glossary term.*/record GlossaryTermAssociation{/**Urn of the applied glossary term*/@Searchable={\"fieldName\":\"glossaryTerms\",\"filterNameOverride\":\"Glossary Term\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}urn:/**Business Term*/@java.class=\"com.linkedin.common.urn.GlossaryTermUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"glossaryTerm\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"GlossaryTerm\",\"doc\":\"business term\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"The name of business term with hierarchy.\",\"type\":\"string\"}],\"maxLength\":56}typeref GlossaryTermUrn=string}]/**Audit stamp containing who reported the related business term*/auditStamp:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}}/**For schema fields that are part of complex keys, set this field to true\nWe do this to easily distinguish between value and key fields*/isPartOfKey:boolean=false}}]", SchemaFormatType.PDL));

    public SchemaFieldArray() {
        this(new DataList());
    }

    public SchemaFieldArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public SchemaFieldArray(Collection<SchemaField> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public SchemaFieldArray(DataList data) {
        super(data, SCHEMA, SchemaField.class);
    }

    public SchemaFieldArray(SchemaField first, SchemaField... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public SchemaFieldArray clone()
        throws CloneNotSupportedException
    {
        return ((SchemaFieldArray) super.clone());
    }

    @Override
    public SchemaFieldArray copy()
        throws CloneNotSupportedException
    {
        return ((SchemaFieldArray) super.copy());
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

        public com.linkedin.schema.SchemaField.Fields items() {
            return new com.linkedin.schema.SchemaField.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
