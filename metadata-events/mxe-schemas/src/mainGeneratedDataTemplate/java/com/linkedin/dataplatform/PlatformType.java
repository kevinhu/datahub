
package com.linkedin.dataplatform;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Platform types available at LinkedIn
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataplatform/DataPlatformInfo.pdl.")
public enum PlatformType {


    /**
     * Value for a file system, e.g. hdfs
     * 
     */
    FILE_SYSTEM,

    /**
     * Value for a key value store, e.g. espresso, voldemort
     * 
     */
    KEY_VALUE_STORE,

    /**
     * Value for a message broker, e.g. kafka
     * 
     */
    MESSAGE_BROKER,

    /**
     * Value for an object store, e.g. ambry
     * 
     */
    OBJECT_STORE,

    /**
     * Value for an OLAP datastore, e.g. pinot
     * 
     */
    OLAP_DATASTORE,

    /**
     * Value for other platforms, e.g salesforce, dovetail
     * 
     */
    OTHERS,

    /**
     * Value for a query engine, e.g. presto
     * 
     */
    QUERY_ENGINE,

    /**
     * Value for a relational database, e.g. oracle, mysql
     * 
     */
    RELATIONAL_DB,

    /**
     * Value for a search engine, e.g seas
     * 
     */
    SEARCH_ENGINE,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataplatform/**Platform types available at LinkedIn*/enum PlatformType{/**Value for a file system, e.g. hdfs*/FILE_SYSTEM/**Value for a key value store, e.g. espresso, voldemort*/KEY_VALUE_STORE/**Value for a message broker, e.g. kafka*/MESSAGE_BROKER/**Value for an object store, e.g. ambry*/OBJECT_STORE/**Value for an OLAP datastore, e.g. pinot*/OLAP_DATASTORE/**Value for other platforms, e.g salesforce, dovetail*/OTHERS/**Value for a query engine, e.g. presto*/QUERY_ENGINE/**Value for a relational database, e.g. oracle, mysql*/RELATIONAL_DB/**Value for a search engine, e.g seas*/SEARCH_ENGINE}", SchemaFormatType.PDL));

}
