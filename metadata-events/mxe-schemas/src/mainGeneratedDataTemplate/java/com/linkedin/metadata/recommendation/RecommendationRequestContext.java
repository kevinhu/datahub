
package com.linkedin.metadata.recommendation;

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
 * Context that defines the page requesting recommendations
 * i.e. for search pages, the query/filters. for entity pages, the entity urn and tab
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/RecommendationRequestContext.pdl.")
public class RecommendationRequestContext
    extends RecordTemplate
{

    private final static RecommendationRequestContext.Fields _fields = new RecommendationRequestContext.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation/**Context that defines the page requesting recommendations\ni.e. for search pages, the query/filters. for entity pages, the entity urn and tab*/record RecommendationRequestContext{/**Scenario in which the recommendations will be displayed*/scenario:/**Type of the scenario requesting recommendation*/enum ScenarioType{/**Recommendations to show on the users home page*/HOME/**Recommendations to show on the search results page*/SEARCH_RESULTS/**Recommendations to show on an Entity Profile page*/ENTITY_PROFILE}/**Additional context for defining the search page requesting recommendations*/searchRequestContext:optional/**Context that defines a search page requesting recommendations*/record SearchRequestContext{/**Search query*/query:string/**filters applied to search results*/filters:array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}=\"EQUAL\"}}]=[]}/**Additional context for defining the entity page requesting recommendations*/entityRequestContext:optional/**Context that defines an entity page requesting recommendations*/record EntityRequestContext{/**Type of the entity being displayed*/type:string/**Urn of the entity being displayed*/urn:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}}}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Scenario = SCHEMA.getField("scenario");
    private final static RecordDataSchema.Field FIELD_SearchRequestContext = SCHEMA.getField("searchRequestContext");
    private final static RecordDataSchema.Field FIELD_EntityRequestContext = SCHEMA.getField("entityRequestContext");

    public RecommendationRequestContext() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
    }

    public RecommendationRequestContext(DataMap data) {
        super(data, SCHEMA);
    }

    public static RecommendationRequestContext.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for scenario
     * 
     * @see RecommendationRequestContext.Fields#scenario
     */
    public boolean hasScenario() {
        return contains(FIELD_Scenario);
    }

    /**
     * Remover for scenario
     * 
     * @see RecommendationRequestContext.Fields#scenario
     */
    public void removeScenario() {
        remove(FIELD_Scenario);
    }

    /**
     * Getter for scenario
     * 
     * @see RecommendationRequestContext.Fields#scenario
     */
    public ScenarioType getScenario(GetMode mode) {
        return obtainDirect(FIELD_Scenario, ScenarioType.class, mode);
    }

    /**
     * Getter for scenario
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RecommendationRequestContext.Fields#scenario
     */
    @Nonnull
    public ScenarioType getScenario() {
        return obtainDirect(FIELD_Scenario, ScenarioType.class, GetMode.STRICT);
    }

    /**
     * Setter for scenario
     * 
     * @see RecommendationRequestContext.Fields#scenario
     */
    public RecommendationRequestContext setScenario(ScenarioType value, SetMode mode) {
        putDirect(FIELD_Scenario, ScenarioType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for scenario
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationRequestContext.Fields#scenario
     */
    public RecommendationRequestContext setScenario(
        @Nonnull
        ScenarioType value) {
        putDirect(FIELD_Scenario, ScenarioType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for searchRequestContext
     * 
     * @see RecommendationRequestContext.Fields#searchRequestContext
     */
    public boolean hasSearchRequestContext() {
        return contains(FIELD_SearchRequestContext);
    }

    /**
     * Remover for searchRequestContext
     * 
     * @see RecommendationRequestContext.Fields#searchRequestContext
     */
    public void removeSearchRequestContext() {
        remove(FIELD_SearchRequestContext);
    }

    /**
     * Getter for searchRequestContext
     * 
     * @see RecommendationRequestContext.Fields#searchRequestContext
     */
    public SearchRequestContext getSearchRequestContext(GetMode mode) {
        return obtainWrapped(FIELD_SearchRequestContext, SearchRequestContext.class, mode);
    }

    /**
     * Getter for searchRequestContext
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationRequestContext.Fields#searchRequestContext
     */
    @Nullable
    public SearchRequestContext getSearchRequestContext() {
        return obtainWrapped(FIELD_SearchRequestContext, SearchRequestContext.class, GetMode.STRICT);
    }

    /**
     * Setter for searchRequestContext
     * 
     * @see RecommendationRequestContext.Fields#searchRequestContext
     */
    public RecommendationRequestContext setSearchRequestContext(SearchRequestContext value, SetMode mode) {
        putWrapped(FIELD_SearchRequestContext, SearchRequestContext.class, value, mode);
        return this;
    }

    /**
     * Setter for searchRequestContext
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationRequestContext.Fields#searchRequestContext
     */
    public RecommendationRequestContext setSearchRequestContext(
        @Nonnull
        SearchRequestContext value) {
        putWrapped(FIELD_SearchRequestContext, SearchRequestContext.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for entityRequestContext
     * 
     * @see RecommendationRequestContext.Fields#entityRequestContext
     */
    public boolean hasEntityRequestContext() {
        return contains(FIELD_EntityRequestContext);
    }

    /**
     * Remover for entityRequestContext
     * 
     * @see RecommendationRequestContext.Fields#entityRequestContext
     */
    public void removeEntityRequestContext() {
        remove(FIELD_EntityRequestContext);
    }

    /**
     * Getter for entityRequestContext
     * 
     * @see RecommendationRequestContext.Fields#entityRequestContext
     */
    public EntityRequestContext getEntityRequestContext(GetMode mode) {
        return obtainWrapped(FIELD_EntityRequestContext, EntityRequestContext.class, mode);
    }

    /**
     * Getter for entityRequestContext
     * 
     * @return
     *     Optional field. Always check for null.
     * @see RecommendationRequestContext.Fields#entityRequestContext
     */
    @Nullable
    public EntityRequestContext getEntityRequestContext() {
        return obtainWrapped(FIELD_EntityRequestContext, EntityRequestContext.class, GetMode.STRICT);
    }

    /**
     * Setter for entityRequestContext
     * 
     * @see RecommendationRequestContext.Fields#entityRequestContext
     */
    public RecommendationRequestContext setEntityRequestContext(EntityRequestContext value, SetMode mode) {
        putWrapped(FIELD_EntityRequestContext, EntityRequestContext.class, value, mode);
        return this;
    }

    /**
     * Setter for entityRequestContext
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationRequestContext.Fields#entityRequestContext
     */
    public RecommendationRequestContext setEntityRequestContext(
        @Nonnull
        EntityRequestContext value) {
        putWrapped(FIELD_EntityRequestContext, EntityRequestContext.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public RecommendationRequestContext clone()
        throws CloneNotSupportedException
    {
        return ((RecommendationRequestContext) super.clone());
    }

    @Override
    public RecommendationRequestContext copy()
        throws CloneNotSupportedException
    {
        return ((RecommendationRequestContext) super.copy());
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
         * Scenario in which the recommendations will be displayed
         * 
         */
        public PathSpec scenario() {
            return new PathSpec(getPathComponents(), "scenario");
        }

        /**
         * Additional context for defining the search page requesting recommendations
         * 
         */
        public com.linkedin.metadata.recommendation.SearchRequestContext.Fields searchRequestContext() {
            return new com.linkedin.metadata.recommendation.SearchRequestContext.Fields(getPathComponents(), "searchRequestContext");
        }

        /**
         * Additional context for defining the entity page requesting recommendations
         * 
         */
        public com.linkedin.metadata.recommendation.EntityRequestContext.Fields entityRequestContext() {
            return new com.linkedin.metadata.recommendation.EntityRequestContext.Fields(getPathComponents(), "entityRequestContext");
        }

    }

}
