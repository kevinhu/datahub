
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
import com.linkedin.data.template.StringArray;
import com.linkedin.metadata.query.filter.CriterionArray;


/**
 * Context to define the search recommendations
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/SearchParams.pdl.")
public class SearchParams
    extends RecordTemplate
{

    private final static SearchParams.Fields _fields = new SearchParams.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Context to define the search recommendations*/record SearchParams{/**Entity types to be searched. If this is not provided, all entities will be searched.*/types:array[string]=[]/**Search query*/query:string/**Filters*/filters:array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}=\"EQUAL\"}}]=[]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Types = SCHEMA.getField("types");
    private final static RecordDataSchema.Field FIELD_Query = SCHEMA.getField("query");
    private final static RecordDataSchema.Field FIELD_Filters = SCHEMA.getField("filters");

    public SearchParams() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
    }

    public SearchParams(DataMap data) {
        super(data, SCHEMA);
    }

    public static SearchParams.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for types
     * 
     * @see SearchParams.Fields#types
     */
    public boolean hasTypes() {
        return contains(FIELD_Types);
    }

    /**
     * Remover for types
     * 
     * @see SearchParams.Fields#types
     */
    public void removeTypes() {
        remove(FIELD_Types);
    }

    /**
     * Getter for types
     * 
     * @see SearchParams.Fields#types
     */
    public StringArray getTypes(GetMode mode) {
        return obtainWrapped(FIELD_Types, StringArray.class, mode);
    }

    /**
     * Getter for types
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchParams.Fields#types
     */
    @Nonnull
    public StringArray getTypes() {
        return obtainWrapped(FIELD_Types, StringArray.class, GetMode.STRICT);
    }

    /**
     * Setter for types
     * 
     * @see SearchParams.Fields#types
     */
    public SearchParams setTypes(StringArray value, SetMode mode) {
        putWrapped(FIELD_Types, StringArray.class, value, mode);
        return this;
    }

    /**
     * Setter for types
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchParams.Fields#types
     */
    public SearchParams setTypes(
        @Nonnull
        StringArray value) {
        putWrapped(FIELD_Types, StringArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for query
     * 
     * @see SearchParams.Fields#query
     */
    public boolean hasQuery() {
        return contains(FIELD_Query);
    }

    /**
     * Remover for query
     * 
     * @see SearchParams.Fields#query
     */
    public void removeQuery() {
        remove(FIELD_Query);
    }

    /**
     * Getter for query
     * 
     * @see SearchParams.Fields#query
     */
    public String getQuery(GetMode mode) {
        return obtainDirect(FIELD_Query, String.class, mode);
    }

    /**
     * Getter for query
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchParams.Fields#query
     */
    @Nonnull
    public String getQuery() {
        return obtainDirect(FIELD_Query, String.class, GetMode.STRICT);
    }

    /**
     * Setter for query
     * 
     * @see SearchParams.Fields#query
     */
    public SearchParams setQuery(String value, SetMode mode) {
        putDirect(FIELD_Query, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for query
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchParams.Fields#query
     */
    public SearchParams setQuery(
        @Nonnull
        String value) {
        putDirect(FIELD_Query, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for filters
     * 
     * @see SearchParams.Fields#filters
     */
    public boolean hasFilters() {
        return contains(FIELD_Filters);
    }

    /**
     * Remover for filters
     * 
     * @see SearchParams.Fields#filters
     */
    public void removeFilters() {
        remove(FIELD_Filters);
    }

    /**
     * Getter for filters
     * 
     * @see SearchParams.Fields#filters
     */
    public CriterionArray getFilters(GetMode mode) {
        return obtainWrapped(FIELD_Filters, CriterionArray.class, mode);
    }

    /**
     * Getter for filters
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SearchParams.Fields#filters
     */
    @Nonnull
    public CriterionArray getFilters() {
        return obtainWrapped(FIELD_Filters, CriterionArray.class, GetMode.STRICT);
    }

    /**
     * Setter for filters
     * 
     * @see SearchParams.Fields#filters
     */
    public SearchParams setFilters(CriterionArray value, SetMode mode) {
        putWrapped(FIELD_Filters, CriterionArray.class, value, mode);
        return this;
    }

    /**
     * Setter for filters
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SearchParams.Fields#filters
     */
    public SearchParams setFilters(
        @Nonnull
        CriterionArray value) {
        putWrapped(FIELD_Filters, CriterionArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public SearchParams clone()
        throws CloneNotSupportedException
    {
        return ((SearchParams) super.clone());
    }

    @Override
    public SearchParams copy()
        throws CloneNotSupportedException
    {
        return ((SearchParams) super.copy());
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
         * Entity types to be searched. If this is not provided, all entities will be searched.
         * 
         */
        public PathSpec types() {
            return new PathSpec(getPathComponents(), "types");
        }

        /**
         * Entity types to be searched. If this is not provided, all entities will be searched.
         * 
         */
        public PathSpec types(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "types");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Search query
         * 
         */
        public PathSpec query() {
            return new PathSpec(getPathComponents(), "query");
        }

        /**
         * Filters
         * 
         */
        public com.linkedin.metadata.query.filter.CriterionArray.Fields filters() {
            return new com.linkedin.metadata.query.filter.CriterionArray.Fields(getPathComponents(), "filters");
        }

        /**
         * Filters
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
