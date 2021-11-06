
package com.linkedin.metadata.aspect;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/SchemaFieldAspect.pdl.")
public class SchemaFieldAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a SchemaField*/@Aspect.name=\"schemaFieldKey\"record SchemaFieldKey{/**Parent associated with the schema field*/@Searchable.fieldType=\"URN\"parent:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**fieldPath identifying the schema field*/@Searchable.fieldType=\"KEYWORD\"fieldPath:string}}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_SchemaFieldKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.SchemaFieldKey");
    private final static TyperefInfo TYPEREFINFO = new SchemaFieldAspect.UnionTyperefInfo();

    public SchemaFieldAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public SchemaFieldAspect(Object data) {
        super(data, SCHEMA);
    }

    public static SchemaFieldAspect create(com.linkedin.metadata.key.SchemaFieldKey value) {
        SchemaFieldAspect newUnion = new SchemaFieldAspect();
        newUnion.setSchemaFieldKey(value);
        return newUnion;
    }

    public boolean isSchemaFieldKey() {
        return memberIs("com.linkedin.metadata.key.SchemaFieldKey");
    }

    public com.linkedin.metadata.key.SchemaFieldKey getSchemaFieldKey() {
        return obtainWrapped(MEMBER_SchemaFieldKey, com.linkedin.metadata.key.SchemaFieldKey.class, "com.linkedin.metadata.key.SchemaFieldKey");
    }

    public void setSchemaFieldKey(com.linkedin.metadata.key.SchemaFieldKey value) {
        selectWrapped(MEMBER_SchemaFieldKey, com.linkedin.metadata.key.SchemaFieldKey.class, "com.linkedin.metadata.key.SchemaFieldKey", value);
    }

    @Override
    public SchemaFieldAspect clone()
        throws CloneNotSupportedException
    {
        return ((SchemaFieldAspect) super.clone());
    }

    @Override
    public SchemaFieldAspect copy()
        throws CloneNotSupportedException
    {
        return ((SchemaFieldAspect) super.copy());
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

        public com.linkedin.metadata.key.SchemaFieldKey.Fields SchemaFieldKey() {
            return new com.linkedin.metadata.key.SchemaFieldKey.Fields(getPathComponents(), "com.linkedin.metadata.key.SchemaFieldKey");
        }

    }


    /**
     * A union of all supported metadata aspects for a SchemaField
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a SchemaField*/typeref SchemaFieldAspect=union[{namespace com.linkedin.metadata.key/**Key for a SchemaField*/@Aspect.name=\"schemaFieldKey\"record SchemaFieldKey{/**Parent associated with the schema field*/@Searchable.fieldType=\"URN\"parent:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**fieldPath identifying the schema field*/@Searchable.fieldType=\"KEYWORD\"fieldPath:string}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
