// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
internal class PropertyServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val propertyServiceAsync = client.crm().properties()

        val createdResponsePropertyFuture =
            propertyServiceAsync.create(
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

        val createdResponseProperty = createdResponsePropertyFuture.get()
        createdResponseProperty.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val propertyServiceAsync = client.crm().properties()

        val propertyFuture =
            propertyServiceAsync.update(
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

        val property = propertyFuture.get()
        property.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val propertyServiceAsync = client.crm().properties()

        val collectionResponsePropertyFuture =
            propertyServiceAsync.list(
                PropertyListParams.builder()
                    .objectType("objectType")
                    .archived(true)
                    .properties("properties")
                    .build()
            )

        val collectionResponseProperty = collectionResponsePropertyFuture.get()
        collectionResponseProperty.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val propertyServiceAsync = client.crm().properties()

        val future =
            propertyServiceAsync.delete(
                PropertyDeleteParams.builder()
                    .objectType("objectType")
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
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val propertyServiceAsync = client.crm().properties()

        val propertyFuture =
            propertyServiceAsync.get(
                PropertyGetParams.builder()
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .archived(true)
                    .properties("properties")
                    .build()
            )

        val property = propertyFuture.get()
        property.validate()
    }
}
