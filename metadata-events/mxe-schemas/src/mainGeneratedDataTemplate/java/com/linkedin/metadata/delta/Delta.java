
package com.linkedin.metadata.delta;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/delta/Delta.pdl.")
public class Delta
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[]", SchemaFormatType.PDL));
    private final static TyperefInfo TYPEREFINFO = new Delta.UnionTyperefInfo();

    public Delta() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public Delta(Object data) {
        super(data, SCHEMA);
    }

    @Override
    public Delta clone()
        throws CloneNotSupportedException
    {
        return ((Delta) super.clone());
    }

    @Override
    public Delta copy()
        throws CloneNotSupportedException
    {
        return ((Delta) super.copy());
    }

    public TyperefInfo typerefInfo() {
        return TYPEREFINFO;
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


    /**
     * A union of all supported metadata delta types.
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.delta/**A union of all supported metadata delta types.*/typeref Delta=union[]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
