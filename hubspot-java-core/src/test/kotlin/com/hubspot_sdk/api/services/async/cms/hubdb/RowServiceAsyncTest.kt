// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.hubdb

import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.hubdb.BatchInputHubDbTableRowBatchCloneRequest
import com.hubspot_sdk.api.models.cms.hubdb.BatchInputHubDbTableRowV3BatchUpdateRequest
import com.hubspot_sdk.api.models.cms.hubdb.BatchInputHubDbTableRowV3Request
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowBatchCloneRequest
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3BatchUpdateRequest
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3Request
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCloneBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCloneDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCreateBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCreateParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowDeleteDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetDraftBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowPurgeBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowReplaceBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowReplaceDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowUpdateBatchParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowUpdateDraftParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RowServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val hubDbTableRowV3Future =
            rowServiceAsync.create(
                RowCreateParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .hubDbTableRowV3Request(
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

        val hubDbTableRowV3 = hubDbTableRowV3Future.get()
        hubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val pageFuture = rowServiceAsync.list("tableIdOrName")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cloneBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val batchResponseHubDbTableRowV3Future =
            rowServiceAsync.cloneBatch(
                RowCloneBatchParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun cloneDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val hubDbTableRowV3Future =
            rowServiceAsync.cloneDraft(
                RowCloneDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .rowId("321669910225")
                    .name("name")
                    .build()
            )

        val hubDbTableRowV3 = hubDbTableRowV3Future.get()
        hubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val batchResponseHubDbTableRowV3Future =
            rowServiceAsync.createBatch(
                RowCreateBatchParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val future =
            rowServiceAsync.deleteDraft(
                RowDeleteDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .rowId("321669910225")
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val hubDbTableRowV3Future =
            rowServiceAsync.get(
                RowGetParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .rowId("321669910225")
                    .archived(true)
                    .build()
            )

        val hubDbTableRowV3 = hubDbTableRowV3Future.get()
        hubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val batchResponseHubDbTableRowV3Future =
            rowServiceAsync.getBatch(
                RowGetBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseHubDbTableRowV3 = batchResponseHubDbTableRowV3Future.get()
        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val hubDbTableRowV3Future =
            rowServiceAsync.getDraft(
                RowGetDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .rowId("321669910225")
                    .archived(true)
                    .build()
            )

        val hubDbTableRowV3 = hubDbTableRowV3Future.get()
        hubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDraftBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val batchResponseHubDbTableRowV3Future =
            rowServiceAsync.getDraftBatch(
                RowGetDraftBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val batchResponseHubDbTableRowV3 = batchResponseHubDbTableRowV3Future.get()
        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun purgeBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val future =
            rowServiceAsync.purgeBatch(
                RowPurgeBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replaceBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val batchResponseHubDbTableRowV3Future =
            rowServiceAsync.replaceBatch(
                RowReplaceBatchParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun replaceDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val hubDbTableRowV3Future =
            rowServiceAsync.replaceDraft(
                RowReplaceDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .rowId("321669910225")
                    .hubDbTableRowV3Request(
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

        val hubDbTableRowV3 = hubDbTableRowV3Future.get()
        hubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateBatch() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val batchResponseHubDbTableRowV3Future =
            rowServiceAsync.updateBatch(
                RowUpdateBatchParams.builder()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateDraft() {
        val client = HubspotOkHttpClientAsync.builder().accessToken("My Access Token").build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val hubDbTableRowV3Future =
            rowServiceAsync.updateDraft(
                RowUpdateDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .rowId("321669910225")
                    .hubDbTableRowV3Request(
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

        val hubDbTableRowV3 = hubDbTableRowV3Future.get()
        hubDbTableRowV3.validate()
    }
}
