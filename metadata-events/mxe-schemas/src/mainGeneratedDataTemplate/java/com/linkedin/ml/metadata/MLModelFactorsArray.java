
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelFactorPrompts.pdl.")
public class MLModelFactorsArray
    extends WrappingArrayTemplate<MLModelFactors>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.ml.metadata/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera\u2019s hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}}]", SchemaFormatType.PDL));

    public MLModelFactorsArray() {
        this(new DataList());
    }

    public MLModelFactorsArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public MLModelFactorsArray(Collection<MLModelFactors> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public MLModelFactorsArray(DataList data) {
        super(data, SCHEMA, MLModelFactors.class);
    }

    public MLModelFactorsArray(MLModelFactors first, MLModelFactors... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public MLModelFactorsArray clone()
        throws CloneNotSupportedException
    {
        return ((MLModelFactorsArray) super.clone());
    }

    @Override
    public MLModelFactorsArray copy()
        throws CloneNotSupportedException
    {
        return ((MLModelFactorsArray) super.copy());
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

        public com.linkedin.ml.metadata.MLModelFactors.Fields items() {
            return new com.linkedin.ml.metadata.MLModelFactors.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
