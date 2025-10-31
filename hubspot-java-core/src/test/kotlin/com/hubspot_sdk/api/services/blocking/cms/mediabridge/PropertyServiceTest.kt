// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.models.BatchInputPropertyCreate
import com.hubspot_sdk.api.models.BatchInputPropertyName
import com.hubspot_sdk.api.models.OptionInput
import com.hubspot_sdk.api.models.PropertyCreate
import com.hubspot_sdk.api.models.PropertyName
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgePropertyUpdate
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyArchiveBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyCreateBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyCreateParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyDeleteParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyGetBatchParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyGetParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyListParams
import com.hubspot_sdk.api.models.cms.mediabridge.properties.PropertyUpdateParams
import com.hubspot_sdk.api.models.crm.properties.BatchReadInputPropertyName
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PropertyServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyService = client.cms().mediaBridge().properties()

        val property =
            propertyService.create(
                PropertyCreateParams.builder()
                    .appId("appId")
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

        property.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyService = client.cms().mediaBridge().properties()

        val property =
            propertyService.update(
                PropertyUpdateParams.builder()
                    .appId("appId")
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

        property.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyService = client.cms().mediaBridge().properties()

        val collectionResponsePropertyNoPaging =
            propertyService.list(
                PropertyListParams.builder().appId("appId").objectType("objectType").build()
            )

        collectionResponsePropertyNoPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyService = client.cms().mediaBridge().properties()

        propertyService.delete(
            PropertyDeleteParams.builder()
                .appId("appId")
                .objectType("objectType")
                .propertyName("propertyName")
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun archiveBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyService = client.cms().mediaBridge().properties()

        propertyService.archiveBatch(
            PropertyArchiveBatchParams.builder()
                .appId("appId")
                .objectType("objectType")
                .batchInputPropertyName(
                    BatchInputPropertyName.builder()
                        .addInput(PropertyName.builder().name("name").build())
                        .build()
                )
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyService = client.cms().mediaBridge().properties()

        val batchResponseProperty =
            propertyService.createBatch(
                PropertyCreateBatchParams.builder()
                    .appId("appId")
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
                    .build()
            )

        batchResponseProperty.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyService = client.cms().mediaBridge().properties()

        val property =
            propertyService.get(
                PropertyGetParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .propertyName("propertyName")
                    .build()
            )

        property.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val propertyService = client.cms().mediaBridge().properties()

        val batchResponseProperty =
            propertyService.getBatch(
                PropertyGetBatchParams.builder()
                    .appId("appId")
                    .objectType("objectType")
                    .batchReadInputPropertyName(
                        BatchReadInputPropertyName.builder()
                            .archived(true)
                            .addInput(PropertyName.builder().name("name").build())
                            .dataSensitivity(
                                BatchReadInputPropertyName.DataSensitivity.NON_SENSITIVE
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseProperty.validate()
    }
}
