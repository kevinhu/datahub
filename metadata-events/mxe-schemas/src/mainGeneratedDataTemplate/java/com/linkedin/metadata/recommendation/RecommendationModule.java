
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


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/RecommendationModule.pdl.")
public class RecommendationModule
    extends RecordTemplate
{

    private final static RecommendationModule.Fields _fields = new RecommendationModule.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.recommendation,record RecommendationModule{/**Title of the module to display*/title:string/**Unique id of the module being recommended*/moduleId:string/**Type of rendering that defines how the module should be rendered*/renderType:/**Enum that defines how the modules should be rendered.\nThere should be two frontend implementation of large and small modules per type.*/enum RecommendationRenderType{/**Simple list of entities*/ENTITY_NAME_LIST/**List of platforms to search*/PLATFORM_SEARCH_LIST/**Tag search list*/TAG_SEARCH_LIST/**Glossary term search list*/GLOSSARY_TERM_SEARCH_LIST/**A list of recommended searches*/SEARCH_QUERY_LIST}/**List of content to display inside the module*/content:array[/**Content to display within each recommendation module*/record RecommendationContent{/**String representation of content*/value:string/**Entity being recommended. Empty if the content being recommended is not an entity*/entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Additional context required to generate the the recommendation*/params:optional/**Parameters required to render a recommendation of a given type*/record RecommendationParams{/**Context to define the search recommendations*/searchParams:optional/**Context to define the search recommendations*/record SearchParams{/**Entity types to be searched. If this is not provided, all entities will be searched.*/types:array[string]=[]/**Search query*/query:string/**Filters*/filters:array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}=\"EQUAL\"}}]=[]}/**Context to define the entity profile page*/entityProfileParams:optional/**Context to define the entity profile page*/record EntityProfileParams{/**Urn of the entity being shown*/urn:com.linkedin.common.Urn}/**Context about the recommendation*/contentParams:optional/**Params about the recommended content*/record ContentParams{/**Number of entities corresponding to the recommended content*/count:long}}}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Title = SCHEMA.getField("title");
    private final static RecordDataSchema.Field FIELD_ModuleId = SCHEMA.getField("moduleId");
    private final static RecordDataSchema.Field FIELD_RenderType = SCHEMA.getField("renderType");
    private final static RecordDataSchema.Field FIELD_Content = SCHEMA.getField("content");

    public RecommendationModule() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
    }

    public RecommendationModule(DataMap data) {
        super(data, SCHEMA);
    }

    public static RecommendationModule.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for title
     * 
     * @see RecommendationModule.Fields#title
     */
    public boolean hasTitle() {
        return contains(FIELD_Title);
    }

    /**
     * Remover for title
     * 
     * @see RecommendationModule.Fields#title
     */
    public void removeTitle() {
        remove(FIELD_Title);
    }

    /**
     * Getter for title
     * 
     * @see RecommendationModule.Fields#title
     */
    public String getTitle(GetMode mode) {
        return obtainDirect(FIELD_Title, String.class, mode);
    }

    /**
     * Getter for title
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RecommendationModule.Fields#title
     */
    @Nonnull
    public String getTitle() {
        return obtainDirect(FIELD_Title, String.class, GetMode.STRICT);
    }

    /**
     * Setter for title
     * 
     * @see RecommendationModule.Fields#title
     */
    public RecommendationModule setTitle(String value, SetMode mode) {
        putDirect(FIELD_Title, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for title
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationModule.Fields#title
     */
    public RecommendationModule setTitle(
        @Nonnull
        String value) {
        putDirect(FIELD_Title, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for moduleId
     * 
     * @see RecommendationModule.Fields#moduleId
     */
    public boolean hasModuleId() {
        return contains(FIELD_ModuleId);
    }

    /**
     * Remover for moduleId
     * 
     * @see RecommendationModule.Fields#moduleId
     */
    public void removeModuleId() {
        remove(FIELD_ModuleId);
    }

    /**
     * Getter for moduleId
     * 
     * @see RecommendationModule.Fields#moduleId
     */
    public String getModuleId(GetMode mode) {
        return obtainDirect(FIELD_ModuleId, String.class, mode);
    }

    /**
     * Getter for moduleId
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RecommendationModule.Fields#moduleId
     */
    @Nonnull
    public String getModuleId() {
        return obtainDirect(FIELD_ModuleId, String.class, GetMode.STRICT);
    }

    /**
     * Setter for moduleId
     * 
     * @see RecommendationModule.Fields#moduleId
     */
    public RecommendationModule setModuleId(String value, SetMode mode) {
        putDirect(FIELD_ModuleId, String.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for moduleId
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationModule.Fields#moduleId
     */
    public RecommendationModule setModuleId(
        @Nonnull
        String value) {
        putDirect(FIELD_ModuleId, String.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for renderType
     * 
     * @see RecommendationModule.Fields#renderType
     */
    public boolean hasRenderType() {
        return contains(FIELD_RenderType);
    }

    /**
     * Remover for renderType
     * 
     * @see RecommendationModule.Fields#renderType
     */
    public void removeRenderType() {
        remove(FIELD_RenderType);
    }

    /**
     * Getter for renderType
     * 
     * @see RecommendationModule.Fields#renderType
     */
    public RecommendationRenderType getRenderType(GetMode mode) {
        return obtainDirect(FIELD_RenderType, RecommendationRenderType.class, mode);
    }

    /**
     * Getter for renderType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RecommendationModule.Fields#renderType
     */
    @Nonnull
    public RecommendationRenderType getRenderType() {
        return obtainDirect(FIELD_RenderType, RecommendationRenderType.class, GetMode.STRICT);
    }

    /**
     * Setter for renderType
     * 
     * @see RecommendationModule.Fields#renderType
     */
    public RecommendationModule setRenderType(RecommendationRenderType value, SetMode mode) {
        putDirect(FIELD_RenderType, RecommendationRenderType.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for renderType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationModule.Fields#renderType
     */
    public RecommendationModule setRenderType(
        @Nonnull
        RecommendationRenderType value) {
        putDirect(FIELD_RenderType, RecommendationRenderType.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for content
     * 
     * @see RecommendationModule.Fields#content
     */
    public boolean hasContent() {
        return contains(FIELD_Content);
    }

    /**
     * Remover for content
     * 
     * @see RecommendationModule.Fields#content
     */
    public void removeContent() {
        remove(FIELD_Content);
    }

    /**
     * Getter for content
     * 
     * @see RecommendationModule.Fields#content
     */
    public RecommendationContentArray getContent(GetMode mode) {
        return obtainWrapped(FIELD_Content, RecommendationContentArray.class, mode);
    }

    /**
     * Getter for content
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RecommendationModule.Fields#content
     */
    @Nonnull
    public RecommendationContentArray getContent() {
        return obtainWrapped(FIELD_Content, RecommendationContentArray.class, GetMode.STRICT);
    }

    /**
     * Setter for content
     * 
     * @see RecommendationModule.Fields#content
     */
    public RecommendationModule setContent(RecommendationContentArray value, SetMode mode) {
        putWrapped(FIELD_Content, RecommendationContentArray.class, value, mode);
        return this;
    }

    /**
     * Setter for content
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see RecommendationModule.Fields#content
     */
    public RecommendationModule setContent(
        @Nonnull
        RecommendationContentArray value) {
        putWrapped(FIELD_Content, RecommendationContentArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public RecommendationModule clone()
        throws CloneNotSupportedException
    {
        return ((RecommendationModule) super.clone());
    }

    @Override
    public RecommendationModule copy()
        throws CloneNotSupportedException
    {
        return ((RecommendationModule) super.copy());
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
         * Title of the module to display
         * 
         */
        public PathSpec title() {
            return new PathSpec(getPathComponents(), "title");
        }

        /**
         * Unique id of the module being recommended
         * 
         */
        public PathSpec moduleId() {
            return new PathSpec(getPathComponents(), "moduleId");
        }

        /**
         * Type of rendering that defines how the module should be rendered
         * 
         */
        public PathSpec renderType() {
            return new PathSpec(getPathComponents(), "renderType");
        }

        /**
         * List of content to display inside the module
         * 
         */
        public com.linkedin.metadata.recommendation.RecommendationContentArray.Fields content() {
            return new com.linkedin.metadata.recommendation.RecommendationContentArray.Fields(getPathComponents(), "content");
        }

        /**
         * List of content to display inside the module
         * 
         */
        public PathSpec content(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "content");
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
