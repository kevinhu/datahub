
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
public class MLHyperParamArray
    extends WrappingArrayTemplate<MLHyperParam>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.ml.metadata/**Properties associated with an ML Hyper Param*/@Aspect.name=\"mlHyperParam\"record MLHyperParam{/**Name of the MLHyperParam*/name:string/**Documentation of the MLHyperParam*/description:optional string/**The value of the MLHyperParam*/value:optional string/**Date when the MLHyperParam was developed*/createdAt:optional{namespace com.linkedin.common/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long}}}]", SchemaFormatType.PDL));

    public MLHyperParamArray() {
        this(new DataList());
    }

    public MLHyperParamArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public MLHyperParamArray(Collection<MLHyperParam> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public MLHyperParamArray(DataList data) {
        super(data, SCHEMA, MLHyperParam.class);
    }

    public MLHyperParamArray(MLHyperParam first, MLHyperParam... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public MLHyperParamArray clone()
        throws CloneNotSupportedException
    {
        return ((MLHyperParamArray) super.clone());
    }

    @Override
    public MLHyperParamArray copy()
        throws CloneNotSupportedException
    {
        return ((MLHyperParamArray) super.copy());
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

        public com.linkedin.ml.metadata.MLHyperParam.Fields items() {
            return new com.linkedin.ml.metadata.MLHyperParam.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
