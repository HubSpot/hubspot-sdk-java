// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb.tables

import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.models.Option
import com.hubspot_sdk.api.models.cms.hubdb.ColumnRequest
import com.hubspot_sdk.api.models.cms.hubdb.HubDbTableV3Request
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TableCreateParamsTest {

    @Test
    fun create() {
        TableCreateParams.builder()
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
    }

    @Test
    fun body() {
        val params =
            TableCreateParams.builder()
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TableCreateParams.builder()
                .hubDbTableV3Request(
                    HubDbTableV3Request.builder().label("label").name("name").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(HubDbTableV3Request.builder().label("label").name("name").build())
    }
}
