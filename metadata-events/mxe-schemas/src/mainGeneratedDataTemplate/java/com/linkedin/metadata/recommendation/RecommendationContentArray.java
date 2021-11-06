
package com.linkedin.metadata.recommendation;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/RecommendationModule.pdl.")
public class RecommendationContentArray
    extends WrappingArrayTemplate<RecommendationContent>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.recommendation/**Content to display within each recommendation module*/record RecommendationContent{/**String representation of content*/value:string/**Entity being recommended. Empty if the content being recommended is not an entity*/entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Additional context required to generate the the recommendation*/params:optional/**Parameters required to render a recommendation of a given type*/record RecommendationParams{/**Context to define the search recommendations*/searchParams:optional/**Context to define the search recommendations*/record SearchParams{/**Entity types to be searched. If this is not provided, all entities will be searched.*/types:array[string]=[]/**Search query*/query:string/**Filters*/filters:array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}=\"EQUAL\"}}]=[]}/**Context to define the entity profile page*/entityProfileParams:optional/**Context to define the entity profile page*/record EntityProfileParams{/**Urn of the entity being shown*/urn:com.linkedin.common.Urn}/**Context about the recommendation*/contentParams:optional/**Params about the recommended content*/record ContentParams{/**Number of entities corresponding to the recommended content*/count:long}}}}]", SchemaFormatType.PDL));

    public RecommendationContentArray() {
        this(new DataList());
    }

    public RecommendationContentArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public RecommendationContentArray(Collection<RecommendationContent> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public RecommendationContentArray(DataList data) {
        super(data, SCHEMA, RecommendationContent.class);
    }

    public RecommendationContentArray(RecommendationContent first, RecommendationContent... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public RecommendationContentArray clone()
        throws CloneNotSupportedException
    {
        return ((RecommendationContentArray) super.clone());
    }

    @Override
    public RecommendationContentArray copy()
        throws CloneNotSupportedException
    {
        return ((RecommendationContentArray) super.copy());
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

        public com.linkedin.metadata.recommendation.RecommendationContent.Fields items() {
            return new com.linkedin.metadata.recommendation.RecommendationContent.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
