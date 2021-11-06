
package com.linkedin.dataset;

import java.util.List;
import javax.annotation.Generated;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.DataSchema;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.schema.UnionDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.HasTyperefInfo;
import com.linkedin.data.template.TyperefInfo;
import com.linkedin.data.template.UnionTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetFieldUpstream.pdl.")
public class DatasetFieldUpstream
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"datasetField\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DatasetField\",\"doc\":\"Standardized dataset field information identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dataset\",\"doc\":\"Dataset that this dataset field belongs to.\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"name\":\"fieldPath\",\"doc\":\"Dataset field path\",\"type\":\"string\",\"maxLength\":500}],\"maxLength\":807}typeref DatasetFieldUrn=string}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_DatasetFieldUrn = SCHEMA.getTypeByMemberKey("string");
    private final static TyperefInfo TYPEREFINFO = new DatasetFieldUpstream.UnionTyperefInfo();

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetFieldUrn.class);
    }

    public DatasetFieldUpstream() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public DatasetFieldUpstream(Object data) {
        super(data, SCHEMA);
    }

    public static DatasetFieldUpstream create(com.linkedin.common.urn.DatasetFieldUrn value) {
        DatasetFieldUpstream newUnion = new DatasetFieldUpstream();
        newUnion.setDatasetFieldUrn(value);
        return newUnion;
    }

    public boolean isDatasetFieldUrn() {
        return memberIs("string");
    }

    public com.linkedin.common.urn.DatasetFieldUrn getDatasetFieldUrn() {
        return obtainCustomType(MEMBER_DatasetFieldUrn, com.linkedin.common.urn.DatasetFieldUrn.class, "string");
    }

    public void setDatasetFieldUrn(com.linkedin.common.urn.DatasetFieldUrn value) {
        selectCustomType(MEMBER_DatasetFieldUrn, com.linkedin.common.urn.DatasetFieldUrn.class, String.class, "string", value);
    }

    @Override
    public DatasetFieldUpstream clone()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldUpstream) super.clone());
    }

    @Override
    public DatasetFieldUpstream copy()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldUpstream) super.copy());
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

        public PathSpec DatasetFieldUrn() {
            return new PathSpec(getPathComponents(), "string");
        }

    }


    /**
     * Upstreams of a dataset field.
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Upstreams of a dataset field.*/typeref DatasetFieldUpstream=union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"datasetField\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DatasetField\",\"doc\":\"Standardized dataset field information identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dataset\",\"doc\":\"Dataset that this dataset field belongs to.\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"name\":\"fieldPath\",\"doc\":\"Dataset field path\",\"type\":\"string\",\"maxLength\":500}],\"maxLength\":807}typeref DatasetFieldUrn=string}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
