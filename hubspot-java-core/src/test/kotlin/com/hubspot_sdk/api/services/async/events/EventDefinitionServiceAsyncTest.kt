// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.events

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionCreatePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionDeletePropertyParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdateParams
import com.hubspot_sdk.api.models.events.eventdefinitions.EventDefinitionUpdatePropertyParams
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

        val eventDefinitionFuture =
            eventDefinitionServiceAsync.create(
                EventDefinitionCreateParams.builder()
                    .label("label")
                    .addPropertyDefinition(
                        EventDefinitionCreateParams.PropertyDefinition.builder()
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

        val eventDefinition = eventDefinitionFuture.get()
        eventDefinition.validate()
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

        val eventDefinitionFuture =
            eventDefinitionServiceAsync.update(
                EventDefinitionUpdateParams.builder()
                    .eventName("eventName")
                    .description("description")
                    .label("label")
                    .build()
            )

        val eventDefinition = eventDefinitionFuture.get()
        eventDefinition.validate()
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

        val eventDefinitionFuture = eventDefinitionServiceAsync.get("eventName")

        val eventDefinition = eventDefinitionFuture.get()
        eventDefinition.validate()
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

        val property = propertyFuture.get()
        property.validate()
    }
}
