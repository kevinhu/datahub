
package com.linkedin.metadata.search;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/Document.pdl.")
public class Document
    extends UnionTemplate
    implements HasTyperefInfo
{

    private final static UnionDataSchema SCHEMA = ((UnionDataSchema) DataTemplateUtil.parseSchema("union[{namespace com.linkedin.metadata.search/**Data model for CorpUserInfo entity search*/record CorpUserInfoDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{/**Urn for the CorpUser.*/urn:{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}/**ldap of the CorpUser*/ldap:optional string/**title of the CorpUser*/title:optional string/**direct manager's ldap of the CorpUser*/managerLdap:optional string/**Common name of the CorpUser, format is firstName + lastName (split by a whitespace)*/fullName:optional string/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/teams:optional array[string]/**Skills that the user possesses e.g. Machine Learning*/skills:optional array[string]/**Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/active:optional boolean/**The user's full email(s).*/emails:optional array[string]}}{namespace com.linkedin.metadata.search/**Data model for dataset entity search*/record DatasetDocument includes BaseDocument{/**Urn for the dataset*/urn:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Dataset native name e.g. {db}.{table}, /dir/subdir/{name}, or {name}*/name:optional string/**Platform name for the dataset*/platform:optional string/**Fabric type where dataset belongs to or where it was generated*/origin:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}/**LDAP usernames of corp users who are the owners of this dataset*/owners:optional array[string]/**Flag to indicate if the dataset is deprecated.*/deprecated:optional boolean/**Documentation of the dataset.*/description:optional string/**Field paths of the dataset*/fieldPaths:optional array[string]/**Flag to indicate if the dataset has non empty corp users as owners or not.*/hasOwners:optional boolean/**Flag to indicate if the dataset has non-empty schema or not.*/hasSchema:optional boolean/**Lineage information represented by the number of immediate downstream datasets of this dataset.*/numDownstreamDatasets:optional long/**List of upstreams for this dataset*/upstreams:optional array[com.linkedin.common.DatasetUrn]/**List of tags for this dataset*/tags:optional array[string]/**List of field descriptions*/fieldDescriptions:optional array[string]/**List of tags applied to fields*/fieldTags:optional array[string]/**List of field descriptions*/editedFieldDescriptions:optional array[string]/**List of tags applied to fields*/editedFieldTags:optional array[string]/**List of terms for this dataset*/glossaryTerms:optional array[string]}}]", SchemaFormatType.PDL));
    private final static DataSchema MEMBER_CorpUserInfoDocument = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.search.CorpUserInfoDocument");
    private final static DataSchema MEMBER_DatasetDocument = SCHEMA.getTypeByMemberKey("com.linkedin.metadata.search.DatasetDocument");
    private final static TyperefInfo TYPEREFINFO = new Document.UnionTyperefInfo();

    public Document() {
        super(new DataMap(2, 0.75F), SCHEMA);
    }

    public Document(Object data) {
        super(data, SCHEMA);
    }

    public static Document create(com.linkedin.metadata.search.CorpUserInfoDocument value) {
        Document newUnion = new Document();
        newUnion.setCorpUserInfoDocument(value);
        return newUnion;
    }

    public boolean isCorpUserInfoDocument() {
        return memberIs("com.linkedin.metadata.search.CorpUserInfoDocument");
    }

    public com.linkedin.metadata.search.CorpUserInfoDocument getCorpUserInfoDocument() {
        return obtainWrapped(MEMBER_CorpUserInfoDocument, com.linkedin.metadata.search.CorpUserInfoDocument.class, "com.linkedin.metadata.search.CorpUserInfoDocument");
    }

    public void setCorpUserInfoDocument(com.linkedin.metadata.search.CorpUserInfoDocument value) {
        selectWrapped(MEMBER_CorpUserInfoDocument, com.linkedin.metadata.search.CorpUserInfoDocument.class, "com.linkedin.metadata.search.CorpUserInfoDocument", value);
    }

    public static Document create(com.linkedin.metadata.search.DatasetDocument value) {
        Document newUnion = new Document();
        newUnion.setDatasetDocument(value);
        return newUnion;
    }

    public boolean isDatasetDocument() {
        return memberIs("com.linkedin.metadata.search.DatasetDocument");
    }

    public com.linkedin.metadata.search.DatasetDocument getDatasetDocument() {
        return obtainWrapped(MEMBER_DatasetDocument, com.linkedin.metadata.search.DatasetDocument.class, "com.linkedin.metadata.search.DatasetDocument");
    }

    public void setDatasetDocument(com.linkedin.metadata.search.DatasetDocument value) {
        selectWrapped(MEMBER_DatasetDocument, com.linkedin.metadata.search.DatasetDocument.class, "com.linkedin.metadata.search.DatasetDocument", value);
    }

    @Override
    public Document clone()
        throws CloneNotSupportedException
    {
        return ((Document) super.clone());
    }

    @Override
    public Document copy()
        throws CloneNotSupportedException
    {
        return ((Document) super.copy());
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

        public com.linkedin.metadata.search.CorpUserInfoDocument.Fields CorpUserInfoDocument() {
            return new com.linkedin.metadata.search.CorpUserInfoDocument.Fields(getPathComponents(), "com.linkedin.metadata.search.CorpUserInfoDocument");
        }

        public com.linkedin.metadata.search.DatasetDocument.Fields DatasetDocument() {
            return new com.linkedin.metadata.search.DatasetDocument.Fields(getPathComponents(), "com.linkedin.metadata.search.DatasetDocument");
        }

    }


    /**
     * A union of all supported document types.
     * 
     */
    private final static class UnionTyperefInfo
        extends TyperefInfo
    {

        private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**A union of all supported document types.*/typeref Document=union[/**Data model for CorpUserInfo entity search*/record CorpUserInfoDocument includes/**Common fields that may apply to all documents*/record BaseDocument{/**Whether the entity has been removed or not*/removed:optional boolean=false/**All paths representing the hierarchy of this entity. This is essential for browsing various paths leading to this entity.*/browsePaths:optional array[string]}{/**Urn for the CorpUser.*/urn:{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:security\",\"entityType\":\"corpuser\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Corpuser\",\"doc\":\"Corporate user's AD/LDAP login\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"username\",\"doc\":\"The name of the AD/LDAP user.\",\"type\":\"string\",\"maxLength\":20}],\"maxLength\":36}typeref CorpuserUrn=string}/**ldap of the CorpUser*/ldap:optional string/**title of the CorpUser*/title:optional string/**direct manager's ldap of the CorpUser*/managerLdap:optional string/**Common name of the CorpUser, format is firstName + lastName (split by a whitespace)*/fullName:optional string/**About me section of the user*/aboutMe:optional string/**Teams that the user belongs to e.g. Metadata*/teams:optional array[string]/**Skills that the user possesses e.g. Machine Learning*/skills:optional array[string]/**Whether the corpUser is active, ref: https://iwww.corp.linkedin.com/wiki/cf/display/GTSD/Accessing+Active+Directory+via+LDAP+tools*/active:optional boolean/**The user's full email(s).*/emails:optional array[string]}/**Data model for dataset entity search*/record DatasetDocument includes BaseDocument{/**Urn for the dataset*/urn:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"owningTeam\":\"urn:li:internalTeam:datahub\",\"entityType\":\"dataset\",\"constructable\":true,\"namespace\":\"li\",\"name\":\"Dataset\",\"doc\":\"Standardized dataset identifier.\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"fields\":[{\"name\":\"platform\",\"doc\":\"Standardized platform urn where dataset is defined.\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"name\":\"datasetName\",\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"type\":\"string\",\"maxLength\":210},{\"name\":\"origin\",\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284}typeref DatasetUrn=string}/**Dataset native name e.g. {db}.{table}, /dir/subdir/{name}, or {name}*/name:optional string/**Platform name for the dataset*/platform:optional string/**Fabric type where dataset belongs to or where it was generated*/origin:optional{namespace com.linkedin.common/**Fabric group type*/enum FabricType{/**Designates development fabrics*/DEV/**Designates early-integration (staging) fabrics*/EI/**Designates production fabrics*/PROD/**Designates corporation fabrics*/CORP}}/**LDAP usernames of corp users who are the owners of this dataset*/owners:optional array[string]/**Flag to indicate if the dataset is deprecated.*/deprecated:optional boolean/**Documentation of the dataset.*/description:optional string/**Field paths of the dataset*/fieldPaths:optional array[string]/**Flag to indicate if the dataset has non empty corp users as owners or not.*/hasOwners:optional boolean/**Flag to indicate if the dataset has non-empty schema or not.*/hasSchema:optional boolean/**Lineage information represented by the number of immediate downstream datasets of this dataset.*/numDownstreamDatasets:optional long/**List of upstreams for this dataset*/upstreams:optional array[com.linkedin.common.DatasetUrn]/**List of tags for this dataset*/tags:optional array[string]/**List of field descriptions*/fieldDescriptions:optional array[string]/**List of tags applied to fields*/fieldTags:optional array[string]/**List of field descriptions*/editedFieldDescriptions:optional array[string]/**List of tags applied to fields*/editedFieldTags:optional array[string]/**List of terms for this dataset*/glossaryTerms:optional array[string]}]", SchemaFormatType.PDL));

        public UnionTyperefInfo() {
            super(SCHEMA);
        }

    }

}
