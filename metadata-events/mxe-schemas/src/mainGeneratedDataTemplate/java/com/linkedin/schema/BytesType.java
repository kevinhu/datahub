
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
 * Bytes field type.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/BytesType.pdl.")
public class BytesType
    extends RecordTemplate
{

    private final static BytesType.Fields _fields = new BytesType.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Bytes field type.*/record BytesType{}", SchemaFormatType.PDL));

    public BytesType() {
        super(new DataMap(0, 0.75F), SCHEMA);
    }

    public BytesType(DataMap data) {
        super(data, SCHEMA);
    }

    public static BytesType.Fields fields() {
        return _fields;
    }

    @Override
    public BytesType clone()
        throws CloneNotSupportedException
    {
        return ((BytesType) super.clone());
    }

    @Override
    public BytesType copy()
        throws CloneNotSupportedException
    {
        return ((BytesType) super.copy());
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
