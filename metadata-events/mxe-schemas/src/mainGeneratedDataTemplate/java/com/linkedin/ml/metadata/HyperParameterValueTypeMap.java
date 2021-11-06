
package com.linkedin.ml.metadata;

import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.MapDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.WrappingMapTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelProperties.pdl.")
public class HyperParameterValueTypeMap
    extends WrappingMapTemplate<HyperParameterValueType>
{

    private final static MapDataSchema SCHEMA = ((MapDataSchema) DataTemplateUtil.parseSchema("map[string,union[string,int,float,double,boolean]]", SchemaFormatType.PDL));

    public HyperParameterValueTypeMap() {
        this(new DataMap());
    }

    public HyperParameterValueTypeMap(int initialCapacity) {
        this(new DataMap(initialCapacity));
    }

    public HyperParameterValueTypeMap(int initialCapacity, float loadFactor) {
        this(new DataMap(initialCapacity, loadFactor));
    }

    public HyperParameterValueTypeMap(Map<String, HyperParameterValueType> m) {
        this(newDataMapOfSize(m.size()));
        putAll(m);
    }

    public HyperParameterValueTypeMap(DataMap data) {
        super(data, SCHEMA, HyperParameterValueType.class);
    }

    @Override
    public HyperParameterValueTypeMap clone()
        throws CloneNotSupportedException
    {
        return ((HyperParameterValueTypeMap) super.clone());
    }

    @Override
    public HyperParameterValueTypeMap copy()
        throws CloneNotSupportedException
    {
        return ((HyperParameterValueTypeMap) super.copy());
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

        public com.linkedin.ml.metadata.HyperParameterValueType.Fields values() {
            return new com.linkedin.ml.metadata.HyperParameterValueType.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
