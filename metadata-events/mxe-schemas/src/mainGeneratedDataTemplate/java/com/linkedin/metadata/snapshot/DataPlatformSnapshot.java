
package com.linkedin.metadata.snapshot;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.metadata.aspect.DataPlatformAspectArray;


/**
 * A metadata snapshot for a specific dataplatform entity.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/DataPlatformSnapshot.pdl.")
public class DataPlatformSnapshot
    extends RecordTemplate
{

    private final static DataPlatformSnapshot.Fields _fields = new DataPlatformSnapshot.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.snapshot/**A metadata snapshot for a specific dataplatform entity.*/@Entity={\"keyAspect\":\"dataPlatformKey\",\"name\":\"dataPlatform\"}record DataPlatformSnapshot{/**URN for the entity the metadata snapshot is associated with.*/urn:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataPlatform\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataPlatform\",\"doc\":\"Standardized data platforms available\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platformName\",\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"type\":\"string\",\"maxLength\":25}],\"maxLength\":45}typeref DataPlatformUrn=string}/**The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.*/aspects:array[{namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a Data Platform*/typeref DataPlatformAspect=union[{namespace com.linkedin.metadata.key/**Key for a Data Platform*/@Aspect.name=\"dataPlatformKey\"record DataPlatformKey{/**Data platform name i.e. hdfs, oracle, espresso*/platformName:string}}{namespace com.linkedin.dataplatform/**Information about a data platform*/@Aspect.name=\"dataPlatformInfo\"record DataPlatformInfo{/**Name of the data platform*/@validate.strlen.max=15,name:string/**The name that will be used for displaying a platform type.*/displayName:optional string/**Platform type this data platform describes*/type:/**Platform types available at LinkedIn*/enum PlatformType{/**Value for a file system, e.g. hdfs*/FILE_SYSTEM/**Value for a key value store, e.g. espresso, voldemort*/KEY_VALUE_STORE/**Value for a message broker, e.g. kafka*/MESSAGE_BROKER/**Value for an object store, e.g. ambry*/OBJECT_STORE/**Value for an OLAP datastore, e.g. pinot*/OLAP_DATASTORE/**Value for other platforms, e.g salesforce, dovetail*/OTHERS/**Value for a query engine, e.g. presto*/QUERY_ENGINE/**Value for a relational database, e.g. oracle, mysql*/RELATIONAL_DB/**Value for a search engine, e.g seas*/SEARCH_ENGINE}/**The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle*/datasetNameDelimiter:string/**The URL for a logo associated with the platform*/logoUrl:optional{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}}]}]}", SchemaFormatType.PDL));
    private final static RecordDataSchema.Field FIELD_Urn = SCHEMA.getField("urn");
    private final static RecordDataSchema.Field FIELD_Aspects = SCHEMA.getField("aspects");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataPlatformUrn.class);
    }

    public DataPlatformSnapshot() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
    }

    public DataPlatformSnapshot(DataMap data) {
        super(data, SCHEMA);
    }

    public static DataPlatformSnapshot.Fields fields() {
        return _fields;
    }

    /**
     * Existence checker for urn
     * 
     * @see DataPlatformSnapshot.Fields#urn
     */
    public boolean hasUrn() {
        return contains(FIELD_Urn);
    }

    /**
     * Remover for urn
     * 
     * @see DataPlatformSnapshot.Fields#urn
     */
    public void removeUrn() {
        remove(FIELD_Urn);
    }

    /**
     * Getter for urn
     * 
     * @see DataPlatformSnapshot.Fields#urn
     */
    public com.linkedin.common.urn.DataPlatformUrn getUrn(GetMode mode) {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataPlatformUrn.class, mode);
    }

    /**
     * Getter for urn
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformSnapshot.Fields#urn
     */
    @Nonnull
    public com.linkedin.common.urn.DataPlatformUrn getUrn() {
        return obtainCustomType(FIELD_Urn, com.linkedin.common.urn.DataPlatformUrn.class, GetMode.STRICT);
    }

    /**
     * Setter for urn
     * 
     * @see DataPlatformSnapshot.Fields#urn
     */
    public DataPlatformSnapshot setUrn(com.linkedin.common.urn.DataPlatformUrn value, SetMode mode) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataPlatformUrn.class, String.class, value, mode);
        return this;
    }

    /**
     * Setter for urn
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformSnapshot.Fields#urn
     */
    public DataPlatformSnapshot setUrn(
        @Nonnull
        com.linkedin.common.urn.DataPlatformUrn value) {
        putCustomType(FIELD_Urn, com.linkedin.common.urn.DataPlatformUrn.class, String.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    /**
     * Existence checker for aspects
     * 
     * @see DataPlatformSnapshot.Fields#aspects
     */
    public boolean hasAspects() {
        return contains(FIELD_Aspects);
    }

    /**
     * Remover for aspects
     * 
     * @see DataPlatformSnapshot.Fields#aspects
     */
    public void removeAspects() {
        remove(FIELD_Aspects);
    }

    /**
     * Getter for aspects
     * 
     * @see DataPlatformSnapshot.Fields#aspects
     */
    public DataPlatformAspectArray getAspects(GetMode mode) {
        return obtainWrapped(FIELD_Aspects, DataPlatformAspectArray.class, mode);
    }

    /**
     * Getter for aspects
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DataPlatformSnapshot.Fields#aspects
     */
    @Nonnull
    public DataPlatformAspectArray getAspects() {
        return obtainWrapped(FIELD_Aspects, DataPlatformAspectArray.class, GetMode.STRICT);
    }

    /**
     * Setter for aspects
     * 
     * @see DataPlatformSnapshot.Fields#aspects
     */
    public DataPlatformSnapshot setAspects(DataPlatformAspectArray value, SetMode mode) {
        putWrapped(FIELD_Aspects, DataPlatformAspectArray.class, value, mode);
        return this;
    }

    /**
     * Setter for aspects
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DataPlatformSnapshot.Fields#aspects
     */
    public DataPlatformSnapshot setAspects(
        @Nonnull
        DataPlatformAspectArray value) {
        putWrapped(FIELD_Aspects, DataPlatformAspectArray.class, value, SetMode.DISALLOW_NULL);
        return this;
    }

    @Override
    public DataPlatformSnapshot clone()
        throws CloneNotSupportedException
    {
        return ((DataPlatformSnapshot) super.clone());
    }

    @Override
    public DataPlatformSnapshot copy()
        throws CloneNotSupportedException
    {
        return ((DataPlatformSnapshot) super.copy());
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

        /**
         * URN for the entity the metadata snapshot is associated with.
         * 
         */
        public PathSpec urn() {
            return new PathSpec(getPathComponents(), "urn");
        }

        /**
         * The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public com.linkedin.metadata.aspect.DataPlatformAspectArray.Fields aspects() {
            return new com.linkedin.metadata.aspect.DataPlatformAspectArray.Fields(getPathComponents(), "aspects");
        }

        /**
         * The list of metadata aspects associated with the data platform. Depending on the use case, this can either be all, or a selection, of supported aspects.
         * 
         */
        public PathSpec aspects(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "aspects");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

}
