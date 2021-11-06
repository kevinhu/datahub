
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
public class DatasetUrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.DatasetUrn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
    }

    public DatasetUrnArray() {
        this(new DataList());
    }

    public DatasetUrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DatasetUrnArray(Collection<com.linkedin.common.urn.DatasetUrn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DatasetUrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.DatasetUrn.class, String.class);
    }

    public DatasetUrnArray(com.linkedin.common.urn.DatasetUrn first, com.linkedin.common.urn.DatasetUrn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public DatasetUrnArray clone()
        throws CloneNotSupportedException
    {
        return ((DatasetUrnArray) super.clone());
    }

    @Override
    public DatasetUrnArray copy()
        throws CloneNotSupportedException
    {
        return ((DatasetUrnArray) super.copy());
    }

}
