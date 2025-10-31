// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.hubdb

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot_sdk.api.TestServerExtension
import com.hubspot_sdk.api.client.okhttp.HubspotOkHttpClient
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
internal class TableServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        val hubDbTableV3 =
            tableService.create(
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
                                    .description("")
                                    .displayOrder(0)
                                    .doubleData(0.0)
                                    .hidden(false)
                                    .label("")
                                    .readOnly(false)
                                    .value("")
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

        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        val page = tableService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        tableService.delete("tableIdOrName")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cloneDraft() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        val hubDbTableV3 =
            tableService.cloneDraft(
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

        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deleteVersion() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        tableService.deleteVersion(
            TableDeleteVersionParams.builder().tableIdOrName("tableIdOrName").versionId(0L).build()
        )
    }

    @Test
    fun export(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            tableService.export(
                TableExportParams.builder().tableIdOrName("tableIdOrName").format("format").build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Test
    fun exportDraft(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()
        stubFor(get(anyUrl()).willReturn(ok().withBody("abc")))

        val response =
            tableService.exportDraft(
                TableExportDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .format("format")
                    .build()
            )

        assertThat(response.body()).hasContent("abc")
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun get() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        val hubDbTableV3 =
            tableService.get(
                TableGetParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .archived(true)
                    .includeForeignIds(true)
                    .isGetLocalizedSchema(true)
                    .build()
            )

        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getDraft() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        val hubDbTableV3 =
            tableService.getDraft(
                TableGetDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .archived(true)
                    .includeForeignIds(true)
                    .isGetLocalizedSchema(true)
                    .build()
            )

        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun importDraft() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        val importResult =
            tableService.importDraft(
                TableImportDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .config("config")
                    .file("some content".byteInputStream())
                    .build()
            )

        importResult.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listDraft() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        val collectionResponseWithTotalHubDbTableV3ForwardPaging =
            tableService.listDraft(
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

        collectionResponseWithTotalHubDbTableV3ForwardPaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun publishDraft() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        val hubDbTableV3 =
            tableService.publishDraft(
                TablePublishDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .includeForeignIds(true)
                    .build()
            )

        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun resetDraft() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        val hubDbTableV3 =
            tableService.resetDraft(
                TableResetDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .includeForeignIds(true)
                    .build()
            )

        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unpublish() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        val hubDbTableV3 =
            tableService.unpublish(
                TableUnpublishParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .includeForeignIds(true)
                    .build()
            )

        hubDbTableV3.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateDraft() {
        val client =
            HubspotOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .accessToken("pat-na1-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")
                .build()
        val tableService = client.cms().hubdb().tables()

        val hubDbTableV3 =
            tableService.updateDraft(
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
                                            .description("")
                                            .displayOrder(0)
                                            .doubleData(0.0)
                                            .hidden(false)
                                            .label("")
                                            .readOnly(false)
                                            .value("")
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

        hubDbTableV3.validate()
    }
}
