
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
 * Time field type. This should also be used for datetimes.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/TimeType.pdl.")
public class TimeType
    extends RecordTemplate
{

    private final static TimeType.Fields _fields = new TimeType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Time field type. This should also be used for datetimes.*/record TimeType{}", SchemaFormatType.PDL));

    public TimeType() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public TimeType(DataMap data) {
        super(data, SCHEMA);
    }

    public static TimeType.Fields fields() {
        return _fields;
    }

    @Override
    public TimeType clone()
        throws CloneNotSupportedException
    {
        return ((TimeType) super.clone());
    }

    @Override
    public TimeType copy()
        throws CloneNotSupportedException
    {
        return ((TimeType) super.copy());
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
