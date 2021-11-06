
package com.linkedin.dataset;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetUpstreamLineage.pdl.")
public class DatasetFieldMappingArray
    extends WrappingArrayTemplate<DatasetFieldMapping>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dataset/**Representation of mapping between fields in source dataset to the field in destination dataset*/record DatasetFieldMapping includes{namespace com.linkedin.common/**Base model representing field mappings*/record BaseFieldMapping{/**Audit stamp containing who reported the field mapping and when*/created:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}/**Transfomration function between the fields involved*/transformation:union[{namespace com.linkedin.common.fieldtransformer/**Type of the transformation involved in generating destination fields from source fields.*/enum TransformationType{/**Field transformation expressed as unknown black box function.*/BLACKBOX/**Field transformation expressed as Identity function.*/IDENTITY}}{namespace com.linkedin.common.fieldtransformer/**Field transformation expressed in UDF*/record UDFTransformer{/**A UDF mentioning how the source fields got transformed to destination field. This is the FQCN(Fully Qualified Class Name) of the udf.*/udf:string}}]}}{/**Source fields from which the fine grained lineage is derived*/sourceFields:array[/**Upstreams of a dataset field.*/typeref DatasetFieldUpstream=union[{namespace com.linkedin.common/**Standardized dataset field information identifier.*/@java.class=\"com.linkedin.common.urn.DatasetFieldUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"datasetField\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DatasetField\",\"doc\":\"Standardized dataset field information identifier\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"dataset\",\"doc\":\"Dataset that this dataset field belongs to.\",\"type\":\"com.linkedin.common.urn.DatasetUrn\"},{\"name\":\"fieldPath\",\"doc\":\"Dataset field path\",\"type\":\"string\",\"maxLength\":500}],\"maxLength\":807}typeref DatasetFieldUrn=string}]]/**Destination field which is derived from source fields*/destinationField:com.linkedin.common.DatasetFieldUrn}}]", SchemaFormatType.PDL));

    public DatasetFieldMappingArray() {
        this(new DataList());
    }

    public DatasetFieldMappingArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DatasetFieldMappingArray(Collection<DatasetFieldMapping> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DatasetFieldMappingArray(DataList data) {
        super(data, SCHEMA, DatasetFieldMapping.class);
    }

    public DatasetFieldMappingArray(DatasetFieldMapping first, DatasetFieldMapping... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public DatasetFieldMappingArray clone()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldMappingArray) super.clone());
    }

    @Override
    public DatasetFieldMappingArray copy()
        throws CloneNotSupportedException
    {
        return ((DatasetFieldMappingArray) super.copy());
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

        public com.linkedin.dataset.DatasetFieldMapping.Fields items() {
            return new com.linkedin.dataset.DatasetFieldMapping.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
