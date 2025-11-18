// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.hubdb.rows

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
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
internal class BatchServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun cloneBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.cms().hubdb().rows().batch()

        val batchResponseHubDbTableRowV3Future =
            batchServiceAsync.cloneBatch(
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

        val batchResponseHubDbTableRowV3 = batchResponseHubDbTableRowV3Future.get()
        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun createBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.cms().hubdb().rows().batch()

        val batchResponseHubDbTableRowV3Future =
            batchServiceAsync.createBatch(
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

        val batchResponseHubDbTableRowV3 = batchResponseHubDbTableRowV3Future.get()
        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.cms().hubdb().rows().batch()

        val batchResponseHubDbTableRowV3Future =
            batchServiceAsync.getBatch(
                BatchGetBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseHubDbTableRowV3 = batchResponseHubDbTableRowV3Future.get()
        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getDraftBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.cms().hubdb().rows().batch()

        val batchResponseHubDbTableRowV3Future =
            batchServiceAsync.getDraftBatch(
                BatchGetDraftBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseHubDbTableRowV3 = batchResponseHubDbTableRowV3Future.get()
        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun purgeBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.cms().hubdb().rows().batch()

        val future =
            batchServiceAsync.purgeBatch(
                BatchPurgeBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun replaceBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.cms().hubdb().rows().batch()

        val batchResponseHubDbTableRowV3Future =
            batchServiceAsync.replaceBatch(
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

        val batchResponseHubDbTableRowV3 = batchResponseHubDbTableRowV3Future.get()
        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateBatch() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val batchServiceAsync = client.cms().hubdb().rows().batch()

        val batchResponseHubDbTableRowV3Future =
            batchServiceAsync.updateBatch(
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

        val batchResponseHubDbTableRowV3 = batchResponseHubDbTableRowV3Future.get()
        batchResponseHubDbTableRowV3.validate()
    }
}
