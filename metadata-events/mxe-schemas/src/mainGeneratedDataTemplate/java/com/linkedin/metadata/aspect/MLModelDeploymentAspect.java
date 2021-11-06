
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/MLModelDeploymentAspect.pdl.")
public class MLModelDeploymentAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for an ML model deployment*/@Aspect.name=\"mlModelDeploymentKey\"record MLModelDeploymentKey{/**Standardized platform urn for the model Deployment*/platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Name of the MLModelDeployment*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Fabric type where model Deployment belongs to or where it was generated*/@Searchable={\"filterNameOverride\":\"Environment\",\"queryByDefault\":false,\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\"}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}}{namespace com.linkedin.ml.metadata/**Properties associated with an ML Model Deployment*/@Aspect.name=\"mlModelDeploymentProperties\"record MLModelDeploymentProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Documentation of the MLModelDeployment*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Date when the MLModelDeployment was developed*/createdAt:optional{namespace com.linkedin.common/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long}/**Version of the MLModelDeployment*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}}/**Status of the deployment*/status:optional/**Model endpoint statuses*/enum DeploymentStatus{/**Deployments out of service.*/OUT_OF_SERVICE/**Deployments being created.*/CREATING/**Deployments being updated.*/UPDATING/**Deployments being reverted to a previous version.*/ROLLING_BACK/**Deployments that are active.*/IN_SERVICE/**Deployments being deleted.*/DELETING/**Deployments with an error state.*/FAILED/**Deployments with unknown/unmappable state.*/UNKNOWN}}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:Urn/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Deprecation status of an entity*/@Aspect.name=\"deprecation\"record Deprecation{/**Whether the entity is deprecated.*/@Searchable={\"weightsPerFieldValue\":{\"true\":0.5},\"fieldType\":\"BOOLEAN\"}deprecated:boolean/**The time user plan to decommission this entity.*/decommissionTime:optional Time/**Additional information about the entity deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"filterNameOverride\":\"Platform\",\"addToFilters\":true,\"fieldType\":\"URN\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/instance:optional string}}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_MLModelDeploymentKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.MLModelDeploymentKey");
    private final static DataSchema MEMBER_MLModelDeploymentProperties = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLModelDeploymentProperties");
    private final static DataSchema MEMBER_Ownership = SCHEMA.getTypeByMemberKey("com.linkedin.common.Ownership");
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    private final static DataSchema MEMBER_Deprecation = SCHEMA.getTypeByMemberKey("com.linkedin.common.Deprecation");
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    private final static DataSchema MEMBER_DataPlatformInstance = SCHEMA.getTypeByMemberKey("com.linkedin.common.DataPlatformInstance");
    private final static TyperefInfo TYPEREFINFO = new MLModelDeploymentAspect.UnionTyperefInfo();

    public MLModelDeploymentAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public MLModelDeploymentAspect(Object data) {
        super(data, SCHEMA);
    }

    public static MLModelDeploymentAspect create(com.linkedin.metadata.key.MLModelDeploymentKey value) {
        MLModelDeploymentAspect newUnion = new MLModelDeploymentAspect();
        newUnion.setMLModelDeploymentKey(value);
        return newUnion;
    }

    public boolean isMLModelDeploymentKey() {
        return memberIs("com.linkedin.metadata.key.MLModelDeploymentKey");
    }

    public com.linkedin.metadata.key.MLModelDeploymentKey getMLModelDeploymentKey() {
        return obtainWrapped(MEMBER_MLModelDeploymentKey, com.linkedin.metadata.key.MLModelDeploymentKey.class, "com.linkedin.metadata.key.MLModelDeploymentKey");
    }

    public void setMLModelDeploymentKey(com.linkedin.metadata.key.MLModelDeploymentKey value) {
        selectWrapped(MEMBER_MLModelDeploymentKey, com.linkedin.metadata.key.MLModelDeploymentKey.class, "com.linkedin.metadata.key.MLModelDeploymentKey", value);
    }

    public static MLModelDeploymentAspect create(com.linkedin.ml.metadata.MLModelDeploymentProperties value) {
        MLModelDeploymentAspect newUnion = new MLModelDeploymentAspect();
        newUnion.setMLModelDeploymentProperties(value);
        return newUnion;
    }

    public boolean isMLModelDeploymentProperties() {
        return memberIs("com.linkedin.ml.metadata.MLModelDeploymentProperties");
    }

    public com.linkedin.ml.metadata.MLModelDeploymentProperties getMLModelDeploymentProperties() {
        return obtainWrapped(MEMBER_MLModelDeploymentProperties, com.linkedin.ml.metadata.MLModelDeploymentProperties.class, "com.linkedin.ml.metadata.MLModelDeploymentProperties");
    }

    public void setMLModelDeploymentProperties(com.linkedin.ml.metadata.MLModelDeploymentProperties value) {
        selectWrapped(MEMBER_MLModelDeploymentProperties, com.linkedin.ml.metadata.MLModelDeploymentProperties.class, "com.linkedin.ml.metadata.MLModelDeploymentProperties", value);
    }

    public static MLModelDeploymentAspect create(com.linkedin.common.Ownership value) {
        MLModelDeploymentAspect newUnion = new MLModelDeploymentAspect();
        newUnion.setOwnership(value);
        return newUnion;
    }

    public boolean isOwnership() {
        return memberIs("com.linkedin.common.Ownership");
    }

    public com.linkedin.common.Ownership getOwnership() {
        return obtainWrapped(MEMBER_Ownership, com.linkedin.common.Ownership.class, "com.linkedin.common.Ownership");
    }

    public void setOwnership(com.linkedin.common.Ownership value) {
        selectWrapped(MEMBER_Ownership, com.linkedin.common.Ownership.class, "com.linkedin.common.Ownership", value);
    }

    public static MLModelDeploymentAspect create(com.linkedin.common.Status value) {
        MLModelDeploymentAspect newUnion = new MLModelDeploymentAspect();
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

    public static MLModelDeploymentAspect create(com.linkedin.common.Deprecation value) {
        MLModelDeploymentAspect newUnion = new MLModelDeploymentAspect();
        newUnion.setDeprecation(value);
        return newUnion;
    }

    public boolean isDeprecation() {
        return memberIs("com.linkedin.common.Deprecation");
    }

    public com.linkedin.common.Deprecation getDeprecation() {
        return obtainWrapped(MEMBER_Deprecation, com.linkedin.common.Deprecation.class, "com.linkedin.common.Deprecation");
    }

    public void setDeprecation(com.linkedin.common.Deprecation value) {
        selectWrapped(MEMBER_Deprecation, com.linkedin.common.Deprecation.class, "com.linkedin.common.Deprecation", value);
    }

    public static MLModelDeploymentAspect create(com.linkedin.common.GlobalTags value) {
        MLModelDeploymentAspect newUnion = new MLModelDeploymentAspect();
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

    public static MLModelDeploymentAspect create(com.linkedin.common.DataPlatformInstance value) {
        MLModelDeploymentAspect newUnion = new MLModelDeploymentAspect();
        newUnion.setDataPlatformInstance(value);
        return newUnion;
    }

    public boolean isDataPlatformInstance() {
        return memberIs("com.linkedin.common.DataPlatformInstance");
    }

    public com.linkedin.common.DataPlatformInstance getDataPlatformInstance() {
        return obtainWrapped(MEMBER_DataPlatformInstance, com.linkedin.common.DataPlatformInstance.class, "com.linkedin.common.DataPlatformInstance");
    }

    public void setDataPlatformInstance(com.linkedin.common.DataPlatformInstance value) {
        selectWrapped(MEMBER_DataPlatformInstance, com.linkedin.common.DataPlatformInstance.class, "com.linkedin.common.DataPlatformInstance", value);
    }

    @Override
    public MLModelDeploymentAspect clone()
        throws CloneNotSupportedException
    {
        return ((MLModelDeploymentAspect) super.clone());
    }

    @Override
    public MLModelDeploymentAspect copy()
        throws CloneNotSupportedException
    {
        return ((MLModelDeploymentAspect) super.copy());
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

        public com.linkedin.metadata.key.MLModelDeploymentKey.Fields MLModelDeploymentKey() {
            return new com.linkedin.metadata.key.MLModelDeploymentKey.Fields(getPathComponents(), "com.linkedin.metadata.key.MLModelDeploymentKey");
        }

        public com.linkedin.ml.metadata.MLModelDeploymentProperties.Fields MLModelDeploymentProperties() {
            return new com.linkedin.ml.metadata.MLModelDeploymentProperties.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLModelDeploymentProperties");
        }

        public com.linkedin.common.Ownership.Fields Ownership() {
            return new com.linkedin.common.Ownership.Fields(getPathComponents(), "com.linkedin.common.Ownership");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

        public com.linkedin.common.Deprecation.Fields Deprecation() {
            return new com.linkedin.common.Deprecation.Fields(getPathComponents(), "com.linkedin.common.Deprecation");
        }

        public com.linkedin.common.GlobalTags.Fields GlobalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "com.linkedin.common.GlobalTags");
        }

        public com.linkedin.common.DataPlatformInstance.Fields DataPlatformInstance() {
            return new com.linkedin.common.DataPlatformInstance.Fields(getPathComponents(), "com.linkedin.common.DataPlatformInstance");
        }

    }


    /**
     * A union of all supported metadata aspects for a MLModelDeployment
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a MLModelDeployment*/typeref MLModelDeploymentAspect=union[{namespace com.linkedin.metadata.key/**Key for an ML model deployment*/@Aspect.name=\"mlModelDeploymentKey\"record MLModelDeploymentKey{/**Standardized platform urn for the model Deployment*/platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Name of the MLModelDeployment*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Fabric type where model Deployment belongs to or where it was generated*/@Searchable={\"filterNameOverride\":\"Environment\",\"queryByDefault\":false,\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\"}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}}{namespace com.linkedin.ml.metadata/**Properties associated with an ML Model Deployment*/@Aspect.name=\"mlModelDeploymentProperties\"record MLModelDeploymentProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Documentation of the MLModelDeployment*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Date when the MLModelDeployment was developed*/createdAt:optional{namespace com.linkedin.common/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long}/**Version of the MLModelDeployment*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}}/**Status of the deployment*/status:optional/**Model endpoint statuses*/enum DeploymentStatus{/**Deployments out of service.*/OUT_OF_SERVICE/**Deployments being created.*/CREATING/**Deployments being updated.*/UPDATING/**Deployments being reverted to a previous version.*/ROLLING_BACK/**Deployments that are active.*/IN_SERVICE/**Deployments being deleted.*/DELETING/**Deployments with an error state.*/FAILED/**Deployments with unknown/unmappable state.*/UNKNOWN}}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:Urn/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:Time/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Deprecation status of an entity*/@Aspect.name=\"deprecation\"record Deprecation{/**Whether the entity is deprecated.*/@Searchable={\"weightsPerFieldValue\":{\"true\":0.5},\"fieldType\":\"BOOLEAN\"}deprecated:boolean/**The time user plan to decommission this entity.*/decommissionTime:optional Time/**Additional information about the entity deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"filterNameOverride\":\"Platform\",\"addToFilters\":true,\"fieldType\":\"URN\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/instance:optional string}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
