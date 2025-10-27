// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubSpotOkHttpClient
import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.PropertyCreate
import com.hubspot_sdk.api.models.crm.properties.PropertyCreateParams
import com.hubspot_sdk.api.models.crm.properties.PropertyDeleteParams
import com.hubspot_sdk.api.models.crm.properties.PropertyGetParams
import com.hubspot_sdk.api.models.crm.properties.PropertyListParams
import com.hubspot_sdk.api.models.crm.properties.PropertyUpdate
import com.hubspot_sdk.api.models.crm.properties.PropertyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PropertyServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val propertyService = client.crm().properties()

        val createdResponseProperty =
            propertyService.create(
                PropertyCreateParams.builder()
                    .objectType("objectType")
                    .propertyCreate(
                        PropertyCreate.builder()
                            .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                            .groupName("groupName")
                            .label("label")
                            .name("name")
                            .type(PropertyCreate.Type.BOOL)
                            .calculationFormula("calculationFormula")
                            .dataSensitivity(PropertyCreate.DataSensitivity.NON_SENSITIVE)
                            .description("description")
                            .displayOrder(0)
                            .externalOptions(true)
                            .formField(true)
                            .hasUniqueValue(true)
                            .hidden(true)
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(0)
                                    .hidden(true)
                                    .label("label")
                                    .value("value")
                                    .description("description")
                                    .build()
                            )
                            .referencedObjectType("referencedObjectType")
                            .build()
                    )
                    .build()
            )

        createdResponseProperty.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val propertyService = client.crm().properties()

        val property =
            propertyService.update(
                PropertyUpdateParams.builder()
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .propertyUpdate(
                        PropertyUpdate.builder()
                            .calculationFormula("calculationFormula")
                            .description("description")
                            .displayOrder(2)
                            .fieldType(PropertyUpdate.FieldType.SELECT)
                            .formField(true)
                            .groupName("contactinformation")
                            .hidden(false)
                            .label("My Contact Property")
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(1)
                                    .hidden(false)
                                    .label("Option A")
                                    .value("A")
                                    .description("Choice number one")
                                    .build()
                            )
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(2)
                                    .hidden(false)
                                    .label("Option B")
                                    .value("B")
                                    .description("Choice number two")
                                    .build()
                            )
                            .type(PropertyUpdate.Type.ENUMERATION)
                            .build()
                    )
                    .build()
            )

        property.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val propertyService = client.crm().properties()

        val collectionResponseProperty =
            propertyService.list(
                PropertyListParams.builder()
                    .objectType("objectType")
                    .archived(true)
                    .properties("properties")
                    .build()
            )

        collectionResponseProperty.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val propertyService = client.crm().properties()

        propertyService.delete(
            PropertyDeleteParams.builder()
                .objectType("objectType")
                .propertyName("propertyName")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val propertyService = client.crm().properties()

        val property =
            propertyService.get(
                PropertyGetParams.builder()
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .archived(true)
                    .properties("properties")
                    .build()
            )

        property.validate()
    }
}
