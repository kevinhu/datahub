
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
 * Fine Grained upstream lineage for fields in a dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetUpstreamLineage.pdl.")
public class DatasetUpstreamLineage
    extends RecordTemplate
{

    private final static DatasetUpstreamLineage.Fields _fields = new DatasetUpstreamLineage.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Fine Grained upstream lineage for fields in a dataset*/@Aspect.name=\"datasetUpstreamLineage\"record DatasetUpstreamLineage{/**Upstream to downstream field level lineage mappings*/fieldMappings:array[/**Representation of mapping between fields in source dataset to the field in destination dataset*/record DatasetFieldMapping includes{namespace com.linkedin.common/**Base model representing field mappings*/record BaseFieldMapping{/**Audit stamp containing who reported the field mapping and when*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}/**Transfomration function between the fields involved*/transformation:union[{namespace com.linkedin.common.fieldtransformer/**Type of the transformation involved in generating destination fields from source fields.*/enum TransformationType{/**Field transformation expressed as unknown black box function.*/BLACKBOX/**Field transformation expressed as Identity function.*/IDENTITY}}{namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}}]}}{/**Source fields from which the fine grained lineage is derived*/sourceFields:array[/**Upstreams of a dataset field.*/typeref DatasetFieldUpstream=union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"datasetField\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DatasetField\",\"doc\":\"Standardized dataset field information identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dataset\",\"doc\":\"Dataset that this dataset field belongs to.\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"name\":\"fieldPath\",\"doc\":\"Dataset field path\",\"type\":\"string\",\"maxLength\":500}],\"maxLength\":807}typeref DatasetFieldUrn=string}]]/**Destination field which is derived from source fields*/destinationField:com.linkedin.common.DatasetFieldUrn}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_FieldMappings = SCHEMA.getField("fieldMappings");

    public DatasetUpstreamLineage() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public DatasetUpstreamLineage(DataMap data) {
        super(data, SCHEMA);
    }

    public static DatasetUpstreamLineage.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for fieldMappings
     * 
     * @see DatasetUpstreamLineage.Fields#fieldMappings
     */
    public boolean hasFieldMappings() {
        return contains(FIELD_FieldMappings);
    }

    /**
     * Remover for fieldMappings
     * 
     * @see DatasetUpstreamLineage.Fields#fieldMappings
     */
    public void removeFieldMappings() {
        remove(FIELD_FieldMappings);
    }

    /**
     * Getter for fieldMappings
     * 
     * @see DatasetUpstreamLineage.Fields#fieldMappings
     */
    public DatasetFieldMappingArray getFieldMappings(GetMode mode) {
        return obtainWrapped(FIELD_FieldMappings, DatasetFieldMappingArray.class, mode);
    }

    /**
     * Getter for fieldMappings
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetUpstreamLineage.Fields#fieldMappings
     */
    @Nonnull
    public DatasetFieldMappingArray getFieldMappings() {
        return obtainWrapped(FIELD_FieldMappings, DatasetFieldMappingArray.class, GetMode.STRICT);
    }

    /**
     * Setter for fieldMappings
     * 
     * @see DatasetUpstreamLineage.Fields#fieldMappings
     */
    public DatasetUpstreamLineage setFieldMappings(DatasetFieldMappingArray value, SetMode mode) {
        putWrapped(FIELD_FieldMappings, DatasetFieldMappingArray.class, value, mode);
        return this;
    }

    /**
     * Setter for fieldMappings
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetUpstreamLineage.Fields#fieldMappings
     */
    public DatasetUpstreamLineage setFieldMappings(
        @Nonnull
        DatasetFieldMappingArray value) {
        putWrapped(FIELD_FieldMappings, DatasetFieldMappingArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DatasetUpstreamLineage clone()
        throws CloneNotSupportedException
    {
        return ((DatasetUpstreamLineage) super.clone());
    }

    @Override
    public DatasetUpstreamLineage copy()
        throws CloneNotSupportedException
    {
        return ((DatasetUpstreamLineage) super.copy());
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
         * Upstream to downstream field level lineage mappings
         * 
         */
        public com.linkedin.dataset.DatasetFieldMappingArray.Fields fieldMappings() {
            return new com.linkedin.dataset.DatasetFieldMappingArray.Fields(getPathComponents(), "fieldMappings");
        }

        /**
         * Upstream to downstream field level lineage mappings
         * 
         */
        public PathSpec fieldMappings(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fieldMappings");
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
