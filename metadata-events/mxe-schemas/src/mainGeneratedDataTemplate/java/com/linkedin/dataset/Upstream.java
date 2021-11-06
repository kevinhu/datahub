
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
 * Upstream lineage information about a dataset including the source reporting the lineage
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/Upstream.pdl.")
public class Upstream
    extends RecordTemplate
{

    private final static Upstream.Fields _fields = new Upstream.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Upstream lineage information about a dataset including the source reporting the lineage*/record Upstream{/**Audit stamp containing who reported the lineage and when.\nWARNING: this field is deprecated and may be removed in a future release.*/@deprecated=\"we no longer associate a timestamp per upstream edge\"auditStamp:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**The upstream dataset the lineage points to*/@Relationship={\"name\":\"DownstreamOf\",\"entityTypes\":[\"dataset\"]}@Searchable={\"fieldName\":\"upstreams\",\"queryByDefault\":false,\"fieldType\":\"URN\"}dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_AuditStamp = SCHEMA.getField("auditStamp");
    private final static RecordDataSchema.Field FIELD_Dataset = SCHEMA.getField("dataset");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
    }

    public Upstream() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
    }

    public Upstream(DataMap data) {
        super(data, SCHEMA);
    }

    public static Upstream.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for auditStamp
     * 
     * @deprecated
     *     we no longer associate a timestamp per upstream edge
     * @see Upstream.Fields#auditStamp
     */
    @Deprecated
    public boolean hasAuditStamp() {
        return contains(FIELD_AuditStamp);
    }

    /**
     * Remover for auditStamp
     * 
     * @deprecated
     *     we no longer associate a timestamp per upstream edge
     * @see Upstream.Fields#auditStamp
     */
    @Deprecated
    public void removeAuditStamp() {
        remove(FIELD_AuditStamp);
    }

    /**
     * Getter for auditStamp
     * 
     * @deprecated
     *     we no longer associate a timestamp per upstream edge
     * @see Upstream.Fields#auditStamp
     */
    @Deprecated
    public AuditStamp getAuditStamp(GetMode mode) {
        return obtainWrapped(FIELD_AuditStamp, AuditStamp.class, mode);
    }

    /**
     * Getter for auditStamp
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @deprecated
     *     we no longer associate a timestamp per upstream edge
     * @see Upstream.Fields#auditStamp
     */
    @Deprecated
    @Nonnull
    public AuditStamp getAuditStamp() {
        return obtainWrapped(FIELD_AuditStamp, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for auditStamp
     * 
     * @deprecated
     *     we no longer associate a timestamp per upstream edge
     * @see Upstream.Fields#auditStamp
     */
    @Deprecated
    public Upstream setAuditStamp(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_AuditStamp, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for auditStamp
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @deprecated
     *     we no longer associate a timestamp per upstream edge
     * @see Upstream.Fields#auditStamp
     */
    @Deprecated
    public Upstream setAuditStamp(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_AuditStamp, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for dataset
     * 
     * @see Upstream.Fields#dataset
     */
    public boolean hasDataset() {
        return contains(FIELD_Dataset);
    }

    /**
     * Remover for dataset
     * 
     * @see Upstream.Fields#dataset
     */
    public void removeDataset() {
        remove(FIELD_Dataset);
    }

    /**
     * Getter for dataset
     * 
     * @see Upstream.Fields#dataset
     */
    public com.linkedin.common.urn.DatasetUrn getDataset(GetMode mode) {
        return obtainCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, mode);
    }

    /**
     * Getter for dataset
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Upstream.Fields#dataset
     */
    @Nonnull
    public com.linkedin.common.urn.DatasetUrn getDataset() {
        return obtainCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for dataset
     * 
     * @see Upstream.Fields#dataset
     */
    public Upstream setDataset(com.linkedin.common.urn.DatasetUrn value, SetMode mode) {
        putCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for dataset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Upstream.Fields#dataset
     */
    public Upstream setDataset(
        @Nonnull
        com.linkedin.common.urn.DatasetUrn value) {
        putCustomType(FIELD_Dataset, com.linkedin.common.urn.DatasetUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see Upstream.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see Upstream.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see Upstream.Fields#type
     */
    public DatasetLineageType getType(GetMode mode) {
        return obtainDirect(FIELD_Type, DatasetLineageType.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Upstream.Fields#type
     */
    @Nonnull
    public DatasetLineageType getType() {
        return obtainDirect(FIELD_Type, DatasetLineageType.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see Upstream.Fields#type
     */
    public Upstream setType(DatasetLineageType value, SetMode mode) {
        putDirect(FIELD_Type, DatasetLineageType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Upstream.Fields#type
     */
    public Upstream setType(
        @Nonnull
        DatasetLineageType value) {
        putDirect(FIELD_Type, DatasetLineageType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Upstream clone()
        throws CloneNotSupportedException
    {
        return ((Upstream) super.clone());
    }

    @Override
    public Upstream copy()
        throws CloneNotSupportedException
    {
        return ((Upstream) super.copy());
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
         * Audit stamp containing who reported the lineage and when.
         * WARNING: this field is deprecated and may be removed in a future release.
         * 
         * @deprecated
         *     we no longer associate a timestamp per upstream edge
         */
        @Deprecated
        public com.linkedin.common.AuditStamp.Fields auditStamp() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "auditStamp");
        }

        /**
         * The upstream dataset the lineage points to
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
