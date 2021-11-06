
package com.linkedin.common;

import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DirectArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datajob/DataJobInputOutput.pdl.")
public class DataJobUrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.DataJobUrn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataJob\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataJob\",\"doc\":\"Standardized data processing job identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"flow\",\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"name\":\"jobID\",\"doc\":\"Unique identifier of the data job\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":594}typeref DataJobUrn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataJobUrn.class);
    }

    public DataJobUrnArray() {
        this(new DataList());
    }

    public DataJobUrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DataJobUrnArray(Collection<com.linkedin.common.urn.DataJobUrn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DataJobUrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.DataJobUrn.class, String.class);
    }

    public DataJobUrnArray(com.linkedin.common.urn.DataJobUrn first, com.linkedin.common.urn.DataJobUrn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public DataJobUrnArray clone()
        throws CloneNotSupportedException
    {
        return ((DataJobUrnArray) super.clone());
    }

    @Override
    public DataJobUrnArray copy()
        throws CloneNotSupportedException
    {
        return ((DataJobUrnArray) super.copy());
    }

}
