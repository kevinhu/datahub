
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
 * Enum field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/EnumType.pdl.")
public class EnumType
    extends RecordTemplate
{

    private final static EnumType.Fields _fields = new EnumType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Enum field type.*/record EnumType{}", SchemaFormatType.PDL));

    public EnumType() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public EnumType(DataMap data) {
        super(data, SCHEMA);
    }

    public static EnumType.Fields fields() {
        return _fields;
    }

    @Override
    public EnumType clone()
        throws CloneNotSupportedException
    {
        return ((EnumType) super.clone());
    }

    @Override
    public EnumType copy()
        throws CloneNotSupportedException
    {
        return ((EnumType) super.copy());
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
