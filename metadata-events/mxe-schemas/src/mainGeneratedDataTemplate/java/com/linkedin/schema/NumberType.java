
package com.linkedin.schema;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.RecordTemplate;


/**
 * Number data type: long, integer, short, etc..
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/NumberType.pdl.")
public class NumberType
    extends RecordTemplate
{

    private final static NumberType.Fields _fields = new NumberType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Number data type: long, integer, short, etc..*/record NumberType{}", SchemaFormatType.PDL));

    public NumberType() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public NumberType(DataMap data) {
        super(data, SCHEMA);
    }

    public static NumberType.Fields fields() {
        return _fields;
    }

    @Override
    public NumberType clone()
        throws CloneNotSupportedException
    {
        return ((NumberType) super.clone());
    }

    @Override
    public NumberType copy()
        throws CloneNotSupportedException
    {
        return ((NumberType) super.copy());
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

    }

}
