
package com.linkedin.dataset;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldProfile.pdl.")
public class ValueFrequencyArray
    extends WrappingArrayTemplate<ValueFrequency>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dataset,record ValueFrequency{value:string,frequency:long}}]", SchemaFormatType.PDL));

    public ValueFrequencyArray() {
        this(new DataList());
    }

    public ValueFrequencyArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public ValueFrequencyArray(Collection<ValueFrequency> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public ValueFrequencyArray(DataList data) {
        super(data, SCHEMA, ValueFrequency.class);
    }

    public ValueFrequencyArray(ValueFrequency first, ValueFrequency... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public ValueFrequencyArray clone()
        throws CloneNotSupportedException
    {
        return ((ValueFrequencyArray) super.clone());
    }

    @Override
    public ValueFrequencyArray copy()
        throws CloneNotSupportedException
    {
        return ((ValueFrequencyArray) super.copy());
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

        public com.linkedin.dataset.ValueFrequency.Fields items() {
            return new com.linkedin.dataset.ValueFrequency.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
