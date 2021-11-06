
package com.linkedin.ml.metadata;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelProperties.pdl.")
public class MLMetricArray
    extends WrappingArrayTemplate<MLMetric>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.ml.metadata/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional{namespace com.linkedin.common/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long}}}]", SchemaFormatType.PDL));

    public MLMetricArray() {
        this(new DataList());
    }

    public MLMetricArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public MLMetricArray(Collection<MLMetric> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public MLMetricArray(DataList data) {
        super(data, SCHEMA, MLMetric.class);
    }

    public MLMetricArray(MLMetric first, MLMetric... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public MLMetricArray clone()
        throws CloneNotSupportedException
    {
        return ((MLMetricArray) super.clone());
    }

    @Override
    public MLMetricArray copy()
        throws CloneNotSupportedException
    {
        return ((MLMetricArray) super.copy());
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

        public com.linkedin.ml.metadata.MLMetric.Fields items() {
            return new com.linkedin.ml.metadata.MLMetric.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
