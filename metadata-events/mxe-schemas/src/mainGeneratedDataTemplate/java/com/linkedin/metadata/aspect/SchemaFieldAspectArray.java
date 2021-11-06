
package com.linkedin.metadata.aspect;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/SchemaFieldSnapshot.pdl.")
public class SchemaFieldAspectArray
    extends WrappingArrayTemplate<SchemaFieldAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.key/**Key for a SchemaField*/@Aspect.name=\"schemaFieldKey\"record SchemaFieldKey{/**Parent associated with the schema field*/@Searchable.fieldType=\"URN\"parent:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**fieldPath identifying the schema field*/@Searchable.fieldType=\"KEYWORD\"fieldPath:string}}]]", SchemaFormatType.PDL));

    public SchemaFieldAspectArray() {
        this(new DataList());
    }

    public SchemaFieldAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public SchemaFieldAspectArray(Collection<SchemaFieldAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public SchemaFieldAspectArray(DataList data) {
        super(data, SCHEMA, SchemaFieldAspect.class);
    }

    public SchemaFieldAspectArray(SchemaFieldAspect first, SchemaFieldAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public SchemaFieldAspectArray clone()
        throws CloneNotSupportedException
    {
        return ((SchemaFieldAspectArray) super.clone());
    }

    @Override
    public SchemaFieldAspectArray copy()
        throws CloneNotSupportedException
    {
        return ((SchemaFieldAspectArray) super.copy());
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

        public com.linkedin.metadata.aspect.SchemaFieldAspect.Fields items() {
            return new com.linkedin.metadata.aspect.SchemaFieldAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
