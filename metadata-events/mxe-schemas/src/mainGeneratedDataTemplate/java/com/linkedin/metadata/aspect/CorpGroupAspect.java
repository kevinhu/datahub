
package com.linkedin.metadata.aspect;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/CorpGroupAspect.pdl.")
public class CorpGroupAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string}}{namespace com.linkedin.identity/**group of corpUser, it may contains nested group*/@Aspect={\"name\":\"corpGroupInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"]}record CorpGroupInfo{/**The name to use when displaying the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group*/@Relationship.`/*`={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\"]}admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}]/**List of ldap urn in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpUser\"]}members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpGroup\"]}groups:array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpGroup\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"CorpGroup\",\"doc\":\"Corporate group's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"groupName\",\"doc\":\"The name of the AD/LDAP group.\",\"type\":\"string\",\"maxLength\":64}],\"maxLength\":81}typeref CorpGroupUrn=string}]/**A description of the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"description:optional string}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_CorpGroupKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.CorpGroupKey");
    private final static DataSchema MEMBER_CorpGroupInfo = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpGroupInfo");
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    private final static TyperefInfo TYPEREFINFO = new CorpGroupAspect.UnionTyperefInfo();

    public CorpGroupAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public CorpGroupAspect(Object data) {
        super(data, SCHEMA);
    }

    public static CorpGroupAspect create(com.linkedin.metadata.key.CorpGroupKey value) {
        CorpGroupAspect newUnion = new CorpGroupAspect();
        newUnion.setCorpGroupKey(value);
        return newUnion;
    }

    public boolean isCorpGroupKey() {
        return memberIs("com.linkedin.metadata.key.CorpGroupKey");
    }

    public com.linkedin.metadata.key.CorpGroupKey getCorpGroupKey() {
        return obtainWrapped(MEMBER_CorpGroupKey, com.linkedin.metadata.key.CorpGroupKey.class, "com.linkedin.metadata.key.CorpGroupKey");
    }

    public void setCorpGroupKey(com.linkedin.metadata.key.CorpGroupKey value) {
        selectWrapped(MEMBER_CorpGroupKey, com.linkedin.metadata.key.CorpGroupKey.class, "com.linkedin.metadata.key.CorpGroupKey", value);
    }

    public static CorpGroupAspect create(com.linkedin.identity.CorpGroupInfo value) {
        CorpGroupAspect newUnion = new CorpGroupAspect();
        newUnion.setCorpGroupInfo(value);
        return newUnion;
    }

    public boolean isCorpGroupInfo() {
        return memberIs("com.linkedin.identity.CorpGroupInfo");
    }

    public com.linkedin.identity.CorpGroupInfo getCorpGroupInfo() {
        return obtainWrapped(MEMBER_CorpGroupInfo, com.linkedin.identity.CorpGroupInfo.class, "com.linkedin.identity.CorpGroupInfo");
    }

    public void setCorpGroupInfo(com.linkedin.identity.CorpGroupInfo value) {
        selectWrapped(MEMBER_CorpGroupInfo, com.linkedin.identity.CorpGroupInfo.class, "com.linkedin.identity.CorpGroupInfo", value);
    }

    public static CorpGroupAspect create(com.linkedin.common.GlobalTags value) {
        CorpGroupAspect newUnion = new CorpGroupAspect();
        newUnion.setGlobalTags(value);
        return newUnion;
    }

    public boolean isGlobalTags() {
        return memberIs("com.linkedin.common.GlobalTags");
    }

    public com.linkedin.common.GlobalTags getGlobalTags() {
        return obtainWrapped(MEMBER_GlobalTags, com.linkedin.common.GlobalTags.class, "com.linkedin.common.GlobalTags");
    }

    public void setGlobalTags(com.linkedin.common.GlobalTags value) {
        selectWrapped(MEMBER_GlobalTags, com.linkedin.common.GlobalTags.class, "com.linkedin.common.GlobalTags", value);
    }

    public static CorpGroupAspect create(com.linkedin.common.Status value) {
        CorpGroupAspect newUnion = new CorpGroupAspect();
        newUnion.setStatus(value);
        return newUnion;
    }

    public boolean isStatus() {
        return memberIs("com.linkedin.common.Status");
    }

    public com.linkedin.common.Status getStatus() {
        return obtainWrapped(MEMBER_Status, com.linkedin.common.Status.class, "com.linkedin.common.Status");
    }

    public void setStatus(com.linkedin.common.Status value) {
        selectWrapped(MEMBER_Status, com.linkedin.common.Status.class, "com.linkedin.common.Status", value);
    }

    @Override
    public CorpGroupAspect clone()
        throws CloneNotSupportedException
    {
        return ((CorpGroupAspect) super.clone());
    }

    @Override
    public CorpGroupAspect copy()
        throws CloneNotSupportedException
    {
        return ((CorpGroupAspect) super.copy());
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
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

        public com.linkedin.metadata.key.CorpGroupKey.Fields CorpGroupKey() {
            return new com.linkedin.metadata.key.CorpGroupKey.Fields(getPathComponents(), "com.linkedin.metadata.key.CorpGroupKey");
        }

        public com.linkedin.identity.CorpGroupInfo.Fields CorpGroupInfo() {
            return new com.linkedin.identity.CorpGroupInfo.Fields(getPathComponents(), "com.linkedin.identity.CorpGroupInfo");
        }

        public com.linkedin.common.GlobalTags.Fields GlobalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "com.linkedin.common.GlobalTags");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

    }


    /**
     * A union of all supported metadata aspects for a CorpGroup
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a CorpGroup*/typeref CorpGroupAspect=union[{namespace com.linkedin.metadata.key/**Key for a CorpGroup*/@Aspect.name=\"corpGroupKey\"record CorpGroupKey{/**The URL-encoded name of the AD/LDAP group. Serves as a globally unique identifier within DataHub.*/@Searchable.fieldType=\"TEXT_PARTIAL\"name:string}}{namespace com.linkedin.identity/**group of corpUser, it may contains nested group*/@Aspect={\"name\":\"corpGroupInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpGroupUrn\"]}record CorpGroupInfo{/**The name to use when displaying the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"displayName:optional string/**email of this group*/email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**owners of this group*/@Relationship.`/*`={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\"]}admins:array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}]/**List of ldap urn in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpUser\"]}members:array[com.linkedin.common.CorpuserUrn]/**List of groups in this group.*/@Relationship.`/*`={\"name\":\"IsPartOf\",\"entityTypes\":[\"corpGroup\"]}groups:array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpGroup\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"CorpGroup\",\"doc\":\"Corporate group's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"groupName\",\"doc\":\"The name of the AD/LDAP group.\",\"type\":\"string\",\"maxLength\":64}],\"maxLength\":81}typeref CorpGroupUrn=string}]/**A description of the group.*/@Searchable.fieldType=\"TEXT_PARTIAL\"description:optional string}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
