
package com.linkedin.mxe;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.avro2pegasus.events.KafkaAuditHeader;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.metadata.entity.EntityArray;
import com.linkedin.metadata.relationship.RelationshipArray;


/**
 * Kafka event for capturing update made to a list of entities and relationships.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/mxe/MetadataGraphEvent.pdl.")
public class MetadataGraphEvent
    extends RecordTemplate
{

    private final static MetadataGraphEvent.Fields _fields = new MetadataGraphEvent.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**Kafka event for capturing update made to a list of entities and relationships.*/record MetadataGraphEvent{/**Kafka audit header. See go/kafkaauditheader for more info.*/auditHeader:optional{namespace com.linkedin.avro2pegasus.events/**This header records information about the context of an event as it is emitted into kafka and is intended to be used by the kafka audit application.  For more information see go/kafkaauditheader*/record KafkaAuditHeader{/**The time at which the event was emitted into kafka.*/@compliance=[{\"policy\":\"EVENT_TIME\"}]time:long/**The fully qualified name of the host from which the event is being emitted.*/@compliance=\"NONE\"server:string/**The instance on the server from which the event is being emitted. e.g. i001*/@compliance=\"NONE\"instance:optional string/**The name of the application from which the event is being emitted. see go/appname*/@compliance=\"NONE\"appName:string/**A unique identifier for the message*/@compliance=\"NONE\"messageId:fixed UUID 16/**The version that is being used for auditing. In version 0, the audit trail buckets events into 10 minute audit windows based on the EventHeader timestamp. In version 1, the audit trail buckets events as follows: if the schema has an outer KafkaAuditHeader, use the outer audit header timestamp for bucketing; else if the EventHeader has an inner KafkaAuditHeader use that inner audit header's timestamp for bucketing*/@compliance=\"NONE\"auditVersion:optional int/**The fabricUrn of the host from which the event is being emitted. Fabric Urn in the format of urn:li:fabric:{fabric_name}. See go/fabric.*/@compliance=\"NONE\"fabricUrn:optional string/**This is a String that the client uses to establish some kind of connection with the Kafka cluster. The exact format of it depends on specific versions of clients and brokers. This information could potentially identify the fabric and cluster with which the client is producing to or consuming from.*/@compliance=\"NONE\"clusterConnectionString:optional string}}/**A list of entity updates-or-inserts. Only fields updated are set in the case of partial update.*/upsertedEntities:array[{namespace com.linkedin.metadata.entity/**A union of all supported entity types.*/typeref Entity=union[/**Data model for a CorpUser entity*/record CorpUserEntity includes/**Common fields that apply to all entities*/record BaseEntity{/**Whether the entity has been removed or not*/removed:optional boolean=false}{/**Urn for the LDAP User*/urn:{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}/**LDAP name(id) : e.g. hzhang2, ywang5 ..*/name:optional string}/**Data model for a dataset entity*/record DatasetEntity includes BaseEntity{/**Urn for the dataset*/urn:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Dataset native name e.g. {db}.{table}, /dir/subdir/{name}, or {name}*/name:optional string/**Platform urn for the dataset in the form of urn:li:platform:{platform_name}*/platform:optional{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataPlatform\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataPlatform\",\"doc\":\"Standardized data platforms available\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platformName\",\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"type\":\"string\",\"maxLength\":25}],\"maxLength\":45}typeref DataPlatformUrn=string}/**Fabric type where dataset belongs to or where it was generated.*/origin:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}/**Data model for a Data Process entity*/record DataProcessEntity{/**Urn for the Data Process*/urn:{namespace com.linkedin.common/**Standardized process identifier.*/@java.class=\"com.linkedin.common.urn.DataProcessUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataProcess\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataProcess\",\"doc\":\"Standardized process identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"process name i.e. an ETL job name\",\"type\":\"string\",\"maxLength\":25},{\"name\":\"orchestrator\",\"doc\":\"Standardized Orchestrator where data process is defined.\",\"type\":\"string\",\"maxLength\":100},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DataProcessUrn=string}/**Data Process name(id)*/name:optional string/**Process Orchestrator for this process in the form. Options can be Airflow, Azkaban, Azure Data Factory*/orchestrator:optional string/**Fabric type where dataset belongs to or where it was generated.*/origin:optional com.linkedin.common.FabricType}/**Data model for a ML Model entity*/record MLModelEntity includes BaseEntity{/**Urn for the ML Model*/urn:{namespace com.linkedin.common/**Standardized MLModel identifier.*/@java.class=\"com.linkedin.common.urn.MLModelUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"mlModel\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"MlModel\",\"doc\":\"Standardized model identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn for the MLModel.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"mlModelName\",\"doc\":\"Name of the MLModel\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where model belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref MLModelUrn=string}/**ML Model native name*/name:optional string/**Platform urn for the ML Model in the form of urn:li:platform:{platform_name}*/platform:optional com.linkedin.common.DataPlatformUrn/**Fabric type where ML Model belongs to or where it was generated.*/origin:optional com.linkedin.common.FabricType}/**Data model for a DataFlow entity*/record DataFlowEntity includes BaseEntity{/**Urn for the DataFlow*/urn:{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataFlow\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataFlow\",\"doc\":\"Standardized data processing flow identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"orchestrator\",\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"type\":\"string\",\"maxLength\":50},{\"name\":\"flowId\",\"doc\":\"Unique Identifier of the data flow\",\"type\":\"string\",\"maxLength\":200},{\"name\":\"cluster\",\"doc\":\"Cluster where the flow is executed\",\"type\":\"string\",\"maxLength\":100}],\"maxLength\":373}typeref DataFlowUrn=string}/**Workflow orchestrator ex: Azkaban, Airflow*/orchestrator:optional string/**Id of the flow*/flowId:optional string/**Cluster of the flow*/cluster:optional string}/**Data model for a DataJob entity*/record DataJobEntity includes BaseEntity{/**Urn for the DataJob*/urn:{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataJob\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataJob\",\"doc\":\"Standardized data processing job identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"flow\",\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"name\":\"jobID\",\"doc\":\"Unique identifier of the data job\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":594}typeref DataJobUrn=string}/**Urn of the associated DataFlow*/flow:optional com.linkedin.common.DataFlowUrn/**Id of the job*/jobId:optional string}]}]/**A list of removed relationships. Only fields used to identify the relationships to remove are set.*/removedRelationships:array[{namespace com.linkedin.metadata.relationship/**A union of all supported relationship types.*/typeref Relationship=union[/**A generic model for the Has-A relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.ChartUrn\",\"source\":\"com.linkedin.common.urn.DashboardUrn\"},{\"destination\":\"com.linkedin.common.urn.GlossaryTermUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"},{\"destination\":\"com.linkedin.common.urn.GlossaryNodeUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"}]record Contains includes/**Common fields that apply to all relationships*/record BaseRelationship{/**Urn for the source of the relationship*/source:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Urn for the destination of the relationship*/destination:com.linkedin.common.Urn}{}/**A generic model for the Is-Part-Of relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DataFlowUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record IsPartOf includes BaseRelationship{}/**A generic model for the Owned-By relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DatasetUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataProcessUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.MLModelUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.GlossaryTermUrn\"},{\"destination\":\"com.linkedin.common.urn.CorpuserUrn\",\"source\":\"com.linkedin.common.urn.GlossaryNodeUrn\"}]record OwnedBy includes BaseRelationship{/**The type of the ownership*/type:{namespace com.linkedin.common/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}}}/**A generic model for the*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DatasetUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record Consumes includes BaseRelationship{}/**A generic model for the*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DatasetUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record Produces includes BaseRelationship{}]}]/**A list of relationship updates-or-inserts.*/upsertedRelationships:array[com.linkedin.metadata.relationship.Relationship]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_AuditHeader = SCHEMA.getField("auditHeader");
    private final static RecordDataSchema.Field FIELD_UpsertedEntities = SCHEMA.getField("upsertedEntities");
    private final static RecordDataSchema.Field FIELD_RemovedRelationships = SCHEMA.getField("removedRelationships");
    private final static RecordDataSchema.Field FIELD_UpsertedRelationships = SCHEMA.getField("upsertedRelationships");

    public MetadataGraphEvent() {
        super(new DataMap(6, 0.75F), SCHEMA, 6);
    }

    public MetadataGraphEvent(DataMap data) {
        super(data, SCHEMA);
    }

    public static MetadataGraphEvent.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for auditHeader
     * 
     * @see MetadataGraphEvent.Fields#auditHeader
     */
    public boolean hasAuditHeader() {
        return contains(FIELD_AuditHeader);
    }

    /**
     * Remover for auditHeader
     * 
     * @see MetadataGraphEvent.Fields#auditHeader
     */
    public void removeAuditHeader() {
        remove(FIELD_AuditHeader);
    }

    /**
     * Getter for auditHeader
     * 
     * @see MetadataGraphEvent.Fields#auditHeader
     */
    public KafkaAuditHeader getAuditHeader(GetMode mode) {
        return obtainWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, mode);
    }

    /**
     * Getter for auditHeader
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataGraphEvent.Fields#auditHeader
     */
    @Nullable
    public KafkaAuditHeader getAuditHeader() {
        return obtainWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, GetMode.STRICT);
    }

    /**
     * Setter for auditHeader
     * 
     * @see MetadataGraphEvent.Fields#auditHeader
     */
    public MetadataGraphEvent setAuditHeader(KafkaAuditHeader value, SetMode mode) {
        putWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, value, mode);
        return this;
    }

    /**
     * Setter for auditHeader
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataGraphEvent.Fields#auditHeader
     */
    public MetadataGraphEvent setAuditHeader(
        @Nonnull
        KafkaAuditHeader value) {
        putWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for upsertedEntities
     * 
     * @see MetadataGraphEvent.Fields#upsertedEntities
     */
    public boolean hasUpsertedEntities() {
        return contains(FIELD_UpsertedEntities);
    }

    /**
     * Remover for upsertedEntities
     * 
     * @see MetadataGraphEvent.Fields#upsertedEntities
     */
    public void removeUpsertedEntities() {
        remove(FIELD_UpsertedEntities);
    }

    /**
     * Getter for upsertedEntities
     * 
     * @see MetadataGraphEvent.Fields#upsertedEntities
     */
    public EntityArray getUpsertedEntities(GetMode mode) {
        return obtainWrapped(FIELD_UpsertedEntities, EntityArray.class, mode);
    }

    /**
     * Getter for upsertedEntities
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MetadataGraphEvent.Fields#upsertedEntities
     */
    @Nonnull
    public EntityArray getUpsertedEntities() {
        return obtainWrapped(FIELD_UpsertedEntities, EntityArray.class, GetMode.STRICT);
    }

    /**
     * Setter for upsertedEntities
     * 
     * @see MetadataGraphEvent.Fields#upsertedEntities
     */
    public MetadataGraphEvent setUpsertedEntities(EntityArray value, SetMode mode) {
        putWrapped(FIELD_UpsertedEntities, EntityArray.class, value, mode);
        return this;
    }

    /**
     * Setter for upsertedEntities
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataGraphEvent.Fields#upsertedEntities
     */
    public MetadataGraphEvent setUpsertedEntities(
        @Nonnull
        EntityArray value) {
        putWrapped(FIELD_UpsertedEntities, EntityArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for removedRelationships
     * 
     * @see MetadataGraphEvent.Fields#removedRelationships
     */
    public boolean hasRemovedRelationships() {
        return contains(FIELD_RemovedRelationships);
    }

    /**
     * Remover for removedRelationships
     * 
     * @see MetadataGraphEvent.Fields#removedRelationships
     */
    public void removeRemovedRelationships() {
        remove(FIELD_RemovedRelationships);
    }

    /**
     * Getter for removedRelationships
     * 
     * @see MetadataGraphEvent.Fields#removedRelationships
     */
    public RelationshipArray getRemovedRelationships(GetMode mode) {
        return obtainWrapped(FIELD_RemovedRelationships, RelationshipArray.class, mode);
    }

    /**
     * Getter for removedRelationships
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MetadataGraphEvent.Fields#removedRelationships
     */
    @Nonnull
    public RelationshipArray getRemovedRelationships() {
        return obtainWrapped(FIELD_RemovedRelationships, RelationshipArray.class, GetMode.STRICT);
    }

    /**
     * Setter for removedRelationships
     * 
     * @see MetadataGraphEvent.Fields#removedRelationships
     */
    public MetadataGraphEvent setRemovedRelationships(RelationshipArray value, SetMode mode) {
        putWrapped(FIELD_RemovedRelationships, RelationshipArray.class, value, mode);
        return this;
    }

    /**
     * Setter for removedRelationships
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataGraphEvent.Fields#removedRelationships
     */
    public MetadataGraphEvent setRemovedRelationships(
        @Nonnull
        RelationshipArray value) {
        putWrapped(FIELD_RemovedRelationships, RelationshipArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for upsertedRelationships
     * 
     * @see MetadataGraphEvent.Fields#upsertedRelationships
     */
    public boolean hasUpsertedRelationships() {
        return contains(FIELD_UpsertedRelationships);
    }

    /**
     * Remover for upsertedRelationships
     * 
     * @see MetadataGraphEvent.Fields#upsertedRelationships
     */
    public void removeUpsertedRelationships() {
        remove(FIELD_UpsertedRelationships);
    }

    /**
     * Getter for upsertedRelationships
     * 
     * @see MetadataGraphEvent.Fields#upsertedRelationships
     */
    public RelationshipArray getUpsertedRelationships(GetMode mode) {
        return obtainWrapped(FIELD_UpsertedRelationships, RelationshipArray.class, mode);
    }

    /**
     * Getter for upsertedRelationships
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MetadataGraphEvent.Fields#upsertedRelationships
     */
    @Nonnull
    public RelationshipArray getUpsertedRelationships() {
        return obtainWrapped(FIELD_UpsertedRelationships, RelationshipArray.class, GetMode.STRICT);
    }

    /**
     * Setter for upsertedRelationships
     * 
     * @see MetadataGraphEvent.Fields#upsertedRelationships
     */
    public MetadataGraphEvent setUpsertedRelationships(RelationshipArray value, SetMode mode) {
        putWrapped(FIELD_UpsertedRelationships, RelationshipArray.class, value, mode);
        return this;
    }

    /**
     * Setter for upsertedRelationships
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataGraphEvent.Fields#upsertedRelationships
     */
    public MetadataGraphEvent setUpsertedRelationships(
        @Nonnull
        RelationshipArray value) {
        putWrapped(FIELD_UpsertedRelationships, RelationshipArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MetadataGraphEvent clone()
        throws CloneNotSupportedException
    {
        return ((MetadataGraphEvent) super.clone());
    }

    @Override
    public MetadataGraphEvent copy()
        throws CloneNotSupportedException
    {
        return ((MetadataGraphEvent) super.copy());
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
         * Kafka audit header. See go/kafkaauditheader for more info.
         * 
         */
        public com.linkedin.avro2pegasus.events.KafkaAuditHeader.Fields auditHeader() {
            return new com.linkedin.avro2pegasus.events.KafkaAuditHeader.Fields(getPathComponents(), "auditHeader");
        }

        /**
         * A list of entity updates-or-inserts. Only fields updated are set in the case of partial update.
         * 
         */
        public com.linkedin.metadata.entity.EntityArray.Fields upsertedEntities() {
            return new com.linkedin.metadata.entity.EntityArray.Fields(getPathComponents(), "upsertedEntities");
        }

        /**
         * A list of entity updates-or-inserts. Only fields updated are set in the case of partial update.
         * 
         */
        public PathSpec upsertedEntities(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "upsertedEntities");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A list of removed relationships. Only fields used to identify the relationships to remove are set.
         * 
         */
        public com.linkedin.metadata.relationship.RelationshipArray.Fields removedRelationships() {
            return new com.linkedin.metadata.relationship.RelationshipArray.Fields(getPathComponents(), "removedRelationships");
        }

        /**
         * A list of removed relationships. Only fields used to identify the relationships to remove are set.
         * 
         */
        public PathSpec removedRelationships(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "removedRelationships");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * A list of relationship updates-or-inserts.
         * 
         */
        public com.linkedin.metadata.relationship.RelationshipArray.Fields upsertedRelationships() {
            return new com.linkedin.metadata.relationship.RelationshipArray.Fields(getPathComponents(), "upsertedRelationships");
        }

        /**
         * A list of relationship updates-or-inserts.
         * 
         */
        public PathSpec upsertedRelationships(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "upsertedRelationships");
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
