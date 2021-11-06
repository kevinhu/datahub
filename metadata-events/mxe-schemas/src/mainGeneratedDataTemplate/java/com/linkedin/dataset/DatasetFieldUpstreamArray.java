
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldMapping.pdl.")
public class DatasetFieldUpstreamArray
    extends WrappingArrayTemplate<DatasetFieldUpstream>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"datasetField\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DatasetField\",\"doc\":\"Standardized dataset field information identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dataset\",\"doc\":\"Dataset that this dataset field belongs to.\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"name\":\"fieldPath\",\"doc\":\"Dataset field path\",\"type\":\"string\",\"maxLength\":500}],\"maxLength\":807}typeref DatasetFieldUrn=string}]]", SchemaFormatType.PDL));

    public DatasetFieldUpstreamArray() {
        this(new DataList());
    }

    public DatasetFieldUpstreamArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DatasetFieldUpstreamArray(Collection<DatasetFieldUpstream> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DatasetFieldUpstreamArray(DataList data) {
        super(data, SCHEMA, DatasetFieldUpstream.class);
    }

    public DatasetFieldUpstreamArray(DatasetFieldUpstream first, DatasetFieldUpstream... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public DatasetFieldUpstreamArray clone()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldUpstreamArray) super.clone());
    }

    @Override
    public DatasetFieldUpstreamArray copy()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldUpstreamArray) super.copy());
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

        public com.linkedin.dataset.DatasetFieldUpstream.Fields items() {
            return new com.linkedin.dataset.DatasetFieldUpstream.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
