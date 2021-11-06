
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


/**
 * Kafka event for capturing a failure to process a specific MetadataChangeEvent.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/mxe/FailedMetadataChangeProposal.pdl.")
public class FailedMetadataChangeProposal
    extends RecordTemplate
{

    private final static FailedMetadataChangeProposal.Fields _fields = new FailedMetadataChangeProposal.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**Kafka event for capturing a failure to process a specific MetadataChangeEvent.*/record FailedMetadataChangeProposal{/**Kafka audit header. See go/kafkaauditheader for more info.*/auditHeader:optional{namespace com.linkedin.avro2pegasus.events/**This header records information about the context of an event as it is emitted into kafka and is intended to be used by the kafka audit application.  For more information see go/kafkaauditheader*/record KafkaAuditHeader{/**The time at which the event was emitted into kafka.*/@compliance=[{\"policy\":\"EVENT_TIME\"}]time:long/**The fully qualified name of the host from which the event is being emitted.*/@compliance=\"NONE\"server:string/**The instance on the server from which the event is being emitted. e.g. i001*/@compliance=\"NONE\"instance:optional string/**The name of the application from which the event is being emitted. see go/appname*/@compliance=\"NONE\"appName:string/**A unique identifier for the message*/@compliance=\"NONE\"messageId:fixed UUID 16/**The version that is being used for auditing. In version 0, the audit trail buckets events into 10 minute audit windows based on the EventHeader timestamp. In version 1, the audit trail buckets events as follows: if the schema has an outer KafkaAuditHeader, use the outer audit header timestamp for bucketing; else if the EventHeader has an inner KafkaAuditHeader use that inner audit header's timestamp for bucketing*/@compliance=\"NONE\"auditVersion:optional int/**The fabricUrn of the host from which the event is being emitted. Fabric Urn in the format of urn:li:fabric:{fabric_name}. See go/fabric.*/@compliance=\"NONE\"fabricUrn:optional string/**This is a String that the client uses to establish some kind of connection with the Kafka cluster. The exact format of it depends on specific versions of clients and brokers. This information could potentially identify the fabric and cluster with which the client is producing to or consuming from.*/@compliance=\"NONE\"clusterConnectionString:optional string}}/**The even that failed to be processed.*/metadataChangeProposal:/**Kafka event for proposing a metadata change for an entity. A corresponding MetadataChangeLog is emitted when the change is accepted and committed, otherwise a FailedMetadataChangeProposal will be emitted instead.*/record MetadataChangeProposal{/**Kafka audit header. See go/kafkaauditheader for more info.*/auditHeader:optional com.linkedin.avro2pegasus.events.KafkaAuditHeader/**Type of the entity being written to*/entityType:string/**Urn of the entity being written\n*/entityUrn:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Key aspect of the entity being written*/entityKeyAspect:optional/**Generic record structure for serializing an Aspect\n*/record GenericAspect{value:bytes,contentType:string}/**Type of change being proposed*/changeType:{namespace com.linkedin.events.metadata/**Descriptor for a change action*/enum ChangeType{/**insert if not exists. otherwise update*/UPSERT/**NOT SUPPORTED YET\ninsert if not exists. otherwise fail*/CREATE/**NOT SUPPORTED YET\nupdate if exists. otherwise fail*/UPDATE/**NOT SUPPORTED YET\ndelete action*/DELETE/**NOT SUPPORTED YET\npatch the changes instead of full replace*/PATCH}}/**Aspect of the entity being written to\nNot filling this out implies that the writer wants to affect the entire entity\nNote: This is only valid for CREATE and DELETE operations.\n*/aspectName:optional string,aspect:optional GenericAspect/**A string->string map of custom properties that one might want to attach to an event\n*/systemMetadata:optional/**Kafka event for proposing a metadata change for an entity. A corresponding MetadataAuditEvent is emitted when the change is accepted and committed, otherwise a FailedMetadataChangeEvent will be emitted instead.*/record SystemMetadata{/**The timestamp the metadata was observed at*/lastObserved:optional long=0/**The run id that produced the metadata*/runId:optional string=\"no-run-id-provided\"/**Additional properties*/properties:optional map[string,string]}}/**The error message or the stacktrace for the failure.*/error:string}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_AuditHeader = SCHEMA.getField("auditHeader");
    private final static RecordDataSchema.Field FIELD_MetadataChangeProposal = SCHEMA.getField("metadataChangeProposal");
    private final static RecordDataSchema.Field FIELD_Error = SCHEMA.getField("error");

    public FailedMetadataChangeProposal() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
    }

    public FailedMetadataChangeProposal(DataMap data) {
        super(data, SCHEMA);
    }

    public static FailedMetadataChangeProposal.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for auditHeader
     * 
     * @see FailedMetadataChangeProposal.Fields#auditHeader
     */
    public boolean hasAuditHeader() {
        return contains(FIELD_AuditHeader);
    }

    /**
     * Remover for auditHeader
     * 
     * @see FailedMetadataChangeProposal.Fields#auditHeader
     */
    public void removeAuditHeader() {
        remove(FIELD_AuditHeader);
    }

    /**
     * Getter for auditHeader
     * 
     * @see FailedMetadataChangeProposal.Fields#auditHeader
     */
    public KafkaAuditHeader getAuditHeader(GetMode mode) {
        return obtainWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, mode);
    }

    /**
     * Getter for auditHeader
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FailedMetadataChangeProposal.Fields#auditHeader
     */
    @Nullable
    public KafkaAuditHeader getAuditHeader() {
        return obtainWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, GetMode.STRICT);
    }

    /**
     * Setter for auditHeader
     * 
     * @see FailedMetadataChangeProposal.Fields#auditHeader
     */
    public FailedMetadataChangeProposal setAuditHeader(KafkaAuditHeader value, SetMode mode) {
        putWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, value, mode);
        return this;
    }

    /**
     * Setter for auditHeader
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FailedMetadataChangeProposal.Fields#auditHeader
     */
    public FailedMetadataChangeProposal setAuditHeader(
        @Nonnull
        KafkaAuditHeader value) {
        putWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for metadataChangeProposal
     * 
     * @see FailedMetadataChangeProposal.Fields#metadataChangeProposal
     */
    public boolean hasMetadataChangeProposal() {
        return contains(FIELD_MetadataChangeProposal);
    }

    /**
     * Remover for metadataChangeProposal
     * 
     * @see FailedMetadataChangeProposal.Fields#metadataChangeProposal
     */
    public void removeMetadataChangeProposal() {
        remove(FIELD_MetadataChangeProposal);
    }

    /**
     * Getter for metadataChangeProposal
     * 
     * @see FailedMetadataChangeProposal.Fields#metadataChangeProposal
     */
    public MetadataChangeProposal getMetadataChangeProposal(GetMode mode) {
        return obtainWrapped(FIELD_MetadataChangeProposal, MetadataChangeProposal.class, mode);
    }

    /**
     * Getter for metadataChangeProposal
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FailedMetadataChangeProposal.Fields#metadataChangeProposal
     */
    @Nonnull
    public MetadataChangeProposal getMetadataChangeProposal() {
        return obtainWrapped(FIELD_MetadataChangeProposal, MetadataChangeProposal.class, GetMode.STRICT);
    }

    /**
     * Setter for metadataChangeProposal
     * 
     * @see FailedMetadataChangeProposal.Fields#metadataChangeProposal
     */
    public FailedMetadataChangeProposal setMetadataChangeProposal(MetadataChangeProposal value, SetMode mode) {
        putWrapped(FIELD_MetadataChangeProposal, MetadataChangeProposal.class, value, mode);
        return this;
    }

    /**
     * Setter for metadataChangeProposal
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FailedMetadataChangeProposal.Fields#metadataChangeProposal
     */
    public FailedMetadataChangeProposal setMetadataChangeProposal(
        @Nonnull
        MetadataChangeProposal value) {
        putWrapped(FIELD_MetadataChangeProposal, MetadataChangeProposal.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for error
     * 
     * @see FailedMetadataChangeProposal.Fields#error
     */
    public boolean hasError() {
        return contains(FIELD_Error);
    }

    /**
     * Remover for error
     * 
     * @see FailedMetadataChangeProposal.Fields#error
     */
    public void removeError() {
        remove(FIELD_Error);
    }

    /**
     * Getter for error
     * 
     * @see FailedMetadataChangeProposal.Fields#error
     */
    public String getError(GetMode mode) {
        return obtainDirect(FIELD_Error, String.class, mode);
    }

    /**
     * Getter for error
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FailedMetadataChangeProposal.Fields#error
     */
    @Nonnull
    public String getError() {
        return obtainDirect(FIELD_Error, String.class, GetMode.STRICT);
    }

    /**
     * Setter for error
     * 
     * @see FailedMetadataChangeProposal.Fields#error
     */
    public FailedMetadataChangeProposal setError(String value, SetMode mode) {
        putDirect(FIELD_Error, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for error
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FailedMetadataChangeProposal.Fields#error
     */
    public FailedMetadataChangeProposal setError(
        @Nonnull
        String value) {
        putDirect(FIELD_Error, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public FailedMetadataChangeProposal clone()
        throws CloneNotSupportedException
    {
        return ((FailedMetadataChangeProposal) super.clone());
    }

    @Override
    public FailedMetadataChangeProposal copy()
        throws CloneNotSupportedException
    {
        return ((FailedMetadataChangeProposal) super.copy());
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
         * The even that failed to be processed.
         * 
         */
        public com.linkedin.mxe.MetadataChangeProposal.Fields metadataChangeProposal() {
            return new com.linkedin.mxe.MetadataChangeProposal.Fields(getPathComponents(), "metadataChangeProposal");
        }

        /**
         * The error message or the stacktrace for the failure.
         * 
         */
        public PathSpec error() {
            return new PathSpec(getPathComponents(), "error");
        }

    }

}
