
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
public class QuantileArray
    extends WrappingArrayTemplate<Quantile>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dataset,record Quantile{quantile:string,value:string}}]", SchemaFormatType.PDL));

    public QuantileArray() {
        this(new DataList());
    }

    public QuantileArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public QuantileArray(Collection<Quantile> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public QuantileArray(DataList data) {
        super(data, SCHEMA, Quantile.class);
    }

    public QuantileArray(Quantile first, Quantile... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public QuantileArray clone()
        throws CloneNotSupportedException
    {
        return ((QuantileArray) super.clone());
    }

    @Override
    public QuantileArray copy()
        throws CloneNotSupportedException
    {
        return ((QuantileArray) super.copy());
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

        public com.linkedin.dataset.Quantile.Fields items() {
            return new com.linkedin.dataset.Quantile.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
