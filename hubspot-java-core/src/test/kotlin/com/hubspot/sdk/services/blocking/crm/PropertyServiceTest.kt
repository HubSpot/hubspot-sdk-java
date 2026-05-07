// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm

import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.models.OptionInput
import com.hubspot.sdk.models.PropertyCreate
import com.hubspot.sdk.models.crm.properties.PropertyCreateParams
import com.hubspot.sdk.models.crm.properties.PropertyDeleteParams
import com.hubspot.sdk.models.crm.properties.PropertyGetParams
import com.hubspot.sdk.models.crm.properties.PropertyListParams
import com.hubspot.sdk.models.crm.properties.PropertyUpdate
import com.hubspot.sdk.models.crm.properties.PropertyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PropertyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val propertyService = client.crm().properties()

        val property =
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
                            .currencyPropertyName("currencyPropertyName")
                            .dataSensitivity(PropertyCreate.DataSensitivity.HIGHLY_SENSITIVE)
                            .description("description")
                            .displayOrder(0)
                            .externalOptions(true)
                            .formField(true)
                            .hasUniqueValue(true)
                            .hidden(true)
                            .numberDisplayHint(PropertyCreate.NumberDisplayHint.CURRENCY)
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
                            .showCurrencySymbol(true)
                            .build()
                    )
                    .build()
            )

        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val propertyService = client.crm().properties()

        val property =
            propertyService.update(
                PropertyUpdateParams.builder()
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .propertyUpdate(
                        PropertyUpdate.builder()
                            .calculationFormula("calculationFormula")
                            .currencyPropertyName("currencyPropertyName")
                            .description("description")
                            .displayOrder(0)
                            .fieldType(PropertyUpdate.FieldType.BOOLEANCHECKBOX)
                            .formField(true)
                            .groupName("groupName")
                            .hidden(true)
                            .label("label")
                            .numberDisplayHint(PropertyUpdate.NumberDisplayHint.CURRENCY)
                            .addOption(
                                OptionInput.builder()
                                    .displayOrder(0)
                                    .hidden(true)
                                    .label("label")
                                    .value("value")
                                    .description("description")
                                    .build()
                            )
                            .showCurrencySymbol(true)
                            .type(PropertyUpdate.Type.BOOL)
                            .build()
                    )
                    .build()
            )

        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val propertyService = client.crm().properties()

        val collectionResponsePropertyNoPaging =
            propertyService.list(
                PropertyListParams.builder()
                    .objectType("objectType")
                    .archived(true)
                    .dataSensitivity(PropertyListParams.DataSensitivity.HIGHLY_SENSITIVE)
                    .locale("locale")
                    .properties("properties")
                    .build()
            )

        collectionResponsePropertyNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val propertyService = client.crm().properties()

        propertyService.delete(
            PropertyDeleteParams.builder()
                .objectType("objectType")
                .propertyName("propertyName")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val propertyService = client.crm().properties()

        val property =
            propertyService.get(
                PropertyGetParams.builder()
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .archived(true)
                    .dataSensitivity(PropertyGetParams.DataSensitivity.HIGHLY_SENSITIVE)
                    .locale("locale")
                    .properties("properties")
                    .build()
            )

        property.validate()
    }
}
