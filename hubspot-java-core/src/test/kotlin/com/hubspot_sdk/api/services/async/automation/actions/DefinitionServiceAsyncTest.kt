// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.automation.actions

import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.AutomationActionsOption
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
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionCreateParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionCreateRequiresObjectParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionGetParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionGetRequiresObjectParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DefinitionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val definitionServiceAsync = client.automation().actions().definitions()

        val publicActionDefinitionFuture =
            definitionServiceAsync.create(
                DefinitionCreateParams.builder()
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
                                                AutomationActionsOption.builder()
                                                    .description("description")
                                                    .displayOrder(0)
                                                    .doubleData(0.0)
                                                    .hidden(true)
                                                    .label("label")
                                                    .readOnly(true)
                                                    .value("value")
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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val definitionServiceAsync = client.automation().actions().definitions()

        val publicActionDefinitionFuture =
            definitionServiceAsync.update(
                DefinitionUpdateParams.builder()
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
                                                AutomationActionsOption.builder()
                                                    .description("description")
                                                    .displayOrder(0)
                                                    .doubleData(0.0)
                                                    .hidden(true)
                                                    .label("label")
                                                    .readOnly(true)
                                                    .value("value")
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
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val definitionServiceAsync = client.automation().actions().definitions()

        val pageFuture = definitionServiceAsync.list(0)

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val definitionServiceAsync = client.automation().actions().definitions()

        val future =
            definitionServiceAsync.delete(
                DefinitionDeleteParams.builder().appId(0).definitionId("definitionId").build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createRequiresObject() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val definitionServiceAsync = client.automation().actions().definitions()

        val future =
            definitionServiceAsync.createRequiresObject(
                DefinitionCreateRequiresObjectParams.builder()
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
    fun get() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val definitionServiceAsync = client.automation().actions().definitions()

        val publicActionDefinitionFuture =
            definitionServiceAsync.get(
                DefinitionGetParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .archived(true)
                    .build()
            )

        val publicActionDefinition = publicActionDefinitionFuture.get()
        publicActionDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getRequiresObject() {
        val client = HubSpotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val definitionServiceAsync = client.automation().actions().definitions()

        val publicActionDefinitionRequiresObjectResponseFuture =
            definitionServiceAsync.getRequiresObject(
                DefinitionGetRequiresObjectParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .build()
            )

        val publicActionDefinitionRequiresObjectResponse =
            publicActionDefinitionRequiresObjectResponseFuture.get()
        publicActionDefinitionRequiresObjectResponse.validate()
    }
}
