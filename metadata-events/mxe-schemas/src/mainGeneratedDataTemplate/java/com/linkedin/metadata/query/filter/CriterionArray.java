
package com.linkedin.metadata.query.filter;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/recommendation/SearchRequestContext.pdl.")
public class CriterionArray
    extends WrappingArrayTemplate<Criterion>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.query.filter/**A criterion for matching a field with given value*/record Criterion{/**The name of the field that the criterion refers to*/field:string/**The value of the intended field*/value:string/**The condition for the criterion, e.g. EQUAL, START_WITH*/condition:/**The matching condition in a filter criterion*/enum Condition{/**Represent the relation: String field contains value, e.g. name contains Profile*/CONTAIN/**Represent the relation: String field ends with value, e.g. name ends with Event*/END_WITH/**Represent the relation: field = value, e.g. platform = hdfs*/EQUAL/**Represent the relation greater than, e.g. ownerCount > 5*/GREATER_THAN/**Represent the relation greater than or equal to, e.g. ownerCount >= 5*/GREATER_THAN_OR_EQUAL_TO/**Represent the relation: String field is one of the array values to, e.g. name in [\"Profile\", \"Event\"]*/IN/**Represent the relation less than, e.g. ownerCount < 3*/LESS_THAN/**Represent the relation less than or equal to, e.g. ownerCount <= 3*/LESS_THAN_OR_EQUAL_TO/**Represent the relation: String field starts with value, e.g. name starts with PageView*/START_WITH}=\"EQUAL\"}}]", SchemaFormatType.PDL));

    public CriterionArray() {
        this(new DataList());
    }

    public CriterionArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public CriterionArray(Collection<Criterion> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public CriterionArray(DataList data) {
        super(data, SCHEMA, Criterion.class);
    }

    public CriterionArray(Criterion first, Criterion... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public CriterionArray clone()
        throws CloneNotSupportedException
    {
        return ((CriterionArray) super.clone());
    }

    @Override
    public CriterionArray copy()
        throws CloneNotSupportedException
    {
        return ((CriterionArray) super.copy());
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

        public com.linkedin.metadata.query.filter.Criterion.Fields items() {
            return new com.linkedin.metadata.query.filter.Criterion.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
