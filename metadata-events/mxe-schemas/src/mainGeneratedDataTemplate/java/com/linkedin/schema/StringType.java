
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
 * String field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/StringType.pdl.")
public class StringType
    extends RecordTemplate
{

    private final static StringType.Fields _fields = new StringType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**String field type.*/record StringType{}", SchemaFormatType.PDL));

    public StringType() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public StringType(DataMap data) {
        super(data, SCHEMA);
    }

    public static StringType.Fields fields() {
        return _fields;
    }

    @Override
    public StringType clone()
        throws CloneNotSupportedException
    {
        return ((StringType) super.clone());
    }

    @Override
    public StringType copy()
        throws CloneNotSupportedException
    {
        return ((StringType) super.copy());
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
