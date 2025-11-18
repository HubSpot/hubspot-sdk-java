// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.tables

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.http.QueryParams
import com.hubspot_sdk.api.models.Option
import com.hubspot_sdk.api.models.cms.hubdb.ColumnRequest
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableV3Request
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TableUpdateDraftParamsTest {

    @Test
    fun create() {
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
                    .label("label")
                    .name("name")
                    .useForPages(true)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TableUpdateDraftParams.builder()
                .tableIdOrName("tableIdOrName")
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
                                        .hidden(false)
                                        .label("Option A")
                                        .value("A")
                                        .build()
                                )
                                .type(ColumnRequest.Type.NULL)
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

        assertThat(params._pathParam(0)).isEqualTo("tableIdOrName")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
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
                        .label("label")
                        .name("name")
                        .useForPages(true)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("archived", "true")
                    .put("includeForeignIds", "true")
                    .put("isGetLocalizedSchema", "true")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            TableUpdateDraftParams.builder()
                .tableIdOrName("tableIdOrName")
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
                                        .hidden(false)
                                        .label("Option A")
                                        .value("A")
                                        .build()
                                )
                                .type(ColumnRequest.Type.NULL)
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
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
                        .label("label")
                        .name("name")
                        .useForPages(true)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
                    .label("label")
                    .name("name")
                    .useForPages(true)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TableUpdateDraftParams.builder()
                .tableIdOrName("tableIdOrName")
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
                                        .hidden(false)
                                        .label("Option A")
                                        .value("A")
                                        .build()
                                )
                                .type(ColumnRequest.Type.NULL)
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                HubDbTableV3Request.builder()
                    .allowChildTables(true)
                    .allowPublicApiAccess(true)
                    .addColumn(
                        ColumnRequest.builder()
                            .id(0)
                            .label("label")
                            .name("name")
                            .addOption(
                                Option.builder().hidden(false).label("Option A").value("A").build()
                            )
                            .type(ColumnRequest.Type.NULL)
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
    }
}
