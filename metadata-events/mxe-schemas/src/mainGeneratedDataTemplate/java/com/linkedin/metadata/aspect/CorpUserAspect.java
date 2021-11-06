
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/CorpUserAspect.pdl.")
public class CorpUserAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a CorpUser*/@Aspect.name=\"corpUserKey\"record CorpUserKey{/**The name of the AD/LDAP user.*/@Searchable={\"enableAutocomplete\":true,\"fieldName\":\"ldap\",\"boostScore\":2.0,\"fieldType\":\"TEXT_PARTIAL\"}username:string}}{namespace com.linkedin.identity/**Linkedin corp user information*/@Aspect={\"name\":\"corpUserInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"]}record CorpUserInfo{/**Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/@Searchable={\"weightsPerFieldValue\":{\"true\":2.0},\"fieldType\":\"BOOLEAN\"}active:boolean/**displayName of this user ,  e.g.  Hang Zhang(DataHQ)*/displayName:optional string/**email address of this user*/@Searchable={\"queryByDefault\":true,\"fieldType\":\"KEYWORD\"}email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**title of this user*/@Searchable={\"queryByDefault\":true,\"fieldType\":\"KEYWORD\"}title:optional string/**direct manager of this user*/@Relationship={\"name\":\"ReportsTo\",\"entityTypes\":[\"corpUser\"]}@Searchable={\"fieldName\":\"managerLdap\",\"queryByDefault\":true,\"fieldType\":\"URN\"}managerUrn:optional{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}/**department id this user belong to*/departmentId:optional long/**department name this user belong to*/departmentName:optional string/**first name of this user*/firstName:optional string/**last name of this user*/lastName:optional string/**Common name of this user, format is firstName + lastName (split by a whitespace)*/@Searchable={\"boostScore\":10.0,\"queryByDefault\":true,\"fieldType\":\"TEXT_PARTIAL\"}fullName:optional string/**two uppercase letters country code. e.g.  US*/countryCode:optional string}}{namespace com.linkedin.identity/**Linkedin corp user information that can be edited from UI*/@Aspect={\"name\":\"corpUserEditableInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"]}record CorpUserEditableInfo{/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/@Searchable.`/*`.fieldType=\"TEXT\"teams:array[string]=[]/**Skills that the user possesses e.g. Machine Learning*/@Searchable.`/*`.fieldType=\"TEXT\"skills:array[string]=[]/**A URL which points to a picture which user wants to set as a profile photo*/pictureLink:{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}=\"https://raw.githubusercontent.com/linkedin/datahub/master/datahub-web-react/src/images/default_avatar.png\"}}{namespace com.linkedin.identity/**The status of the user, e.g. provisioned, active, suspended, etc.*/@Aspect.name=\"corpUserStatus\"record CorpUserStatus{/**Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED*/@Searchable.fieldType=\"KEYWORD\"status:string/**Audit stamp containing who last modified the status and when.*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}}}{namespace com.linkedin.identity/**Carries information about the CorpGroups a user is in.*/@Aspect.name=\"groupMembership\"record GroupMembership{@Relationship.`/*`={\"name\":\"IsMemberOfGroup\",\"entityTypes\":[\"corpGroup\"]}groups:array[com.linkedin.common.Urn]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_CorpUserKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.CorpUserKey");
    private final static DataSchema MEMBER_CorpUserInfo = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpUserInfo");
    private final static DataSchema MEMBER_CorpUserEditableInfo = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpUserEditableInfo");
    private final static DataSchema MEMBER_CorpUserStatus = SCHEMA.getTypeByMemberKey("com.linkedin.identity.CorpUserStatus");
    private final static DataSchema MEMBER_GroupMembership = SCHEMA.getTypeByMemberKey("com.linkedin.identity.GroupMembership");
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    private final static TyperefInfo TYPEREFINFO = new CorpUserAspect.UnionTyperefInfo();

    public CorpUserAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public CorpUserAspect(Object data) {
        super(data, SCHEMA);
    }

    public static CorpUserAspect create(com.linkedin.metadata.key.CorpUserKey value) {
        CorpUserAspect newUnion = new CorpUserAspect();
        newUnion.setCorpUserKey(value);
        return newUnion;
    }

    public boolean isCorpUserKey() {
        return memberIs("com.linkedin.metadata.key.CorpUserKey");
    }

    public com.linkedin.metadata.key.CorpUserKey getCorpUserKey() {
        return obtainWrapped(MEMBER_CorpUserKey, com.linkedin.metadata.key.CorpUserKey.class, "com.linkedin.metadata.key.CorpUserKey");
    }

    public void setCorpUserKey(com.linkedin.metadata.key.CorpUserKey value) {
        selectWrapped(MEMBER_CorpUserKey, com.linkedin.metadata.key.CorpUserKey.class, "com.linkedin.metadata.key.CorpUserKey", value);
    }

    public static CorpUserAspect create(com.linkedin.identity.CorpUserInfo value) {
        CorpUserAspect newUnion = new CorpUserAspect();
        newUnion.setCorpUserInfo(value);
        return newUnion;
    }

    public boolean isCorpUserInfo() {
        return memberIs("com.linkedin.identity.CorpUserInfo");
    }

    public com.linkedin.identity.CorpUserInfo getCorpUserInfo() {
        return obtainWrapped(MEMBER_CorpUserInfo, com.linkedin.identity.CorpUserInfo.class, "com.linkedin.identity.CorpUserInfo");
    }

    public void setCorpUserInfo(com.linkedin.identity.CorpUserInfo value) {
        selectWrapped(MEMBER_CorpUserInfo, com.linkedin.identity.CorpUserInfo.class, "com.linkedin.identity.CorpUserInfo", value);
    }

    public static CorpUserAspect create(com.linkedin.identity.CorpUserEditableInfo value) {
        CorpUserAspect newUnion = new CorpUserAspect();
        newUnion.setCorpUserEditableInfo(value);
        return newUnion;
    }

    public boolean isCorpUserEditableInfo() {
        return memberIs("com.linkedin.identity.CorpUserEditableInfo");
    }

    public com.linkedin.identity.CorpUserEditableInfo getCorpUserEditableInfo() {
        return obtainWrapped(MEMBER_CorpUserEditableInfo, com.linkedin.identity.CorpUserEditableInfo.class, "com.linkedin.identity.CorpUserEditableInfo");
    }

    public void setCorpUserEditableInfo(com.linkedin.identity.CorpUserEditableInfo value) {
        selectWrapped(MEMBER_CorpUserEditableInfo, com.linkedin.identity.CorpUserEditableInfo.class, "com.linkedin.identity.CorpUserEditableInfo", value);
    }

    public static CorpUserAspect create(com.linkedin.identity.CorpUserStatus value) {
        CorpUserAspect newUnion = new CorpUserAspect();
        newUnion.setCorpUserStatus(value);
        return newUnion;
    }

    public boolean isCorpUserStatus() {
        return memberIs("com.linkedin.identity.CorpUserStatus");
    }

    public com.linkedin.identity.CorpUserStatus getCorpUserStatus() {
        return obtainWrapped(MEMBER_CorpUserStatus, com.linkedin.identity.CorpUserStatus.class, "com.linkedin.identity.CorpUserStatus");
    }

    public void setCorpUserStatus(com.linkedin.identity.CorpUserStatus value) {
        selectWrapped(MEMBER_CorpUserStatus, com.linkedin.identity.CorpUserStatus.class, "com.linkedin.identity.CorpUserStatus", value);
    }

    public static CorpUserAspect create(com.linkedin.identity.GroupMembership value) {
        CorpUserAspect newUnion = new CorpUserAspect();
        newUnion.setGroupMembership(value);
        return newUnion;
    }

    public boolean isGroupMembership() {
        return memberIs("com.linkedin.identity.GroupMembership");
    }

    public com.linkedin.identity.GroupMembership getGroupMembership() {
        return obtainWrapped(MEMBER_GroupMembership, com.linkedin.identity.GroupMembership.class, "com.linkedin.identity.GroupMembership");
    }

    public void setGroupMembership(com.linkedin.identity.GroupMembership value) {
        selectWrapped(MEMBER_GroupMembership, com.linkedin.identity.GroupMembership.class, "com.linkedin.identity.GroupMembership", value);
    }

    public static CorpUserAspect create(com.linkedin.common.GlobalTags value) {
        CorpUserAspect newUnion = new CorpUserAspect();
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

    public static CorpUserAspect create(com.linkedin.common.Status value) {
        CorpUserAspect newUnion = new CorpUserAspect();
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
    public CorpUserAspect clone()
        throws CloneNotSupportedException
    {
        return ((CorpUserAspect) super.clone());
    }

    @Override
    public CorpUserAspect copy()
        throws CloneNotSupportedException
    {
        return ((CorpUserAspect) super.copy());
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

        public com.linkedin.metadata.key.CorpUserKey.Fields CorpUserKey() {
            return new com.linkedin.metadata.key.CorpUserKey.Fields(getPathComponents(), "com.linkedin.metadata.key.CorpUserKey");
        }

        public com.linkedin.identity.CorpUserInfo.Fields CorpUserInfo() {
            return new com.linkedin.identity.CorpUserInfo.Fields(getPathComponents(), "com.linkedin.identity.CorpUserInfo");
        }

        public com.linkedin.identity.CorpUserEditableInfo.Fields CorpUserEditableInfo() {
            return new com.linkedin.identity.CorpUserEditableInfo.Fields(getPathComponents(), "com.linkedin.identity.CorpUserEditableInfo");
        }

        public com.linkedin.identity.CorpUserStatus.Fields CorpUserStatus() {
            return new com.linkedin.identity.CorpUserStatus.Fields(getPathComponents(), "com.linkedin.identity.CorpUserStatus");
        }

        public com.linkedin.identity.GroupMembership.Fields GroupMembership() {
            return new com.linkedin.identity.GroupMembership.Fields(getPathComponents(), "com.linkedin.identity.GroupMembership");
        }

        public com.linkedin.common.GlobalTags.Fields GlobalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "com.linkedin.common.GlobalTags");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

    }


    /**
     * A union of all supported metadata aspects for a CorpUser
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a CorpUser*/typeref CorpUserAspect=union[{namespace com.linkedin.metadata.key/**Key for a CorpUser*/@Aspect.name=\"corpUserKey\"record CorpUserKey{/**The name of the AD/LDAP user.*/@Searchable={\"enableAutocomplete\":true,\"fieldName\":\"ldap\",\"boostScore\":2.0,\"fieldType\":\"TEXT_PARTIAL\"}username:string}}{namespace com.linkedin.identity/**Linkedin corp user information*/@Aspect={\"name\":\"corpUserInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"]}record CorpUserInfo{/**Deprecated! Use CorpUserStatus instead. Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/@Searchable={\"weightsPerFieldValue\":{\"true\":2.0},\"fieldType\":\"BOOLEAN\"}active:boolean/**displayName of this user ,  e.g.  Hang Zhang(DataHQ)*/displayName:optional string/**email address of this user*/@Searchable={\"queryByDefault\":true,\"fieldType\":\"KEYWORD\"}email:optional{namespace com.linkedin.common,typeref EmailAddress=string}/**title of this user*/@Searchable={\"queryByDefault\":true,\"fieldType\":\"KEYWORD\"}title:optional string/**direct manager of this user*/@Relationship={\"name\":\"ReportsTo\",\"entityTypes\":[\"corpUser\"]}@Searchable={\"fieldName\":\"managerLdap\",\"queryByDefault\":true,\"fieldType\":\"URN\"}managerUrn:optional{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}/**department id this user belong to*/departmentId:optional long/**department name this user belong to*/departmentName:optional string/**first name of this user*/firstName:optional string/**last name of this user*/lastName:optional string/**Common name of this user, format is firstName + lastName (split by a whitespace)*/@Searchable={\"boostScore\":10.0,\"queryByDefault\":true,\"fieldType\":\"TEXT_PARTIAL\"}fullName:optional string/**two uppercase letters country code. e.g.  US*/countryCode:optional string}}{namespace com.linkedin.identity/**Linkedin corp user information that can be edited from UI*/@Aspect={\"name\":\"corpUserEditableInfo\",\"EntityUrns\":[\"com.linkedin.common.CorpuserUrn\"]}record CorpUserEditableInfo{/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/@Searchable.`/*`.fieldType=\"TEXT\"teams:array[string]=[]/**Skills that the user possesses e.g. Machine Learning*/@Searchable.`/*`.fieldType=\"TEXT\"skills:array[string]=[]/**A URL which points to a picture which user wants to set as a profile photo*/pictureLink:{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}=\"https://raw.githubusercontent.com/linkedin/datahub/master/datahub-web-react/src/images/default_avatar.png\"}}{namespace com.linkedin.identity/**The status of the user, e.g. provisioned, active, suspended, etc.*/@Aspect.name=\"corpUserStatus\"record CorpUserStatus{/**Status of the user, e.g. PROVISIONED / ACTIVE / SUSPENDED*/@Searchable.fieldType=\"KEYWORD\"status:string/**Audit stamp containing who last modified the status and when.*/lastModified:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}}}{namespace com.linkedin.identity/**Carries information about the CorpGroups a user is in.*/@Aspect.name=\"groupMembership\"record GroupMembership{@Relationship.`/*`={\"name\":\"IsMemberOfGroup\",\"entityTypes\":[\"corpGroup\"]}groups:array[com.linkedin.common.Urn]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
