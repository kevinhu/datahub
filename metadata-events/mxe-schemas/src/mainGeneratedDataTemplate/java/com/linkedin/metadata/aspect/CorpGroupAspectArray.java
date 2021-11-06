
package com.linkedin.metadata.aspect;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/CorpGroupSnapshot.pdl.")
public class CorpGroupAspectArray
    extends WrappingArrayTemplate<CorpGroupAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string}}{namespace com.linkedin.identity/**group of corpUser, it may contains nested group*/@Aspect={\"name\":\"corpGroupInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"]}record CorpGroupInfo{/**The name to use when displaying the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group*/@Relationship.`/*`={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\"]}admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}]/**List of ldap urn in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpUser\"]}members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpGroup\"]}groups:array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpGroup\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"CorpGroup\",\"doc\":\"Corporate group's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"groupName\",\"doc\":\"The name of the AD/LDAP group.\",\"type\":\"string\",\"maxLength\":64}],\"maxLength\":81}typeref CorpGroupUrn=string}]/**A description of the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"description:optional string}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]]", SchemaFormatType.PDL));

    public CorpGroupAspectArray() {
        this(new DataList());
    }

    public CorpGroupAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public CorpGroupAspectArray(Collection<CorpGroupAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public CorpGroupAspectArray(DataList data) {
        super(data, SCHEMA, CorpGroupAspect.class);
    }

    public CorpGroupAspectArray(CorpGroupAspect first, CorpGroupAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public CorpGroupAspectArray clone()
        throws CloneNotSupportedException
    {
        return ((CorpGroupAspectArray) super.clone());
    }

    @Override
    public CorpGroupAspectArray copy()
        throws CloneNotSupportedException
    {
        return ((CorpGroupAspectArray) super.copy());
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

        public com.linkedin.metadata.aspect.CorpGroupAspect.Fields items() {
            return new com.linkedin.metadata.aspect.CorpGroupAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
