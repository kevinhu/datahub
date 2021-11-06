
package com.linkedin.dataset;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * Describes a delta change to a dataset downstream lineage
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DownstreamLineageDelta.pdl.")
public class DownstreamLineageDelta
    extends RecordTemplate
{

    private final static DownstreamLineageDelta.Fields _fields = new DownstreamLineageDelta.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Describes a delta change to a dataset downstream lineage*/record DownstreamLineageDelta{/**The list of downstream lineages to be updated for a dataset*/downstreamsToUpdate:array[/**Downstream lineage information about a dataset including the source reporting the lineage*/record Downstream{/**Audit stamp containing who reported the lineage and when*/auditStamp:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}/**The downstream dataset the lineage points to*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_DownstreamsToUpdate = SCHEMA.getField("downstreamsToUpdate");

    public DownstreamLineageDelta() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public DownstreamLineageDelta(DataMap data) {
        super(data, SCHEMA);
    }

    public static DownstreamLineageDelta.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for downstreamsToUpdate
     * 
     * @see DownstreamLineageDelta.Fields#downstreamsToUpdate
     */
    public boolean hasDownstreamsToUpdate() {
        return contains(FIELD_DownstreamsToUpdate);
    }

    /**
     * Remover for downstreamsToUpdate
     * 
     * @see DownstreamLineageDelta.Fields#downstreamsToUpdate
     */
    public void removeDownstreamsToUpdate() {
        remove(FIELD_DownstreamsToUpdate);
    }

    /**
     * Getter for downstreamsToUpdate
     * 
     * @see DownstreamLineageDelta.Fields#downstreamsToUpdate
     */
    public DownstreamArray getDownstreamsToUpdate(GetMode mode) {
        return obtainWrapped(FIELD_DownstreamsToUpdate, DownstreamArray.class, mode);
    }

    /**
     * Getter for downstreamsToUpdate
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DownstreamLineageDelta.Fields#downstreamsToUpdate
     */
    @Nonnull
    public DownstreamArray getDownstreamsToUpdate() {
        return obtainWrapped(FIELD_DownstreamsToUpdate, DownstreamArray.class, GetMode.STRICT);
    }

    /**
     * Setter for downstreamsToUpdate
     * 
     * @see DownstreamLineageDelta.Fields#downstreamsToUpdate
     */
    public DownstreamLineageDelta setDownstreamsToUpdate(DownstreamArray value, SetMode mode) {
        putWrapped(FIELD_DownstreamsToUpdate, DownstreamArray.class, value, mode);
        return this;
    }

    /**
     * Setter for downstreamsToUpdate
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DownstreamLineageDelta.Fields#downstreamsToUpdate
     */
    public DownstreamLineageDelta setDownstreamsToUpdate(
        @Nonnull
        DownstreamArray value) {
        putWrapped(FIELD_DownstreamsToUpdate, DownstreamArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DownstreamLineageDelta clone()
        throws CloneNotSupportedException
    {
        return ((DownstreamLineageDelta) super.clone());
    }

    @Override
    public DownstreamLineageDelta copy()
        throws CloneNotSupportedException
    {
        return ((DownstreamLineageDelta) super.copy());
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
         * The list of downstream lineages to be updated for a dataset
         * 
         */
        public com.linkedin.dataset.DownstreamArray.Fields downstreamsToUpdate() {
            return new com.linkedin.dataset.DownstreamArray.Fields(getPathComponents(), "downstreamsToUpdate");
        }

        /**
         * The list of downstream lineages to be updated for a dataset
         * 
         */
        public PathSpec downstreamsToUpdate(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "downstreamsToUpdate");
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
