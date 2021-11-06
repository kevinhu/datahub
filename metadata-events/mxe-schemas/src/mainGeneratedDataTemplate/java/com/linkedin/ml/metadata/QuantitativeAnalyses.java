
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
 * Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/QuantitativeAnalyses.pdl.")
public class QuantitativeAnalyses
    extends RecordTemplate
{

    private final static QuantitativeAnalyses.Fields _fields = new QuantitativeAnalyses.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.*/@Aspect.name=\"mlModelQuantitativeAnalyses\"record QuantitativeAnalyses{/**Link to a dashboard with results showing how the MLModel performed with respect to each factor*/unitaryResults:optional/**A union of all supported metadata aspects for ResultsType*/typeref ResultsType=union[string]/**Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?*/intersectionalResults:optional ResultsType}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_UnitaryResults = SCHEMA.getField("unitaryResults");
    private final static RecordDataSchema.Field FIELD_IntersectionalResults = SCHEMA.getField("intersectionalResults");

    public QuantitativeAnalyses() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
    }

    public QuantitativeAnalyses(DataMap data) {
        super(data, SCHEMA);
    }

    public static QuantitativeAnalyses.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for unitaryResults
     * 
     * @see QuantitativeAnalyses.Fields#unitaryResults
     */
    public boolean hasUnitaryResults() {
        return contains(FIELD_UnitaryResults);
    }

    /**
     * Remover for unitaryResults
     * 
     * @see QuantitativeAnalyses.Fields#unitaryResults
     */
    public void removeUnitaryResults() {
        remove(FIELD_UnitaryResults);
    }

    /**
     * Getter for unitaryResults
     * 
     * @see QuantitativeAnalyses.Fields#unitaryResults
     */
    public ResultsType getUnitaryResults(GetMode mode) {
        return obtainWrapped(FIELD_UnitaryResults, ResultsType.class, mode);
    }

    /**
     * Getter for unitaryResults
     * 
     * @return
     *     Optional field. Always check for null.
     * @see QuantitativeAnalyses.Fields#unitaryResults
     */
    @Nullable
    public ResultsType getUnitaryResults() {
        return obtainWrapped(FIELD_UnitaryResults, ResultsType.class, GetMode.STRICT);
    }

    /**
     * Setter for unitaryResults
     * 
     * @see QuantitativeAnalyses.Fields#unitaryResults
     */
    public QuantitativeAnalyses setUnitaryResults(ResultsType value, SetMode mode) {
        putWrapped(FIELD_UnitaryResults, ResultsType.class, value, mode);
        return this;
    }

    /**
     * Setter for unitaryResults
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QuantitativeAnalyses.Fields#unitaryResults
     */
    public QuantitativeAnalyses setUnitaryResults(
        @Nonnull
        ResultsType value) {
        putWrapped(FIELD_UnitaryResults, ResultsType.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for intersectionalResults
     * 
     * @see QuantitativeAnalyses.Fields#intersectionalResults
     */
    public boolean hasIntersectionalResults() {
        return contains(FIELD_IntersectionalResults);
    }

    /**
     * Remover for intersectionalResults
     * 
     * @see QuantitativeAnalyses.Fields#intersectionalResults
     */
    public void removeIntersectionalResults() {
        remove(FIELD_IntersectionalResults);
    }

    /**
     * Getter for intersectionalResults
     * 
     * @see QuantitativeAnalyses.Fields#intersectionalResults
     */
    public ResultsType getIntersectionalResults(GetMode mode) {
        return obtainWrapped(FIELD_IntersectionalResults, ResultsType.class, mode);
    }

    /**
     * Getter for intersectionalResults
     * 
     * @return
     *     Optional field. Always check for null.
     * @see QuantitativeAnalyses.Fields#intersectionalResults
     */
    @Nullable
    public ResultsType getIntersectionalResults() {
        return obtainWrapped(FIELD_IntersectionalResults, ResultsType.class, GetMode.STRICT);
    }

    /**
     * Setter for intersectionalResults
     * 
     * @see QuantitativeAnalyses.Fields#intersectionalResults
     */
    public QuantitativeAnalyses setIntersectionalResults(ResultsType value, SetMode mode) {
        putWrapped(FIELD_IntersectionalResults, ResultsType.class, value, mode);
        return this;
    }

    /**
     * Setter for intersectionalResults
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QuantitativeAnalyses.Fields#intersectionalResults
     */
    public QuantitativeAnalyses setIntersectionalResults(
        @Nonnull
        ResultsType value) {
        putWrapped(FIELD_IntersectionalResults, ResultsType.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public QuantitativeAnalyses clone()
        throws CloneNotSupportedException
    {
        return ((QuantitativeAnalyses) super.clone());
    }

    @Override
    public QuantitativeAnalyses copy()
        throws CloneNotSupportedException
    {
        return ((QuantitativeAnalyses) super.copy());
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
         * Link to a dashboard with results showing how the MLModel performed with respect to each factor
         * 
         */
        public com.linkedin.ml.metadata.ResultsType.Fields unitaryResults() {
            return new com.linkedin.ml.metadata.ResultsType.Fields(getPathComponents(), "unitaryResults");
        }

        /**
         * Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?
         * 
         */
        public com.linkedin.ml.metadata.ResultsType.Fields intersectionalResults() {
            return new com.linkedin.ml.metadata.ResultsType.Fields(getPathComponents(), "intersectionalResults");
        }

    }

}
