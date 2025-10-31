// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.events

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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
internal class EventDefinitionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val eventDefinitionService = client.events().eventDefinitions()

        val eventDefinition =
            eventDefinitionService.create(
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

        eventDefinition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val eventDefinitionService = client.events().eventDefinitions()

        val eventDefinition =
            eventDefinitionService.update(
                EventDefinitionUpdateParams.builder()
                    .eventName("eventName")
                    .description("description")
                    .label("label")
                    .build()
            )

        eventDefinition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val eventDefinitionService = client.events().eventDefinitions()

        val page = eventDefinitionService.list()

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
        val eventDefinitionService = client.events().eventDefinitions()

        eventDefinitionService.delete("eventName")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createProperty() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val eventDefinitionService = client.events().eventDefinitions()

        val property =
            eventDefinitionService.createProperty(
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

        property.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteProperty() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val eventDefinitionService = client.events().eventDefinitions()

        eventDefinitionService.deleteProperty(
            EventDefinitionDeletePropertyParams.builder()
                .eventName("eventName")
                .propertyName("propertyName")
                .build()
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
        val eventDefinitionService = client.events().eventDefinitions()

        val eventDefinition = eventDefinitionService.get("eventName")

        eventDefinition.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateProperty() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val eventDefinitionService = client.events().eventDefinitions()

        val property =
            eventDefinitionService.updateProperty(
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

        property.validate()
    }
}
