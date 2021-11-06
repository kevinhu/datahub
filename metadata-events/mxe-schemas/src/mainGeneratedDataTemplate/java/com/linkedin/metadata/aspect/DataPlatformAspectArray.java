
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/snapshot/DataPlatformSnapshot.pdl.")
public class DataPlatformAspectArray
    extends WrappingArrayTemplate<DataPlatformAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.key/**Key for a Data Platform*/@Aspect.name=\"dataPlatformKey\"record DataPlatformKey{/**Data platform name i.e. hdfs, oracle, espresso*/platformName:string}}{namespace com.linkedin.dataplatform/**Information about a data platform*/@Aspect.name=\"dataPlatformInfo\"record DataPlatformInfo{/**Name of the data platform*/@validate.strlen.max=15,name:string/**The name that will be used for displaying a platform type.*/displayName:optional string/**Platform type this data platform describes*/type:/**Platform types available at LinkedIn*/enum PlatformType{/**Value for a file system, e.g. hdfs*/FILE_SYSTEM/**Value for a key value store, e.g. espresso, voldemort*/KEY_VALUE_STORE/**Value for a message broker, e.g. kafka*/MESSAGE_BROKER/**Value for an object store, e.g. ambry*/OBJECT_STORE/**Value for an OLAP datastore, e.g. pinot*/OLAP_DATASTORE/**Value for other platforms, e.g salesforce, dovetail*/OTHERS/**Value for a query engine, e.g. presto*/QUERY_ENGINE/**Value for a relational database, e.g. oracle, mysql*/RELATIONAL_DB/**Value for a search engine, e.g seas*/SEARCH_ENGINE}/**The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle*/datasetNameDelimiter:string/**The URL for a logo associated with the platform*/logoUrl:optional{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}}]]", SchemaFormatType.PDL));

    public DataPlatformAspectArray() {
        this(new DataList());
    }

    public DataPlatformAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DataPlatformAspectArray(Collection<DataPlatformAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DataPlatformAspectArray(DataList data) {
        super(data, SCHEMA, DataPlatformAspect.class);
    }

    public DataPlatformAspectArray(DataPlatformAspect first, DataPlatformAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    @Override
    public DataPlatformAspectArray clone()
        throws CloneNotSupportedException
    {
        return ((DataPlatformAspectArray) super.clone());
    }

    @Override
    public DataPlatformAspectArray copy()
        throws CloneNotSupportedException
    {
        return ((DataPlatformAspectArray) super.copy());
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

        public com.linkedin.metadata.aspect.DataPlatformAspect.Fields items() {
            return new com.linkedin.metadata.aspect.DataPlatformAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

}
