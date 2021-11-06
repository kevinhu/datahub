
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
 * Upstream lineage of a dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/UpstreamLineage.pdl.")
public class UpstreamLineage
    extends RecordTemplate
{

    private final static UpstreamLineage.Fields _fields = new UpstreamLineage.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Upstream lineage of a dataset*/@Aspect.name=\"upstreamLineage\"record UpstreamLineage{/**List of upstream dataset lineage information*/upstreams:array[/**Upstream lineage information about a dataset including the source reporting the lineage*/record Upstream{/**Audit stamp containing who reported the lineage and when.\nWARNING: this field is deprecated and may be removed in a future release.*/@deprecated=\"we no longer associate a timestamp per upstream edge\"auditStamp:{namespace com.linkedin.common/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}/**The upstream dataset the lineage points to*/@Relationship={\"name\":\"DownstreamOf\",\"entityTypes\":[\"dataset\"]}@Searchable={\"fieldName\":\"upstreams\",\"queryByDefault\":false,\"fieldType\":\"URN\"}dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**The type of the lineage*/type:/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Upstreams = SCHEMA.getField("upstreams");

    public UpstreamLineage() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public UpstreamLineage(DataMap data) {
        super(data, SCHEMA);
    }

    public static UpstreamLineage.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for upstreams
     * 
     * @see UpstreamLineage.Fields#upstreams
     */
    public boolean hasUpstreams() {
        return contains(FIELD_Upstreams);
    }

    /**
     * Remover for upstreams
     * 
     * @see UpstreamLineage.Fields#upstreams
     */
    public void removeUpstreams() {
        remove(FIELD_Upstreams);
    }

    /**
     * Getter for upstreams
     * 
     * @see UpstreamLineage.Fields#upstreams
     */
    public UpstreamArray getUpstreams(GetMode mode) {
        return obtainWrapped(FIELD_Upstreams, UpstreamArray.class, mode);
    }

    /**
     * Getter for upstreams
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UpstreamLineage.Fields#upstreams
     */
    @Nonnull
    public UpstreamArray getUpstreams() {
        return obtainWrapped(FIELD_Upstreams, UpstreamArray.class, GetMode.STRICT);
    }

    /**
     * Setter for upstreams
     * 
     * @see UpstreamLineage.Fields#upstreams
     */
    public UpstreamLineage setUpstreams(UpstreamArray value, SetMode mode) {
        putWrapped(FIELD_Upstreams, UpstreamArray.class, value, mode);
        return this;
    }

    /**
     * Setter for upstreams
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UpstreamLineage.Fields#upstreams
     */
    public UpstreamLineage setUpstreams(
        @Nonnull
        UpstreamArray value) {
        putWrapped(FIELD_Upstreams, UpstreamArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public UpstreamLineage clone()
        throws CloneNotSupportedException
    {
        return ((UpstreamLineage) super.clone());
    }

    @Override
    public UpstreamLineage copy()
        throws CloneNotSupportedException
    {
        return ((UpstreamLineage) super.copy());
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
         * List of upstream dataset lineage information
         * 
         */
        public com.linkedin.dataset.UpstreamArray.Fields upstreams() {
            return new com.linkedin.dataset.UpstreamArray.Fields(getPathComponents(), "upstreams");
        }

        /**
         * List of upstream dataset lineage information
         * 
         */
        public PathSpec upstreams(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "upstreams");
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
