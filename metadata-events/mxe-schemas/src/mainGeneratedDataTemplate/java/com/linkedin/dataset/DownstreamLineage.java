
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
 * Downstream lineage of a dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DownstreamLineage.pdl.")
public class DownstreamLineage
    extends RecordTemplate
{

    private final static DownstreamLineage.Fields _fields = new DownstreamLineage.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Downstream lineage of a dataset*/record DownstreamLineage{/**List of downstream dataset lineage information*/downstreams:array[/**Downstream lineage information about a dataset including the source reporting the lineage*/record Downstream{/**Audit stamp containing who reported the lineage and when*/auditStamp:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}/**The downstream dataset the lineage points to*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Downstreams = SCHEMA.getField("downstreams");

    public DownstreamLineage() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public DownstreamLineage(DataMap data) {
        super(data, SCHEMA);
    }

    public static DownstreamLineage.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for downstreams
     * 
     * @see DownstreamLineage.Fields#downstreams
     */
    public boolean hasDownstreams() {
        return contains(FIELD_Downstreams);
    }

    /**
     * Remover for downstreams
     * 
     * @see DownstreamLineage.Fields#downstreams
     */
    public void removeDownstreams() {
        remove(FIELD_Downstreams);
    }

    /**
     * Getter for downstreams
     * 
     * @see DownstreamLineage.Fields#downstreams
     */
    public DownstreamArray getDownstreams(GetMode mode) {
        return obtainWrapped(FIELD_Downstreams, DownstreamArray.class, mode);
    }

    /**
     * Getter for downstreams
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DownstreamLineage.Fields#downstreams
     */
    @Nonnull
    public DownstreamArray getDownstreams() {
        return obtainWrapped(FIELD_Downstreams, DownstreamArray.class, GetMode.STRICT);
    }

    /**
     * Setter for downstreams
     * 
     * @see DownstreamLineage.Fields#downstreams
     */
    public DownstreamLineage setDownstreams(DownstreamArray value, SetMode mode) {
        putWrapped(FIELD_Downstreams, DownstreamArray.class, value, mode);
        return this;
    }

    /**
     * Setter for downstreams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DownstreamLineage.Fields#downstreams
     */
    public DownstreamLineage setDownstreams(
        @Nonnull
        DownstreamArray value) {
        putWrapped(FIELD_Downstreams, DownstreamArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DownstreamLineage clone()
        throws CloneNotSupportedException
    {
        return ((DownstreamLineage) super.clone());
    }

    @Override
    public DownstreamLineage copy()
        throws CloneNotSupportedException
    {
        return ((DownstreamLineage) super.copy());
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
         * List of downstream dataset lineage information
         * 
         */
        public com.linkedin.dataset.DownstreamArray.Fields downstreams() {
            return new com.linkedin.dataset.DownstreamArray.Fields(getPathComponents(), "downstreams");
        }

        /**
         * List of downstream dataset lineage information
         * 
         */
        public PathSpec downstreams(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "downstreams");
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
