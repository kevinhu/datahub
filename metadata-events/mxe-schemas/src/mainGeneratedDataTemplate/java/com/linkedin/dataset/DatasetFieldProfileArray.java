
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetProfile.pdl.")
public class DatasetFieldProfileArray
    extends WrappingArrayTemplate<DatasetFieldProfile>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dataset/**Stats corresponding to fields in a dataset*/record DatasetFieldProfile{fieldPath:string,uniqueCount:optional long,uniqueProportion:optional float,nullCount:optional long,nullProportion:optional float,min:optional string,max:optional string,mean:optional string,median:optional string,stdev:optional string,quantiles:optional array[record Quantile{quantile:string,value:string}]distinctValueFrequencies:optional array[record ValueFrequency{value:string,frequency:long}]histogram:optional record Histogram{boundaries:array[string]heights:array[float]}sampleValues:optional array[string]}}]", SchemaFormatType.PDL));

    public DatasetFieldProfileArray() {
        this(new DataList());
    }

    public DatasetFieldProfileArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DatasetFieldProfileArray(Collection<DatasetFieldProfile> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DatasetFieldProfileArray(DataList data) {
        super(data, SCHEMA, DatasetFieldProfile.class);
    }

    public DatasetFieldProfileArray(DatasetFieldProfile first, DatasetFieldProfile... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public DatasetFieldProfileArray clone()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldProfileArray) super.clone());
    }

    @Override
    public DatasetFieldProfileArray copy()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldProfileArray) super.copy());
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

        public com.linkedin.dataset.DatasetFieldProfile.Fields items() {
            return new com.linkedin.dataset.DatasetFieldProfile.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
