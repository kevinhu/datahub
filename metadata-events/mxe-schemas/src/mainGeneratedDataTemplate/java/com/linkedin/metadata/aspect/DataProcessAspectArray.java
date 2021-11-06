
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/DataProcessSnapshot.pdl.")
public class DataProcessAspectArray
    extends WrappingArrayTemplate<DataProcessAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.key/**Key for a Data Process*/@Aspect.name=\"dataProcessKey\"record DataProcessKey{/**Process name i.e. an ETL job name*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":4.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Standardized Orchestrator where data process is defined.\nTODO: Migrate towards something that can be validated like DataPlatform urn*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}orchestrator:string/**Fabric type where dataset belongs to or where it was generated.*/@Searchable={\"queryByDefault\":false,\"fieldType\":\"TEXT_PARTIAL\"}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.dataprocess/**The inputs and outputs of this data process*/@Aspect.name=\"dataProcessInfo\"record DataProcessInfo{/**the inputs of the data process*/@Relationship.`/*`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}@Searchable.`/*`={\"fieldName\":\"inputs\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false,\"fieldType\":\"URN\"}inputs:optional array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]/**the outputs of the data process*/@Relationship.`/*`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}@Searchable.`/*`={\"fieldName\":\"outputs\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false,\"fieldType\":\"URN\"}outputs:optional array[com.linkedin.common.DatasetUrn]}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]]", SchemaFormatType.PDL));

    public DataProcessAspectArray() {
        this(new DataList());
    }

    public DataProcessAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DataProcessAspectArray(Collection<DataProcessAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DataProcessAspectArray(DataList data) {
        super(data, SCHEMA, DataProcessAspect.class);
    }

    public DataProcessAspectArray(DataProcessAspect first, DataProcessAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public DataProcessAspectArray clone()
        throws CloneNotSupportedException
    {
        return ((DataProcessAspectArray) super.clone());
    }

    @Override
    public DataProcessAspectArray copy()
        throws CloneNotSupportedException
    {
        return ((DataProcessAspectArray) super.copy());
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

        public com.linkedin.metadata.aspect.DataProcessAspect.Fields items() {
            return new com.linkedin.metadata.aspect.DataProcessAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
