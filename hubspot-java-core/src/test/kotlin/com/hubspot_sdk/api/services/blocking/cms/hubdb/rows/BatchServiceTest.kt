// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.hubdb.rows

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.hubdb.BatchInputHubDbTableRowBatchCloneRequest
import com.hubspot_sdk.api.models.cms.hubdb.BatchInputHubDbTableRowV3BatchUpdateRequest
import com.hubspot_sdk.api.models.cms.hubdb.BatchInputHubDbTableRowV3Request
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowBatchCloneRequest
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3BatchUpdateRequest
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3Request
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchCloneBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchCreateBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchGetBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchGetDraftBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchPurgeBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchReplaceBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.batch.BatchUpdateBatchParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BatchServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun cloneBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchService = client.cms().hubdb().rows().batch()

        val batchResponseHubDbTableRowV3 =
            batchService.cloneBatch(
                BatchCloneBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputHubDbTableRowBatchCloneRequest(
                        BatchInputHubDbTableRowBatchCloneRequest.builder()
                            .addInput(
                                HubDbTableRowBatchCloneRequest.builder()
                                    .id("id")
                                    .name("name")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchService = client.cms().hubdb().rows().batch()

        val batchResponseHubDbTableRowV3 =
            batchService.createBatch(
                BatchCreateBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputHubDbTableRowV3Request(
                        BatchInputHubDbTableRowV3Request.builder()
                            .addInput(
                                HubDbTableRowV3Request.builder()
                                    .childTableId(0L)
                                    .displayIndex(0)
                                    .values(
                                        HubDbTableRowV3Request.Values.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .name("name")
                                    .path("path")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchService = client.cms().hubdb().rows().batch()

        val batchResponseHubDbTableRowV3 =
            batchService.getBatch(
                BatchGetBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getDraftBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchService = client.cms().hubdb().rows().batch()

        val batchResponseHubDbTableRowV3 =
            batchService.getDraftBatch(
                BatchGetDraftBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun purgeBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchService = client.cms().hubdb().rows().batch()

        batchService.purgeBatch(
            BatchPurgeBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun replaceBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchService = client.cms().hubdb().rows().batch()

        val batchResponseHubDbTableRowV3 =
            batchService.replaceBatch(
                BatchReplaceBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputHubDbTableRowV3BatchUpdateRequest(
                        BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                            .addInput(
                                HubDbTableRowV3BatchUpdateRequest.builder()
                                    .childTableId(0)
                                    .displayIndex(0)
                                    .values(
                                        HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .id("id")
                                    .name("name")
                                    .path("path")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateBatch() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchService = client.cms().hubdb().rows().batch()

        val batchResponseHubDbTableRowV3 =
            batchService.updateBatch(
                BatchUpdateBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputHubDbTableRowV3BatchUpdateRequest(
                        BatchInputHubDbTableRowV3BatchUpdateRequest.builder()
                            .addInput(
                                HubDbTableRowV3BatchUpdateRequest.builder()
                                    .childTableId(0)
                                    .displayIndex(0)
                                    .values(
                                        HubDbTableRowV3BatchUpdateRequest.Values.builder()
                                            .putAdditionalProperty(
                                                "foo",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .id("id")
                                    .name("name")
                                    .path("path")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        batchResponseHubDbTableRowV3.validate()
    }
}
