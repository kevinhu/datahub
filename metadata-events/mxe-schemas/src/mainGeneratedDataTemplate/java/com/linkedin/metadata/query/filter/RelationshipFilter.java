
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
 * The relationship filter to apply in a graph query
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/query/filter/RelationshipFilter.pdl.")
public class RelationshipFilter
    extends RecordTemplate
{

    private final static RelationshipFilter.Fields _fields = new RelationshipFilter.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.query.filter/**The relationship filter to apply in a graph query*/record RelationshipFilter includes/**The filter for finding a record or a collection of records*/record Filter{/**A list of of disjunctive criterion for the filter.*/or:optional array[/**A list of criterion and'd together.*/record ConjunctiveCriterion{/**A list of and criteria the filter applies to the query*/and:array[/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}=\"EQUAL\"}]}]/**Deprecated! A list of conjunctive criterion for the filter. If \"or\" field is provided, then this field is ignored.*/criteria:optional array[Criterion]}{/**The relationship direction between two nodes in a graph query*/direction:/**The relationship direction in a relationship filter*/enum RelationshipDirection{/**The incoming edge to a source node in the graph*/INCOMING/**The outgoing edge to a source node in the graph*/OUTGOING/**This is used for a query where the direction of the edge does not matter*/UNDIRECTED}=\"UNDIRECTED\"}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Or = SCHEMA.getField("or");
    private final static RecordDataSchema.Field FIELD_Criteria = SCHEMA.getField("criteria");
    private final static RecordDataSchema.Field FIELD_Direction = SCHEMA.getField("direction");

    public RelationshipFilter() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
    }

    public RelationshipFilter(DataMap data) {
        super(data, SCHEMA);
    }

    public static RelationshipFilter.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for or
     * 
     * @see RelationshipFilter.Fields#or
     */
    public boolean hasOr() {
        return contains(FIELD_Or);
    }

    /**
     * Remover for or
     * 
     * @see RelationshipFilter.Fields#or
     */
    public void removeOr() {
        remove(FIELD_Or);
    }

    /**
     * Getter for or
     * 
     * @see RelationshipFilter.Fields#or
     */
    public ConjunctiveCriterionArray getOr(GetMode mode) {
        return obtainWrapped(FIELD_Or, ConjunctiveCriterionArray.class, mode);
    }

    /**
     * Getter for or
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RelationshipFilter.Fields#or
     */
    @Nullable
    public ConjunctiveCriterionArray getOr() {
        return obtainWrapped(FIELD_Or, ConjunctiveCriterionArray.class, GetMode.STRICT);
    }

    /**
     * Setter for or
     * 
     * @see RelationshipFilter.Fields#or
     */
    public RelationshipFilter setOr(ConjunctiveCriterionArray value, SetMode mode) {
        putWrapped(FIELD_Or, ConjunctiveCriterionArray.class, value, mode);
        return this;
    }

    /**
     * Setter for or
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipFilter.Fields#or
     */
    public RelationshipFilter setOr(
        @Nonnull
        ConjunctiveCriterionArray value) {
        putWrapped(FIELD_Or, ConjunctiveCriterionArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for criteria
     * 
     * @see RelationshipFilter.Fields#criteria
     */
    public boolean hasCriteria() {
        return contains(FIELD_Criteria);
    }

    /**
     * Remover for criteria
     * 
     * @see RelationshipFilter.Fields#criteria
     */
    public void removeCriteria() {
        remove(FIELD_Criteria);
    }

    /**
     * Getter for criteria
     * 
     * @see RelationshipFilter.Fields#criteria
     */
    public CriterionArray getCriteria(GetMode mode) {
        return obtainWrapped(FIELD_Criteria, CriterionArray.class, mode);
    }

    /**
     * Getter for criteria
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RelationshipFilter.Fields#criteria
     */
    @Nullable
    public CriterionArray getCriteria() {
        return obtainWrapped(FIELD_Criteria, CriterionArray.class, GetMode.STRICT);
    }

    /**
     * Setter for criteria
     * 
     * @see RelationshipFilter.Fields#criteria
     */
    public RelationshipFilter setCriteria(CriterionArray value, SetMode mode) {
        putWrapped(FIELD_Criteria, CriterionArray.class, value, mode);
        return this;
    }

    /**
     * Setter for criteria
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipFilter.Fields#criteria
     */
    public RelationshipFilter setCriteria(
        @Nonnull
        CriterionArray value) {
        putWrapped(FIELD_Criteria, CriterionArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for direction
     * 
     * @see RelationshipFilter.Fields#direction
     */
    public boolean hasDirection() {
        return contains(FIELD_Direction);
    }

    /**
     * Remover for direction
     * 
     * @see RelationshipFilter.Fields#direction
     */
    public void removeDirection() {
        remove(FIELD_Direction);
    }

    /**
     * Getter for direction
     * 
     * @see RelationshipFilter.Fields#direction
     */
    public RelationshipDirection getDirection(GetMode mode) {
        return obtainDirect(FIELD_Direction, RelationshipDirection.class, mode);
    }

    /**
     * Getter for direction
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RelationshipFilter.Fields#direction
     */
    @Nonnull
    public RelationshipDirection getDirection() {
        return obtainDirect(FIELD_Direction, RelationshipDirection.class, GetMode.STRICT);
    }

    /**
     * Setter for direction
     * 
     * @see RelationshipFilter.Fields#direction
     */
    public RelationshipFilter setDirection(RelationshipDirection value, SetMode mode) {
        putDirect(FIELD_Direction, RelationshipDirection.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for direction
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RelationshipFilter.Fields#direction
     */
    public RelationshipFilter setDirection(
        @Nonnull
        RelationshipDirection value) {
        putDirect(FIELD_Direction, RelationshipDirection.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public RelationshipFilter clone()
        throws CloneNotSupportedException
    {
        return ((RelationshipFilter) super.clone());
    }

    @Override
    public RelationshipFilter copy()
        throws CloneNotSupportedException
    {
        return ((RelationshipFilter) super.copy());
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

        /**
         * The relationship direction between two nodes in a graph query
         * 
         */
        public PathSpec direction() {
            return new PathSpec(getPathComponents(), "direction");
        }

    }

}
