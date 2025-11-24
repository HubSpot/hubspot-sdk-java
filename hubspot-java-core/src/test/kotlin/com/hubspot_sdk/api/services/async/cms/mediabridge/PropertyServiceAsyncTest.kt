// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.models.BatchInputPropertyCreate
import com.hubspot_sdk.api.models.BatchInputPropertyName
import com.hubspot_sdk.api.models.BatchReadInputPropertyName
import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.PropertyCreate
import com.hubspot_sdk.api.models.PropertyName
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgePropertyUpdate
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyCreateBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyCreateParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyDeleteBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyDeleteParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyGetBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyGetParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyListParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyUpdateParams
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
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyServiceAsync = client.cms().mediaBridge().properties()

        val propertyFuture =
            propertyServiceAsync.create(
                PropertyCreateParams.builder()
                    .appId(0)
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

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyServiceAsync = client.cms().mediaBridge().properties()

        val propertyFuture =
            propertyServiceAsync.update(
                PropertyUpdateParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .mediaBridgePropertyUpdate(
                        MediaBridgePropertyUpdate.builder()
                            .calculationFormula("calculationFormula")
                            .description("description")
                            .displayOrder(0)
                            .fieldType(MediaBridgePropertyUpdate.FieldType.BOOLEANCHECKBOX)
                            .formField(true)
                            .groupName("groupName")
                            .hasUniqueValue(true)
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
                            .type(MediaBridgePropertyUpdate.Type.BOOL)
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
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyServiceAsync = client.cms().mediaBridge().properties()

        val collectionResponsePropertyNoPagingFuture =
            propertyServiceAsync.list(
                PropertyListParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .archived(true)
                    .properties("properties")
                    .build()
            )

        val collectionResponsePropertyNoPaging = collectionResponsePropertyNoPagingFuture.get()
        collectionResponsePropertyNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyServiceAsync = client.cms().mediaBridge().properties()

        val future =
            propertyServiceAsync.delete(
                PropertyDeleteParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyServiceAsync = client.cms().mediaBridge().properties()

        val batchResponsePropertyFuture =
            propertyServiceAsync.createBatch(
                PropertyCreateBatchParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .batchInputPropertyCreate(
                        BatchInputPropertyCreate.builder()
                            .addInput(
                                PropertyCreate.builder()
                                    .fieldType(PropertyCreate.FieldType.BOOLEANCHECKBOX)
                                    .groupName("groupName")
                                    .label("label")
                                    .name("name")
                                    .type(PropertyCreate.Type.BOOL)
                                    .calculationFormula("calculationFormula")
                                    .dataSensitivity(
                                        PropertyCreate.DataSensitivity.HIGHLY_SENSITIVE
                                    )
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
                    .build()
            )

        val batchResponseProperty = batchResponsePropertyFuture.get()
        batchResponseProperty.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyServiceAsync = client.cms().mediaBridge().properties()

        val future =
            propertyServiceAsync.deleteBatch(
                PropertyDeleteBatchParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .batchInputPropertyName(
                        BatchInputPropertyName.builder()
                            .addInput(PropertyName.builder().name("name").build())
                            .build()
                    )
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
        val propertyServiceAsync = client.cms().mediaBridge().properties()

        val propertyFuture =
            propertyServiceAsync.get(
                PropertyGetParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .archived(true)
                    .properties("properties")
                    .build()
            )

        val property = propertyFuture.get()
        property.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyServiceAsync = client.cms().mediaBridge().properties()

        val batchResponsePropertyFuture =
            propertyServiceAsync.getBatch(
                PropertyGetBatchParams.builder()
                    .appId(0)
                    .objectType("objectType")
                    .batchReadInputPropertyName(
                        BatchReadInputPropertyName.builder()
                            .archived(true)
                            .dataSensitivity(
                                BatchReadInputPropertyName.DataSensitivity.HIGHLY_SENSITIVE
                            )
                            .addInput(PropertyName.builder().name("name").build())
                            .build()
                    )
                    .build()
            )

        val batchResponseProperty = batchResponsePropertyFuture.get()
        batchResponseProperty.validate()
    }
}
