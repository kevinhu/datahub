
package com.linkedin.ml.metadata;

import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DirectArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/IntendedUse.pdl.")
public class IntendedUserTypeArray
    extends DirectArrayTemplate<IntendedUserType>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.ml.metadata,enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}}]", SchemaFormatType.PDL));

    public IntendedUserTypeArray() {
        this(new DataList());
    }

    public IntendedUserTypeArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public IntendedUserTypeArray(Collection<IntendedUserType> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public IntendedUserTypeArray(DataList data) {
        super(data, SCHEMA, IntendedUserType.class, String.class);
    }

    public IntendedUserTypeArray(IntendedUserType first, IntendedUserType... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public IntendedUserTypeArray clone()
        throws CloneNotSupportedException
    {
        return ((IntendedUserTypeArray) super.clone());
    }

    @Override
    public IntendedUserTypeArray copy()
        throws CloneNotSupportedException
    {
        return ((IntendedUserTypeArray) super.copy());
    }

}
