
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
import com.linkedin.metadata.search.DocumentArray;


/**
 * Kafka event for capturing update made to a list of search documents.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/mxe/MetadataSearchEvent.pdl.")
public class MetadataSearchEvent
    extends RecordTemplate
{

    private final static MetadataSearchEvent.Fields _fields = new MetadataSearchEvent.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.mxe/**Kafka event for capturing update made to a list of search documents.*/record MetadataSearchEvent{/**Kafka audit header. See go/kafkaauditheader for more info.*/auditHeader:optional{namespace com.linkedin.avro2pegasus.events/**This header records information about the context of an event as it is emitted into kafka and is intended to be used by the kafka audit application.  For more information see go/kafkaauditheader*/record KafkaAuditHeader{/**The time at which the event was emitted into kafka.*/@compliance=[{\"policy\":\"EVENT_TIME\"}]time:long/**The fully qualified name of the host from which the event is being emitted.*/@compliance=\"NONE\"server:string/**The instance on the server from which the event is being emitted. e.g. i001*/@compliance=\"NONE\"instance:optional string/**The name of the application from which the event is being emitted. see go/appname*/@compliance=\"NONE\"appName:string/**A unique identifier for the message*/@compliance=\"NONE\"messageId:fixed UUID 16/**The version that is being used for auditing. In version 0, the audit trail buckets events into 10 minute audit windows based on the EventHeader timestamp. In version 1, the audit trail buckets events as follows: if the schema has an outer KafkaAuditHeader, use the outer audit header timestamp for bucketing; else if the EventHeader has an inner KafkaAuditHeader use that inner audit header's timestamp for bucketing*/@compliance=\"NONE\"auditVersion:optional int/**The fabricUrn of the host from which the event is being emitted. Fabric Urn in the format of urn:li:fabric:{fabric_name}. See go/fabric.*/@compliance=\"NONE\"fabricUrn:optional string/**This is a String that the client uses to establish some kind of connection with the Kafka cluster. The exact format of it depends on specific versions of clients and brokers. This information could potentially identify the fabric and cluster with which the client is producing to or consuming from.*/@compliance=\"NONE\"clusterConnectionString:optional string}}/**A list of search document updates-or-inserts. Only fields updated are set in the case of partial update.*/upsertedDocuments:array[{namespace com.linkedin.metadata.search/**A union of all supported document types.*/typeref Document=union[/**Data model for CorpUserInfo entity search*/record CorpUserInfoDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{/**Urn for the CorpUser.*/urn:{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}/**ldap of the CorpUser*/ldap:optional string/**title of the CorpUser*/title:optional string/**direct manager's ldap of the CorpUser*/managerLdap:optional string/**Common name of the CorpUser, format is firstName + lastName (split by a whitespace)*/fullName:optional string/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/teams:optional array[string]/**Skills that the user possesses e.g. Machine Learning*/skills:optional array[string]/**Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/active:optional boolean/**The user's full email(s).*/emails:optional array[string]}/**Data model for dataset entity search*/record DatasetDocument includes BaseDocument{/**Urn for the dataset*/urn:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Dataset native name e.g. {db}.{table}, /dir/subdir/{name}, or {name}*/name:optional string/**Platform name for the dataset*/platform:optional string/**Fabric type where dataset belongs to or where it was generated*/origin:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}/**LDAP usernames of corp users who are the owners of this dataset*/owners:optional array[string]/**Flag to indicate if the dataset is deprecated.*/deprecated:optional boolean/**Documentation of the dataset.*/description:optional string/**Field paths of the dataset*/fieldPaths:optional array[string]/**Flag to indicate if the dataset has non empty corp users as owners or not.*/hasOwners:optional boolean/**Flag to indicate if the dataset has non-empty schema or not.*/hasSchema:optional boolean/**Lineage information represented by the number of immediate downstream datasets of this dataset.*/numDownstreamDatasets:optional long/**List of upstreams for this dataset*/upstreams:optional array[com.linkedin.common.DatasetUrn]/**List of tags for this dataset*/tags:optional array[string]/**List of field descriptions*/fieldDescriptions:optional array[string]/**List of tags applied to fields*/fieldTags:optional array[string]/**List of field descriptions*/editedFieldDescriptions:optional array[string]/**List of tags applied to fields*/editedFieldTags:optional array[string]/**List of terms for this dataset*/glossaryTerms:optional array[string]}]}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_AuditHeader = SCHEMA.getField("auditHeader");
    private final static RecordDataSchema.Field FIELD_UpsertedDocuments = SCHEMA.getField("upsertedDocuments");

    public MetadataSearchEvent() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
    }

    public MetadataSearchEvent(DataMap data) {
        super(data, SCHEMA);
    }

    public static MetadataSearchEvent.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for auditHeader
     * 
     * @see MetadataSearchEvent.Fields#auditHeader
     */
    public boolean hasAuditHeader() {
        return contains(FIELD_AuditHeader);
    }

    /**
     * Remover for auditHeader
     * 
     * @see MetadataSearchEvent.Fields#auditHeader
     */
    public void removeAuditHeader() {
        remove(FIELD_AuditHeader);
    }

    /**
     * Getter for auditHeader
     * 
     * @see MetadataSearchEvent.Fields#auditHeader
     */
    public KafkaAuditHeader getAuditHeader(GetMode mode) {
        return obtainWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, mode);
    }

    /**
     * Getter for auditHeader
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MetadataSearchEvent.Fields#auditHeader
     */
    @Nullable
    public KafkaAuditHeader getAuditHeader() {
        return obtainWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, GetMode.STRICT);
    }

    /**
     * Setter for auditHeader
     * 
     * @see MetadataSearchEvent.Fields#auditHeader
     */
    public MetadataSearchEvent setAuditHeader(KafkaAuditHeader value, SetMode mode) {
        putWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, value, mode);
        return this;
    }

    /**
     * Setter for auditHeader
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataSearchEvent.Fields#auditHeader
     */
    public MetadataSearchEvent setAuditHeader(
        @Nonnull
        KafkaAuditHeader value) {
        putWrapped(FIELD_AuditHeader, KafkaAuditHeader.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for upsertedDocuments
     * 
     * @see MetadataSearchEvent.Fields#upsertedDocuments
     */
    public boolean hasUpsertedDocuments() {
        return contains(FIELD_UpsertedDocuments);
    }

    /**
     * Remover for upsertedDocuments
     * 
     * @see MetadataSearchEvent.Fields#upsertedDocuments
     */
    public void removeUpsertedDocuments() {
        remove(FIELD_UpsertedDocuments);
    }

    /**
     * Getter for upsertedDocuments
     * 
     * @see MetadataSearchEvent.Fields#upsertedDocuments
     */
    public DocumentArray getUpsertedDocuments(GetMode mode) {
        return obtainWrapped(FIELD_UpsertedDocuments, DocumentArray.class, mode);
    }

    /**
     * Getter for upsertedDocuments
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MetadataSearchEvent.Fields#upsertedDocuments
     */
    @Nonnull
    public DocumentArray getUpsertedDocuments() {
        return obtainWrapped(FIELD_UpsertedDocuments, DocumentArray.class, GetMode.STRICT);
    }

    /**
     * Setter for upsertedDocuments
     * 
     * @see MetadataSearchEvent.Fields#upsertedDocuments
     */
    public MetadataSearchEvent setUpsertedDocuments(DocumentArray value, SetMode mode) {
        putWrapped(FIELD_UpsertedDocuments, DocumentArray.class, value, mode);
        return this;
    }

    /**
     * Setter for upsertedDocuments
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MetadataSearchEvent.Fields#upsertedDocuments
     */
    public MetadataSearchEvent setUpsertedDocuments(
        @Nonnull
        DocumentArray value) {
        putWrapped(FIELD_UpsertedDocuments, DocumentArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MetadataSearchEvent clone()
        throws CloneNotSupportedException
    {
        return ((MetadataSearchEvent) super.clone());
    }

    @Override
    public MetadataSearchEvent copy()
        throws CloneNotSupportedException
    {
        return ((MetadataSearchEvent) super.copy());
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
         * A list of search document updates-or-inserts. Only fields updated are set in the case of partial update.
         * 
         */
        public com.linkedin.metadata.search.DocumentArray.Fields upsertedDocuments() {
            return new com.linkedin.metadata.search.DocumentArray.Fields(getPathComponents(), "upsertedDocuments");
        }

        /**
         * A list of search document updates-or-inserts. Only fields updated are set in the case of partial update.
         * 
         */
        public PathSpec upsertedDocuments(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "upsertedDocuments");
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
