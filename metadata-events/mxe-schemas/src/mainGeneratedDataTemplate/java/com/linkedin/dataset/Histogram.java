
package com.linkedin.dataset;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.FloatArray;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldProfile.pdl.")
public class Histogram
    extends RecordTemplate
{

    private final static Histogram.Fields _fields = new Histogram.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset,record Histogram{boundaries:array[string]heights:array[float]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Boundaries = SCHEMA.getField("boundaries");
    private final static RecordDataSchema.Field FIELD_Heights = SCHEMA.getField("heights");

    public Histogram() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
    }

    public Histogram(DataMap data) {
        super(data, SCHEMA);
    }

    public static Histogram.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for boundaries
     * 
     * @see Histogram.Fields#boundaries
     */
    public boolean hasBoundaries() {
        return contains(FIELD_Boundaries);
    }

    /**
     * Remover for boundaries
     * 
     * @see Histogram.Fields#boundaries
     */
    public void removeBoundaries() {
        remove(FIELD_Boundaries);
    }

    /**
     * Getter for boundaries
     * 
     * @see Histogram.Fields#boundaries
     */
    public StringArray getBoundaries(GetMode mode) {
        return obtainWrapped(FIELD_Boundaries, StringArray.class, mode);
    }

    /**
     * Getter for boundaries
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Histogram.Fields#boundaries
     */
    @Nonnull
    public StringArray getBoundaries() {
        return obtainWrapped(FIELD_Boundaries, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for boundaries
     * 
     * @see Histogram.Fields#boundaries
     */
    public Histogram setBoundaries(StringArray value, SetMode mode) {
        putWrapped(FIELD_Boundaries, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for boundaries
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Histogram.Fields#boundaries
     */
    public Histogram setBoundaries(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Boundaries, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for heights
     * 
     * @see Histogram.Fields#heights
     */
    public boolean hasHeights() {
        return contains(FIELD_Heights);
    }

    /**
     * Remover for heights
     * 
     * @see Histogram.Fields#heights
     */
    public void removeHeights() {
        remove(FIELD_Heights);
    }

    /**
     * Getter for heights
     * 
     * @see Histogram.Fields#heights
     */
    public FloatArray getHeights(GetMode mode) {
        return obtainWrapped(FIELD_Heights, FloatArray.class, mode);
    }

    /**
     * Getter for heights
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see Histogram.Fields#heights
     */
    @Nonnull
    public FloatArray getHeights() {
        return obtainWrapped(FIELD_Heights, FloatArray.class, GetMode.STRICT);
    }

    /**
     * Setter for heights
     * 
     * @see Histogram.Fields#heights
     */
    public Histogram setHeights(FloatArray value, SetMode mode) {
        putWrapped(FIELD_Heights, FloatArray.class, value, mode);
        return this;
    }

    /**
     * Setter for heights
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Histogram.Fields#heights
     */
    public Histogram setHeights(
        @Nonnull
        FloatArray value) {
        putWrapped(FIELD_Heights, FloatArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Histogram clone()
        throws CloneNotSupportedException
    {
        return ((Histogram) super.clone());
    }

    @Override
    public Histogram copy()
        throws CloneNotSupportedException
    {
        return ((Histogram) super.copy());
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

        public PathSpec boundaries() {
            return new PathSpec(getPathComponents(), "boundaries");
        }

        public PathSpec boundaries(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "boundaries");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        public PathSpec heights() {
            return new PathSpec(getPathComponents(), "heights");
        }

        public PathSpec heights(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "heights");
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
