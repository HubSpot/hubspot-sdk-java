// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.automation.actions

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.Option
import com.hubspot_sdk.api.models.automation.actions.FieldTypeDefinition
import com.hubspot_sdk.api.models.automation.actions.InputFieldDefinition
import com.hubspot_sdk.api.models.automation.actions.OutputFieldDefinition
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinitionEgg
import com.hubspot_sdk.api.models.automation.actions.PublicActionDefinitionPatch
import com.hubspot_sdk.api.models.automation.actions.PublicActionFunction
import com.hubspot_sdk.api.models.automation.actions.PublicExecutionTranslationRule
import com.hubspot_sdk.api.models.automation.actions.PublicObjectRequestOptions
import com.hubspot_sdk.api.models.automation.actions.PublicSingleFieldDependency
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionCreateParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionDeleteParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionGetParams
import com.hubspot_sdk.api.models.automation.actions.definitions.DefinitionUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DefinitionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionService = client.automation().actions().definitions()

        val publicActionDefinition =
            definitionService.create(
                DefinitionCreateParams.builder()
                    .appId(0)
                    .publicActionDefinitionEgg(
                        PublicActionDefinitionEgg.builder()
                            .actionUrl("actionUrl")
                            .addFunction(
                                PublicActionFunction.builder()
                                    .functionSource("functionSource")
                                    .functionType(
                                        PublicActionFunction.FunctionType.PRE_ACTION_EXECUTION
                                    )
                                    .id("id")
                                    .build()
                            )
                            .addInputField(
                                InputFieldDefinition.builder()
                                    .isRequired(true)
                                    .typeDefinition(
                                        FieldTypeDefinition.builder()
                                            .externalOptions(true)
                                            .name("name")
                                            .addOption(
                                                Option.builder()
                                                    .description("")
                                                    .displayOrder(0)
                                                    .doubleData(0.0)
                                                    .hidden(false)
                                                    .label("")
                                                    .readOnly(false)
                                                    .value("")
                                                    .build()
                                            )
                                            .type(FieldTypeDefinition.Type.STRING)
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
                                                FieldTypeDefinition.ReferencedObjectType.CONTACT
                                            )
                                            .build()
                                    )
                                    .automationFieldType("automationFieldType")
                                    .addSupportedValueType(
                                        InputFieldDefinition.SupportedValueType.STATIC_VALUE
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
                                                    .description("")
                                                    .displayOrder(0)
                                                    .doubleData(0.0)
                                                    .hidden(false)
                                                    .label("")
                                                    .readOnly(false)
                                                    .value("")
                                                    .build()
                                            )
                                            .type(FieldTypeDefinition.Type.STRING)
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
                                                FieldTypeDefinition.ReferencedObjectType.CONTACT
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        publicActionDefinition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionService = client.automation().actions().definitions()

        val publicActionDefinition =
            definitionService.update(
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
                                InputFieldDefinition.builder()
                                    .isRequired(true)
                                    .typeDefinition(
                                        FieldTypeDefinition.builder()
                                            .externalOptions(true)
                                            .name("name")
                                            .addOption(
                                                Option.builder()
                                                    .description("")
                                                    .displayOrder(0)
                                                    .doubleData(0.0)
                                                    .hidden(false)
                                                    .label("")
                                                    .readOnly(false)
                                                    .value("")
                                                    .build()
                                            )
                                            .type(FieldTypeDefinition.Type.STRING)
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
                                                FieldTypeDefinition.ReferencedObjectType.CONTACT
                                            )
                                            .build()
                                    )
                                    .automationFieldType("automationFieldType")
                                    .addSupportedValueType(
                                        InputFieldDefinition.SupportedValueType.STATIC_VALUE
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
                                                    .description("")
                                                    .displayOrder(0)
                                                    .doubleData(0.0)
                                                    .hidden(false)
                                                    .label("")
                                                    .readOnly(false)
                                                    .value("")
                                                    .build()
                                            )
                                            .type(FieldTypeDefinition.Type.STRING)
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
                                                FieldTypeDefinition.ReferencedObjectType.CONTACT
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

        publicActionDefinition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionService = client.automation().actions().definitions()

        val page = definitionService.list(0)

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionService = client.automation().actions().definitions()

        definitionService.delete(
            DefinitionDeleteParams.builder().appId(0).definitionId("definitionId").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val definitionService = client.automation().actions().definitions()

        val publicActionDefinition =
            definitionService.get(
                DefinitionGetParams.builder()
                    .appId(0)
                    .definitionId("definitionId")
                    .archived(true)
                    .build()
            )

        publicActionDefinition.validate()
    }
}
