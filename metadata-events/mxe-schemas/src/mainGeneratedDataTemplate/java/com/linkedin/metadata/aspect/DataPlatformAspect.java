
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/DataPlatformAspect.pdl.")
public class DataPlatformAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for a Data Platform*/@Aspect.name=\"dataPlatformKey\"record DataPlatformKey{/**Data platform name i.e. hdfs, oracle, espresso*/platformName:string}}{namespace com.linkedin.dataplatform/**Information about a data platform*/@Aspect.name=\"dataPlatformInfo\"record DataPlatformInfo{/**Name of the data platform*/@validate.strlen.max=15,name:string/**The name that will be used for displaying a platform type.*/displayName:optional string/**Platform type this data platform describes*/type:/**Platform types available at LinkedIn*/enum PlatformType{/**Value for a file system, e.g. hdfs*/FILE_SYSTEM/**Value for a key value store, e.g. espresso, voldemort*/KEY_VALUE_STORE/**Value for a message broker, e.g. kafka*/MESSAGE_BROKER/**Value for an object store, e.g. ambry*/OBJECT_STORE/**Value for an OLAP datastore, e.g. pinot*/OLAP_DATASTORE/**Value for other platforms, e.g salesforce, dovetail*/OTHERS/**Value for a query engine, e.g. presto*/QUERY_ENGINE/**Value for a relational database, e.g. oracle, mysql*/RELATIONAL_DB/**Value for a search engine, e.g seas*/SEARCH_ENGINE}/**The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle*/datasetNameDelimiter:string/**The URL for a logo associated with the platform*/logoUrl:optional{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_DataPlatformKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.DataPlatformKey");
    private final static DataSchema MEMBER_DataPlatformInfo = SCHEMA.getTypeByMemberKey("com.linkedin.dataplatform.DataPlatformInfo");
    private final static TyperefInfo TYPEREFINFO = new DataPlatformAspect.UnionTyperefInfo();

    public DataPlatformAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public DataPlatformAspect(Object data) {
        super(data, SCHEMA);
    }

    public static DataPlatformAspect create(com.linkedin.metadata.key.DataPlatformKey value) {
        DataPlatformAspect newUnion = new DataPlatformAspect();
        newUnion.setDataPlatformKey(value);
        return newUnion;
    }

    public boolean isDataPlatformKey() {
        return memberIs("com.linkedin.metadata.key.DataPlatformKey");
    }

    public com.linkedin.metadata.key.DataPlatformKey getDataPlatformKey() {
        return obtainWrapped(MEMBER_DataPlatformKey, com.linkedin.metadata.key.DataPlatformKey.class, "com.linkedin.metadata.key.DataPlatformKey");
    }

    public void setDataPlatformKey(com.linkedin.metadata.key.DataPlatformKey value) {
        selectWrapped(MEMBER_DataPlatformKey, com.linkedin.metadata.key.DataPlatformKey.class, "com.linkedin.metadata.key.DataPlatformKey", value);
    }

    public static DataPlatformAspect create(com.linkedin.dataplatform.DataPlatformInfo value) {
        DataPlatformAspect newUnion = new DataPlatformAspect();
        newUnion.setDataPlatformInfo(value);
        return newUnion;
    }

    public boolean isDataPlatformInfo() {
        return memberIs("com.linkedin.dataplatform.DataPlatformInfo");
    }

    public com.linkedin.dataplatform.DataPlatformInfo getDataPlatformInfo() {
        return obtainWrapped(MEMBER_DataPlatformInfo, com.linkedin.dataplatform.DataPlatformInfo.class, "com.linkedin.dataplatform.DataPlatformInfo");
    }

    public void setDataPlatformInfo(com.linkedin.dataplatform.DataPlatformInfo value) {
        selectWrapped(MEMBER_DataPlatformInfo, com.linkedin.dataplatform.DataPlatformInfo.class, "com.linkedin.dataplatform.DataPlatformInfo", value);
    }

    @Override
    public DataPlatformAspect clone()
        throws CloneNotSupportedException
    {
        return ((DataPlatformAspect) super.clone());
    }

    @Override
    public DataPlatformAspect copy()
        throws CloneNotSupportedException
    {
        return ((DataPlatformAspect) super.copy());
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

        public com.linkedin.metadata.key.DataPlatformKey.Fields DataPlatformKey() {
            return new com.linkedin.metadata.key.DataPlatformKey.Fields(getPathComponents(), "com.linkedin.metadata.key.DataPlatformKey");
        }

        public com.linkedin.dataplatform.DataPlatformInfo.Fields DataPlatformInfo() {
            return new com.linkedin.dataplatform.DataPlatformInfo.Fields(getPathComponents(), "com.linkedin.dataplatform.DataPlatformInfo");
        }

    }


    /**
     * A union of all supported metadata aspects for a Data Platform
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a Data Platform*/typeref DataPlatformAspect=union[{namespace com.linkedin.metadata.key/**Key for a Data Platform*/@Aspect.name=\"dataPlatformKey\"record DataPlatformKey{/**Data platform name i.e. hdfs, oracle, espresso*/platformName:string}}{namespace com.linkedin.dataplatform/**Information about a data platform*/@Aspect.name=\"dataPlatformInfo\"record DataPlatformInfo{/**Name of the data platform*/@validate.strlen.max=15,name:string/**The name that will be used for displaying a platform type.*/displayName:optional string/**Platform type this data platform describes*/type:/**Platform types available at LinkedIn*/enum PlatformType{/**Value for a file system, e.g. hdfs*/FILE_SYSTEM/**Value for a key value store, e.g. espresso, voldemort*/KEY_VALUE_STORE/**Value for a message broker, e.g. kafka*/MESSAGE_BROKER/**Value for an object store, e.g. ambry*/OBJECT_STORE/**Value for an OLAP datastore, e.g. pinot*/OLAP_DATASTORE/**Value for other platforms, e.g salesforce, dovetail*/OTHERS/**Value for a query engine, e.g. presto*/QUERY_ENGINE/**Value for a relational database, e.g. oracle, mysql*/RELATIONAL_DB/**Value for a search engine, e.g seas*/SEARCH_ENGINE}/**The delimiter in the dataset names on the data platform, e.g. '/' for HDFS and '.' for Oracle*/datasetNameDelimiter:string/**The URL for a logo associated with the platform*/logoUrl:optional{namespace com.linkedin.common@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
