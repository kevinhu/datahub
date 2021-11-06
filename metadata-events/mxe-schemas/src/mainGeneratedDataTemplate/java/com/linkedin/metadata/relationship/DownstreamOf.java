
package com.linkedin.metadata.relationship;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.dataset.DatasetLineageType;


/**
 * A generic model for the DownstreamOf relationship
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/relationship/DownstreamOf.pdl.")
public class DownstreamOf
    extends RecordTemplate
{

    private final static DownstreamOf.Fields _fields = new DownstreamOf.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.relationship/**A generic model for the DownstreamOf relationship*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DatasetUrn\",\"source\":\"com.linkedin.common.urn.DatasetUrn\"},{\"destination\":\"com.linkedin.common.urn.DatasetUrn\",\"source\":\"com.linkedin.common.urn.ChartUrn\"}]record DownstreamOf includes/**Common fields that apply to all relationships*/record BaseRelationship{/**Urn for the source of the relationship*/source:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Urn for the destination of the relationship*/destination:com.linkedin.common.Urn}{/**The type of the lineage*/type:optional{namespace com.linkedin.dataset/**The various types of supported dataset lineage*/enum DatasetLineageType{/**Direct copy without modification*/COPY/**Transformed data with modification (format or content change)*/TRANSFORMED/**Represents a view defined on the sources e.g. Hive view defined on underlying hive tables or a Hive table pointing to a HDFS dataset or DALI view defined on multiple sources*/VIEW}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Source = SCHEMA.getField("source");
    private final static RecordDataSchema.Field FIELD_Destination = SCHEMA.getField("destination");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DownstreamOf() {
        super(new DataMap(4, 0.75F), SCHEMA);
    }

    public DownstreamOf(DataMap data) {
        super(data, SCHEMA);
    }

    public static DownstreamOf.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for source
     * 
     * @see DownstreamOf.Fields#source
     */
    public boolean hasSource() {
        return contains(FIELD_Source);
    }

    /**
     * Remover for source
     * 
     * @see DownstreamOf.Fields#source
     */
    public void removeSource() {
        remove(FIELD_Source);
    }

    /**
     * Getter for source
     * 
     * @see DownstreamOf.Fields#source
     */
    public com.linkedin.common.urn.Urn getSource(GetMode mode) {
        return obtainCustomType(FIELD_Source, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for source
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DownstreamOf.Fields#source
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getSource() {
        return obtainCustomType(FIELD_Source, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for source
     * 
     * @see DownstreamOf.Fields#source
     */
    public DownstreamOf setSource(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Source, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for source
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DownstreamOf.Fields#source
     */
    public DownstreamOf setSource(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Source, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for destination
     * 
     * @see DownstreamOf.Fields#destination
     */
    public boolean hasDestination() {
        return contains(FIELD_Destination);
    }

    /**
     * Remover for destination
     * 
     * @see DownstreamOf.Fields#destination
     */
    public void removeDestination() {
        remove(FIELD_Destination);
    }

    /**
     * Getter for destination
     * 
     * @see DownstreamOf.Fields#destination
     */
    public com.linkedin.common.urn.Urn getDestination(GetMode mode) {
        return obtainCustomType(FIELD_Destination, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for destination
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DownstreamOf.Fields#destination
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getDestination() {
        return obtainCustomType(FIELD_Destination, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for destination
     * 
     * @see DownstreamOf.Fields#destination
     */
    public DownstreamOf setDestination(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Destination, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for destination
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DownstreamOf.Fields#destination
     */
    public DownstreamOf setDestination(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Destination, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see DownstreamOf.Fields#type
     */
    public boolean hasType() {
        return contains(FIELD_Type);
    }

    /**
     * Remover for type
     * 
     * @see DownstreamOf.Fields#type
     */
    public void removeType() {
        remove(FIELD_Type);
    }

    /**
     * Getter for type
     * 
     * @see DownstreamOf.Fields#type
     */
    public DatasetLineageType getType(GetMode mode) {
        return obtainDirect(FIELD_Type, DatasetLineageType.class, mode);
    }

    /**
     * Getter for type
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DownstreamOf.Fields#type
     */
    @Nullable
    public DatasetLineageType getType() {
        return obtainDirect(FIELD_Type, DatasetLineageType.class, GetMode.STRICT);
    }

    /**
     * Setter for type
     * 
     * @see DownstreamOf.Fields#type
     */
    public DownstreamOf setType(DatasetLineageType value, SetMode mode) {
        putDirect(FIELD_Type, DatasetLineageType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DownstreamOf.Fields#type
     */
    public DownstreamOf setType(
        @Nonnull
        DatasetLineageType value) {
        putDirect(FIELD_Type, DatasetLineageType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DownstreamOf clone()
        throws CloneNotSupportedException
    {
        return ((DownstreamOf) super.clone());
    }

    @Override
    public DownstreamOf copy()
        throws CloneNotSupportedException
    {
        return ((DownstreamOf) super.copy());
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
         * Urn for the source of the relationship
         * 
         */
        public PathSpec source() {
            return new PathSpec(getPathComponents(), "source");
        }

        /**
         * Urn for the destination of the relationship
         * 
         */
        public PathSpec destination() {
            return new PathSpec(getPathComponents(), "destination");
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
