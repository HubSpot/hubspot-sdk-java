// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.hubdb

import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableRowV3Request
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCloneDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowCreateParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowDeleteDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowGetParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowListDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowReplaceDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.rows.RowUpdateDraftParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RowServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val hubDbTableRowV3Future =
            rowServiceAsync.create(
                RowCreateParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .hubDbTableRowV3Request(
                        HubDbTableRowV3Request.builder()
                            .values(
                                HubDbTableRowV3Request.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .childTableId(0L)
                            .displayIndex(0)
                            .name("name")
                            .path("path")
                            .build()
                    )
                    .build()
            )

        val hubDbTableRowV3 = hubDbTableRowV3Future.get()
        hubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val pageFuture = rowServiceAsync.list("tableIdOrName")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cloneDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun getDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun listDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val unifiedCollectionResponseWithTotalBaseHubDbTableRowV3Future =
            rowServiceAsync.listDraft(
                RowListDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .after("after")
                    .archived(true)
                    .limit(0)
                    .offset(0)
                    .addProperty("string")
                    .addSort("string")
                    .build()
            )

        val unifiedCollectionResponseWithTotalBaseHubDbTableRowV3 =
            unifiedCollectionResponseWithTotalBaseHubDbTableRowV3Future.get()
        unifiedCollectionResponseWithTotalBaseHubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun replaceDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val hubDbTableRowV3Future =
            rowServiceAsync.replaceDraft(
                RowReplaceDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .rowId("321669910225")
                    .hubDbTableRowV3Request(
                        HubDbTableRowV3Request.builder()
                            .values(
                                HubDbTableRowV3Request.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .childTableId(0L)
                            .displayIndex(0)
                            .name("name")
                            .path("path")
                            .build()
                    )
                    .build()
            )

        val hubDbTableRowV3 = hubDbTableRowV3Future.get()
        hubDbTableRowV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val rowServiceAsync = client.cms().hubdb().rows()

        val hubDbTableRowV3Future =
            rowServiceAsync.updateDraft(
                RowUpdateDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .rowId("321669910225")
                    .hubDbTableRowV3Request(
                        HubDbTableRowV3Request.builder()
                            .values(
                                HubDbTableRowV3Request.Values.builder()
                                    .putAdditionalProperty(
                                        "foo",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .childTableId(0L)
                            .displayIndex(0)
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
