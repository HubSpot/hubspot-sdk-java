// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.hubdb

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClientAsync
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.Option
import com.hubspot_sdk.api.models.cms.hubdb.ColumnRequest
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableCloneRequest
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableV3Request
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableCloneDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableDeleteVersionParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableExportDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableExportParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableGetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableGetParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableImportDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableListDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TablePublishDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableResetDraftParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableUnpublishParams
import com.hubspot_sdk.api.models.cms.hubdb.tables.TableUpdateDraftParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.parallel.ResourceLock

@ExtendWith(TestServerExtension::class)
@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class TableServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val hubDbTableV3Future =
            tableServiceAsync.create(
                HubDbTableV3Request.builder()
                    .label("label")
                    .name("name")
                    .allowChildTables(true)
                    .allowPublicApiAccess(true)
                    .addColumn(
                        ColumnRequest.builder()
                            .id(0)
                            .label("label")
                            .name("name")
                            .addOption(
                                Option.builder()
                                    .hidden(false)
                                    .label("Option A")
                                    .value("A")
                                    .description("Choice number one")
                                    .displayOrder(1)
                                    .build()
                            )
                            .type(ColumnRequest.Type.NULL)
                            .foreignColumnId(0)
                            .foreignTableId(0L)
                            .maxNumberOfCharacters(0)
                            .maxNumberOfOptions(0)
                            .build()
                    )
                    .dynamicMetaTags(
                        HubDbTableV3Request.DynamicMetaTags.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .enableChildTablePages(true)
                    .useForPages(true)
                    .build()
            )

        val hubDbTableV3 = hubDbTableV3Future.get()
        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val pageFuture = tableServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val future = tableServiceAsync.delete("tableIdOrName")

        val response = future.get()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cloneDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val hubDbTableV3Future =
            tableServiceAsync.cloneDraft(
                TableCloneDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .hubDbTableCloneRequest(
                        HubDbTableCloneRequest.builder()
                            .copyRows(true)
                            .isHubspotDefined(true)
                            .newLabel("newLabel")
                            .newName("newName")
                            .build()
                    )
                    .build()
            )

        val hubDbTableV3 = hubDbTableV3Future.get()
        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteVersion() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val future =
            tableServiceAsync.deleteVersion(
                TableDeleteVersionParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .versionId(0L)
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun export(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            tableServiceAsync.export(
                TableExportParams.builder().tableIdOrName("tableIdOrName").format("format").build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun exportDraft(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val responseFuture =
            tableServiceAsync.exportDraft(
                TableExportDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .format("format")
                    .build()
            )

        val response = responseFuture.get()
        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val hubDbTableV3Future =
            tableServiceAsync.get(
                TableGetParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .archived(true)
                    .includeForeignIds(true)
                    .isGetLocalizedSchema(true)
                    .build()
            )

        val hubDbTableV3 = hubDbTableV3Future.get()
        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val hubDbTableV3Future =
            tableServiceAsync.getDraft(
                TableGetDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .archived(true)
                    .includeForeignIds(true)
                    .isGetLocalizedSchema(true)
                    .build()
            )

        val hubDbTableV3 = hubDbTableV3Future.get()
        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun importDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val importResultFuture =
            tableServiceAsync.importDraft(
                TableImportDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .config("config")
                    .file("some content".byteInputStream())
                    .build()
            )

        val importResult = importResultFuture.get()
        importResult.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val collectionResponseWithTotalHubDbTableV3ForwardPagingFuture =
            tableServiceAsync.listDraft(
                TableListDraftParams.builder()
                    .after("after")
                    .archived(true)
                    .contentType("contentType")
                    .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .isGetLocalizedSchema(true)
                    .limit(0)
                    .addSort("string")
                    .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val collectionResponseWithTotalHubDbTableV3ForwardPaging =
            collectionResponseWithTotalHubDbTableV3ForwardPagingFuture.get()
        collectionResponseWithTotalHubDbTableV3ForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun publishDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val hubDbTableV3Future =
            tableServiceAsync.publishDraft(
                TablePublishDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .includeForeignIds(true)
                    .build()
            )

        val hubDbTableV3 = hubDbTableV3Future.get()
        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun resetDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val hubDbTableV3Future =
            tableServiceAsync.resetDraft(
                TableResetDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .includeForeignIds(true)
                    .build()
            )

        val hubDbTableV3 = hubDbTableV3Future.get()
        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unpublish() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val hubDbTableV3Future =
            tableServiceAsync.unpublish(
                TableUnpublishParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .includeForeignIds(true)
                    .build()
            )

        val hubDbTableV3 = hubDbTableV3Future.get()
        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateDraft() {
        val client =
            HubspotOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx")
                .build()
        val tableServiceAsync = client.cms().hubdb().tables()

        val hubDbTableV3Future =
            tableServiceAsync.updateDraft(
                TableUpdateDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .archived(true)
                    .includeForeignIds(true)
                    .isGetLocalizedSchema(true)
                    .hubDbTableV3Request(
                        HubDbTableV3Request.builder()
                            .label("label")
                            .name("name")
                            .allowChildTables(true)
                            .allowPublicApiAccess(true)
                            .addColumn(
                                ColumnRequest.builder()
                                    .id(0)
                                    .label("label")
                                    .name("name")
                                    .addOption(
                                        Option.builder()
                                            .hidden(false)
                                            .label("Option A")
                                            .value("A")
                                            .description("Choice number one")
                                            .displayOrder(1)
                                            .build()
                                    )
                                    .type(ColumnRequest.Type.NULL)
                                    .foreignColumnId(0)
                                    .foreignTableId(0L)
                                    .maxNumberOfCharacters(0)
                                    .maxNumberOfOptions(0)
                                    .build()
                            )
                            .dynamicMetaTags(
                                HubDbTableV3Request.DynamicMetaTags.builder()
                                    .putAdditionalProperty("foo", JsonValue.from(0))
                                    .build()
                            )
                            .enableChildTablePages(true)
                            .useForPages(true)
                            .build()
                    )
                    .build()
            )

        val hubDbTableV3 = hubDbTableV3Future.get()
        hubDbTableV3.validate()
    }
}
