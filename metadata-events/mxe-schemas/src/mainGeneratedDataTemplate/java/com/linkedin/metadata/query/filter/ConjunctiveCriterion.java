
package com.linkedin.metadata.query.filter;

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
 * A list of criterion and'd together.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/filter/ConjunctiveCriterion.pdl.")
public class ConjunctiveCriterion
    extends RecordTemplate
{

    private final static ConjunctiveCriterion.Fields _fields = new ConjunctiveCriterion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query.filter/**A list of criterion and'd together.*/record ConjunctiveCriterion{/**A list of and criteria the filter applies to the query*/and:array[/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}=\"EQUAL\"}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_And = SCHEMA.getField("and");

    public ConjunctiveCriterion() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
    }

    public ConjunctiveCriterion(DataMap data) {
        super(data, SCHEMA);
    }

    public static ConjunctiveCriterion.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for and
     * 
     * @see ConjunctiveCriterion.Fields#and
     */
    public boolean hasAnd() {
        return contains(FIELD_And);
    }

    /**
     * Remover for and
     * 
     * @see ConjunctiveCriterion.Fields#and
     */
    public void removeAnd() {
        remove(FIELD_And);
    }

    /**
     * Getter for and
     * 
     * @see ConjunctiveCriterion.Fields#and
     */
    public CriterionArray getAnd(GetMode mode) {
        return obtainWrapped(FIELD_And, CriterionArray.class, mode);
    }

    /**
     * Getter for and
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ConjunctiveCriterion.Fields#and
     */
    @Nonnull
    public CriterionArray getAnd() {
        return obtainWrapped(FIELD_And, CriterionArray.class, GetMode.STRICT);
    }

    /**
     * Setter for and
     * 
     * @see ConjunctiveCriterion.Fields#and
     */
    public ConjunctiveCriterion setAnd(CriterionArray value, SetMode mode) {
        putWrapped(FIELD_And, CriterionArray.class, value, mode);
        return this;
    }

    /**
     * Setter for and
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ConjunctiveCriterion.Fields#and
     */
    public ConjunctiveCriterion setAnd(
        @Nonnull
        CriterionArray value) {
        putWrapped(FIELD_And, CriterionArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public ConjunctiveCriterion clone()
        throws CloneNotSupportedException
    {
        return ((ConjunctiveCriterion) super.clone());
    }

    @Override
    public ConjunctiveCriterion copy()
        throws CloneNotSupportedException
    {
        return ((ConjunctiveCriterion) super.copy());
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
         * A list of and criteria the filter applies to the query
         * 
         */
        public com.linkedin.metadata.query.filter.CriterionArray.Fields and() {
            return new com.linkedin.metadata.query.filter.CriterionArray.Fields(getPathComponents(), "and");
        }

        /**
         * A list of and criteria the filter applies to the query
         * 
         */
        public PathSpec and(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "and");
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
