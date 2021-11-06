
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/aspect/MLModelAspect.pdl.")
public class MLModelAspect
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.key/**Key for an ML model*/@Aspect.name=\"mlModelKey\"record MLModelKey{/**Standardized platform urn for the model*/platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Name of the MLModel*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Fabric type where model belongs to or where it was generated*/@Searchable={\"filterNameOverride\":\"Environment\",\"queryByDefault\":false,\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\"}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:Urn/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.ml.metadata/**Properties associated with a ML Model*/@Aspect.name=\"mlModelProperties\"record MLModelProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Documentation of the MLModel*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Date when the MLModel was developed*/date:optional com.linkedin.common.Time/**Version of the MLModel*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}}/**Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc*/@Searchable.fieldType=\"TEXT_PARTIAL\"type:optional string/**Hyper Parameters of the MLModel\n\nNOTE: these are deprecated in favor of hyperParams*/hyperParameters:optional map[string/**A union of all supported metadata aspects for HyperParameter Value*/typeref HyperParameterValueType=union[string,int,float,double,boolean]]/**Hyperparameters of the MLModel*/hyperParams:optional array[/**Properties associated with an ML Hyper Param*/@Aspect.name=\"mlHyperParam\"record MLHyperParam{/**Name of the MLHyperParam*/name:string/**Documentation of the MLHyperParam*/description:optional string/**The value of the MLHyperParam*/value:optional string/**Date when the MLHyperParam was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in training*/trainingMetrics:optional array[/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in production*/onlineMetrics:optional array[MLMetric]/**List of features used for MLModel training*/mlFeatures:optional array[{namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"mlFeature\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"MLFeature\",\"doc\":\"Standardized MLFeature identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"mlFeatureNamespace\",\"doc\":\"Namespace for the MLFeature\",\"type\":\"string\"},{\"name\":\"mlFeatureName\",\"doc\":\"Name of the MLFeature\",\"type\":\"string\",\"maxLength\":210}],\"maxLength\":284}typeref MLFeatureUrn=string}]/**Tags for the MLModel*/tags:array[string]=[]/**Deployments for the MLModel*/@Relationship.`/*`={\"name\":\"DeployedTo\",\"entityTypes\":[\"mlModelDeployment\"]}deployments:optional array[com.linkedin.common.Urn]/**List of jobs (if any) used to train the model*/@Relationship.`/*`={\"name\":\"TrainedBy\",\"entityTypes\":[\"dataJob\"]}trainingJobs:optional array[com.linkedin.common.Urn]/**List of jobs (if any) that use the model*/@Relationship.`/*`={\"name\":\"UsedBy\",\"entityTypes\":[\"dataJob\"]}downstreamJobs:optional array[com.linkedin.common.Urn]/**Groups the model belongs to*/@Relationship.`/*`={\"name\":\"MemberOf\",\"entityTypes\":[\"mlModelGroup\"]}groups:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.ml.metadata/**Intended Use for the ML Model*/@Aspect.name=\"intendedUse\"record IntendedUse{/**Primary Use cases for the MLModel.*/primaryUses:optional array[string]/**Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?*/primaryUsers:optional array[enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}]/**Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.*/outOfScopeUses:optional array[string]}}{namespace com.linkedin.ml.metadata/**Prompts which affect the performance of the MLModel*/@Aspect.name=\"mlModelFactorPrompts\"record MLModelFactorPrompts{/**What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?*/relevantFactors:optional array[/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera\u2019s hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}]/**Which factors are being reported, and why were these chosen?*/evaluationFactors:optional array[MLModelFactors]}}{namespace com.linkedin.ml.metadata/**Metrics to be featured for the MLModel.*/@Aspect.name=\"mlModelMetrics\"record Metrics{/**Measures of MLModel performance*/performanceMeasures:optional array[string]/**Decision Thresholds used (if any)?*/decisionThreshold:optional array[string]}}{namespace com.linkedin.ml.metadata/**All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.*/@Aspect.name=\"mlModelEvaluationData\"record EvaluationData{/**Details on the dataset(s) used for the quantitative analyses in the MLModel*/evaluationData:array[/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}]}}{namespace com.linkedin.ml.metadata/**Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.*/@Aspect.name=\"mlModelTrainingData\"record TrainingData{/**Details on the dataset(s) used for training the MLModel*/trainingData:array[BaseData]}}{namespace com.linkedin.ml.metadata/**Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.*/@Aspect.name=\"mlModelQuantitativeAnalyses\"record QuantitativeAnalyses{/**Link to a dashboard with results showing how the MLModel performed with respect to each factor*/unitaryResults:optional/**A union of all supported metadata aspects for ResultsType*/typeref ResultsType=union[string]/**Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?*/intersectionalResults:optional ResultsType}}{namespace com.linkedin.ml.metadata/**This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.*/@Aspect.name=\"mlModelEthicalConsiderations\"record EthicalConsiderations{/**Does the MLModel use any sensitive data (e.g., protected classes)?*/data:optional array[string]/** Is the MLModel intended to inform decisions about matters central to human life or flourishing \u2013 e.g., health or safety? Or could it be used in such a way?*/humanLife:optional array[string]/**What risk mitigation strategies were used during MLModel development?*/mitigations:optional array[string]/**What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.*/risksAndHarms:optional array[string]/**Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section*/useCases:optional array[string]}}{namespace com.linkedin.ml.metadata/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/@Aspect.name=\"mlModelCaveatsAndRecommendations\"record CaveatsAndRecommendations{/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?*/caveats:optional/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/record CaveatDetails{/**Did the results suggest any further testing?*/needsFurtherTesting:optional boolean/**Caveat Description\nFor ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.*/caveatDescription:optional string/**Relevant groups that were not represented in the evaluation dataset?*/groupsNotRepresented:optional array[string]}/**Recommendations on where this MLModel should be used.*/recommendations:optional string/**Ideal characteristics of an evaluation dataset for this MLModel*/idealDatasetCharacteristics:optional array[string]}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp}]}}{namespace com.linkedin.ml.metadata/**Source Code*/@Aspect.name=\"sourceCode\"record SourceCode{/**Source Code along with types*/sourceCode:array[/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:com.linkedin.common.Url}]}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common@Aspect.name=\"cost\"record Cost{costType:/**Type of Cost Code*/enum CostType{/**Org Cost Type to which the Cost of this entity should be attributed to*/ORG_COST_TYPE}cost:/**A union of all supported Cost Value types*/typeref CostValue=union[costId:double,costCode:string]}}{namespace com.linkedin.common/**Deprecation status of an entity*/@Aspect.name=\"deprecation\"record Deprecation{/**Whether the entity is deprecated.*/@Searchable={\"weightsPerFieldValue\":{\"true\":0.5},\"fieldType\":\"BOOLEAN\"}deprecated:boolean/**The time user plan to decommission this entity.*/decommissionTime:optional Time/**Additional information about the entity deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be backslash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"filterNameOverride\":\"Platform\",\"addToFilters\":true,\"fieldType\":\"URN\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/instance:optional string}}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_MLModelKey = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.key.MLModelKey");
    private final static DataSchema MEMBER_Ownership = SCHEMA.getTypeByMemberKey("com.linkedin.common.Ownership");
    private final static DataSchema MEMBER_MLModelProperties = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLModelProperties");
    private final static DataSchema MEMBER_IntendedUse = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.IntendedUse");
    private final static DataSchema MEMBER_MLModelFactorPrompts = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.MLModelFactorPrompts");
    private final static DataSchema MEMBER_Metrics = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.Metrics");
    private final static DataSchema MEMBER_EvaluationData = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.EvaluationData");
    private final static DataSchema MEMBER_TrainingData = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.TrainingData");
    private final static DataSchema MEMBER_QuantitativeAnalyses = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.QuantitativeAnalyses");
    private final static DataSchema MEMBER_EthicalConsiderations = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.EthicalConsiderations");
    private final static DataSchema MEMBER_CaveatsAndRecommendations = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.CaveatsAndRecommendations");
    private final static DataSchema MEMBER_InstitutionalMemory = SCHEMA.getTypeByMemberKey("com.linkedin.common.InstitutionalMemory");
    private final static DataSchema MEMBER_SourceCode = SCHEMA.getTypeByMemberKey("com.linkedin.ml.metadata.SourceCode");
    private final static DataSchema MEMBER_Status = SCHEMA.getTypeByMemberKey("com.linkedin.common.Status");
    private final static DataSchema MEMBER_Cost = SCHEMA.getTypeByMemberKey("com.linkedin.common.Cost");
    private final static DataSchema MEMBER_Deprecation = SCHEMA.getTypeByMemberKey("com.linkedin.common.Deprecation");
    private final static DataSchema MEMBER_BrowsePaths = SCHEMA.getTypeByMemberKey("com.linkedin.common.BrowsePaths");
    private final static DataSchema MEMBER_GlobalTags = SCHEMA.getTypeByMemberKey("com.linkedin.common.GlobalTags");
    private final static DataSchema MEMBER_DataPlatformInstance = SCHEMA.getTypeByMemberKey("com.linkedin.common.DataPlatformInstance");
    private final static TyperefInfo TYPEREFINFO = new MLModelAspect.UnionTyperefInfo();

    public MLModelAspect() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public MLModelAspect(Object data) {
        super(data, SCHEMA);
    }

    public static MLModelAspect create(com.linkedin.metadata.key.MLModelKey value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setMLModelKey(value);
        return newUnion;
    }

    public boolean isMLModelKey() {
        return memberIs("com.linkedin.metadata.key.MLModelKey");
    }

    public com.linkedin.metadata.key.MLModelKey getMLModelKey() {
        return obtainWrapped(MEMBER_MLModelKey, com.linkedin.metadata.key.MLModelKey.class, "com.linkedin.metadata.key.MLModelKey");
    }

    public void setMLModelKey(com.linkedin.metadata.key.MLModelKey value) {
        selectWrapped(MEMBER_MLModelKey, com.linkedin.metadata.key.MLModelKey.class, "com.linkedin.metadata.key.MLModelKey", value);
    }

    public static MLModelAspect create(com.linkedin.common.Ownership value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setOwnership(value);
        return newUnion;
    }

    public boolean isOwnership() {
        return memberIs("com.linkedin.common.Ownership");
    }

    public com.linkedin.common.Ownership getOwnership() {
        return obtainWrapped(MEMBER_Ownership, com.linkedin.common.Ownership.class, "com.linkedin.common.Ownership");
    }

    public void setOwnership(com.linkedin.common.Ownership value) {
        selectWrapped(MEMBER_Ownership, com.linkedin.common.Ownership.class, "com.linkedin.common.Ownership", value);
    }

    public static MLModelAspect create(com.linkedin.ml.metadata.MLModelProperties value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setMLModelProperties(value);
        return newUnion;
    }

    public boolean isMLModelProperties() {
        return memberIs("com.linkedin.ml.metadata.MLModelProperties");
    }

    public com.linkedin.ml.metadata.MLModelProperties getMLModelProperties() {
        return obtainWrapped(MEMBER_MLModelProperties, com.linkedin.ml.metadata.MLModelProperties.class, "com.linkedin.ml.metadata.MLModelProperties");
    }

    public void setMLModelProperties(com.linkedin.ml.metadata.MLModelProperties value) {
        selectWrapped(MEMBER_MLModelProperties, com.linkedin.ml.metadata.MLModelProperties.class, "com.linkedin.ml.metadata.MLModelProperties", value);
    }

    public static MLModelAspect create(com.linkedin.ml.metadata.IntendedUse value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setIntendedUse(value);
        return newUnion;
    }

    public boolean isIntendedUse() {
        return memberIs("com.linkedin.ml.metadata.IntendedUse");
    }

    public com.linkedin.ml.metadata.IntendedUse getIntendedUse() {
        return obtainWrapped(MEMBER_IntendedUse, com.linkedin.ml.metadata.IntendedUse.class, "com.linkedin.ml.metadata.IntendedUse");
    }

    public void setIntendedUse(com.linkedin.ml.metadata.IntendedUse value) {
        selectWrapped(MEMBER_IntendedUse, com.linkedin.ml.metadata.IntendedUse.class, "com.linkedin.ml.metadata.IntendedUse", value);
    }

    public static MLModelAspect create(com.linkedin.ml.metadata.MLModelFactorPrompts value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setMLModelFactorPrompts(value);
        return newUnion;
    }

    public boolean isMLModelFactorPrompts() {
        return memberIs("com.linkedin.ml.metadata.MLModelFactorPrompts");
    }

    public com.linkedin.ml.metadata.MLModelFactorPrompts getMLModelFactorPrompts() {
        return obtainWrapped(MEMBER_MLModelFactorPrompts, com.linkedin.ml.metadata.MLModelFactorPrompts.class, "com.linkedin.ml.metadata.MLModelFactorPrompts");
    }

    public void setMLModelFactorPrompts(com.linkedin.ml.metadata.MLModelFactorPrompts value) {
        selectWrapped(MEMBER_MLModelFactorPrompts, com.linkedin.ml.metadata.MLModelFactorPrompts.class, "com.linkedin.ml.metadata.MLModelFactorPrompts", value);
    }

    public static MLModelAspect create(com.linkedin.ml.metadata.Metrics value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setMetrics(value);
        return newUnion;
    }

    public boolean isMetrics() {
        return memberIs("com.linkedin.ml.metadata.Metrics");
    }

    public com.linkedin.ml.metadata.Metrics getMetrics() {
        return obtainWrapped(MEMBER_Metrics, com.linkedin.ml.metadata.Metrics.class, "com.linkedin.ml.metadata.Metrics");
    }

    public void setMetrics(com.linkedin.ml.metadata.Metrics value) {
        selectWrapped(MEMBER_Metrics, com.linkedin.ml.metadata.Metrics.class, "com.linkedin.ml.metadata.Metrics", value);
    }

    public static MLModelAspect create(com.linkedin.ml.metadata.EvaluationData value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setEvaluationData(value);
        return newUnion;
    }

    public boolean isEvaluationData() {
        return memberIs("com.linkedin.ml.metadata.EvaluationData");
    }

    public com.linkedin.ml.metadata.EvaluationData getEvaluationData() {
        return obtainWrapped(MEMBER_EvaluationData, com.linkedin.ml.metadata.EvaluationData.class, "com.linkedin.ml.metadata.EvaluationData");
    }

    public void setEvaluationData(com.linkedin.ml.metadata.EvaluationData value) {
        selectWrapped(MEMBER_EvaluationData, com.linkedin.ml.metadata.EvaluationData.class, "com.linkedin.ml.metadata.EvaluationData", value);
    }

    public static MLModelAspect create(com.linkedin.ml.metadata.TrainingData value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setTrainingData(value);
        return newUnion;
    }

    public boolean isTrainingData() {
        return memberIs("com.linkedin.ml.metadata.TrainingData");
    }

    public com.linkedin.ml.metadata.TrainingData getTrainingData() {
        return obtainWrapped(MEMBER_TrainingData, com.linkedin.ml.metadata.TrainingData.class, "com.linkedin.ml.metadata.TrainingData");
    }

    public void setTrainingData(com.linkedin.ml.metadata.TrainingData value) {
        selectWrapped(MEMBER_TrainingData, com.linkedin.ml.metadata.TrainingData.class, "com.linkedin.ml.metadata.TrainingData", value);
    }

    public static MLModelAspect create(com.linkedin.ml.metadata.QuantitativeAnalyses value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setQuantitativeAnalyses(value);
        return newUnion;
    }

    public boolean isQuantitativeAnalyses() {
        return memberIs("com.linkedin.ml.metadata.QuantitativeAnalyses");
    }

    public com.linkedin.ml.metadata.QuantitativeAnalyses getQuantitativeAnalyses() {
        return obtainWrapped(MEMBER_QuantitativeAnalyses, com.linkedin.ml.metadata.QuantitativeAnalyses.class, "com.linkedin.ml.metadata.QuantitativeAnalyses");
    }

    public void setQuantitativeAnalyses(com.linkedin.ml.metadata.QuantitativeAnalyses value) {
        selectWrapped(MEMBER_QuantitativeAnalyses, com.linkedin.ml.metadata.QuantitativeAnalyses.class, "com.linkedin.ml.metadata.QuantitativeAnalyses", value);
    }

    public static MLModelAspect create(com.linkedin.ml.metadata.EthicalConsiderations value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setEthicalConsiderations(value);
        return newUnion;
    }

    public boolean isEthicalConsiderations() {
        return memberIs("com.linkedin.ml.metadata.EthicalConsiderations");
    }

    public com.linkedin.ml.metadata.EthicalConsiderations getEthicalConsiderations() {
        return obtainWrapped(MEMBER_EthicalConsiderations, com.linkedin.ml.metadata.EthicalConsiderations.class, "com.linkedin.ml.metadata.EthicalConsiderations");
    }

    public void setEthicalConsiderations(com.linkedin.ml.metadata.EthicalConsiderations value) {
        selectWrapped(MEMBER_EthicalConsiderations, com.linkedin.ml.metadata.EthicalConsiderations.class, "com.linkedin.ml.metadata.EthicalConsiderations", value);
    }

    public static MLModelAspect create(com.linkedin.ml.metadata.CaveatsAndRecommendations value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setCaveatsAndRecommendations(value);
        return newUnion;
    }

    public boolean isCaveatsAndRecommendations() {
        return memberIs("com.linkedin.ml.metadata.CaveatsAndRecommendations");
    }

    public com.linkedin.ml.metadata.CaveatsAndRecommendations getCaveatsAndRecommendations() {
        return obtainWrapped(MEMBER_CaveatsAndRecommendations, com.linkedin.ml.metadata.CaveatsAndRecommendations.class, "com.linkedin.ml.metadata.CaveatsAndRecommendations");
    }

    public void setCaveatsAndRecommendations(com.linkedin.ml.metadata.CaveatsAndRecommendations value) {
        selectWrapped(MEMBER_CaveatsAndRecommendations, com.linkedin.ml.metadata.CaveatsAndRecommendations.class, "com.linkedin.ml.metadata.CaveatsAndRecommendations", value);
    }

    public static MLModelAspect create(com.linkedin.common.InstitutionalMemory value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setInstitutionalMemory(value);
        return newUnion;
    }

    public boolean isInstitutionalMemory() {
        return memberIs("com.linkedin.common.InstitutionalMemory");
    }

    public com.linkedin.common.InstitutionalMemory getInstitutionalMemory() {
        return obtainWrapped(MEMBER_InstitutionalMemory, com.linkedin.common.InstitutionalMemory.class, "com.linkedin.common.InstitutionalMemory");
    }

    public void setInstitutionalMemory(com.linkedin.common.InstitutionalMemory value) {
        selectWrapped(MEMBER_InstitutionalMemory, com.linkedin.common.InstitutionalMemory.class, "com.linkedin.common.InstitutionalMemory", value);
    }

    public static MLModelAspect create(com.linkedin.ml.metadata.SourceCode value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setSourceCode(value);
        return newUnion;
    }

    public boolean isSourceCode() {
        return memberIs("com.linkedin.ml.metadata.SourceCode");
    }

    public com.linkedin.ml.metadata.SourceCode getSourceCode() {
        return obtainWrapped(MEMBER_SourceCode, com.linkedin.ml.metadata.SourceCode.class, "com.linkedin.ml.metadata.SourceCode");
    }

    public void setSourceCode(com.linkedin.ml.metadata.SourceCode value) {
        selectWrapped(MEMBER_SourceCode, com.linkedin.ml.metadata.SourceCode.class, "com.linkedin.ml.metadata.SourceCode", value);
    }

    public static MLModelAspect create(com.linkedin.common.Status value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setStatus(value);
        return newUnion;
    }

    public boolean isStatus() {
        return memberIs("com.linkedin.common.Status");
    }

    public com.linkedin.common.Status getStatus() {
        return obtainWrapped(MEMBER_Status, com.linkedin.common.Status.class, "com.linkedin.common.Status");
    }

    public void setStatus(com.linkedin.common.Status value) {
        selectWrapped(MEMBER_Status, com.linkedin.common.Status.class, "com.linkedin.common.Status", value);
    }

    public static MLModelAspect create(com.linkedin.common.Cost value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setCost(value);
        return newUnion;
    }

    public boolean isCost() {
        return memberIs("com.linkedin.common.Cost");
    }

    public com.linkedin.common.Cost getCost() {
        return obtainWrapped(MEMBER_Cost, com.linkedin.common.Cost.class, "com.linkedin.common.Cost");
    }

    public void setCost(com.linkedin.common.Cost value) {
        selectWrapped(MEMBER_Cost, com.linkedin.common.Cost.class, "com.linkedin.common.Cost", value);
    }

    public static MLModelAspect create(com.linkedin.common.Deprecation value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setDeprecation(value);
        return newUnion;
    }

    public boolean isDeprecation() {
        return memberIs("com.linkedin.common.Deprecation");
    }

    public com.linkedin.common.Deprecation getDeprecation() {
        return obtainWrapped(MEMBER_Deprecation, com.linkedin.common.Deprecation.class, "com.linkedin.common.Deprecation");
    }

    public void setDeprecation(com.linkedin.common.Deprecation value) {
        selectWrapped(MEMBER_Deprecation, com.linkedin.common.Deprecation.class, "com.linkedin.common.Deprecation", value);
    }

    public static MLModelAspect create(com.linkedin.common.BrowsePaths value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setBrowsePaths(value);
        return newUnion;
    }

    public boolean isBrowsePaths() {
        return memberIs("com.linkedin.common.BrowsePaths");
    }

    public com.linkedin.common.BrowsePaths getBrowsePaths() {
        return obtainWrapped(MEMBER_BrowsePaths, com.linkedin.common.BrowsePaths.class, "com.linkedin.common.BrowsePaths");
    }

    public void setBrowsePaths(com.linkedin.common.BrowsePaths value) {
        selectWrapped(MEMBER_BrowsePaths, com.linkedin.common.BrowsePaths.class, "com.linkedin.common.BrowsePaths", value);
    }

    public static MLModelAspect create(com.linkedin.common.GlobalTags value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setGlobalTags(value);
        return newUnion;
    }

    public boolean isGlobalTags() {
        return memberIs("com.linkedin.common.GlobalTags");
    }

    public com.linkedin.common.GlobalTags getGlobalTags() {
        return obtainWrapped(MEMBER_GlobalTags, com.linkedin.common.GlobalTags.class, "com.linkedin.common.GlobalTags");
    }

    public void setGlobalTags(com.linkedin.common.GlobalTags value) {
        selectWrapped(MEMBER_GlobalTags, com.linkedin.common.GlobalTags.class, "com.linkedin.common.GlobalTags", value);
    }

    public static MLModelAspect create(com.linkedin.common.DataPlatformInstance value) {
        MLModelAspect newUnion = new MLModelAspect();
        newUnion.setDataPlatformInstance(value);
        return newUnion;
    }

    public boolean isDataPlatformInstance() {
        return memberIs("com.linkedin.common.DataPlatformInstance");
    }

    public com.linkedin.common.DataPlatformInstance getDataPlatformInstance() {
        return obtainWrapped(MEMBER_DataPlatformInstance, com.linkedin.common.DataPlatformInstance.class, "com.linkedin.common.DataPlatformInstance");
    }

    public void setDataPlatformInstance(com.linkedin.common.DataPlatformInstance value) {
        selectWrapped(MEMBER_DataPlatformInstance, com.linkedin.common.DataPlatformInstance.class, "com.linkedin.common.DataPlatformInstance", value);
    }

    @Override
    public MLModelAspect clone()
        throws CloneNotSupportedException
    {
        return ((MLModelAspect) super.clone());
    }

    @Override
    public MLModelAspect copy()
        throws CloneNotSupportedException
    {
        return ((MLModelAspect) super.copy());
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

        public com.linkedin.metadata.key.MLModelKey.Fields MLModelKey() {
            return new com.linkedin.metadata.key.MLModelKey.Fields(getPathComponents(), "com.linkedin.metadata.key.MLModelKey");
        }

        public com.linkedin.common.Ownership.Fields Ownership() {
            return new com.linkedin.common.Ownership.Fields(getPathComponents(), "com.linkedin.common.Ownership");
        }

        public com.linkedin.ml.metadata.MLModelProperties.Fields MLModelProperties() {
            return new com.linkedin.ml.metadata.MLModelProperties.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLModelProperties");
        }

        public com.linkedin.ml.metadata.IntendedUse.Fields IntendedUse() {
            return new com.linkedin.ml.metadata.IntendedUse.Fields(getPathComponents(), "com.linkedin.ml.metadata.IntendedUse");
        }

        public com.linkedin.ml.metadata.MLModelFactorPrompts.Fields MLModelFactorPrompts() {
            return new com.linkedin.ml.metadata.MLModelFactorPrompts.Fields(getPathComponents(), "com.linkedin.ml.metadata.MLModelFactorPrompts");
        }

        public com.linkedin.ml.metadata.Metrics.Fields Metrics() {
            return new com.linkedin.ml.metadata.Metrics.Fields(getPathComponents(), "com.linkedin.ml.metadata.Metrics");
        }

        public com.linkedin.ml.metadata.EvaluationData.Fields EvaluationData() {
            return new com.linkedin.ml.metadata.EvaluationData.Fields(getPathComponents(), "com.linkedin.ml.metadata.EvaluationData");
        }

        public com.linkedin.ml.metadata.TrainingData.Fields TrainingData() {
            return new com.linkedin.ml.metadata.TrainingData.Fields(getPathComponents(), "com.linkedin.ml.metadata.TrainingData");
        }

        public com.linkedin.ml.metadata.QuantitativeAnalyses.Fields QuantitativeAnalyses() {
            return new com.linkedin.ml.metadata.QuantitativeAnalyses.Fields(getPathComponents(), "com.linkedin.ml.metadata.QuantitativeAnalyses");
        }

        public com.linkedin.ml.metadata.EthicalConsiderations.Fields EthicalConsiderations() {
            return new com.linkedin.ml.metadata.EthicalConsiderations.Fields(getPathComponents(), "com.linkedin.ml.metadata.EthicalConsiderations");
        }

        public com.linkedin.ml.metadata.CaveatsAndRecommendations.Fields CaveatsAndRecommendations() {
            return new com.linkedin.ml.metadata.CaveatsAndRecommendations.Fields(getPathComponents(), "com.linkedin.ml.metadata.CaveatsAndRecommendations");
        }

        public com.linkedin.common.InstitutionalMemory.Fields InstitutionalMemory() {
            return new com.linkedin.common.InstitutionalMemory.Fields(getPathComponents(), "com.linkedin.common.InstitutionalMemory");
        }

        public com.linkedin.ml.metadata.SourceCode.Fields SourceCode() {
            return new com.linkedin.ml.metadata.SourceCode.Fields(getPathComponents(), "com.linkedin.ml.metadata.SourceCode");
        }

        public com.linkedin.common.Status.Fields Status() {
            return new com.linkedin.common.Status.Fields(getPathComponents(), "com.linkedin.common.Status");
        }

        public com.linkedin.common.Cost.Fields Cost() {
            return new com.linkedin.common.Cost.Fields(getPathComponents(), "com.linkedin.common.Cost");
        }

        public com.linkedin.common.Deprecation.Fields Deprecation() {
            return new com.linkedin.common.Deprecation.Fields(getPathComponents(), "com.linkedin.common.Deprecation");
        }

        public com.linkedin.common.BrowsePaths.Fields BrowsePaths() {
            return new com.linkedin.common.BrowsePaths.Fields(getPathComponents(), "com.linkedin.common.BrowsePaths");
        }

        public com.linkedin.common.GlobalTags.Fields GlobalTags() {
            return new com.linkedin.common.GlobalTags.Fields(getPathComponents(), "com.linkedin.common.GlobalTags");
        }

        public com.linkedin.common.DataPlatformInstance.Fields DataPlatformInstance() {
            return new com.linkedin.common.DataPlatformInstance.Fields(getPathComponents(), "com.linkedin.common.DataPlatformInstance");
        }

    }


    /**
     * A union of all supported metadata aspects for a ML Model
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.aspect/**A union of all supported metadata aspects for a ML Model*/typeref MLModelAspect=union[{namespace com.linkedin.metadata.key/**Key for an ML model*/@Aspect.name=\"mlModelKey\"record MLModelKey{/**Standardized platform urn for the model*/platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Name of the MLModel*/@Searchable={\"enableAutocomplete\":true,\"boostScore\":10.0,\"fieldType\":\"TEXT_PARTIAL\"}name:string/**Fabric type where model belongs to or where it was generated*/@Searchable={\"filterNameOverride\":\"Environment\",\"queryByDefault\":false,\"addToFilters\":true,\"fieldType\":\"TEXT_PARTIAL\"}origin:{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}}}{namespace com.linkedin.common/**Ownership information of an entity.*/@Aspect.name=\"ownership\"record Ownership{/**List of owners of the entity.*/owners:array[/**Ownership information*/record Owner{/**Owner URN, e.g. urn:li:corpuser:ldap, urn:li:corpGroup:group_name, and urn:li:multiProduct:mp_name\n(Caveat: only corpuser is currently supported in the frontend.)*/@Relationship={\"name\":\"OwnedBy\",\"entityTypes\":[\"corpUser\",\"corpGroup\"]}@Searchable={\"fieldName\":\"owners\",\"hasValuesFieldName\":\"hasOwners\",\"queryByDefault\":false,\"fieldType\":\"URN\"}owner:Urn/**The type of the ownership*/type:/**Owner category or owner role*/enum OwnershipType{/**A person or group that is in charge of developing the code*/DEVELOPER/**A person or group that is owning the data*/DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.*/DELEGATE/**A person, group, or service that produces/generates the data*/PRODUCER/**A person, group, or service that consumes the data*/CONSUMER/**A person or a group that has direct business interest*/STAKEHOLDER}/**Source information for the ownership*/source:optional/**Source/provider of the ownership information*/record OwnershipSource{/**The type of the source*/type:enum OwnershipSourceType{/**Auditing system or audit logs*/AUDIT/**Database, e.g. GRANTS table*/DATABASE/**File system, e.g. file/directory owner*/FILE_SYSTEM/**Issue tracking system, e.g. Jira*/ISSUE_TRACKING_SYSTEM/**Manually provided by a user*/MANUAL/**Other ownership-like service, e.g. Nuage, ACL service etc*/SERVICE/**SCM system, e.g. GIT, SVN*/SOURCE_CONTROL/**Other sources*/OTHER}/**A reference URL for the source*/url:optional string}}]/**Audit stamp containing who last modified the record and when. A value of 0 in the time field indicates missing data.*/lastModified:/**Data captured on a resource/association/sub-resource level giving insight into when that resource/association/sub-resource moved into a particular lifecycle stage, and who acted to move it into that specific lifecycle stage.*/record AuditStamp{/**When did the resource/association/sub-resource move into the specific lifecycle stage represented by this AuditEvent.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) which will be credited for moving the resource/association/sub-resource into the specific lifecycle stage. It is also the one used to authorize the change.*/actor:Urn/**The entity (e.g. a service URN) which performs the change on behalf of the Actor and must be authorized to act as the Actor.*/impersonator:optional Urn}={\"actor\":\"urn:li:corpuser:unknown\",\"time\":0}}}{namespace com.linkedin.ml.metadata/**Properties associated with a ML Model*/@Aspect.name=\"mlModelProperties\"record MLModelProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`.queryByDefault,customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/externalUrl:optional@java={\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\",\"class\":\"com.linkedin.common.url.Url\"}typeref Url=string}}{/**Documentation of the MLModel*/@Searchable={\"hasValuesFieldName\":\"hasDescription\",\"fieldType\":\"TEXT\"}description:optional string/**Date when the MLModel was developed*/date:optional com.linkedin.common.Time/**Version of the MLModel*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string}}/**Type of Algorithm or MLModel such as whether it is a Naive Bayes classifier, Convolutional Neural Network, etc*/@Searchable.fieldType=\"TEXT_PARTIAL\"type:optional string/**Hyper Parameters of the MLModel\n\nNOTE: these are deprecated in favor of hyperParams*/hyperParameters:optional map[string/**A union of all supported metadata aspects for HyperParameter Value*/typeref HyperParameterValueType=union[string,int,float,double,boolean]]/**Hyperparameters of the MLModel*/hyperParams:optional array[/**Properties associated with an ML Hyper Param*/@Aspect.name=\"mlHyperParam\"record MLHyperParam{/**Name of the MLHyperParam*/name:string/**Documentation of the MLHyperParam*/description:optional string/**The value of the MLHyperParam*/value:optional string/**Date when the MLHyperParam was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in training*/trainingMetrics:optional array[/**Properties associated with an ML Metric*/@Aspect.name=\"mlMetric\"record MLMetric{/**Name of the mlMetric*/name:string/**Documentation of the mlMetric*/description:optional string/**The value of the mlMetric*/value:optional string/**Date when the mlMetric was developed*/createdAt:optional com.linkedin.common.Time}]/**Metrics of the MLModel used in production*/onlineMetrics:optional array[MLMetric]/**List of features used for MLModel training*/mlFeatures:optional array[{namespace com.linkedin.common/**Standardized MLFeature identifier.*/@java.class=\"com.linkedin.common.urn.MLFeatureUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"mlFeature\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"MLFeature\",\"doc\":\"Standardized MLFeature identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"mlFeatureNamespace\",\"doc\":\"Namespace for the MLFeature\",\"type\":\"string\"},{\"name\":\"mlFeatureName\",\"doc\":\"Name of the MLFeature\",\"type\":\"string\",\"maxLength\":210}],\"maxLength\":284}typeref MLFeatureUrn=string}]/**Tags for the MLModel*/tags:array[string]=[]/**Deployments for the MLModel*/@Relationship.`/*`={\"name\":\"DeployedTo\",\"entityTypes\":[\"mlModelDeployment\"]}deployments:optional array[com.linkedin.common.Urn]/**List of jobs (if any) used to train the model*/@Relationship.`/*`={\"name\":\"TrainedBy\",\"entityTypes\":[\"dataJob\"]}trainingJobs:optional array[com.linkedin.common.Urn]/**List of jobs (if any) that use the model*/@Relationship.`/*`={\"name\":\"UsedBy\",\"entityTypes\":[\"dataJob\"]}downstreamJobs:optional array[com.linkedin.common.Urn]/**Groups the model belongs to*/@Relationship.`/*`={\"name\":\"MemberOf\",\"entityTypes\":[\"mlModelGroup\"]}groups:optional array[com.linkedin.common.Urn]}}{namespace com.linkedin.ml.metadata/**Intended Use for the ML Model*/@Aspect.name=\"intendedUse\"record IntendedUse{/**Primary Use cases for the MLModel.*/primaryUses:optional array[string]/**Primary Intended Users - For example, was the MLModel developed for entertainment purposes, for hobbyists, or enterprise solutions?*/primaryUsers:optional array[enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}]/**Highlight technology that the MLModel might easily be confused with, or related contexts that users could try to apply the MLModel to.*/outOfScopeUses:optional array[string]}}{namespace com.linkedin.ml.metadata/**Prompts which affect the performance of the MLModel*/@Aspect.name=\"mlModelFactorPrompts\"record MLModelFactorPrompts{/**What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?*/relevantFactors:optional array[/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera\u2019s hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}]/**Which factors are being reported, and why were these chosen?*/evaluationFactors:optional array[MLModelFactors]}}{namespace com.linkedin.ml.metadata/**Metrics to be featured for the MLModel.*/@Aspect.name=\"mlModelMetrics\"record Metrics{/**Measures of MLModel performance*/performanceMeasures:optional array[string]/**Decision Thresholds used (if any)?*/decisionThreshold:optional array[string]}}{namespace com.linkedin.ml.metadata/**All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.*/@Aspect.name=\"mlModelEvaluationData\"record EvaluationData{/**Details on the dataset(s) used for the quantitative analyses in the MLModel*/evaluationData:array[/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}]}}{namespace com.linkedin.ml.metadata/**Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.*/@Aspect.name=\"mlModelTrainingData\"record TrainingData{/**Details on the dataset(s) used for training the MLModel*/trainingData:array[BaseData]}}{namespace com.linkedin.ml.metadata/**Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.*/@Aspect.name=\"mlModelQuantitativeAnalyses\"record QuantitativeAnalyses{/**Link to a dashboard with results showing how the MLModel performed with respect to each factor*/unitaryResults:optional/**A union of all supported metadata aspects for ResultsType*/typeref ResultsType=union[string]/**Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?*/intersectionalResults:optional ResultsType}}{namespace com.linkedin.ml.metadata/**This section is intended to demonstrate the ethical considerations that went into MLModel development, surfacing ethical challenges and solutions to stakeholders.*/@Aspect.name=\"mlModelEthicalConsiderations\"record EthicalConsiderations{/**Does the MLModel use any sensitive data (e.g., protected classes)?*/data:optional array[string]/** Is the MLModel intended to inform decisions about matters central to human life or flourishing \u2013 e.g., health or safety? Or could it be used in such a way?*/humanLife:optional array[string]/**What risk mitigation strategies were used during MLModel development?*/mitigations:optional array[string]/**What risks may be present in MLModel usage? Try to identify the potential recipients, likelihood, and magnitude of harms. If these cannot be determined, note that they were considered but remain unknown.*/risksAndHarms:optional array[string]/**Are there any known MLModel use cases that are especially fraught? This may connect directly to the intended use section*/useCases:optional array[string]}}{namespace com.linkedin.ml.metadata/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/@Aspect.name=\"mlModelCaveatsAndRecommendations\"record CaveatsAndRecommendations{/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset?*/caveats:optional/**This section should list additional concerns that were not covered in the previous sections. For example, did the results suggest any further testing? Were there any relevant groups that were not represented in the evaluation dataset? Are there additional recommendations for model use?*/record CaveatDetails{/**Did the results suggest any further testing?*/needsFurtherTesting:optional boolean/**Caveat Description\nFor ex: Given gender classes are binary (male/not male), which we include as male/female. Further work needed to evaluate across a spectrum of genders.*/caveatDescription:optional string/**Relevant groups that were not represented in the evaluation dataset?*/groupsNotRepresented:optional array[string]}/**Recommendations on where this MLModel should be used.*/recommendations:optional string/**Ideal characteristics of an evaluation dataset for this MLModel*/idealDatasetCharacteristics:optional array[string]}}{namespace com.linkedin.common/**Institutional memory of an entity. This is a way to link to relevant documentation and provide description of the documentation. Institutional or tribal knowledge is very important for users to leverage the entity.*/@Aspect.name=\"institutionalMemory\"record InstitutionalMemory{/**List of records that represent institutional memory of an entity. Each record consists of a link, description, creator and timestamps associated with that record.*/elements:array[/**Metadata corresponding to a record of institutional memory.*/record InstitutionalMemoryMetadata{/**Link to an engineering design document or a wiki page.*/url:Url/**Description of the link.*/description:string/**Audit stamp associated with creation of this record*/createStamp:AuditStamp}]}}{namespace com.linkedin.ml.metadata/**Source Code*/@Aspect.name=\"sourceCode\"record SourceCode{/**Source Code along with types*/sourceCode:array[/**Source Code Url Entity*/record SourceCodeUrl{/**Source Code Url Types*/type:enum SourceCodeUrlType{ML_MODEL_SOURCE_CODE,TRAINING_PIPELINE_SOURCE_CODE,EVALUATION_PIPELINE_SOURCE_CODE}/**Source Code Url*/sourceCodeUrl:com.linkedin.common.Url}]}}{namespace com.linkedin.common/**The status metadata of an entity, e.g. dataset, metric, feature, etc.\nThis aspect is used to represent soft deletes conventionally.*/@Aspect.name=\"status\"record Status{/**whether the entity is removed or not*/@Searchable.fieldType=\"BOOLEAN\"removed:boolean=false}}{namespace com.linkedin.common@Aspect.name=\"cost\"record Cost{costType:/**Type of Cost Code*/enum CostType{/**Org Cost Type to which the Cost of this entity should be attributed to*/ORG_COST_TYPE}cost:/**A union of all supported Cost Value types*/typeref CostValue=union[costId:double,costCode:string]}}{namespace com.linkedin.common/**Deprecation status of an entity*/@Aspect.name=\"deprecation\"record Deprecation{/**Whether the entity is deprecated.*/@Searchable={\"weightsPerFieldValue\":{\"true\":0.5},\"fieldType\":\"BOOLEAN\"}deprecated:boolean/**The time user plan to decommission this entity.*/decommissionTime:optional Time/**Additional information about the entity deprecation plan, such as the wiki, doc, RB.*/note:string/**The corpuser URN which will be credited for modifying this deprecation content.*/actor:/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}}{namespace com.linkedin.common/**Shared aspect containing Browse Paths to be indexed for an entity.*/@Aspect.name=\"browsePaths\"record BrowsePaths{/**A list of valid browse paths for the entity.\n\nBrowse paths are expected to be backslash-separated strings. For example: 'prod/snowflake/datasetName'*/@Searchable.`/*`={\"fieldName\":\"browsePaths\",\"fieldType\":\"BROWSE_PATH\"}paths:array[string]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/@Searchable={\"fieldName\":\"tags\",\"hasValuesFieldName\":\"hasTags\",\"filterNameOverride\":\"Tag\",\"addToFilters\":true,\"fieldType\":\"URN_PARTIAL\"}tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"tag\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Tag\",\"doc\":\"Globally defined tags\",\"owners\":[],\"fields\":[{\"name\":\"name\",\"doc\":\"tag name\",\"type\":\"string\",\"maxLength\":200}],\"maxLength\":220}typeref TagUrn=string}]}}{namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"dataPlatformInstance\"record DataPlatformInstance{/**Data Platform*/@Searchable={\"filterNameOverride\":\"Platform\",\"addToFilters\":true,\"fieldType\":\"URN\"}platform:Urn/**Instance of the data platform (e.g. db instance)*/instance:optional string}}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
