// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.Option
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HubDbTableV3RequestTest {

    @Test
    fun create() {
        val hubDbTableV3Request =
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

        assertThat(hubDbTableV3Request.allowChildTables()).isEqualTo(true)
        assertThat(hubDbTableV3Request.allowPublicApiAccess()).isEqualTo(true)
        assertThat(hubDbTableV3Request.columns())
            .containsExactly(
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
        assertThat(hubDbTableV3Request.dynamicMetaTags())
            .isEqualTo(
                HubDbTableV3Request.DynamicMetaTags.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(hubDbTableV3Request.enableChildTablePages()).isEqualTo(true)
        assertThat(hubDbTableV3Request.label()).isEqualTo("label")
        assertThat(hubDbTableV3Request.name()).isEqualTo("name")
        assertThat(hubDbTableV3Request.useForPages()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hubDbTableV3Request =
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

        val roundtrippedHubDbTableV3Request =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hubDbTableV3Request),
                jacksonTypeRef<HubDbTableV3Request>(),
            )

        assertThat(roundtrippedHubDbTableV3Request).isEqualTo(hubDbTableV3Request)
    }
}
