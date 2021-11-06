
package com.linkedin.metadata.snapshot;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.metadata.aspect.DataProcessAspectArray;


/**
 * A metadata snapshot for a specific Data process entity.
 * 
 * @deprecated
 *     Use DataJob instead.
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/DataProcessSnapshot.pdl.")
@Deprecated
public class DataProcessSnapshot
    extends RecordTemplate
{

    private final static DataProcessSnapshot.Fields _fields = new DataProcessSnapshot.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.snapshot/**A metadata snapshot for a specific Data process entity.*/@Entity={\"keyAspect\":\"dataProcessKey\",\"name\":\"dataProcess\"}@deprecated=\"Use DataJob instead.\"record DataProcessSnapshot{/**URN for the entity the metadata snapshot is associated with.*/urn:{namespace com.linkedin.common/**Standardized process identifier.*/@java.class=\"com.linkedin.common.urn.DataProcessUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataProcess\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataProcess\",\"doc\":\"Standardized process identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"process name i.e. an ETL job name\",\"type\":\"string\",\"maxLength\":25},{\"name\":\"orchestrator\",\"doc\":\"Standardized Orchestrator where data process is defined.\",\"type\":\"string\",\"maxLength\":100},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DataProcessUrn=string}/**The list of metadata aspects associated with the data process. Depending on the use case, this can either be all, or a selection, of supported aspects.*/aspects:array[{namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a data process*/@deprecated=\"Use DataJob instead.\"typeref DataProcessAspect=union[{namespace com.linkedin.metadata.key/**Key for a Data Process*/@Aspect.name=\"dataProcessKey\"record DataProcessKey{/**Process name i.e. an ETL job name*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":4.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Standardized Orchestrator where data process is defined.\nTODO: Migrate towards something that can be validated like DataPlatform urn*/@Searchable={\"enableAutocomplete\":true,\"fieldType\":\"TEXT_PARTIAL\"}orchestrator:string/**Fabric type where dataset belongs to or where it was generated.*/@Searchable={\"queryByDefault\":false,\"fieldType\":\"TEXT_PARTIAL\"}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.dataprocess/**The inputs and outputs of this data process*/@Aspect.name=\"dataProcessInfo\"record DataProcessInfo{/**the inputs of the data process*/@Relationship.`/*`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}@Searchable.`/*`={\"fieldName\":\"inputs\",\"numValuesFieldName\":\"numInputDatasets\",\"queryByDefault\":false,\"fieldType\":\"URN\"}inputs:optional array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]/**the outputs of the data process*/@Relationship.`/*`={\"name\":\"Consumes\",\"entityTypes\":[\"dataset\"]}@Searchable.`/*`={\"fieldName\":\"outputs\",\"numValuesFieldName\":\"numOutputDatasets\",\"queryByDefault\":false,\"fieldType\":\"URN\"}outputs:optional array[com.linkedin.common.DatasetUrn]}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}]}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Aspects = SCHEMA.getField("aspects");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataProcessUrn.class);
    }

    public DataProcessSnapshot() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
    }

    public DataProcessSnapshot(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataProcessSnapshot.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for urn
     * 
     * @see DataProcessSnapshot.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DataProcessSnapshot.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DataProcessSnapshot.Fields#urn
     */
    public com.linkedin.common.urn.DataProcessUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataProcessUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessSnapshot.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DataProcessUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataProcessUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DataProcessSnapshot.Fields#urn
     */
    public DataProcessSnapshot setUrn(com.linkedin.common.urn.DataProcessUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataProcessUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessSnapshot.Fields#urn
     */
    public DataProcessSnapshot setUrn(
        @Nonnull
        com.linkedin.common.urn.DataProcessUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataProcessUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aspects
     * 
     * @see DataProcessSnapshot.Fields#aspects
     */
    public boolean hasAspects() {
        return contains(FIELD_Aspects);
    }

    /**
     * Remover for aspects
     * 
     * @see DataProcessSnapshot.Fields#aspects
     */
    public void removeAspects() {
        remove(FIELD_Aspects);
    }

    /**
     * Getter for aspects
     * 
     * @see DataProcessSnapshot.Fields#aspects
     */
    public DataProcessAspectArray getAspects(GetMode mode) {
        return obtainWrapped(FIELD_Aspects, DataProcessAspectArray.class, mode);
    }

    /**
     * Getter for aspects
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataProcessSnapshot.Fields#aspects
     */
    @Nonnull
    public DataProcessAspectArray getAspects() {
        return obtainWrapped(FIELD_Aspects, DataProcessAspectArray.class, GetMode.STRICT);
    }

    /**
     * Setter for aspects
     * 
     * @see DataProcessSnapshot.Fields#aspects
     */
    public DataProcessSnapshot setAspects(DataProcessAspectArray value, SetMode mode) {
        putWrapped(FIELD_Aspects, DataProcessAspectArray.class, value, mode);
        return this;
    }

    /**
     * Setter for aspects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataProcessSnapshot.Fields#aspects
     */
    public DataProcessSnapshot setAspects(
        @Nonnull
        DataProcessAspectArray value) {
        putWrapped(FIELD_Aspects, DataProcessAspectArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataProcessSnapshot clone()
        throws CloneNotSupportedException
    {
        return ((DataProcessSnapshot) super.clone());
    }

    @Override
    public DataProcessSnapshot copy()
        throws CloneNotSupportedException
    {
        return ((DataProcessSnapshot) super.copy());
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
         * URN for the entity the metadata snapshot is associated with.
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * The list of metadata aspects associated with the data process. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public com.linkedin.metadata.aspect.DataProcessAspectArray.Fields aspects() {
            return new com.linkedin.metadata.aspect.DataProcessAspectArray.Fields(getPathComponents(), "aspects");
        }

        /**
         * The list of metadata aspects associated with the data process. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public PathSpec aspects(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aspects");
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
