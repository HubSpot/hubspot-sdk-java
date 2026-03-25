// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.events

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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

internal class SendServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createEventDefinition() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendServiceAsync = client.events().send()

        val externalBehavioralEventTypeDefinitionFuture =
            sendServiceAsync.createEventDefinition(
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

        val externalBehavioralEventTypeDefinition =
            externalBehavioralEventTypeDefinitionFuture.get()
        externalBehavioralEventTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createEventDefinitionProperty() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendServiceAsync = client.events().send()

        val propertyFuture =
            sendServiceAsync.createEventDefinitionProperty(
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

        val property = propertyFuture.get()
        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteEventDefinition() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendServiceAsync = client.events().send()

        val future = sendServiceAsync.deleteEventDefinition("eventName")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteEventDefinitionProperty() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendServiceAsync = client.events().send()

        val future =
            sendServiceAsync.deleteEventDefinitionProperty(
                SendDeleteEventDefinitionPropertyParams.builder()
                    .eventName("eventName")
                    .propertyName("propertyName")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getEventDefinition() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendServiceAsync = client.events().send()

        val externalBehavioralEventTypeDefinitionFuture =
            sendServiceAsync.getEventDefinition("eventName")

        val externalBehavioralEventTypeDefinition =
            externalBehavioralEventTypeDefinitionFuture.get()
        externalBehavioralEventTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listEventDefinitions() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendServiceAsync = client.events().send()

        val pageFuture = sendServiceAsync.listEventDefinitions()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendEvent() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendServiceAsync = client.events().send()

        val future =
            sendServiceAsync.sendEvent(
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

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendEventBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendServiceAsync = client.events().send()

        val future =
            sendServiceAsync.sendEventBatch(
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

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateEventDefinition() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendServiceAsync = client.events().send()

        val externalBehavioralEventTypeDefinitionFuture =
            sendServiceAsync.updateEventDefinition(
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

        val externalBehavioralEventTypeDefinition =
            externalBehavioralEventTypeDefinitionFuture.get()
        externalBehavioralEventTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateEventDefinitionProperty() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val sendServiceAsync = client.events().send()

        val propertyFuture =
            sendServiceAsync.updateEventDefinitionProperty(
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

        val property = propertyFuture.get()
        property.validate()
    }
}
