// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb.tables

import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.models.cms.hubdb.ColumnRequest
import com.hubspot.sdk.models.cms.hubdb.HubDbTableV3Request
import com.hubspot.sdk.models.cms.hubdb.HubdbOption
import com.hubspot.sdk.models.cms.hubdb.SimpleUser
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TableCreateParamsTest {

    @Test
    fun create() {
        TableCreateParams.builder()
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
                                HubdbOption.builder()
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
            .build()
    }

    @Test
    fun body() {
        val params =
            TableCreateParams.builder()
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
                                    HubdbOption.builder()
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
                                HubdbOption.builder()
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TableCreateParams.builder()
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
                                    HubdbOption.builder()
                                        .id("id")
                                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .label("label")
                                        .name("name")
                                        .order(0)
                                        .type("type")
                                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                        .build()
                                )
                                .type(ColumnRequest.Type.BOOLEAN)
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
                                HubdbOption.builder()
                                    .id("id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .label("label")
                                    .name("name")
                                    .order(0)
                                    .type("type")
                                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .type(ColumnRequest.Type.BOOLEAN)
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
