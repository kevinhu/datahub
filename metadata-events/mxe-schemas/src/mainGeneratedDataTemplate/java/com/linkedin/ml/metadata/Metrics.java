
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * Metrics to be featured for the MLModel.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/Metrics.pdl.")
public class Metrics
    extends RecordTemplate
{

    private final static Metrics.Fields _fields = new Metrics.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Metrics to be featured for the MLModel.*/@Aspect.name=\"mlModelMetrics\"record Metrics{/**Measures of MLModel performance*/performanceMeasures:optional array[string]/**Decision Thresholds used (if any)?*/decisionThreshold:optional array[string]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_PerformanceMeasures = SCHEMA.getField("performanceMeasures");
    private final static RecordDataSchema.Field FIELD_DecisionThreshold = SCHEMA.getField("decisionThreshold");

    public Metrics() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
    }

    public Metrics(DataMap data) {
        super(data, SCHEMA);
    }

    public static Metrics.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for performanceMeasures
     * 
     * @see Metrics.Fields#performanceMeasures
     */
    public boolean hasPerformanceMeasures() {
        return contains(FIELD_PerformanceMeasures);
    }

    /**
     * Remover for performanceMeasures
     * 
     * @see Metrics.Fields#performanceMeasures
     */
    public void removePerformanceMeasures() {
        remove(FIELD_PerformanceMeasures);
    }

    /**
     * Getter for performanceMeasures
     * 
     * @see Metrics.Fields#performanceMeasures
     */
    public StringArray getPerformanceMeasures(GetMode mode) {
        return obtainWrapped(FIELD_PerformanceMeasures, StringArray.class, mode);
    }

    /**
     * Getter for performanceMeasures
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Metrics.Fields#performanceMeasures
     */
    @Nullable
    public StringArray getPerformanceMeasures() {
        return obtainWrapped(FIELD_PerformanceMeasures, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for performanceMeasures
     * 
     * @see Metrics.Fields#performanceMeasures
     */
    public Metrics setPerformanceMeasures(StringArray value, SetMode mode) {
        putWrapped(FIELD_PerformanceMeasures, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for performanceMeasures
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Metrics.Fields#performanceMeasures
     */
    public Metrics setPerformanceMeasures(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_PerformanceMeasures, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for decisionThreshold
     * 
     * @see Metrics.Fields#decisionThreshold
     */
    public boolean hasDecisionThreshold() {
        return contains(FIELD_DecisionThreshold);
    }

    /**
     * Remover for decisionThreshold
     * 
     * @see Metrics.Fields#decisionThreshold
     */
    public void removeDecisionThreshold() {
        remove(FIELD_DecisionThreshold);
    }

    /**
     * Getter for decisionThreshold
     * 
     * @see Metrics.Fields#decisionThreshold
     */
    public StringArray getDecisionThreshold(GetMode mode) {
        return obtainWrapped(FIELD_DecisionThreshold, StringArray.class, mode);
    }

    /**
     * Getter for decisionThreshold
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Metrics.Fields#decisionThreshold
     */
    @Nullable
    public StringArray getDecisionThreshold() {
        return obtainWrapped(FIELD_DecisionThreshold, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for decisionThreshold
     * 
     * @see Metrics.Fields#decisionThreshold
     */
    public Metrics setDecisionThreshold(StringArray value, SetMode mode) {
        putWrapped(FIELD_DecisionThreshold, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for decisionThreshold
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Metrics.Fields#decisionThreshold
     */
    public Metrics setDecisionThreshold(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_DecisionThreshold, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Metrics clone()
        throws CloneNotSupportedException
    {
        return ((Metrics) super.clone());
    }

    @Override
    public Metrics copy()
        throws CloneNotSupportedException
    {
        return ((Metrics) super.copy());
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
         * Measures of MLModel performance
         * 
         */
        public PathSpec performanceMeasures() {
            return new PathSpec(getPathComponents(), "performanceMeasures");
        }

        /**
         * Measures of MLModel performance
         * 
         */
        public PathSpec performanceMeasures(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "performanceMeasures");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Decision Thresholds used (if any)?
         * 
         */
        public PathSpec decisionThreshold() {
            return new PathSpec(getPathComponents(), "decisionThreshold");
        }

        /**
         * Decision Thresholds used (if any)?
         * 
         */
        public PathSpec decisionThreshold(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "decisionThreshold");
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
