// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.Option
import com.hubspot_sdk.api.models.automation.actions.ActionCompleteParams
import com.hubspot_sdk.api.models.automation.actions.ActionCreateOrReplaceByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.ActionCreateOrReplaceParams
import com.hubspot_sdk.api.models.automation.actions.ActionCreateParams
import com.hubspot_sdk.api.models.automation.actions.ActionCreateRequiresObjectParams
import com.hubspot_sdk.api.models.automation.actions.ActionDeleteByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.ActionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.ActionExecutionIndexIdentifier
import com.hubspot_sdk.api.models.automation.actions.ActionGetByFunctionTypeParams
import com.hubspot_sdk.api.models.automation.actions.ActionGetParams
import com.hubspot_sdk.api.models.automation.actions.ActionGetRequiresObjectParams
import com.hubspot_sdk.api.models.automation.actions.ActionListParams
import com.hubspot_sdk.api.models.automation.actions.ActionUpdateParams
import com.hubspot_sdk.api.models.automation.actions.BatchInputCallbackCompletionBatchRequest
import com.hubspot_sdk.api.models.automation.actions.CallbackCompletionBatchRequest
import com.hubspot_sdk.api.models.automation.actions.CallbackCompletionRequest
import com.hubspot_sdk.api.models.automation.actions.FieldTypeDefinition
import com.hubspot_sdk.api.models.automation.actions.IntegerFieldSchema
import com.hubspot_sdk.api.models.automation.actions.OutputFieldDefinition
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinitionEgg
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinitionPatch
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinitionRequiresObjectRequest
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunction
import com.hubspot_sdk.api.models.automation.actions.PublicExecutionTranslationRule
import com.hubspot_sdk.api.models.automation.actions.PublicFieldTypeDefinition
import com.hubspot_sdk.api.models.automation.actions.PublicInputFieldDefinition
import com.hubspot_sdk.api.models.automation.actions.PublicObjectRequestOptions
import com.hubspot_sdk.api.models.automation.actions.PublicOption
import com.hubspot_sdk.api.models.automation.actions.PublicSingleFieldDependency
import com.hubspot_sdk.api.models.automation.actions.WorkflowsRequestContext
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val publicActionDefinitionFuture =
            actionServiceAsync.create(
                ActionCreateParams.builder()
                    .appId(0)
                    .publicActionDefinitionEgg(
                        PublicActionDefinitionEgg.builder()
                            .actionUrl("actionUrl")
                            .addFunction(
                                PublicActionFunction.builder()
                                    .functionSource("functionSource")
                                    .functionType(
                                        PublicActionFunction.FunctionType.POST_ACTION_EXECUTION
                                    )
                                    .id("id")
                                    .build()
                            )
                            .addInputField(
                                PublicInputFieldDefinition.builder()
                                    .isRequired(true)
                                    .typeDefinition(
                                        PublicFieldTypeDefinition.builder()
                                            .name("name")
                                            .addOption(
                                                PublicOption.builder()
                                                    .label("label")
                                                    .value("value")
                                                    .description("description")
                                                    .displayOrder(0)
                                                    .build()
                                            )
                                            .type(PublicFieldTypeDefinition.Type.BOOL)
                                            .description("description")
                                            .fieldType(
                                                PublicFieldTypeDefinition.FieldType.BOOLEANCHECKBOX
                                            )
                                            .helpText("helpText")
                                            .label("label")
                                            .optionsUrl("optionsUrl")
                                            .referencedObjectType(
                                                PublicFieldTypeDefinition.ReferencedObjectType.OWNER
                                            )
                                            .build()
                                    )
                                    .addSupportedValueType(
                                        PublicInputFieldDefinition.SupportedValueType.STATIC_VALUE
                                    )
                                    .build()
                            )
                            .labels(
                                PublicActionDefinitionEgg.Labels.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "actionName" to "actionName",
                                                "actionCardContent" to "actionCardContent",
                                                "actionDescription" to "actionDescription",
                                                "appDisplayName" to "appDisplayName",
                                                "executionRules" to mapOf("foo" to "string"),
                                                "inputFieldDescriptions" to
                                                    mapOf("foo" to "string"),
                                                "inputFieldLabels" to mapOf("foo" to "string"),
                                                "inputFieldOptionLabels" to
                                                    mapOf("foo" to mapOf("foo" to "string")),
                                                "outputFieldLabels" to mapOf("foo" to "string"),
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .addObjectType("string")
                            .published(true)
                            .archivedAt(0L)
                            .addExecutionRule(
                                PublicExecutionTranslationRule.builder()
                                    .conditions(
                                        PublicExecutionTranslationRule.Conditions.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .labelName("labelName")
                                    .build()
                            )
                            .addInputFieldDependency(
                                PublicSingleFieldDependency.builder()
                                    .controllingFieldName("controllingFieldName")
                                    .dependencyType(
                                        PublicSingleFieldDependency.DependencyType.SINGLE_FIELD
                                    )
                                    .addDependentFieldName("string")
                                    .build()
                            )
                            .objectRequestOptions(
                                PublicObjectRequestOptions.builder().addProperty("string").build()
                            )
                            .addOutputField(
                                OutputFieldDefinition.builder()
                                    .typeDefinition(
                                        FieldTypeDefinition.builder()
                                            .externalOptions(true)
                                            .name("name")
                                            .addOption(
                                                Option.builder()
                                                    .hidden(true)
                                                    .label("label")
                                                    .value("value")
                                                    .description("description")
                                                    .displayOrder(0)
                                                    .build()
                                            )
                                            .schema(
                                                IntegerFieldSchema.builder()
                                                    .type(IntegerFieldSchema.Type.INTEGER)
                                                    .maximum(0)
                                                    .minimum(0)
                                                    .build()
                                            )
                                            .type(FieldTypeDefinition.Type.BOOL)
                                            .useChirp(true)
                                            .description("description")
                                            .externalOptionsReferenceType(
                                                "externalOptionsReferenceType"
                                            )
                                            .fieldType(
                                                FieldTypeDefinition.FieldType.BOOLEANCHECKBOX
                                            )
                                            .helpText("helpText")
                                            .label("label")
                                            .optionsUrl("optionsUrl")
                                            .referencedObjectType(
                                                FieldTypeDefinition.ReferencedObjectType
                                                    .ABANDONED_CART
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val publicActionDefinition = publicActionDefinitionFuture.get()
        publicActionDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val publicActionDefinitionFuture =
            actionServiceAsync.update(
                ActionUpdateParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .publicActionDefinitionPatch(
                        PublicActionDefinitionPatch.builder()
                            .actionUrl("actionUrl")
                            .addExecutionRule(
                                PublicExecutionTranslationRule.builder()
                                    .conditions(
                                        PublicExecutionTranslationRule.Conditions.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .labelName("labelName")
                                    .build()
                            )
                            .addInputFieldDependency(
                                PublicSingleFieldDependency.builder()
                                    .controllingFieldName("controllingFieldName")
                                    .dependencyType(
                                        PublicSingleFieldDependency.DependencyType.SINGLE_FIELD
                                    )
                                    .addDependentFieldName("string")
                                    .build()
                            )
                            .addInputField(
                                PublicInputFieldDefinition.builder()
                                    .isRequired(true)
                                    .typeDefinition(
                                        PublicFieldTypeDefinition.builder()
                                            .name("name")
                                            .addOption(
                                                PublicOption.builder()
                                                    .label("label")
                                                    .value("value")
                                                    .description("description")
                                                    .displayOrder(0)
                                                    .build()
                                            )
                                            .type(PublicFieldTypeDefinition.Type.BOOL)
                                            .description("description")
                                            .fieldType(
                                                PublicFieldTypeDefinition.FieldType.BOOLEANCHECKBOX
                                            )
                                            .helpText("helpText")
                                            .label("label")
                                            .optionsUrl("optionsUrl")
                                            .referencedObjectType(
                                                PublicFieldTypeDefinition.ReferencedObjectType.OWNER
                                            )
                                            .build()
                                    )
                                    .addSupportedValueType(
                                        PublicInputFieldDefinition.SupportedValueType.STATIC_VALUE
                                    )
                                    .build()
                            )
                            .labels(
                                PublicActionDefinitionPatch.Labels.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(
                                            mapOf(
                                                "actionName" to "actionName",
                                                "actionCardContent" to "actionCardContent",
                                                "actionDescription" to "actionDescription",
                                                "appDisplayName" to "appDisplayName",
                                                "executionRules" to mapOf("foo" to "string"),
                                                "inputFieldDescriptions" to
                                                    mapOf("foo" to "string"),
                                                "inputFieldLabels" to mapOf("foo" to "string"),
                                                "inputFieldOptionLabels" to
                                                    mapOf("foo" to mapOf("foo" to "string")),
                                                "outputFieldLabels" to mapOf("foo" to "string"),
                                            )
                                        ),
                                    )
                                    .build()
                            )
                            .objectRequestOptions(
                                PublicObjectRequestOptions.builder().addProperty("string").build()
                            )
                            .addObjectType("string")
                            .addOutputField(
                                OutputFieldDefinition.builder()
                                    .typeDefinition(
                                        FieldTypeDefinition.builder()
                                            .externalOptions(true)
                                            .name("name")
                                            .addOption(
                                                Option.builder()
                                                    .hidden(true)
                                                    .label("label")
                                                    .value("value")
                                                    .description("description")
                                                    .displayOrder(0)
                                                    .build()
                                            )
                                            .schema(
                                                IntegerFieldSchema.builder()
                                                    .type(IntegerFieldSchema.Type.INTEGER)
                                                    .maximum(0)
                                                    .minimum(0)
                                                    .build()
                                            )
                                            .type(FieldTypeDefinition.Type.BOOL)
                                            .useChirp(true)
                                            .description("description")
                                            .externalOptionsReferenceType(
                                                "externalOptionsReferenceType"
                                            )
                                            .fieldType(
                                                FieldTypeDefinition.FieldType.BOOLEANCHECKBOX
                                            )
                                            .helpText("helpText")
                                            .label("label")
                                            .optionsUrl("optionsUrl")
                                            .referencedObjectType(
                                                FieldTypeDefinition.ReferencedObjectType
                                                    .ABANDONED_CART
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .published(true)
                            .build()
                    )
                    .build()
            )

        val publicActionDefinition = publicActionDefinitionFuture.get()
        publicActionDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val pageFuture =
            actionServiceAsync.list(
                ActionListParams.builder().appId(0).definitionId("definitionId").build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val future =
            actionServiceAsync.delete(
                ActionDeleteParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(ActionDeleteParams.FunctionType.POST_ACTION_EXECUTION)
                    .functionId("functionId")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun complete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val future =
            actionServiceAsync.complete(
                ActionCompleteParams.builder()
                    .callbackId("callbackId")
                    .callbackCompletionRequest(
                        CallbackCompletionRequest.builder()
                            .outputFields(
                                CallbackCompletionRequest.OutputFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .typedOutputs(JsonValue.from(mapOf<String, Any>()))
                            .failureReasonType("failureReasonType")
                            .requestContext(
                                WorkflowsRequestContext.builder()
                                    .source(WorkflowsRequestContext.Source.WORKFLOWS)
                                    .workflowId(0)
                                    .actionExecutionIndexIdentifier(
                                        ActionExecutionIndexIdentifier.builder()
                                            .actionExecutionIndex(0)
                                            .enrollmentId(0)
                                            .build()
                                    )
                                    .actionId(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun completeBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val future =
            actionServiceAsync.completeBatch(
                BatchInputCallbackCompletionBatchRequest.builder()
                    .addInput(
                        CallbackCompletionBatchRequest.builder()
                            .callbackId("callbackId")
                            .outputFields(
                                CallbackCompletionBatchRequest.OutputFields.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .typedOutputs(JsonValue.from(mapOf<String, Any>()))
                            .failureReasonType("failureReasonType")
                            .requestContext(
                                WorkflowsRequestContext.builder()
                                    .source(WorkflowsRequestContext.Source.WORKFLOWS)
                                    .workflowId(0)
                                    .actionExecutionIndexIdentifier(
                                        ActionExecutionIndexIdentifier.builder()
                                            .actionExecutionIndex(0)
                                            .enrollmentId(0)
                                            .build()
                                    )
                                    .actionId(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createOrReplace() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val publicActionFunctionIdentifierFuture =
            actionServiceAsync.createOrReplace(
                ActionCreateOrReplaceParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(ActionCreateOrReplaceParams.FunctionType.POST_ACTION_EXECUTION)
                    .functionId("functionId")
                    .body("body")
                    .build()
            )

        val publicActionFunctionIdentifier = publicActionFunctionIdentifierFuture.get()
        publicActionFunctionIdentifier.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createOrReplaceByFunctionType() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val publicActionFunctionIdentifierFuture =
            actionServiceAsync.createOrReplaceByFunctionType(
                ActionCreateOrReplaceByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(
                        ActionCreateOrReplaceByFunctionTypeParams.FunctionType.POST_ACTION_EXECUTION
                    )
                    .body("body")
                    .build()
            )

        val publicActionFunctionIdentifier = publicActionFunctionIdentifierFuture.get()
        publicActionFunctionIdentifier.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createRequiresObject() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val future =
            actionServiceAsync.createRequiresObject(
                ActionCreateRequiresObjectParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .publicActionDefinitionRequiresObjectRequest(
                        PublicActionDefinitionRequiresObjectRequest.builder()
                            .requiresObject(true)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteByFunctionType() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val future =
            actionServiceAsync.deleteByFunctionType(
                ActionDeleteByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(
                        ActionDeleteByFunctionTypeParams.FunctionType.POST_ACTION_EXECUTION
                    )
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val publicActionRevisionFuture =
            actionServiceAsync.get(
                ActionGetParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .revisionId("revisionId")
                    .build()
            )

        val publicActionRevision = publicActionRevisionFuture.get()
        publicActionRevision.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getByFunctionType() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val publicActionFunctionFuture =
            actionServiceAsync.getByFunctionType(
                ActionGetByFunctionTypeParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .functionType(ActionGetByFunctionTypeParams.FunctionType.POST_ACTION_EXECUTION)
                    .build()
            )

        val publicActionFunction = publicActionFunctionFuture.get()
        publicActionFunction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRequiresObject() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val actionServiceAsync = client.automation().actions()

        val publicActionDefinitionRequiresObjectResponseFuture =
            actionServiceAsync.getRequiresObject(
                ActionGetRequiresObjectParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .build()
            )

        val publicActionDefinitionRequiresObjectResponse =
            publicActionDefinitionRequiresObjectResponseFuture.get()
        publicActionDefinitionRequiresObjectResponse.validate()
    }
}
