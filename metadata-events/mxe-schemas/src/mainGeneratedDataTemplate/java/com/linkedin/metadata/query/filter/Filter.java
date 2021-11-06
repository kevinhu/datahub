
package com.linkedin.metadata.query.filter;

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
 * The filter for finding a record or a collection of records
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/filter/Filter.pdl.")
public class Filter
    extends RecordTemplate
{

    private final static Filter.Fields _fields = new Filter.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query.filter/**The filter for finding a record or a collection of records*/record Filter{/**A list of of disjunctive criterion for the filter.*/or:optional array[/**A list of criterion and'd together.*/record ConjunctiveCriterion{/**A list of and criteria the filter applies to the query*/and:array[/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}=\"EQUAL\"}]}]/**Deprecated! A list of conjunctive criterion for the filter. If \"or\" field is provided, then this field is ignored.*/criteria:optional array[Criterion]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Or = SCHEMA.getField("or");
    private final static RecordDataSchema.Field FIELD_Criteria = SCHEMA.getField("criteria");

    public Filter() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
    }

    public Filter(DataMap data) {
        super(data, SCHEMA);
    }

    public static Filter.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for or
     * 
     * @see Filter.Fields#or
     */
    public boolean hasOr() {
        return contains(FIELD_Or);
    }

    /**
     * Remover for or
     * 
     * @see Filter.Fields#or
     */
    public void removeOr() {
        remove(FIELD_Or);
    }

    /**
     * Getter for or
     * 
     * @see Filter.Fields#or
     */
    public ConjunctiveCriterionArray getOr(GetMode mode) {
        return obtainWrapped(FIELD_Or, ConjunctiveCriterionArray.class, mode);
    }

    /**
     * Getter for or
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Filter.Fields#or
     */
    @Nullable
    public ConjunctiveCriterionArray getOr() {
        return obtainWrapped(FIELD_Or, ConjunctiveCriterionArray.class, GetMode.STRICT);
    }

    /**
     * Setter for or
     * 
     * @see Filter.Fields#or
     */
    public Filter setOr(ConjunctiveCriterionArray value, SetMode mode) {
        putWrapped(FIELD_Or, ConjunctiveCriterionArray.class, value, mode);
        return this;
    }

    /**
     * Setter for or
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Filter.Fields#or
     */
    public Filter setOr(
        @Nonnull
        ConjunctiveCriterionArray value) {
        putWrapped(FIELD_Or, ConjunctiveCriterionArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for criteria
     * 
     * @see Filter.Fields#criteria
     */
    public boolean hasCriteria() {
        return contains(FIELD_Criteria);
    }

    /**
     * Remover for criteria
     * 
     * @see Filter.Fields#criteria
     */
    public void removeCriteria() {
        remove(FIELD_Criteria);
    }

    /**
     * Getter for criteria
     * 
     * @see Filter.Fields#criteria
     */
    public CriterionArray getCriteria(GetMode mode) {
        return obtainWrapped(FIELD_Criteria, CriterionArray.class, mode);
    }

    /**
     * Getter for criteria
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Filter.Fields#criteria
     */
    @Nullable
    public CriterionArray getCriteria() {
        return obtainWrapped(FIELD_Criteria, CriterionArray.class, GetMode.STRICT);
    }

    /**
     * Setter for criteria
     * 
     * @see Filter.Fields#criteria
     */
    public Filter setCriteria(CriterionArray value, SetMode mode) {
        putWrapped(FIELD_Criteria, CriterionArray.class, value, mode);
        return this;
    }

    /**
     * Setter for criteria
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Filter.Fields#criteria
     */
    public Filter setCriteria(
        @Nonnull
        CriterionArray value) {
        putWrapped(FIELD_Criteria, CriterionArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public Filter clone()
        throws CloneNotSupportedException
    {
        return ((Filter) super.clone());
    }

    @Override
    public Filter copy()
        throws CloneNotSupportedException
    {
        return ((Filter) super.copy());
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
         * A list of of disjunctive criterion for the filter.
         * 
         */
        public com.linkedin.metadata.query.filter.ConjunctiveCriterionArray.Fields or() {
            return new com.linkedin.metadata.query.filter.ConjunctiveCriterionArray.Fields(getPathComponents(), "or");
        }

        /**
         * A list of of disjunctive criterion for the filter.
         * 
         */
        public PathSpec or(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "or");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Deprecated! A list of conjunctive criterion for the filter. If "or" field is provided, then this field is ignored.
         * 
         */
        public com.linkedin.metadata.query.filter.CriterionArray.Fields criteria() {
            return new com.linkedin.metadata.query.filter.CriterionArray.Fields(getPathComponents(), "criteria");
        }

        /**
         * Deprecated! A list of conjunctive criterion for the filter. If "or" field is provided, then this field is ignored.
         * 
         */
        public PathSpec criteria(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "criteria");
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
