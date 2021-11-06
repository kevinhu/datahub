
package com.linkedin.dataset;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.common.AuditStamp;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Downstream lineage information about a dataset including the source reporting the lineage
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/Downstream.pdl.")
public class Downstream
    extends RecordTemplate
{

    private final static Downstream.Fields _fields = new Downstream.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Downstream lineage information about a dataset including the source reporting the lineage*/record Downstream{/**Audit stamp containing who reported the lineage and when*/auditStamp:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}/**The downstream dataset the lineage points to*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_AuditStamp = SCHEMA.getField("auditStamp");
    private final static RecordDataSchema.Field FIELD_Dataset = SCHEMA.getField("dataset");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
    }

    public Downstream() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public Downstream(DataMap data) {
        super(data, SCHEMA);
    }

    public static Downstream.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for auditStamp
     * 
     * @see Downstream.Fields#auditStamp
     */
    public boolean hasAuditStamp() {
        return contains(FIELD_AuditStamp);
    }

    /**
     * Remover for auditStamp
     * 
     * @see Downstream.Fields#auditStamp
     */
    public void removeAuditStamp() {
        remove(FIELD_AuditStamp);
    }

    /**
     * Getter for auditStamp
     * 
     * @see Downstream.Fields#auditStamp
     */
    public AuditStamp getAuditStamp(GetMode mode) {
        return obtainWrapped(FIELD_AuditStamp, AuditStamp.class, mode);
    }

    /**
     * Getter for auditStamp
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Downstream.Fields#auditStamp
     */
    @Nonnull
    public AuditStamp getAuditStamp() {
        return obtainWrapped(FIELD_AuditStamp, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for auditStamp
     * 
     * @see Downstream.Fields#auditStamp
     */
    public Downstream setAuditStamp(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_AuditStamp, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for auditStamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Downstream.Fields#auditStamp
     */
    public Downstream setAuditStamp(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_AuditStamp, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for dataset
     * 
     * @see Downstream.Fields#dataset
     */
    public boolean hasDataset() {
        return contains(FIELD_Dataset);
    }

    /**
     * Remover for dataset
     * 
     * @see Downstream.Fields#dataset
     */
    public void removeDataset() {
        remove(FIELD_Dataset);
    }

    /**
     * Getter for dataset
     * 
     * @see Downstream.Fields#dataset
     */
    public com.linkedin.common.urn.DatasetUrn getDataset(GetMode mode) {
        return obtainCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, mode);
    }

    /**
     * Getter for dataset
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Downstream.Fields#dataset
     */
    @Nonnull
    public com.linkedin.common.urn.DatasetUrn getDataset() {
        return obtainCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for dataset
     * 
     * @see Downstream.Fields#dataset
     */
    public Downstream setDataset(com.linkedin.common.urn.DatasetUrn value, SetMode mode) {
        putCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dataset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Downstream.Fields#dataset
     */
    public Downstream setDataset(
        @Nonnull
        com.linkedin.common.urn.DatasetUrn value) {
        putCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see Downstream.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see Downstream.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see Downstream.Fields#type
     */
    public DatasetLineageType getType(GetMode mode) {
        return obtainDirect(FIELD_Type, DatasetLineageType.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Downstream.Fields#type
     */
    @Nonnull
    public DatasetLineageType getType() {
        return obtainDirect(FIELD_Type, DatasetLineageType.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see Downstream.Fields#type
     */
    public Downstream setType(DatasetLineageType value, SetMode mode) {
        putDirect(FIELD_Type, DatasetLineageType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Downstream.Fields#type
     */
    public Downstream setType(
        @Nonnull
        DatasetLineageType value) {
        putDirect(FIELD_Type, DatasetLineageType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Downstream clone()
        throws CloneNotSupportedException
    {
        return ((Downstream) super.clone());
    }

    @Override
    public Downstream copy()
        throws CloneNotSupportedException
    {
        return ((Downstream) super.copy());
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
         * Audit stamp containing who reported the lineage and when
         * 
         */
        public com.linkedin.common.AuditStamp.Fields auditStamp() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "auditStamp");
        }

        /**
         * The downstream dataset the lineage points to
         * 
         */
        public PathSpec dataset() {
            return new PathSpec(getPathComponents(), "dataset");
        }

        /**
         * The type of the lineage
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

    }

}
