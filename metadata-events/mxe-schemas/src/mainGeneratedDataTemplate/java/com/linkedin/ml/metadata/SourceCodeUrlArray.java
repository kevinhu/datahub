
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/SourceCode.pdl.")
public class SourceCodeUrlArray
    extends WrappingArrayTemplate<SourceCodeUrl>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.ml.metadata/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}}]", SchemaFormatType.PDL));

    public SourceCodeUrlArray() {
        this(new DataList());
    }

    public SourceCodeUrlArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public SourceCodeUrlArray(Collection<SourceCodeUrl> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public SourceCodeUrlArray(DataList data) {
        super(data, SCHEMA, SourceCodeUrl.class);
    }

    public SourceCodeUrlArray(SourceCodeUrl first, SourceCodeUrl... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public SourceCodeUrlArray clone()
        throws CloneNotSupportedException
    {
        return ((SourceCodeUrlArray) super.clone());
    }

    @Override
    public SourceCodeUrlArray copy()
        throws CloneNotSupportedException
    {
        return ((SourceCodeUrlArray) super.copy());
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

        public com.linkedin.ml.metadata.SourceCodeUrl.Fields items() {
            return new com.linkedin.ml.metadata.SourceCodeUrl.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
