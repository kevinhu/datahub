
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
 * Representation of mapping between fields in source dataset to the field in destination dataset
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldMapping.pdl.")
public class DatasetFieldMapping
    extends RecordTemplate
{

    private final static DatasetFieldMapping.Fields _fields = new DatasetFieldMapping.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Representation of mapping between fields in source dataset to the field in destination dataset*/record DatasetFieldMapping includes{namespace com.linkedin.common/**Base model representing field mappings*/record BaseFieldMapping{/**Audit stamp containing who reported the field mapping and when*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}/**Transfomration function between the fields involved*/transformation:union[{namespace com.linkedin.common.fieldtransformer/**Type of the transformation involved in generating destination fields from source fields.*/enum TransformationType{/**Field transformation expressed as unknown black box function.*/BLACKBOX/**Field transformation expressed as Identity function.*/IDENTITY}}{namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}}]}}{/**Source fields from which the fine grained lineage is derived*/sourceFields:array[/**Upstreams of a dataset field.*/typeref DatasetFieldUpstream=union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"datasetField\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DatasetField\",\"doc\":\"Standardized dataset field information identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dataset\",\"doc\":\"Dataset that this dataset field belongs to.\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"name\":\"fieldPath\",\"doc\":\"Dataset field path\",\"type\":\"string\",\"maxLength\":500}],\"maxLength\":807}typeref DatasetFieldUrn=string}]]/**Destination field which is derived from source fields*/destinationField:com.linkedin.common.DatasetFieldUrn}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Created = SCHEMA.getField("created");
    private final static RecordDataSchema.Field FIELD_Transformation = SCHEMA.getField("transformation");
    private final static RecordDataSchema.Field FIELD_SourceFields = SCHEMA.getField("sourceFields");
    private final static RecordDataSchema.Field FIELD_DestinationField = SCHEMA.getField("destinationField");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetFieldUrn.class);
    }

    public DatasetFieldMapping() {
        super(new DataMap(6, 0.75F), SCHEMA, 4);
    }

    public DatasetFieldMapping(DataMap data) {
        super(data, SCHEMA);
    }

    public static DatasetFieldMapping.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for created
     * 
     * @see DatasetFieldMapping.Fields#created
     */
    public boolean hasCreated() {
        return contains(FIELD_Created);
    }

    /**
     * Remover for created
     * 
     * @see DatasetFieldMapping.Fields#created
     */
    public void removeCreated() {
        remove(FIELD_Created);
    }

    /**
     * Getter for created
     * 
     * @see DatasetFieldMapping.Fields#created
     */
    public AuditStamp getCreated(GetMode mode) {
        return obtainWrapped(FIELD_Created, AuditStamp.class, mode);
    }

    /**
     * Getter for created
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldMapping.Fields#created
     */
    @Nonnull
    public AuditStamp getCreated() {
        return obtainWrapped(FIELD_Created, AuditStamp.class, GetMode.STRICT);
    }

    /**
     * Setter for created
     * 
     * @see DatasetFieldMapping.Fields#created
     */
    public DatasetFieldMapping setCreated(AuditStamp value, SetMode mode) {
        putWrapped(FIELD_Created, AuditStamp.class, value, mode);
        return this;
    }

    /**
     * Setter for created
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldMapping.Fields#created
     */
    public DatasetFieldMapping setCreated(
        @Nonnull
        AuditStamp value) {
        putWrapped(FIELD_Created, AuditStamp.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for transformation
     * 
     * @see DatasetFieldMapping.Fields#transformation
     */
    public boolean hasTransformation() {
        return contains(FIELD_Transformation);
    }

    /**
     * Remover for transformation
     * 
     * @see DatasetFieldMapping.Fields#transformation
     */
    public void removeTransformation() {
        remove(FIELD_Transformation);
    }

    /**
     * Getter for transformation
     * 
     * @see DatasetFieldMapping.Fields#transformation
     */
    public com.linkedin.common.BaseFieldMapping.Transformation getTransformation(GetMode mode) {
        return obtainWrapped(FIELD_Transformation, com.linkedin.common.BaseFieldMapping.Transformation.class, mode);
    }

    /**
     * Getter for transformation
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldMapping.Fields#transformation
     */
    @Nonnull
    public com.linkedin.common.BaseFieldMapping.Transformation getTransformation() {
        return obtainWrapped(FIELD_Transformation, com.linkedin.common.BaseFieldMapping.Transformation.class, GetMode.STRICT);
    }

    /**
     * Setter for transformation
     * 
     * @see DatasetFieldMapping.Fields#transformation
     */
    public DatasetFieldMapping setTransformation(com.linkedin.common.BaseFieldMapping.Transformation value, SetMode mode) {
        putWrapped(FIELD_Transformation, com.linkedin.common.BaseFieldMapping.Transformation.class, value, mode);
        return this;
    }

    /**
     * Setter for transformation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldMapping.Fields#transformation
     */
    public DatasetFieldMapping setTransformation(
        @Nonnull
        com.linkedin.common.BaseFieldMapping.Transformation value) {
        putWrapped(FIELD_Transformation, com.linkedin.common.BaseFieldMapping.Transformation.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for sourceFields
     * 
     * @see DatasetFieldMapping.Fields#sourceFields
     */
    public boolean hasSourceFields() {
        return contains(FIELD_SourceFields);
    }

    /**
     * Remover for sourceFields
     * 
     * @see DatasetFieldMapping.Fields#sourceFields
     */
    public void removeSourceFields() {
        remove(FIELD_SourceFields);
    }

    /**
     * Getter for sourceFields
     * 
     * @see DatasetFieldMapping.Fields#sourceFields
     */
    public DatasetFieldUpstreamArray getSourceFields(GetMode mode) {
        return obtainWrapped(FIELD_SourceFields, DatasetFieldUpstreamArray.class, mode);
    }

    /**
     * Getter for sourceFields
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldMapping.Fields#sourceFields
     */
    @Nonnull
    public DatasetFieldUpstreamArray getSourceFields() {
        return obtainWrapped(FIELD_SourceFields, DatasetFieldUpstreamArray.class, GetMode.STRICT);
    }

    /**
     * Setter for sourceFields
     * 
     * @see DatasetFieldMapping.Fields#sourceFields
     */
    public DatasetFieldMapping setSourceFields(DatasetFieldUpstreamArray value, SetMode mode) {
        putWrapped(FIELD_SourceFields, DatasetFieldUpstreamArray.class, value, mode);
        return this;
    }

    /**
     * Setter for sourceFields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldMapping.Fields#sourceFields
     */
    public DatasetFieldMapping setSourceFields(
        @Nonnull
        DatasetFieldUpstreamArray value) {
        putWrapped(FIELD_SourceFields, DatasetFieldUpstreamArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for destinationField
     * 
     * @see DatasetFieldMapping.Fields#destinationField
     */
    public boolean hasDestinationField() {
        return contains(FIELD_DestinationField);
    }

    /**
     * Remover for destinationField
     * 
     * @see DatasetFieldMapping.Fields#destinationField
     */
    public void removeDestinationField() {
        remove(FIELD_DestinationField);
    }

    /**
     * Getter for destinationField
     * 
     * @see DatasetFieldMapping.Fields#destinationField
     */
    public com.linkedin.common.urn.DatasetFieldUrn getDestinationField(GetMode mode) {
        return obtainCustomType(FIELD_DestinationField, com.linkedin.common.urn.DatasetFieldUrn.class, mode);
    }

    /**
     * Getter for destinationField
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetFieldMapping.Fields#destinationField
     */
    @Nonnull
    public com.linkedin.common.urn.DatasetFieldUrn getDestinationField() {
        return obtainCustomType(FIELD_DestinationField, com.linkedin.common.urn.DatasetFieldUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for destinationField
     * 
     * @see DatasetFieldMapping.Fields#destinationField
     */
    public DatasetFieldMapping setDestinationField(com.linkedin.common.urn.DatasetFieldUrn value, SetMode mode) {
        putCustomType(FIELD_DestinationField, com.linkedin.common.urn.DatasetFieldUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for destinationField
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetFieldMapping.Fields#destinationField
     */
    public DatasetFieldMapping setDestinationField(
        @Nonnull
        com.linkedin.common.urn.DatasetFieldUrn value) {
        putCustomType(FIELD_DestinationField, com.linkedin.common.urn.DatasetFieldUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DatasetFieldMapping clone()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldMapping) super.clone());
    }

    @Override
    public DatasetFieldMapping copy()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldMapping) super.copy());
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
         * Audit stamp containing who reported the field mapping and when
         * 
         */
        public com.linkedin.common.AuditStamp.Fields created() {
            return new com.linkedin.common.AuditStamp.Fields(getPathComponents(), "created");
        }

        /**
         * Transfomration function between the fields involved
         * 
         */
        public com.linkedin.common.BaseFieldMapping.Transformation.Fields transformation() {
            return new com.linkedin.common.BaseFieldMapping.Transformation.Fields(getPathComponents(), "transformation");
        }

        /**
         * Source fields from which the fine grained lineage is derived
         * 
         */
        public com.linkedin.dataset.DatasetFieldUpstreamArray.Fields sourceFields() {
            return new com.linkedin.dataset.DatasetFieldUpstreamArray.Fields(getPathComponents(), "sourceFields");
        }

        /**
         * Source fields from which the fine grained lineage is derived
         * 
         */
        public PathSpec sourceFields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "sourceFields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Destination field which is derived from source fields
         * 
         */
        public PathSpec destinationField() {
            return new PathSpec(getPathComponents(), "destinationField");
        }

    }

}
