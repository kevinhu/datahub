
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


/**
 * Prompts which affect the performance of the MLModel
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelFactorPrompts.pdl.")
public class MLModelFactorPrompts
    extends RecordTemplate
{

    private final static MLModelFactorPrompts.Fields _fields = new MLModelFactorPrompts.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Prompts which affect the performance of the MLModel*/@Aspect.name=\"mlModelFactorPrompts\"record MLModelFactorPrompts{/**What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?*/relevantFactors:optional array[/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera\u2019s hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}]/**Which factors are being reported, and why were these chosen?*/evaluationFactors:optional array[MLModelFactors]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_RelevantFactors = SCHEMA.getField("relevantFactors");
    private final static RecordDataSchema.Field FIELD_EvaluationFactors = SCHEMA.getField("evaluationFactors");

    public MLModelFactorPrompts() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
    }

    public MLModelFactorPrompts(DataMap data) {
        super(data, SCHEMA);
    }

    public static MLModelFactorPrompts.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for relevantFactors
     * 
     * @see MLModelFactorPrompts.Fields#relevantFactors
     */
    public boolean hasRelevantFactors() {
        return contains(FIELD_RelevantFactors);
    }

    /**
     * Remover for relevantFactors
     * 
     * @see MLModelFactorPrompts.Fields#relevantFactors
     */
    public void removeRelevantFactors() {
        remove(FIELD_RelevantFactors);
    }

    /**
     * Getter for relevantFactors
     * 
     * @see MLModelFactorPrompts.Fields#relevantFactors
     */
    public MLModelFactorsArray getRelevantFactors(GetMode mode) {
        return obtainWrapped(FIELD_RelevantFactors, MLModelFactorsArray.class, mode);
    }

    /**
     * Getter for relevantFactors
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelFactorPrompts.Fields#relevantFactors
     */
    @Nullable
    public MLModelFactorsArray getRelevantFactors() {
        return obtainWrapped(FIELD_RelevantFactors, MLModelFactorsArray.class, GetMode.STRICT);
    }

    /**
     * Setter for relevantFactors
     * 
     * @see MLModelFactorPrompts.Fields#relevantFactors
     */
    public MLModelFactorPrompts setRelevantFactors(MLModelFactorsArray value, SetMode mode) {
        putWrapped(FIELD_RelevantFactors, MLModelFactorsArray.class, value, mode);
        return this;
    }

    /**
     * Setter for relevantFactors
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelFactorPrompts.Fields#relevantFactors
     */
    public MLModelFactorPrompts setRelevantFactors(
        @Nonnull
        MLModelFactorsArray value) {
        putWrapped(FIELD_RelevantFactors, MLModelFactorsArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for evaluationFactors
     * 
     * @see MLModelFactorPrompts.Fields#evaluationFactors
     */
    public boolean hasEvaluationFactors() {
        return contains(FIELD_EvaluationFactors);
    }

    /**
     * Remover for evaluationFactors
     * 
     * @see MLModelFactorPrompts.Fields#evaluationFactors
     */
    public void removeEvaluationFactors() {
        remove(FIELD_EvaluationFactors);
    }

    /**
     * Getter for evaluationFactors
     * 
     * @see MLModelFactorPrompts.Fields#evaluationFactors
     */
    public MLModelFactorsArray getEvaluationFactors(GetMode mode) {
        return obtainWrapped(FIELD_EvaluationFactors, MLModelFactorsArray.class, mode);
    }

    /**
     * Getter for evaluationFactors
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelFactorPrompts.Fields#evaluationFactors
     */
    @Nullable
    public MLModelFactorsArray getEvaluationFactors() {
        return obtainWrapped(FIELD_EvaluationFactors, MLModelFactorsArray.class, GetMode.STRICT);
    }

    /**
     * Setter for evaluationFactors
     * 
     * @see MLModelFactorPrompts.Fields#evaluationFactors
     */
    public MLModelFactorPrompts setEvaluationFactors(MLModelFactorsArray value, SetMode mode) {
        putWrapped(FIELD_EvaluationFactors, MLModelFactorsArray.class, value, mode);
        return this;
    }

    /**
     * Setter for evaluationFactors
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelFactorPrompts.Fields#evaluationFactors
     */
    public MLModelFactorPrompts setEvaluationFactors(
        @Nonnull
        MLModelFactorsArray value) {
        putWrapped(FIELD_EvaluationFactors, MLModelFactorsArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public MLModelFactorPrompts clone()
        throws CloneNotSupportedException
    {
        return ((MLModelFactorPrompts) super.clone());
    }

    @Override
    public MLModelFactorPrompts copy()
        throws CloneNotSupportedException
    {
        return ((MLModelFactorPrompts) super.copy());
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
         * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?
         * 
         */
        public com.linkedin.ml.metadata.MLModelFactorsArray.Fields relevantFactors() {
            return new com.linkedin.ml.metadata.MLModelFactorsArray.Fields(getPathComponents(), "relevantFactors");
        }

        /**
         * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?
         * 
         */
        public PathSpec relevantFactors(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "relevantFactors");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Which factors are being reported, and why were these chosen?
         * 
         */
        public com.linkedin.ml.metadata.MLModelFactorsArray.Fields evaluationFactors() {
            return new com.linkedin.ml.metadata.MLModelFactorsArray.Fields(getPathComponents(), "evaluationFactors");
        }

        /**
         * Which factors are being reported, and why were these chosen?
         * 
         */
        public PathSpec evaluationFactors(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "evaluationFactors");
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
