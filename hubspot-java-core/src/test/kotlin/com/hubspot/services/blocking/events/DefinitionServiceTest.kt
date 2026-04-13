// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.events

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.core.JsonValue
import com.hubspot.models.OptionInput
import com.hubspot.models.events.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot.models.events.BehavioralEventHttpCompletionRequest
import com.hubspot.models.events.definitions.DefinitionCreatePropertyParams
import com.hubspot.models.events.definitions.DefinitionDeletePropertyParams
import com.hubspot.models.events.definitions.DefinitionUpdateParams
import com.hubspot.models.events.definitions.DefinitionUpdatePropertyParams
import com.hubspot.models.events.definitions.ExternalBehavioralEventPropertyCreate
import com.hubspot.models.events.definitions.ExternalBehavioralEventPropertyDefinitionPatch
import com.hubspot.models.events.definitions.ExternalBehavioralEventTypeDefinitionEgg
import com.hubspot.models.events.definitions.ExternalBehavioralEventTypeDefinitionPatch
import com.hubspot.models.events.definitions.ExternalObjectResolutionMappingRequest
import com.hubspot.models.events.definitions.ExternalPrimaryObjectResolutionRule
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DefinitionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val definitionService = client.events().definitions()

        val externalBehavioralEventTypeDefinition =
            definitionService.create(
                ExternalBehavioralEventTypeDefinitionEgg.builder()
                    .includeDefaultProperties(true)
                    .label("label")
                    .addPropertyDefinition(
                        ExternalBehavioralEventPropertyCreate.builder()
                            .label("label")
                            .type("type")
                            .description("description")
                            .name("name")
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(0)
                                    .hidden(true)
                                    .label("label")
                                    .value("value")
                                    .description("description")
                                    .build()
                            )
                            .build()
                    )
                    .customMatchingId(
                        ExternalObjectResolutionMappingRequest.builder()
                            .primaryObjectRule(
                                ExternalPrimaryObjectResolutionRule.builder()
                                    .eventPropertyName("eventPropertyName")
                                    .targetObjectPropertyName("targetObjectPropertyName")
                                    .build()
                            )
                            .build()
                    )
                    .description("description")
                    .name("name")
                    .primaryObject("primaryObject")
                    .build()
            )

        externalBehavioralEventTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val definitionService = client.events().definitions()

        val externalBehavioralEventTypeDefinition =
            definitionService.update(
                DefinitionUpdateParams.builder()
                    .eventName("eventName")
                    .externalBehavioralEventTypeDefinitionPatch(
                        ExternalBehavioralEventTypeDefinitionPatch.builder()
                            .description("description")
                            .label("label")
                            .build()
                    )
                    .build()
            )

        externalBehavioralEventTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val definitionService = client.events().definitions()

        val page = definitionService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val definitionService = client.events().definitions()

        definitionService.delete("eventName")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createProperty() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val definitionService = client.events().definitions()

        val property =
            definitionService.createProperty(
                DefinitionCreatePropertyParams.builder()
                    .eventName("eventName")
                    .externalBehavioralEventPropertyCreate(
                        ExternalBehavioralEventPropertyCreate.builder()
                            .label("label")
                            .type("type")
                            .description("description")
                            .name("name")
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(0)
                                    .hidden(true)
                                    .label("label")
                                    .value("value")
                                    .description("description")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteProperty() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val definitionService = client.events().definitions()

        definitionService.deleteProperty(
            DefinitionDeletePropertyParams.builder()
                .eventName("eventName")
                .propertyName("propertyName")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val definitionService = client.events().definitions()

        val externalBehavioralEventTypeDefinition = definitionService.get("eventName")

        externalBehavioralEventTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val definitionService = client.events().definitions()

        definitionService.sendBatch(
            BatchedBehavioralEventHttpCompletionRequest.builder()
                .addInput(
                    BehavioralEventHttpCompletionRequest.builder()
                        .eventName("eventName")
                        .properties(
                            BehavioralEventHttpCompletionRequest.Properties.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .email("email")
                        .objectId("objectId")
                        .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .utk("utk")
                        .uuid("uuid")
                        .build()
                )
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateProperty() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val definitionService = client.events().definitions()

        val property =
            definitionService.updateProperty(
                DefinitionUpdatePropertyParams.builder()
                    .eventName("eventName")
                    .propertyName("propertyName")
                    .externalBehavioralEventPropertyDefinitionPatch(
                        ExternalBehavioralEventPropertyDefinitionPatch.builder()
                            .description("description")
                            .label("label")
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(0)
                                    .hidden(true)
                                    .label("label")
                                    .value("value")
                                    .description("description")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        property.validate()
    }
}
