
package com.linkedin.metadata.search;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/SearchResult.pdl.")
public class SearchEntityArray
    extends WrappingArrayTemplate<SearchEntity>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.search/**The model for each entity returned by the search query*/record SearchEntity{/**Urn of the entity being returned*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Matched field name and values*/matchedFields:array[record MatchedField{/**Matched field name*/name:string/**Matched field value*/value:string}]=[]features:optional map[string,double]}}]", SchemaFormatType.PDL));

    public SearchEntityArray() {
        this(new DataList());
    }

    public SearchEntityArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public SearchEntityArray(Collection<SearchEntity> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public SearchEntityArray(DataList data) {
        super(data, SCHEMA, SearchEntity.class);
    }

    public SearchEntityArray(SearchEntity first, SearchEntity... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public SearchEntityArray clone()
        throws CloneNotSupportedException
    {
        return ((SearchEntityArray) super.clone());
    }

    @Override
    public SearchEntityArray copy()
        throws CloneNotSupportedException
    {
        return ((SearchEntityArray) super.copy());
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

        public com.linkedin.metadata.search.SearchEntity.Fields items() {
            return new com.linkedin.metadata.search.SearchEntity.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
