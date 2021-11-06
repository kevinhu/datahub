
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelProperties.pdl.")
public class MLFeatureUrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.MLFeatureUrn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"mlFeature\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"MLFeature\",\"doc\":\"Standardized MLFeature identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"mlFeatureNamespace\",\"doc\":\"Namespace for the MLFeature\",\"type\":\"string\"},{\"name\":\"mlFeatureName\",\"doc\":\"Name of the MLFeature\",\"type\":\"string\",\"maxLength\":210}],\"maxLength\":284}typeref MLFeatureUrn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.MLFeatureUrn.class);
    }

    public MLFeatureUrnArray() {
        this(new DataList());
    }

    public MLFeatureUrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public MLFeatureUrnArray(Collection<com.linkedin.common.urn.MLFeatureUrn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public MLFeatureUrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.MLFeatureUrn.class, String.class);
    }

    public MLFeatureUrnArray(com.linkedin.common.urn.MLFeatureUrn first, com.linkedin.common.urn.MLFeatureUrn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public MLFeatureUrnArray clone()
        throws CloneNotSupportedException
    {
        return ((MLFeatureUrnArray) super.clone());
    }

    @Override
    public MLFeatureUrnArray copy()
        throws CloneNotSupportedException
    {
        return ((MLFeatureUrnArray) super.copy());
    }

}
