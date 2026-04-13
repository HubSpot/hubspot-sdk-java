// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.hubdb

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.hubspot.sdk.client.okhttp.HubSpotOkHttpClient
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.cms.hubdb.ColumnRequest
import com.hubspot.sdk.models.cms.hubdb.HubDbTableCloneRequest
import com.hubspot.sdk.models.cms.hubdb.HubDbTableV3Request
import com.hubspot.sdk.models.cms.hubdb.Option
import com.hubspot.sdk.models.cms.hubdb.SimpleUser
import com.hubspot.sdk.models.cms.hubdb.tables.TableCloneDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableDeleteVersionParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableExportDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableExportParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableGetDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableGetParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableImportDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TablePublishDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableResetDraftParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableUnpublishParams
import com.hubspot.sdk.models.cms.hubdb.tables.TableUpdateDraftParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class TableServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val tableService = client.cms().hubdb().tables()

        val hubDbTableV3 =
            tableService.create(
                HubDbTableV3Request.builder()
                    .allowChildTables(true)
                    .allowPublicApiAccess(true)
                    .addColumn(
                        ColumnRequest.builder()
                            .id(0)
                            .label("label")
                            .name("name")
                            .addOption(
                                Option.builder()
                                    .id("id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .label("label")
                                    .name("name")
                                    .order(0)
                                    .type("type")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .createdBy(
                                        SimpleUser.builder()
                                            .id("id")
                                            .email("email")
                                            .firstName("firstName")
                                            .lastName("lastName")
                                            .build()
                                    )
                                    .createdByUserId(0)
                                    .updatedBy(
                                        SimpleUser.builder()
                                            .id("id")
                                            .email("email")
                                            .firstName("firstName")
                                            .lastName("lastName")
                                            .build()
                                    )
                                    .updatedByUserId(0)
                                    .build()
                            )
                            .type(ColumnRequest.Type.BOOLEAN)
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
                    .label("label")
                    .name("name")
                    .useForPages(true)
                    .build()
            )

        hubDbTableV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val tableService = client.cms().hubdb().tables()

        val page = tableService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val tableService = client.cms().hubdb().tables()

        tableService.delete("tableIdOrName")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cloneDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val tableService = client.cms().hubdb().tables()

        val hubDbTableV3 =
            tableService.cloneDraft(
                TableCloneDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .hubDbTableCloneRequest(
                        HubDbTableCloneRequest.builder()
                            .copyRows(true)
                            .isHubSpotDefined(true)
                            .newLabel("newLabel")
                            .newName("newName")
                            .build()
                    )
                    .build()
            )

        hubDbTableV3.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deleteVersion() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val tableService = client.cms().hubdb().tables()

        tableService.deleteVersion(
            TableDeleteVersionParams.builder().tableIdOrName("tableIdOrName").versionId(0L).build()
        )
    }

    @Test
    fun export(wmRuntimeInfo: WireMockRuntimeInfo) {
        val client =
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
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
            HubSpotOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .accessToken("My Access Token")
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun get() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun getDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun importDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val tableService = client.cms().hubdb().tables()

        val importResult =
            tableService.importDraft(
                TableImportDraftParams.builder()
                    .tableIdOrName("tableIdOrName")
                    .config("config")
                    .file("Example data".byteInputStream())
                    .build()
            )

        importResult.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun listDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
        val tableService = client.cms().hubdb().tables()

        val page = tableService.listDraft()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun publishDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun resetDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun unpublish() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
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

    @Disabled("Mock server tests are disabled")
    @Test
    fun updateDraft() {
        val client = HubSpotOkHttpClient.builder().accessToken("My Access Token").build()
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
                            .allowChildTables(true)
                            .allowPublicApiAccess(true)
                            .addColumn(
                                ColumnRequest.builder()
                                    .id(0)
                                    .label("label")
                                    .name("name")
                                    .addOption(
                                        Option.builder()
                                            .id("id")
                                            .createdAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .label("label")
                                            .name("name")
                                            .order(0)
                                            .type("type")
                                            .updatedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .createdBy(
                                                SimpleUser.builder()
                                                    .id("id")
                                                    .email("email")
                                                    .firstName("firstName")
                                                    .lastName("lastName")
                                                    .build()
                                            )
                                            .createdByUserId(0)
                                            .updatedBy(
                                                SimpleUser.builder()
                                                    .id("id")
                                                    .email("email")
                                                    .firstName("firstName")
                                                    .lastName("lastName")
                                                    .build()
                                            )
                                            .updatedByUserId(0)
                                            .build()
                                    )
                                    .type(ColumnRequest.Type.BOOLEAN)
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
                            .label("label")
                            .name("name")
                            .useForPages(true)
                            .build()
                    )
                    .build()
            )

        hubDbTableV3.validate()
    }
}
