
package com.linkedin.metadata.entity;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/entity/Entity.pdl.")
public class Entity
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.entity/**Data model for a CorpUser entity*/record CorpUserEntity includes/**Common fields that apply to all entities*/record BaseEntity{/**Whether the entity has been removed or not*/removed:optional boolean=false}{/**Urn for the LDAP User*/urn:{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}/**LDAP name(id) : e.g. hzhang2, ywang5 ..*/name:optional string}}{namespace com.linkedin.metadata.entity/**Data model for a dataset entity*/record DatasetEntity includes BaseEntity{/**Urn for the dataset*/urn:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Dataset native name e.g. {db}.{table}, /dir/subdir/{name}, or {name}*/name:optional string/**Platform urn for the dataset in the form of urn:li:platform:{platform_name}*/platform:optional{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataPlatform\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataPlatform\",\"doc\":\"Standardized data platforms available\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platformName\",\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"type\":\"string\",\"maxLength\":25}],\"maxLength\":45}typeref DataPlatformUrn=string}/**Fabric type where dataset belongs to or where it was generated.*/origin:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}}{namespace com.linkedin.metadata.entity/**Data model for a Data Process entity*/record DataProcessEntity{/**Urn for the Data Process*/urn:{namespace com.linkedin.common/**Standardized process identifier.*/@java.class=\"com.linkedin.common.urn.DataProcessUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataProcess\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataProcess\",\"doc\":\"Standardized process identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"process name i.e. an ETL job name\",\"type\":\"string\",\"maxLength\":25},{\"name\":\"orchestrator\",\"doc\":\"Standardized Orchestrator where data process is defined.\",\"type\":\"string\",\"maxLength\":100},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DataProcessUrn=string}/**Data Process name(id)*/name:optional string/**Process Orchestrator for this process in the form. Options can be Airflow, Azkaban, Azure Data Factory*/orchestrator:optional string/**Fabric type where dataset belongs to or where it was generated.*/origin:optional com.linkedin.common.FabricType}}{namespace com.linkedin.metadata.entity/**Data model for a ML Model entity*/record MLModelEntity includes BaseEntity{/**Urn for the ML Model*/urn:{namespace com.linkedin.common/**Standardized MLModel identifier.*/@java.class=\"com.linkedin.common.urn.MLModelUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"mlModel\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"MlModel\",\"doc\":\"Standardized model identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn for the MLModel.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"mlModelName\",\"doc\":\"Name of the MLModel\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where model belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref MLModelUrn=string}/**ML Model native name*/name:optional string/**Platform urn for the ML Model in the form of urn:li:platform:{platform_name}*/platform:optional com.linkedin.common.DataPlatformUrn/**Fabric type where ML Model belongs to or where it was generated.*/origin:optional com.linkedin.common.FabricType}}{namespace com.linkedin.metadata.entity/**Data model for a DataFlow entity*/record DataFlowEntity includes BaseEntity{/**Urn for the DataFlow*/urn:{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataFlow\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataFlow\",\"doc\":\"Standardized data processing flow identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"orchestrator\",\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"type\":\"string\",\"maxLength\":50},{\"name\":\"flowId\",\"doc\":\"Unique Identifier of the data flow\",\"type\":\"string\",\"maxLength\":200},{\"name\":\"cluster\",\"doc\":\"Cluster where the flow is executed\",\"type\":\"string\",\"maxLength\":100}],\"maxLength\":373}typeref DataFlowUrn=string}/**Workflow orchestrator ex: Azkaban, Airflow*/orchestrator:optional string/**Id of the flow*/flowId:optional string/**Cluster of the flow*/cluster:optional string}}{namespace com.linkedin.metadata.entity/**Data model for a DataJob entity*/record DataJobEntity includes BaseEntity{/**Urn for the DataJob*/urn:{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataJob\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataJob\",\"doc\":\"Standardized data processing job identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"flow\",\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"name\":\"jobID\",\"doc\":\"Unique identifier of the data job\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":594}typeref DataJobUrn=string}/**Urn of the associated DataFlow*/flow:optional com.linkedin.common.DataFlowUrn/**Id of the job*/jobId:optional string}}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_CorpUserEntity = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.entity.CorpUserEntity");
    private final static DataSchema MEMBER_DatasetEntity = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.entity.DatasetEntity");
    private final static DataSchema MEMBER_DataProcessEntity = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.entity.DataProcessEntity");
    private final static DataSchema MEMBER_MLModelEntity = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.entity.MLModelEntity");
    private final static DataSchema MEMBER_DataFlowEntity = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.entity.DataFlowEntity");
    private final static DataSchema MEMBER_DataJobEntity = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.entity.DataJobEntity");
    private final static TyperefInfo TYPEREFINFO = new Entity.UnionTyperefInfo();

    public Entity() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public Entity(Object data) {
        super(data, SCHEMA);
    }

    public static Entity create(com.linkedin.metadata.entity.CorpUserEntity value) {
        Entity newUnion = new Entity();
        newUnion.setCorpUserEntity(value);
        return newUnion;
    }

    public boolean isCorpUserEntity() {
        return memberIs("com.linkedin.metadata.entity.CorpUserEntity");
    }

    public com.linkedin.metadata.entity.CorpUserEntity getCorpUserEntity() {
        return obtainWrapped(MEMBER_CorpUserEntity, com.linkedin.metadata.entity.CorpUserEntity.class, "com.linkedin.metadata.entity.CorpUserEntity");
    }

    public void setCorpUserEntity(com.linkedin.metadata.entity.CorpUserEntity value) {
        selectWrapped(MEMBER_CorpUserEntity, com.linkedin.metadata.entity.CorpUserEntity.class, "com.linkedin.metadata.entity.CorpUserEntity", value);
    }

    public static Entity create(com.linkedin.metadata.entity.DatasetEntity value) {
        Entity newUnion = new Entity();
        newUnion.setDatasetEntity(value);
        return newUnion;
    }

    public boolean isDatasetEntity() {
        return memberIs("com.linkedin.metadata.entity.DatasetEntity");
    }

    public com.linkedin.metadata.entity.DatasetEntity getDatasetEntity() {
        return obtainWrapped(MEMBER_DatasetEntity, com.linkedin.metadata.entity.DatasetEntity.class, "com.linkedin.metadata.entity.DatasetEntity");
    }

    public void setDatasetEntity(com.linkedin.metadata.entity.DatasetEntity value) {
        selectWrapped(MEMBER_DatasetEntity, com.linkedin.metadata.entity.DatasetEntity.class, "com.linkedin.metadata.entity.DatasetEntity", value);
    }

    public static Entity create(com.linkedin.metadata.entity.DataProcessEntity value) {
        Entity newUnion = new Entity();
        newUnion.setDataProcessEntity(value);
        return newUnion;
    }

    public boolean isDataProcessEntity() {
        return memberIs("com.linkedin.metadata.entity.DataProcessEntity");
    }

    public com.linkedin.metadata.entity.DataProcessEntity getDataProcessEntity() {
        return obtainWrapped(MEMBER_DataProcessEntity, com.linkedin.metadata.entity.DataProcessEntity.class, "com.linkedin.metadata.entity.DataProcessEntity");
    }

    public void setDataProcessEntity(com.linkedin.metadata.entity.DataProcessEntity value) {
        selectWrapped(MEMBER_DataProcessEntity, com.linkedin.metadata.entity.DataProcessEntity.class, "com.linkedin.metadata.entity.DataProcessEntity", value);
    }

    public static Entity create(com.linkedin.metadata.entity.MLModelEntity value) {
        Entity newUnion = new Entity();
        newUnion.setMLModelEntity(value);
        return newUnion;
    }

    public boolean isMLModelEntity() {
        return memberIs("com.linkedin.metadata.entity.MLModelEntity");
    }

    public com.linkedin.metadata.entity.MLModelEntity getMLModelEntity() {
        return obtainWrapped(MEMBER_MLModelEntity, com.linkedin.metadata.entity.MLModelEntity.class, "com.linkedin.metadata.entity.MLModelEntity");
    }

    public void setMLModelEntity(com.linkedin.metadata.entity.MLModelEntity value) {
        selectWrapped(MEMBER_MLModelEntity, com.linkedin.metadata.entity.MLModelEntity.class, "com.linkedin.metadata.entity.MLModelEntity", value);
    }

    public static Entity create(com.linkedin.metadata.entity.DataFlowEntity value) {
        Entity newUnion = new Entity();
        newUnion.setDataFlowEntity(value);
        return newUnion;
    }

    public boolean isDataFlowEntity() {
        return memberIs("com.linkedin.metadata.entity.DataFlowEntity");
    }

    public com.linkedin.metadata.entity.DataFlowEntity getDataFlowEntity() {
        return obtainWrapped(MEMBER_DataFlowEntity, com.linkedin.metadata.entity.DataFlowEntity.class, "com.linkedin.metadata.entity.DataFlowEntity");
    }

    public void setDataFlowEntity(com.linkedin.metadata.entity.DataFlowEntity value) {
        selectWrapped(MEMBER_DataFlowEntity, com.linkedin.metadata.entity.DataFlowEntity.class, "com.linkedin.metadata.entity.DataFlowEntity", value);
    }

    public static Entity create(com.linkedin.metadata.entity.DataJobEntity value) {
        Entity newUnion = new Entity();
        newUnion.setDataJobEntity(value);
        return newUnion;
    }

    public boolean isDataJobEntity() {
        return memberIs("com.linkedin.metadata.entity.DataJobEntity");
    }

    public com.linkedin.metadata.entity.DataJobEntity getDataJobEntity() {
        return obtainWrapped(MEMBER_DataJobEntity, com.linkedin.metadata.entity.DataJobEntity.class, "com.linkedin.metadata.entity.DataJobEntity");
    }

    public void setDataJobEntity(com.linkedin.metadata.entity.DataJobEntity value) {
        selectWrapped(MEMBER_DataJobEntity, com.linkedin.metadata.entity.DataJobEntity.class, "com.linkedin.metadata.entity.DataJobEntity", value);
    }

    @Override
    public Entity clone()
        throws CloneNotSupportedException
    {
        return ((Entity) super.clone());
    }

    @Override
    public Entity copy()
        throws CloneNotSupportedException
    {
        return ((Entity) super.copy());
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

        public com.linkedin.metadata.entity.CorpUserEntity.Fields CorpUserEntity() {
            return new com.linkedin.metadata.entity.CorpUserEntity.Fields(getPathComponents(), "com.linkedin.metadata.entity.CorpUserEntity");
        }

        public com.linkedin.metadata.entity.DatasetEntity.Fields DatasetEntity() {
            return new com.linkedin.metadata.entity.DatasetEntity.Fields(getPathComponents(), "com.linkedin.metadata.entity.DatasetEntity");
        }

        public com.linkedin.metadata.entity.DataProcessEntity.Fields DataProcessEntity() {
            return new com.linkedin.metadata.entity.DataProcessEntity.Fields(getPathComponents(), "com.linkedin.metadata.entity.DataProcessEntity");
        }

        public com.linkedin.metadata.entity.MLModelEntity.Fields MLModelEntity() {
            return new com.linkedin.metadata.entity.MLModelEntity.Fields(getPathComponents(), "com.linkedin.metadata.entity.MLModelEntity");
        }

        public com.linkedin.metadata.entity.DataFlowEntity.Fields DataFlowEntity() {
            return new com.linkedin.metadata.entity.DataFlowEntity.Fields(getPathComponents(), "com.linkedin.metadata.entity.DataFlowEntity");
        }

        public com.linkedin.metadata.entity.DataJobEntity.Fields DataJobEntity() {
            return new com.linkedin.metadata.entity.DataJobEntity.Fields(getPathComponents(), "com.linkedin.metadata.entity.DataJobEntity");
        }

    }


    /**
     * A union of all supported entity types.
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.entity/**A union of all supported entity types.*/typeref Entity=union[/**Data model for a CorpUser entity*/record CorpUserEntity includes/**Common fields that apply to all entities*/record BaseEntity{/**Whether the entity has been removed or not*/removed:optional boolean=false}{/**Urn for the LDAP User*/urn:{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}/**LDAP name(id) : e.g. hzhang2, ywang5 ..*/name:optional string}/**Data model for a dataset entity*/record DatasetEntity includes BaseEntity{/**Urn for the dataset*/urn:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Dataset native name e.g. {db}.{table}, /dir/subdir/{name}, or {name}*/name:optional string/**Platform urn for the dataset in the form of urn:li:platform:{platform_name}*/platform:optional{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataPlatform\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataPlatform\",\"doc\":\"Standardized data platforms available\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platformName\",\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"type\":\"string\",\"maxLength\":25}],\"maxLength\":45}typeref DataPlatformUrn=string}/**Fabric type where dataset belongs to or where it was generated.*/origin:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}/**Data model for a Data Process entity*/record DataProcessEntity{/**Urn for the Data Process*/urn:{namespace com.linkedin.common/**Standardized process identifier.*/@java.class=\"com.linkedin.common.urn.DataProcessUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:wherehows\",\"entityType\":\"dataProcess\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataProcess\",\"doc\":\"Standardized process identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"name\",\"doc\":\"process name i.e. an ETL job name\",\"type\":\"string\",\"maxLength\":25},{\"name\":\"orchestrator\",\"doc\":\"Standardized Orchestrator where data process is defined.\",\"type\":\"string\",\"maxLength\":100},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DataProcessUrn=string}/**Data Process name(id)*/name:optional string/**Process Orchestrator for this process in the form. Options can be Airflow, Azkaban, Azure Data Factory*/orchestrator:optional string/**Fabric type where dataset belongs to or where it was generated.*/origin:optional com.linkedin.common.FabricType}/**Data model for a ML Model entity*/record MLModelEntity includes BaseEntity{/**Urn for the ML Model*/urn:{namespace com.linkedin.common/**Standardized MLModel identifier.*/@java.class=\"com.linkedin.common.urn.MLModelUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"mlModel\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"MlModel\",\"doc\":\"Standardized model identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn for the MLModel.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"mlModelName\",\"doc\":\"Name of the MLModel\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where model belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref MLModelUrn=string}/**ML Model native name*/name:optional string/**Platform urn for the ML Model in the form of urn:li:platform:{platform_name}*/platform:optional com.linkedin.common.DataPlatformUrn/**Fabric type where ML Model belongs to or where it was generated.*/origin:optional com.linkedin.common.FabricType}/**Data model for a DataFlow entity*/record DataFlowEntity includes BaseEntity{/**Urn for the DataFlow*/urn:{namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataFlow\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataFlow\",\"doc\":\"Standardized data processing flow identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"orchestrator\",\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"type\":\"string\",\"maxLength\":50},{\"name\":\"flowId\",\"doc\":\"Unique Identifier of the data flow\",\"type\":\"string\",\"maxLength\":200},{\"name\":\"cluster\",\"doc\":\"Cluster where the flow is executed\",\"type\":\"string\",\"maxLength\":100}],\"maxLength\":373}typeref DataFlowUrn=string}/**Workflow orchestrator ex: Azkaban, Airflow*/orchestrator:optional string/**Id of the flow*/flowId:optional string/**Cluster of the flow*/cluster:optional string}/**Data model for a DataJob entity*/record DataJobEntity includes BaseEntity{/**Urn for the DataJob*/urn:{namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataJob\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"DataJob\",\"doc\":\"Standardized data processing job identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"flow\",\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"name\":\"jobID\",\"doc\":\"Unique identifier of the data job\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":594}typeref DataJobUrn=string}/**Urn of the associated DataFlow*/flow:optional com.linkedin.common.DataFlowUrn/**Id of the job*/jobId:optional string}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
