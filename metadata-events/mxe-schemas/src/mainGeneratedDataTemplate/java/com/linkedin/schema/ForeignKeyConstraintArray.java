
package com.linkedin.schema;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaMetadata.pdl.")
public class ForeignKeyConstraintArray
    extends WrappingArrayTemplate<ForeignKeyConstraint>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.schema/**Description of a foreign key constraint in a schema.*/record ForeignKeyConstraint{/**Name of the constraint, likely provided from the source*/name:string/**Fields the constraint maps to on the foreign dataset*/@Relationship.`/*`={\"name\":\"ForeignKeyTo\",\"entityTypes\":[\"schemaField\"]}foreignFields:array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**Fields the constraint maps to on the source dataset*/sourceFields:array[com.linkedin.common.Urn]/**Reference to the foreign dataset for ease of lookup*/@Relationship={\"name\":\"ForeignKeyToDataset\",\"entityTypes\":[\"dataset\"]}foreignDataset:com.linkedin.common.Urn}}]", SchemaFormatType.PDL));

    public ForeignKeyConstraintArray() {
        this(new DataList());
    }

    public ForeignKeyConstraintArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public ForeignKeyConstraintArray(Collection<ForeignKeyConstraint> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public ForeignKeyConstraintArray(DataList data) {
        super(data, SCHEMA, ForeignKeyConstraint.class);
    }

    public ForeignKeyConstraintArray(ForeignKeyConstraint first, ForeignKeyConstraint... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public ForeignKeyConstraintArray clone()
        throws CloneNotSupportedException
    {
        return ((ForeignKeyConstraintArray) super.clone());
    }

    @Override
    public ForeignKeyConstraintArray copy()
        throws CloneNotSupportedException
    {
        return ((ForeignKeyConstraintArray) super.copy());
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

        public com.linkedin.schema.ForeignKeyConstraint.Fields items() {
            return new com.linkedin.schema.ForeignKeyConstraint.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
