
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/run/IngestionRunSummaryList.pdl.")
public class IngestionRunSummaryArray
    extends WrappingArrayTemplate<IngestionRunSummary>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.run,record IngestionRunSummary{runId:string,timestamp:long,rows:long}}]", SchemaFormatType.PDL));

    public IngestionRunSummaryArray() {
        this(new DataList());
    }

    public IngestionRunSummaryArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public IngestionRunSummaryArray(Collection<IngestionRunSummary> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public IngestionRunSummaryArray(DataList data) {
        super(data, SCHEMA, IngestionRunSummary.class);
    }

    public IngestionRunSummaryArray(IngestionRunSummary first, IngestionRunSummary... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public IngestionRunSummaryArray clone()
        throws CloneNotSupportedException
    {
        return ((IngestionRunSummaryArray) super.clone());
    }

    @Override
    public IngestionRunSummaryArray copy()
        throws CloneNotSupportedException
    {
        return ((IngestionRunSummaryArray) super.copy());
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

        public com.linkedin.metadata.run.IngestionRunSummary.Fields items() {
            return new com.linkedin.metadata.run.IngestionRunSummary.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
