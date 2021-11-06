
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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.events.metadata.ChangeType;


/**
 * Kafka event for proposing a metadata change for an entity. A corresponding MetadataChangeLog is emitted when the change is accepted and committed, otherwise a FailedMetadataChangeProposal will be emitted instead.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/mxe/MetadataChangeProposal.pdl.")
public class MetadataChangeProposal
    extends RecordTemplate
{

    private final static MetadataChangeProposal.Fields _fields = new MetadataChangeProposal.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**Kafka event for proposing a metadata change for an entity. A corresponding MetadataChangeLog is emitted when the change is accepted and committed, otherwise a FailedMetadataChangeProposal will be emitted instead.*/record MetadataChangeProposal{/**Kafka audit header. See go/kafkaauditheader for more info.*/auditHeader:optional{namespace com.linkedin.avro2pegasus.events/**This header records information about the context of an event as it is emitted into kafka and is intended to be used by the kafka audit application.  For more information see go/kafkaauditheader*/record KafkaAuditHeader{/**The time at which the event was emitted into kafka.*/@compliance=[{\"policy\":\"EVENT_TIME\"}]time:long/**The fully qualified name of the host from which the event is being emitted.*/@compliance=\"NONE\"server:string/**The instance on the server from which the event is being emitted. e.g. i001*/@compliance=\"NONE\"instance:optional string/**The name of the application from which the event is being emitted. see go/appname*/@compliance=\"NONE\"appName:string/**A unique identifier for the message*/@compliance=\"NONE\"messageId:fixed UUID 16/**The version that is being used for auditing. In version 0, the audit trail buckets events into 10 minute audit windows based on the EventHeader timestamp. In version 1, the audit trail buckets events as follows: if the schema has an outer KafkaAuditHeader, use the outer audit header timestamp for bucketing; else if the EventHeader has an inner KafkaAuditHeader use that inner audit header's timestamp for bucketing*/@compliance=\"NONE\"auditVersion:optional int/**The fabricUrn of the host from which the event is being emitted. Fabric Urn in the format of urn:li:fabric:{fabric_name}. See go/fabric.*/@compliance=\"NONE\"fabricUrn:optional string/**This is a String that the client uses to establish some kind of connection with the Kafka cluster. The exact format of it depends on specific versions of clients and brokers. This information could potentially identify the fabric and cluster with which the client is producing to or consuming from.*/@compliance=\"NONE\"clusterConnectionString:optional string}}/**Type of the entity being written to*/entityType:string/**Urn of the entity being written\n*/entityUrn:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Key aspect of the entity being written*/entityKeyAspect:optional/**Generic record structure for serializing an Aspect\n*/record GenericAspect{value:bytes,contentType:string}/**Type of change being proposed*/changeType:{namespace com.linkedin.events.metadata/**Descriptor for a change action*/enum ChangeType{/**insert if not exists. otherwise update*/UPSERT/**NOT SUPPORTED YET\ninsert if not exists. otherwise fail*/CREATE/**NOT SUPPORTED YET\nupdate if exists. otherwise fail*/UPDATE/**NOT SUPPORTED YET\ndelete action*/DELETE/**NOT SUPPORTED YET\npatch the changes instead of full replace*/PATCH}}/**Aspect of the entity being written to\nNot filling this out implies that the writer wants to affect the entire entity\nNote: This is only valid for CREATE and DELETE operations.\n*/aspectName:optional string,aspect:optional GenericAspect/**A string->string map of custom properties that one might want to attach to an event\n*/systemMetadata:optional/**Kafka event for proposing a metadata change for an entity. A corresponding MetadataAuditEvent is emitted when the change is accepted and committed, otherwise a FailedMetadataChangeEvent will be emitted instead.*/record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The run id that produced the metadata*/runId:optional string=\"no-run-id-provided\"/**Additional properties*/properties:optional map[string,string]}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_AuditHeader = SCHEMA.getField("auditHeader");
    private final static RecordDataSchema.Field FIELD_EntityType = SCHEMA.getField("entityType");
    private final static RecordDataSchema.Field FIELD_EntityUrn = SCHEMA.getField("entityUrn");
    private final static RecordDataSchema.Field FIELD_EntityKeyAspect = SCHEMA.getField("entityKeyAspect");
    private final static RecordDataSchema.Field FIELD_ChangeType = SCHEMA.getField("changeType");
    private final static RecordDataSchema.Field FIELD_AspectName = SCHEMA.getField("aspectName");
    private final static RecordDataSchema.Field FIELD_Aspect = SCHEMA.getField("aspect");
    private final static RecordDataSchema.Field FIELD_SystemMetadata = SCHEMA.getField("systemMetadata");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public MetadataChangeProposal() {
        super(new DataMap(11, 0.75F), SCHEMA, 6);
    }

    public MetadataChangeProposal(DataMap data) {
        super(data, SCHEMA);
    }

    public static MetadataChangeProposal.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for auditHeader
     * 
     * @see MetadataChangeProposal.Fields#auditHeader
     */
    public boolean hasAuditHeader() {
        return contains(FIELD_AuditHeader);
    }

    /**
     * Remover for auditHeader
     * 
     * @see MetadataChangeProposal.Fields#auditHeader
     */
    public void removeAuditHeader() {
        remove(FIELD_AuditHeader);
    }

    /**
     * Getter for auditHeader
     * 
     * @see MetadataChangeProposal.Fields#auditHeader
     */
    public KafkaAuditHeader getAuditHeader(GetMode mode) {
        return obtainWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, mode);
    }

    /**
     * Getter for auditHeader
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataChangeProposal.Fields#auditHeader
     */
    @Nullable
    public KafkaAuditHeader getAuditHeader() {
        return obtainWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, GetMode.STRICT);
    }

    /**
     * Setter for auditHeader
     * 
     * @see MetadataChangeProposal.Fields#auditHeader
     */
    public MetadataChangeProposal setAuditHeader(KafkaAuditHeader value, SetMode mode) {
        putWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, value, mode);
        return this;
    }

    /**
     * Setter for auditHeader
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#auditHeader
     */
    public MetadataChangeProposal setAuditHeader(
        @Nonnull
        KafkaAuditHeader value) {
        putWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for entityType
     * 
     * @see MetadataChangeProposal.Fields#entityType
     */
    public boolean hasEntityType() {
        return contains(FIELD_EntityType);
    }

    /**
     * Remover for entityType
     * 
     * @see MetadataChangeProposal.Fields#entityType
     */
    public void removeEntityType() {
        remove(FIELD_EntityType);
    }

    /**
     * Getter for entityType
     * 
     * @see MetadataChangeProposal.Fields#entityType
     */
    public String getEntityType(GetMode mode) {
        return obtainDirect(FIELD_EntityType, String.class, mode);
    }

    /**
     * Getter for entityType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MetadataChangeProposal.Fields#entityType
     */
    @Nonnull
    public String getEntityType() {
        return obtainDirect(FIELD_EntityType, String.class, GetMode.STRICT);
    }

    /**
     * Setter for entityType
     * 
     * @see MetadataChangeProposal.Fields#entityType
     */
    public MetadataChangeProposal setEntityType(String value, SetMode mode) {
        putDirect(FIELD_EntityType, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for entityType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#entityType
     */
    public MetadataChangeProposal setEntityType(
        @Nonnull
        String value) {
        putDirect(FIELD_EntityType, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for entityUrn
     * 
     * @see MetadataChangeProposal.Fields#entityUrn
     */
    public boolean hasEntityUrn() {
        return contains(FIELD_EntityUrn);
    }

    /**
     * Remover for entityUrn
     * 
     * @see MetadataChangeProposal.Fields#entityUrn
     */
    public void removeEntityUrn() {
        remove(FIELD_EntityUrn);
    }

    /**
     * Getter for entityUrn
     * 
     * @see MetadataChangeProposal.Fields#entityUrn
     */
    public com.linkedin.common.urn.Urn getEntityUrn(GetMode mode) {
        return obtainCustomType(FIELD_EntityUrn, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for entityUrn
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataChangeProposal.Fields#entityUrn
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntityUrn() {
        return obtainCustomType(FIELD_EntityUrn, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for entityUrn
     * 
     * @see MetadataChangeProposal.Fields#entityUrn
     */
    public MetadataChangeProposal setEntityUrn(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_EntityUrn, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for entityUrn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#entityUrn
     */
    public MetadataChangeProposal setEntityUrn(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_EntityUrn, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for entityKeyAspect
     * 
     * @see MetadataChangeProposal.Fields#entityKeyAspect
     */
    public boolean hasEntityKeyAspect() {
        return contains(FIELD_EntityKeyAspect);
    }

    /**
     * Remover for entityKeyAspect
     * 
     * @see MetadataChangeProposal.Fields#entityKeyAspect
     */
    public void removeEntityKeyAspect() {
        remove(FIELD_EntityKeyAspect);
    }

    /**
     * Getter for entityKeyAspect
     * 
     * @see MetadataChangeProposal.Fields#entityKeyAspect
     */
    public GenericAspect getEntityKeyAspect(GetMode mode) {
        return obtainWrapped(FIELD_EntityKeyAspect, GenericAspect.class, mode);
    }

    /**
     * Getter for entityKeyAspect
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataChangeProposal.Fields#entityKeyAspect
     */
    @Nullable
    public GenericAspect getEntityKeyAspect() {
        return obtainWrapped(FIELD_EntityKeyAspect, GenericAspect.class, GetMode.STRICT);
    }

    /**
     * Setter for entityKeyAspect
     * 
     * @see MetadataChangeProposal.Fields#entityKeyAspect
     */
    public MetadataChangeProposal setEntityKeyAspect(GenericAspect value, SetMode mode) {
        putWrapped(FIELD_EntityKeyAspect, GenericAspect.class, value, mode);
        return this;
    }

    /**
     * Setter for entityKeyAspect
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#entityKeyAspect
     */
    public MetadataChangeProposal setEntityKeyAspect(
        @Nonnull
        GenericAspect value) {
        putWrapped(FIELD_EntityKeyAspect, GenericAspect.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for changeType
     * 
     * @see MetadataChangeProposal.Fields#changeType
     */
    public boolean hasChangeType() {
        return contains(FIELD_ChangeType);
    }

    /**
     * Remover for changeType
     * 
     * @see MetadataChangeProposal.Fields#changeType
     */
    public void removeChangeType() {
        remove(FIELD_ChangeType);
    }

    /**
     * Getter for changeType
     * 
     * @see MetadataChangeProposal.Fields#changeType
     */
    public ChangeType getChangeType(GetMode mode) {
        return obtainDirect(FIELD_ChangeType, ChangeType.class, mode);
    }

    /**
     * Getter for changeType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MetadataChangeProposal.Fields#changeType
     */
    @Nonnull
    public ChangeType getChangeType() {
        return obtainDirect(FIELD_ChangeType, ChangeType.class, GetMode.STRICT);
    }

    /**
     * Setter for changeType
     * 
     * @see MetadataChangeProposal.Fields#changeType
     */
    public MetadataChangeProposal setChangeType(ChangeType value, SetMode mode) {
        putDirect(FIELD_ChangeType, ChangeType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for changeType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#changeType
     */
    public MetadataChangeProposal setChangeType(
        @Nonnull
        ChangeType value) {
        putDirect(FIELD_ChangeType, ChangeType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aspectName
     * 
     * @see MetadataChangeProposal.Fields#aspectName
     */
    public boolean hasAspectName() {
        return contains(FIELD_AspectName);
    }

    /**
     * Remover for aspectName
     * 
     * @see MetadataChangeProposal.Fields#aspectName
     */
    public void removeAspectName() {
        remove(FIELD_AspectName);
    }

    /**
     * Getter for aspectName
     * 
     * @see MetadataChangeProposal.Fields#aspectName
     */
    public String getAspectName(GetMode mode) {
        return obtainDirect(FIELD_AspectName, String.class, mode);
    }

    /**
     * Getter for aspectName
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataChangeProposal.Fields#aspectName
     */
    @Nullable
    public String getAspectName() {
        return obtainDirect(FIELD_AspectName, String.class, GetMode.STRICT);
    }

    /**
     * Setter for aspectName
     * 
     * @see MetadataChangeProposal.Fields#aspectName
     */
    public MetadataChangeProposal setAspectName(String value, SetMode mode) {
        putDirect(FIELD_AspectName, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for aspectName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#aspectName
     */
    public MetadataChangeProposal setAspectName(
        @Nonnull
        String value) {
        putDirect(FIELD_AspectName, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aspect
     * 
     * @see MetadataChangeProposal.Fields#aspect
     */
    public boolean hasAspect() {
        return contains(FIELD_Aspect);
    }

    /**
     * Remover for aspect
     * 
     * @see MetadataChangeProposal.Fields#aspect
     */
    public void removeAspect() {
        remove(FIELD_Aspect);
    }

    /**
     * Getter for aspect
     * 
     * @see MetadataChangeProposal.Fields#aspect
     */
    public GenericAspect getAspect(GetMode mode) {
        return obtainWrapped(FIELD_Aspect, GenericAspect.class, mode);
    }

    /**
     * Getter for aspect
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataChangeProposal.Fields#aspect
     */
    @Nullable
    public GenericAspect getAspect() {
        return obtainWrapped(FIELD_Aspect, GenericAspect.class, GetMode.STRICT);
    }

    /**
     * Setter for aspect
     * 
     * @see MetadataChangeProposal.Fields#aspect
     */
    public MetadataChangeProposal setAspect(GenericAspect value, SetMode mode) {
        putWrapped(FIELD_Aspect, GenericAspect.class, value, mode);
        return this;
    }

    /**
     * Setter for aspect
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#aspect
     */
    public MetadataChangeProposal setAspect(
        @Nonnull
        GenericAspect value) {
        putWrapped(FIELD_Aspect, GenericAspect.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for systemMetadata
     * 
     * @see MetadataChangeProposal.Fields#systemMetadata
     */
    public boolean hasSystemMetadata() {
        return contains(FIELD_SystemMetadata);
    }

    /**
     * Remover for systemMetadata
     * 
     * @see MetadataChangeProposal.Fields#systemMetadata
     */
    public void removeSystemMetadata() {
        remove(FIELD_SystemMetadata);
    }

    /**
     * Getter for systemMetadata
     * 
     * @see MetadataChangeProposal.Fields#systemMetadata
     */
    public SystemMetadata getSystemMetadata(GetMode mode) {
        return obtainWrapped(FIELD_SystemMetadata, SystemMetadata.class, mode);
    }

    /**
     * Getter for systemMetadata
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataChangeProposal.Fields#systemMetadata
     */
    @Nullable
    public SystemMetadata getSystemMetadata() {
        return obtainWrapped(FIELD_SystemMetadata, SystemMetadata.class, GetMode.STRICT);
    }

    /**
     * Setter for systemMetadata
     * 
     * @see MetadataChangeProposal.Fields#systemMetadata
     */
    public MetadataChangeProposal setSystemMetadata(SystemMetadata value, SetMode mode) {
        putWrapped(FIELD_SystemMetadata, SystemMetadata.class, value, mode);
        return this;
    }

    /**
     * Setter for systemMetadata
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataChangeProposal.Fields#systemMetadata
     */
    public MetadataChangeProposal setSystemMetadata(
        @Nonnull
        SystemMetadata value) {
        putWrapped(FIELD_SystemMetadata, SystemMetadata.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MetadataChangeProposal clone()
        throws CloneNotSupportedException
    {
        return ((MetadataChangeProposal) super.clone());
    }

    @Override
    public MetadataChangeProposal copy()
        throws CloneNotSupportedException
    {
        return ((MetadataChangeProposal) super.copy());
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
         * Type of the entity being written to
         * 
         */
        public PathSpec entityType() {
            return new PathSpec(getPathComponents(), "entityType");
        }

        /**
         * Urn of the entity being written
         * 
         * 
         */
        public PathSpec entityUrn() {
            return new PathSpec(getPathComponents(), "entityUrn");
        }

        /**
         * Key aspect of the entity being written
         * 
         */
        public com.linkedin.mxe.GenericAspect.Fields entityKeyAspect() {
            return new com.linkedin.mxe.GenericAspect.Fields(getPathComponents(), "entityKeyAspect");
        }

        /**
         * Type of change being proposed
         * 
         */
        public PathSpec changeType() {
            return new PathSpec(getPathComponents(), "changeType");
        }

        /**
         * Aspect of the entity being written to
         * Not filling this out implies that the writer wants to affect the entire entity
         * Note: This is only valid for CREATE and DELETE operations.
         * 
         * 
         */
        public PathSpec aspectName() {
            return new PathSpec(getPathComponents(), "aspectName");
        }

        public com.linkedin.mxe.GenericAspect.Fields aspect() {
            return new com.linkedin.mxe.GenericAspect.Fields(getPathComponents(), "aspect");
        }

        /**
         * A string->string map of custom properties that one might want to attach to an event
         * 
         * 
         */
        public com.linkedin.mxe.SystemMetadata.Fields systemMetadata() {
            return new com.linkedin.mxe.SystemMetadata.Fields(getPathComponents(), "systemMetadata");
        }

    }

}
