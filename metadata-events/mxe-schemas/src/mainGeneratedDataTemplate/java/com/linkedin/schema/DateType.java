
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
 * Date field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/DateType.pdl.")
public class DateType
    extends RecordTemplate
{

    private final static DateType.Fields _fields = new DateType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Date field type.*/record DateType{}", SchemaFormatType.PDL));

    public DateType() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public DateType(DataMap data) {
        super(data, SCHEMA);
    }

    public static DateType.Fields fields() {
        return _fields;
    }

    @Override
    public DateType clone()
        throws CloneNotSupportedException
    {
        return ((DateType) super.clone());
    }

    @Override
    public DateType copy()
        throws CloneNotSupportedException
    {
        return ((DateType) super.copy());
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
