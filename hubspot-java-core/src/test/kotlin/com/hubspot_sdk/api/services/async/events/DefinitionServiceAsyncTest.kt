// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.events

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.events.BatchedBehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.BehavioralEventHttpCompletionRequest
import com.hubspot_sdk.api.models.events.definitions.DefinitionCreatePropertyParams
import com.hubspot_sdk.api.models.events.definitions.DefinitionDeletePropertyParams
import com.hubspot_sdk.api.models.events.definitions.DefinitionUpdateParams
import com.hubspot_sdk.api.models.events.definitions.DefinitionUpdatePropertyParams
import com.hubspot_sdk.api.models.events.definitions.ExternalBehavioralEventPropertyCreate
import com.hubspot_sdk.api.models.events.definitions.ExternalBehavioralEventPropertyDefinitionPatch
import com.hubspot_sdk.api.models.events.definitions.ExternalBehavioralEventTypeDefinitionEgg
import com.hubspot_sdk.api.models.events.definitions.ExternalBehavioralEventTypeDefinitionPatch
import com.hubspot_sdk.api.models.events.definitions.ExternalObjectResolutionMappingRequest
import com.hubspot_sdk.api.models.events.definitions.ExternalPrimaryObjectResolutionRule
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DefinitionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val definitionServiceAsync = client.events().definitions()

        val externalBehavioralEventTypeDefinitionFuture =
            definitionServiceAsync.create(
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
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val definitionServiceAsync = client.events().definitions()

        val externalBehavioralEventTypeDefinitionFuture =
            definitionServiceAsync.update(
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

        val externalBehavioralEventTypeDefinition =
            externalBehavioralEventTypeDefinitionFuture.get()
        externalBehavioralEventTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val definitionServiceAsync = client.events().definitions()

        val pageFuture = definitionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val definitionServiceAsync = client.events().definitions()

        val future = definitionServiceAsync.delete("eventName")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createProperty() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val definitionServiceAsync = client.events().definitions()

        val propertyFuture =
            definitionServiceAsync.createProperty(
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

        val property = propertyFuture.get()
        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteProperty() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val definitionServiceAsync = client.events().definitions()

        val future =
            definitionServiceAsync.deleteProperty(
                DefinitionDeletePropertyParams.builder()
                    .eventName("eventName")
                    .propertyName("propertyName")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val definitionServiceAsync = client.events().definitions()

        val externalBehavioralEventTypeDefinitionFuture = definitionServiceAsync.get("eventName")

        val externalBehavioralEventTypeDefinition =
            externalBehavioralEventTypeDefinitionFuture.get()
        externalBehavioralEventTypeDefinition.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val definitionServiceAsync = client.events().definitions()

        val future =
            definitionServiceAsync.sendBatch(
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

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateProperty() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val definitionServiceAsync = client.events().definitions()

        val propertyFuture =
            definitionServiceAsync.updateProperty(
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

        val property = propertyFuture.get()
        property.validate()
    }
}
