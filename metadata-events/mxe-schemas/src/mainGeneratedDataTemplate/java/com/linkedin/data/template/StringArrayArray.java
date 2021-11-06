
package com.linkedin.data.template;

import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.SchemaFormatType;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/GenericTable.pdl.")
public class StringArrayArray
    extends WrappingArrayTemplate<StringArray>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[array[string]]", SchemaFormatType.PDL));

    public StringArrayArray() {
        this(new DataList());
    }

    public StringArrayArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public StringArrayArray(Collection<StringArray> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public StringArrayArray(DataList data) {
        super(data, SCHEMA, StringArray.class);
    }

    public StringArrayArray(StringArray first, StringArray... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public StringArrayArray clone()
        throws CloneNotSupportedException
    {
        return ((StringArrayArray) super.clone());
    }

    @Override
    public StringArrayArray copy()
        throws CloneNotSupportedException
    {
        return ((StringArrayArray) super.copy());
    }

}
