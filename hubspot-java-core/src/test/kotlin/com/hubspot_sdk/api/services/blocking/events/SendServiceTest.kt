// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.events

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.events.send.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.send.BehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.send.ExternalBehavioralEventPropertyCreate
import com.hubspot_sdk.api.models.events.send.ExternalBehavioralEventPropertyDefinitionPatch
import com.hubspot_sdk.api.models.events.send.ExternalBehavioralEventTypeDefinitionEgg
import com.hubspot_sdk.api.models.events.send.ExternalBehavioralEventTypeDefinitionPatch
import com.hubspot_sdk.api.models.events.send.ExternalObjectResolutionMappingRequest
import com.hubspot_sdk.api.models.events.send.ExternalPrimaryObjectResolutionRule
import com.hubspot_sdk.api.models.events.send.OptionInput
import com.hubspot_sdk.api.models.events.send.SendCreateEventDefinitionPropertyParams
import com.hubspot_sdk.api.models.events.send.SendDeleteEventDefinitionPropertyParams
import com.hubspot_sdk.api.models.events.send.SendUpdateEventDefinitionParams
import com.hubspot_sdk.api.models.events.send.SendUpdateEventDefinitionPropertyParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SendServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createEventDefinition() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendService = client.events().send()

        val externalBehavioralEventTypeDefinition =
            sendService.createEventDefinition(
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
    fun createEventDefinitionProperty() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendService = client.events().send()

        val property =
            sendService.createEventDefinitionProperty(
                SendCreateEventDefinitionPropertyParams.builder()
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
    fun deleteEventDefinition() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendService = client.events().send()

        sendService.deleteEventDefinition("eventName")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteEventDefinitionProperty() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendService = client.events().send()

        sendService.deleteEventDefinitionProperty(
            SendDeleteEventDefinitionPropertyParams.builder()
                .eventName("eventName")
                .propertyName("propertyName")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEventDefinition() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendService = client.events().send()

        val externalBehavioralEventTypeDefinition = sendService.getEventDefinition("eventName")

        externalBehavioralEventTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEventDefinitions() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendService = client.events().send()

        val page = sendService.listEventDefinitions()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendEvent() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendService = client.events().send()

        sendService.sendEvent(
            BehavioralEventHttpCompletionRequest.builder()
                .eventName("eventName")
                .properties(
                    BehavioralEventHttpCompletionRequest.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .email("email")
                .objectId("objectId")
                .occurredAt(OffsetDateTime.parse("2026-01-20T21:14:16.512Z"))
                .utk("utk")
                .uuid("uuid")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendEventBatch() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendService = client.events().send()

        sendService.sendEventBatch(
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
                        .occurredAt(OffsetDateTime.parse("2026-01-20T21:14:16.512Z"))
                        .utk("utk")
                        .uuid("uuid")
                        .build()
                )
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateEventDefinition() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendService = client.events().send()

        val externalBehavioralEventTypeDefinition =
            sendService.updateEventDefinition(
                SendUpdateEventDefinitionParams.builder()
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
    fun updateEventDefinitionProperty() {
        val client = HubspotOkHttpClient.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendService = client.events().send()

        val property =
            sendService.updateEventDefinitionProperty(
                SendUpdateEventDefinitionPropertyParams.builder()
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
