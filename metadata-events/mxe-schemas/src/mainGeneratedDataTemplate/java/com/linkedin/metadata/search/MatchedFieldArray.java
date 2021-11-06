
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/SearchEntity.pdl.")
public class MatchedFieldArray
    extends WrappingArrayTemplate<MatchedField>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.search,record MatchedField{/**Matched field name*/name:string/**Matched field value*/value:string}}]", SchemaFormatType.PDL));

    public MatchedFieldArray() {
        this(new DataList());
    }

    public MatchedFieldArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public MatchedFieldArray(Collection<MatchedField> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public MatchedFieldArray(DataList data) {
        super(data, SCHEMA, MatchedField.class);
    }

    public MatchedFieldArray(MatchedField first, MatchedField... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public MatchedFieldArray clone()
        throws CloneNotSupportedException
    {
        return ((MatchedFieldArray) super.clone());
    }

    @Override
    public MatchedFieldArray copy()
        throws CloneNotSupportedException
    {
        return ((MatchedFieldArray) super.copy());
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

        public com.linkedin.metadata.search.MatchedField.Fields items() {
            return new com.linkedin.metadata.search.MatchedField.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
