
package com.linkedin.metadata.recommendation;

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
import com.linkedin.metadata.query.filter.CriterionArray;


/**
 * Context that defines a search page requesting recommendations
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/SearchRequestContext.pdl.")
public class SearchRequestContext
    extends RecordTemplate
{

    private final static SearchRequestContext.Fields _fields = new SearchRequestContext.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Context that defines a search page requesting recommendations*/record SearchRequestContext{/**Search query*/query:string/**filters applied to search results*/filters:array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}=\"EQUAL\"}}]=[]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Query = SCHEMA.getField("query");
    private final static RecordDataSchema.Field FIELD_Filters = SCHEMA.getField("filters");

    public SearchRequestContext() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
    }

    public SearchRequestContext(DataMap data) {
        super(data, SCHEMA);
    }

    public static SearchRequestContext.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for query
     * 
     * @see SearchRequestContext.Fields#query
     */
    public boolean hasQuery() {
        return contains(FIELD_Query);
    }

    /**
     * Remover for query
     * 
     * @see SearchRequestContext.Fields#query
     */
    public void removeQuery() {
        remove(FIELD_Query);
    }

    /**
     * Getter for query
     * 
     * @see SearchRequestContext.Fields#query
     */
    public String getQuery(GetMode mode) {
        return obtainDirect(FIELD_Query, String.class, mode);
    }

    /**
     * Getter for query
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchRequestContext.Fields#query
     */
    @Nonnull
    public String getQuery() {
        return obtainDirect(FIELD_Query, String.class, GetMode.STRICT);
    }

    /**
     * Setter for query
     * 
     * @see SearchRequestContext.Fields#query
     */
    public SearchRequestContext setQuery(String value, SetMode mode) {
        putDirect(FIELD_Query, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for query
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchRequestContext.Fields#query
     */
    public SearchRequestContext setQuery(
        @Nonnull
        String value) {
        putDirect(FIELD_Query, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for filters
     * 
     * @see SearchRequestContext.Fields#filters
     */
    public boolean hasFilters() {
        return contains(FIELD_Filters);
    }

    /**
     * Remover for filters
     * 
     * @see SearchRequestContext.Fields#filters
     */
    public void removeFilters() {
        remove(FIELD_Filters);
    }

    /**
     * Getter for filters
     * 
     * @see SearchRequestContext.Fields#filters
     */
    public CriterionArray getFilters(GetMode mode) {
        return obtainWrapped(FIELD_Filters, CriterionArray.class, mode);
    }

    /**
     * Getter for filters
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchRequestContext.Fields#filters
     */
    @Nonnull
    public CriterionArray getFilters() {
        return obtainWrapped(FIELD_Filters, CriterionArray.class, GetMode.STRICT);
    }

    /**
     * Setter for filters
     * 
     * @see SearchRequestContext.Fields#filters
     */
    public SearchRequestContext setFilters(CriterionArray value, SetMode mode) {
        putWrapped(FIELD_Filters, CriterionArray.class, value, mode);
        return this;
    }

    /**
     * Setter for filters
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchRequestContext.Fields#filters
     */
    public SearchRequestContext setFilters(
        @Nonnull
        CriterionArray value) {
        putWrapped(FIELD_Filters, CriterionArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SearchRequestContext clone()
        throws CloneNotSupportedException
    {
        return ((SearchRequestContext) super.clone());
    }

    @Override
    public SearchRequestContext copy()
        throws CloneNotSupportedException
    {
        return ((SearchRequestContext) super.copy());
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
         * Search query
         * 
         */
        public PathSpec query() {
            return new PathSpec(getPathComponents(), "query");
        }

        /**
         * filters applied to search results
         * 
         */
        public com.linkedin.metadata.query.filter.CriterionArray.Fields filters() {
            return new com.linkedin.metadata.query.filter.CriterionArray.Fields(getPathComponents(), "filters");
        }

        /**
         * filters applied to search results
         * 
         */
        public PathSpec filters(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "filters");
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
