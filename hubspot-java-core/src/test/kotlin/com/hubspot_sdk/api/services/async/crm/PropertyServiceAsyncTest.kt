// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

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

internal class PropertyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val propertyServiceAsync = client.crm().properties()

        val propertyFuture =
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
                            .dataSensitivity(PropertyCreate.DataSensitivity.HIGHLY_SENSITIVE)
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

        val property = propertyFuture.get()
        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
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
                            .displayOrder(0)
                            .fieldType(PropertyUpdate.FieldType.BOOLEANCHECKBOX)
                            .formField(true)
                            .groupName("groupName")
                            .hidden(true)
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
                            .type(PropertyUpdate.Type.BOOL)
                            .build()
                    )
                    .build()
            )

        val property = propertyFuture.get()
        property.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val propertyServiceAsync = client.crm().properties()

        val collectionResponsePropertyNoPagingFuture =
            propertyServiceAsync.list(
                PropertyListParams.builder()
                    .objectType("objectType")
                    .archived(true)
                    .dataSensitivity(PropertyListParams.DataSensitivity.HIGHLY_SENSITIVE)
                    .locale("locale")
                    .properties("properties")
                    .build()
            )

        val collectionResponsePropertyNoPaging = collectionResponsePropertyNoPagingFuture.get()
        collectionResponsePropertyNoPaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("pat-na1-xxxxxxxx-xxxx").build()
        val propertyServiceAsync = client.crm().properties()

        val propertyFuture =
            propertyServiceAsync.get(
                PropertyGetParams.builder()
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .archived(true)
                    .dataSensitivity(PropertyGetParams.DataSensitivity.HIGHLY_SENSITIVE)
                    .locale("locale")
                    .properties("properties")
                    .build()
            )

        val property = propertyFuture.get()
        property.validate()
    }
}
