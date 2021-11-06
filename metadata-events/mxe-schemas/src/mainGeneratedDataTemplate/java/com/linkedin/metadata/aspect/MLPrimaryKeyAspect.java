
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/MLPrimaryKeyAspect.pdl.")
public class MLPrimaryKeyAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for an MLPrimaryKey*/@Aspect.name=\"mlPrimaryKeyKey\"record MLPrimaryKeyKey{/**Namespace for the primary key*/@Searchable.fieldType=\"TEXT_PARTIAL\"featureNamespace:string/**Name of the primary key*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":8.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string}}{namespace com.linkedin.ml.metadata/**Properties associated with a MLPrimaryKey*/@Aspect.name=\"mlPrimaryKeyProperties\"record MLPrimaryKeyProperties{/**Documentation of the MLPrimaryKey*/description:optional string/**Data Type of the MLPrimaryKey*/dataType:optional{namespace com.linkedin.common/**MLFeature Data Type*/enum MLFeatureDataType{/**Useless data is unique, discrete data with no potential relationship with the outcome variable.\nA useless feature has high cardinality. An example would be bank account numbers that were generated randomly.*/USELESS/**Nominal data is made of discrete values with no numerical relationship between the different categories \u2014 mean and median are meaningless.\nAnimal species is one example. For example, pig is not higher than bird and lower than fish.*/NOMINAL/**Ordinal data are discrete integers that can be ranked or sorted.\nFor example, the distance between first and second may not be the same as the distance between second and third.*/ORDINAL/**Binary data is discrete data that can be in only one of two categories \u2014 either yes or no, 1 or 0, off or on, etc*/BINARY/**Count data is discrete whole number data \u2014 no negative numbers here.\nCount data often has many small values, such as zero and one.*/COUNT/**Time data is a cyclical, repeating continuous form of data.\nThe relevant time features can be any period\u2014 daily, weekly, monthly, annual, etc.*/TIME/**Interval data has equal spaces between the numbers and does not represent a temporal pattern.\nExamples include percentages, temperatures, and income.*/INTERVAL/**Image Data*/IMAGE/**Video Data*/VIDEO/**Audio Data*/AUDIO/**Text Data*/TEXT/**Mapping Data Type ex: dict, map*/MAP/**Sequence Data Type ex: list, tuple, range*/SEQUENCE/**Set Data Type ex: set, frozenset*/SET/**Continuous data are made of uncountable values, often the result of a measurement such as height, weight, age etc.*/CONTINUOUS/**Bytes data are binary-encoded values that can represent complex objects.*/BYTE/**Unknown data are data that we don't know the type for.*/UNKNOWN}}/**Version of the MLPrimaryKey*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}}/**Source of the MLPrimaryKey*/@Relationship.`/*`={\"name\":\"DerivedFrom\",\"entityTypes\":[\"dataset\"]}sources:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:Urn/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp}]}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Deprecation status of an entity*/@Aspect.name=\"deprecation\"record Deprecation{/**Whether the entity is deprecated.*/@Searchable={\"weightsPerFieldValue\":{\"true\":0.5},\"fieldType\":\"BOOLEAN\"}deprecated:boolean/**The time user plan to decommission this entity.*/decommissionTime:optional Time/**Additional information about the entity deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"filterNameOverride\":\"Platform\",\"addToFilters\":true,\"fieldType\":\"URN\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/instance:optional string}}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_MLPrimaryKeyKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.MLPrimaryKeyKey");
    private final static DataSchema MEMBER_MLPrimaryKeyProperties = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLPrimaryKeyProperties");
    private final static DataSchema MEMBER_Ownership = SCHEMA.getTypeByMemberKey("com.linkedin.common.Ownership");
    private final static DataSchema MEMBER_InstitutionalMemory = SCHEMA.getTypeByMemberKey("com.linkedin.common.InstitutionalMemory");
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    private final static DataSchema MEMBER_Deprecation = SCHEMA.getTypeByMemberKey("com.linkedin.common.Deprecation");
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    private final static DataSchema MEMBER_DataPlatformInstance = SCHEMA.getTypeByMemberKey("com.linkedin.common.DataPlatformInstance");
    private final static TyperefInfo TYPEREFINFO = new MLPrimaryKeyAspect.UnionTyperefInfo();

    public MLPrimaryKeyAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public MLPrimaryKeyAspect(Object data) {
        super(data, SCHEMA);
    }

    public static MLPrimaryKeyAspect create(com.linkedin.metadata.key.MLPrimaryKeyKey value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
        newUnion.setMLPrimaryKeyKey(value);
        return newUnion;
    }

    public boolean isMLPrimaryKeyKey() {
        return memberIs("com.linkedin.metadata.key.MLPrimaryKeyKey");
    }

    public com.linkedin.metadata.key.MLPrimaryKeyKey getMLPrimaryKeyKey() {
        return obtainWrapped(MEMBER_MLPrimaryKeyKey, com.linkedin.metadata.key.MLPrimaryKeyKey.class, "com.linkedin.metadata.key.MLPrimaryKeyKey");
    }

    public void setMLPrimaryKeyKey(com.linkedin.metadata.key.MLPrimaryKeyKey value) {
        selectWrapped(MEMBER_MLPrimaryKeyKey, com.linkedin.metadata.key.MLPrimaryKeyKey.class, "com.linkedin.metadata.key.MLPrimaryKeyKey", value);
    }

    public static MLPrimaryKeyAspect create(com.linkedin.ml.metadata.MLPrimaryKeyProperties value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
        newUnion.setMLPrimaryKeyProperties(value);
        return newUnion;
    }

    public boolean isMLPrimaryKeyProperties() {
        return memberIs("com.linkedin.ml.metadata.MLPrimaryKeyProperties");
    }

    public com.linkedin.ml.metadata.MLPrimaryKeyProperties getMLPrimaryKeyProperties() {
        return obtainWrapped(MEMBER_MLPrimaryKeyProperties, com.linkedin.ml.metadata.MLPrimaryKeyProperties.class, "com.linkedin.ml.metadata.MLPrimaryKeyProperties");
    }

    public void setMLPrimaryKeyProperties(com.linkedin.ml.metadata.MLPrimaryKeyProperties value) {
        selectWrapped(MEMBER_MLPrimaryKeyProperties, com.linkedin.ml.metadata.MLPrimaryKeyProperties.class, "com.linkedin.ml.metadata.MLPrimaryKeyProperties", value);
    }

    public static MLPrimaryKeyAspect create(com.linkedin.common.Ownership value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
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

    public static MLPrimaryKeyAspect create(com.linkedin.common.InstitutionalMemory value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
        newUnion.setInstitutionalMemory(value);
        return newUnion;
    }

    public boolean isInstitutionalMemory() {
        return memberIs("com.linkedin.common.InstitutionalMemory");
    }

    public com.linkedin.common.InstitutionalMemory getInstitutionalMemory() {
        return obtainWrapped(MEMBER_InstitutionalMemory, com.linkedin.common.InstitutionalMemory.class, "com.linkedin.common.InstitutionalMemory");
    }

    public void setInstitutionalMemory(com.linkedin.common.InstitutionalMemory value) {
        selectWrapped(MEMBER_InstitutionalMemory, com.linkedin.common.InstitutionalMemory.class, "com.linkedin.common.InstitutionalMemory", value);
    }

    public static MLPrimaryKeyAspect create(com.linkedin.common.Status value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
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

    public static MLPrimaryKeyAspect create(com.linkedin.common.Deprecation value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
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

    public static MLPrimaryKeyAspect create(com.linkedin.common.GlobalTags value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
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

    public static MLPrimaryKeyAspect create(com.linkedin.common.DataPlatformInstance value) {
        MLPrimaryKeyAspect newUnion = new MLPrimaryKeyAspect();
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
    public MLPrimaryKeyAspect clone()
        throws CloneNotSupportedException
    {
        return ((MLPrimaryKeyAspect) super.clone());
    }

    @Override
    public MLPrimaryKeyAspect copy()
        throws CloneNotSupportedException
    {
        return ((MLPrimaryKeyAspect) super.copy());
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

        public com.linkedin.metadata.key.MLPrimaryKeyKey.Fields MLPrimaryKeyKey() {
            return new com.linkedin.metadata.key.MLPrimaryKeyKey.Fields(getPathComponents(), "com.linkedin.metadata.key.MLPrimaryKeyKey");
        }

        public com.linkedin.ml.metadata.MLPrimaryKeyProperties.Fields MLPrimaryKeyProperties() {
            return new com.linkedin.ml.metadata.MLPrimaryKeyProperties.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLPrimaryKeyProperties");
        }

        public com.linkedin.common.Ownership.Fields Ownership() {
            return new com.linkedin.common.Ownership.Fields(getPathComponents(), "com.linkedin.common.Ownership");
        }

        public com.linkedin.common.InstitutionalMemory.Fields InstitutionalMemory() {
            return new com.linkedin.common.InstitutionalMemory.Fields(getPathComponents(), "com.linkedin.common.InstitutionalMemory");
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
     * A union of all supported metadata aspects for a MLPrimaryKey
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a MLPrimaryKey*/typeref MLPrimaryKeyAspect=union[{namespace com.linkedin.metadata.key/**Key for an MLPrimaryKey*/@Aspect.name=\"mlPrimaryKeyKey\"record MLPrimaryKeyKey{/**Namespace for the primary key*/@Searchable.fieldType=\"TEXT_PARTIAL\"featureNamespace:string/**Name of the primary key*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":8.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string}}{namespace com.linkedin.ml.metadata/**Properties associated with a MLPrimaryKey*/@Aspect.name=\"mlPrimaryKeyProperties\"record MLPrimaryKeyProperties{/**Documentation of the MLPrimaryKey*/description:optional string/**Data Type of the MLPrimaryKey*/dataType:optional{namespace com.linkedin.common/**MLFeature Data Type*/enum MLFeatureDataType{/**Useless data is unique, discrete data with no potential relationship with the outcome variable.\nA useless feature has high cardinality. An example would be bank account numbers that were generated randomly.*/USELESS/**Nominal data is made of discrete values with no numerical relationship between the different categories \u2014 mean and median are meaningless.\nAnimal species is one example. For example, pig is not higher than bird and lower than fish.*/NOMINAL/**Ordinal data are discrete integers that can be ranked or sorted.\nFor example, the distance between first and second may not be the same as the distance between second and third.*/ORDINAL/**Binary data is discrete data that can be in only one of two categories \u2014 either yes or no, 1 or 0, off or on, etc*/BINARY/**Count data is discrete whole number data \u2014 no negative numbers here.\nCount data often has many small values, such as zero and one.*/COUNT/**Time data is a cyclical, repeating continuous form of data.\nThe relevant time features can be any period\u2014 daily, weekly, monthly, annual, etc.*/TIME/**Interval data has equal spaces between the numbers and does not represent a temporal pattern.\nExamples include percentages, temperatures, and income.*/INTERVAL/**Image Data*/IMAGE/**Video Data*/VIDEO/**Audio Data*/AUDIO/**Text Data*/TEXT/**Mapping Data Type ex: dict, map*/MAP/**Sequence Data Type ex: list, tuple, range*/SEQUENCE/**Set Data Type ex: set, frozenset*/SET/**Continuous data are made of uncountable values, often the result of a measurement such as height, weight, age etc.*/CONTINUOUS/**Bytes data are binary-encoded values that can represent complex objects.*/BYTE/**Unknown data are data that we don't know the type for.*/UNKNOWN}}/**Version of the MLPrimaryKey*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}}/**Source of the MLPrimaryKey*/@Relationship.`/*`={\"name\":\"DerivedFrom\",\"entityTypes\":[\"dataset\"]}sources:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:Urn/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp}]}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common/**Deprecation status of an entity*/@Aspect.name=\"deprecation\"record Deprecation{/**Whether the entity is deprecated.*/@Searchable={\"weightsPerFieldValue\":{\"true\":0.5},\"fieldType\":\"BOOLEAN\"}deprecated:boolean/**The time user plan to decommission this entity.*/decommissionTime:optional Time/**Additional information about the entity deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"filterNameOverride\":\"Platform\",\"addToFilters\":true,\"fieldType\":\"URN\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/instance:optional string}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
