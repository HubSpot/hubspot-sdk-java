// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.events

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreatePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionDeletePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdatePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.ExternalBehavioralEventPropertyCreate
import com.hubspot_sdk.api.models.events.eventdefinitions.ExternalBehavioralEventPropertyDefinitionPatch
import com.hubspot_sdk.api.models.events.eventdefinitions.ExternalBehavioralEventTypeDefinitionEgg
import com.hubspot_sdk.api.models.events.eventdefinitions.ExternalBehavioralEventTypeDefinitionPatch
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventDefinitionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventDefinitionServiceAsync = client.events().eventDefinitions()

        val externalBehavioralEventTypeDefinitionFuture =
            eventDefinitionServiceAsync.create(
                ExternalBehavioralEventTypeDefinitionEgg.builder()
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
                    .description("description")
                    .name("name")
                    .primaryObject("primaryObject")
                    .build()
            )

        val externalBehavioralEventTypeDefinition =
            externalBehavioralEventTypeDefinitionFuture.get()
        externalBehavioralEventTypeDefinition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventDefinitionServiceAsync = client.events().eventDefinitions()

        val externalBehavioralEventTypeDefinitionFuture =
            eventDefinitionServiceAsync.update(
                EventDefinitionUpdateParams.builder()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventDefinitionServiceAsync = client.events().eventDefinitions()

        val pageFuture = eventDefinitionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventDefinitionServiceAsync = client.events().eventDefinitions()

        val future = eventDefinitionServiceAsync.delete("eventName")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createProperty() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventDefinitionServiceAsync = client.events().eventDefinitions()

        val propertyFuture =
            eventDefinitionServiceAsync.createProperty(
                EventDefinitionCreatePropertyParams.builder()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteProperty() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventDefinitionServiceAsync = client.events().eventDefinitions()

        val future =
            eventDefinitionServiceAsync.deleteProperty(
                EventDefinitionDeletePropertyParams.builder()
                    .eventName("eventName")
                    .propertyName("propertyName")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventDefinitionServiceAsync = client.events().eventDefinitions()

        val externalBehavioralEventTypeDefinitionFuture =
            eventDefinitionServiceAsync.get("eventName")

        val externalBehavioralEventTypeDefinition =
            externalBehavioralEventTypeDefinitionFuture.get()
        externalBehavioralEventTypeDefinition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateProperty() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val eventDefinitionServiceAsync = client.events().eventDefinitions()

        val propertyFuture =
            eventDefinitionServiceAsync.updateProperty(
                EventDefinitionUpdatePropertyParams.builder()
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
