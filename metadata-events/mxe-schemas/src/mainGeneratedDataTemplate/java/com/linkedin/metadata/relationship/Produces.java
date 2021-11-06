
package com.linkedin.metadata.relationship;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
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
 * A generic model for the
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/relationship/Produces.pdl.")
public class Produces
    extends RecordTemplate
{

    private final static Produces.Fields _fields = new Produces.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.relationship/**A generic model for the*/@pairings=[{\"destination\":\"com.linkedin.common.urn.DatasetUrn\",\"source\":\"com.linkedin.common.urn.DataJobUrn\"}]record Produces includes/**Common fields that apply to all relationships*/record BaseRelationship{/**Urn for the source of the relationship*/source:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Urn for the destination of the relationship*/destination:com.linkedin.common.Urn}{}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Source = SCHEMA.getField("source");
    private final static RecordDataSchema.Field FIELD_Destination = SCHEMA.getField("destination");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public Produces() {
        super(new DataMap(3, 0.75F), SCHEMA);
    }

    public Produces(DataMap data) {
        super(data, SCHEMA);
    }

    public static Produces.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for source
     * 
     * @see Produces.Fields#source
     */
    public boolean hasSource() {
        return contains(FIELD_Source);
    }

    /**
     * Remover for source
     * 
     * @see Produces.Fields#source
     */
    public void removeSource() {
        remove(FIELD_Source);
    }

    /**
     * Getter for source
     * 
     * @see Produces.Fields#source
     */
    public com.linkedin.common.urn.Urn getSource(GetMode mode) {
        return obtainCustomType(FIELD_Source, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for source
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Produces.Fields#source
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getSource() {
        return obtainCustomType(FIELD_Source, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for source
     * 
     * @see Produces.Fields#source
     */
    public Produces setSource(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Source, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for source
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Produces.Fields#source
     */
    public Produces setSource(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Source, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for destination
     * 
     * @see Produces.Fields#destination
     */
    public boolean hasDestination() {
        return contains(FIELD_Destination);
    }

    /**
     * Remover for destination
     * 
     * @see Produces.Fields#destination
     */
    public void removeDestination() {
        remove(FIELD_Destination);
    }

    /**
     * Getter for destination
     * 
     * @see Produces.Fields#destination
     */
    public com.linkedin.common.urn.Urn getDestination(GetMode mode) {
        return obtainCustomType(FIELD_Destination, com.linkedin.common.urn.Urn.class, mode);
    }

    /**
     * Getter for destination
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Produces.Fields#destination
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getDestination() {
        return obtainCustomType(FIELD_Destination, com.linkedin.common.urn.Urn.class, GetMode.STRICT);
    }

    /**
     * Setter for destination
     * 
     * @see Produces.Fields#destination
     */
    public Produces setDestination(com.linkedin.common.urn.Urn value, SetMode mode) {
        putCustomType(FIELD_Destination, com.linkedin.common.urn.Urn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for destination
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Produces.Fields#destination
     */
    public Produces setDestination(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        putCustomType(FIELD_Destination, com.linkedin.common.urn.Urn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Produces clone()
        throws CloneNotSupportedException
    {
        return ((Produces) super.clone());
    }

    @Override
    public Produces copy()
        throws CloneNotSupportedException
    {
        return ((Produces) super.copy());
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

    }

}
