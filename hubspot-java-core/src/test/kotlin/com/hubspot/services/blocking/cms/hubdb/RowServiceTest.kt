// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms.hubdb

import com.hubspot.client.okhttp.HubSpotOkHttpClient
import com.hubspot.core.JsonValue
import com.hubspot.models.BatchInputString
import com.hubspot.models.cms.hubdb.BatchInputHubDbTableRowBatchCloneRequest
import com.hubspot.models.cms.hubdb.BatchInputHubDbTableRowV3BatchUpdateRequest
import com.hubspot.models.cms.hubdb.BatchInputHubDbTableRowV3Request
import com.hubspot.models.cms.hubdb.HubDbTableRowBatchCloneRequest
import com.hubspot.models.cms.hubdb.HubDbTableRowV3BatchUpdateRequest
import com.hubspot.models.cms.hubdb.HubDbTableRowV3Request
import com.hubspot.models.cms.hubdb.rows.RowCloneBatchParams
import com.hubspot.models.cms.hubdb.rows.RowCloneDraftParams
import com.hubspot.models.cms.hubdb.rows.RowCreateBatchParams
import com.hubspot.models.cms.hubdb.rows.RowCreateParams
import com.hubspot.models.cms.hubdb.rows.RowDeleteDraftParams
import com.hubspot.models.cms.hubdb.rows.RowGetBatchParams
import com.hubspot.models.cms.hubdb.rows.RowGetDraftBatchParams
import com.hubspot.models.cms.hubdb.rows.RowGetDraftParams
import com.hubspot.models.cms.hubdb.rows.RowGetParams
import com.hubspot.models.cms.hubdb.rows.RowListParams
import com.hubspot.models.cms.hubdb.rows.RowPurgeBatchParams
import com.hubspot.models.cms.hubdb.rows.RowReplaceBatchParams
import com.hubspot.models.cms.hubdb.rows.RowReplaceDraftParams
import com.hubspot.models.cms.hubdb.rows.RowUpdateBatchParams
import com.hubspot.models.cms.hubdb.rows.RowUpdateDraftParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RowServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val hubDbTableRowV3 =
            rowService.create(
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

        hubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val unifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            rowService.list(
                RowListParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .after("after")
                    .archived(true)
                    .limit(0)
                    .offset(0)
                    .addProperty("string")
                    .addSort("string")
                    .build()
            )

        unifiedCollectionResponseWithTotalBaseHubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cloneBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val batchResponseHubDbTableRowV3 =
            rowService.cloneBatch(
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

        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cloneDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val hubDbTableRowV3 =
            rowService.cloneDraft(
                RowCloneDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .rowId("321669910225")
                    .name("name")
                    .build()
            )

        hubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun createBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val batchResponseHubDbTableRowV3 =
            rowService.createBatch(
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

        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        rowService.deleteDraft(
            RowDeleteDraftParams.builder()
                .tableIdOrName("tableIdOrName")
                .rowId("321669910225")
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val hubDbTableRowV3 =
            rowService.get(
                RowGetParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .rowId("321669910225")
                    .archived(true)
                    .build()
            )

        hubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val batchResponseHubDbTableRowV3 =
            rowService.getBatch(
                RowGetBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val hubDbTableRowV3 =
            rowService.getDraft(
                RowGetDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .rowId("321669910225")
                    .archived(true)
                    .build()
            )

        hubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDraftBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val batchResponseHubDbTableRowV3 =
            rowService.getDraftBatch(
                RowGetDraftBatchParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .batchInputString(BatchInputString.builder().addInput("string").build())
                    .build()
            )

        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun purgeBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        rowService.purgeBatch(
            RowPurgeBatchParams.builder()
                .tableIdOrName("tableIdOrName")
                .batchInputString(BatchInputString.builder().addInput("string").build())
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replaceBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val batchResponseHubDbTableRowV3 =
            rowService.replaceBatch(
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

        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replaceDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val hubDbTableRowV3 =
            rowService.replaceDraft(
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

        hubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateBatch() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val batchResponseHubDbTableRowV3 =
            rowService.updateBatch(
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

        batchResponseHubDbTableRowV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val rowService = client.cms().hubdb().rows()

        val hubDbTableRowV3 =
            rowService.updateDraft(
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

        hubDbTableRowV3.validate()
    }
}
