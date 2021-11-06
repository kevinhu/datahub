
package com.linkedin.metadata.run;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/AspectRowSummaryList.pdl.")
public class AspectRowSummaryArray
    extends WrappingArrayTemplate<AspectRowSummary>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.run,record AspectRowSummary{runId:string,aspectName:string,urn:string,timestamp:long,metadata:string,version:long,keyAspect:boolean}}]", SchemaFormatType.PDL));

    public AspectRowSummaryArray() {
        this(new DataList());
    }

    public AspectRowSummaryArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public AspectRowSummaryArray(Collection<AspectRowSummary> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public AspectRowSummaryArray(DataList data) {
        super(data, SCHEMA, AspectRowSummary.class);
    }

    public AspectRowSummaryArray(AspectRowSummary first, AspectRowSummary... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public AspectRowSummaryArray clone()
        throws CloneNotSupportedException
    {
        return ((AspectRowSummaryArray) super.clone());
    }

    @Override
    public AspectRowSummaryArray copy()
        throws CloneNotSupportedException
    {
        return ((AspectRowSummaryArray) super.copy());
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

        public com.linkedin.metadata.run.AspectRowSummary.Fields items() {
            return new com.linkedin.metadata.run.AspectRowSummary.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
