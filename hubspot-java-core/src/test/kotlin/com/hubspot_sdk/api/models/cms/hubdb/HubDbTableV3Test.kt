// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.Option
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HubDbTableV3Test {

    @Test
    fun create() {
        val hubDbTableV3 =
            HubDbTableV3.builder()
                .id("id")
                .allowChildTables(true)
                .allowPublicApiAccess(true)
                .columnCount(0)
                .addColumn(
                    Column.builder()
                        .id("id")
                        .deleted(true)
                        .description("description")
                        .label("label")
                        .name("name")
                        .type(Column.Type.NULL)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdBy(
                            SimpleUser.builder()
                                .id("id")
                                .email("email")
                                .firstName("firstName")
                                .lastName("lastName")
                                .build()
                        )
                        .createdByUserId(0)
                        .foreignColumnId(0)
                        .addForeignId(
                            ForeignId.builder().id("id").name("name").type("type").build()
                        )
                        .foreignIdsById(
                            Column.ForeignIdsById.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf("id" to "id", "name" to "name", "type" to "type")
                                    ),
                                )
                                .build()
                        )
                        .foreignIdsByName(
                            Column.ForeignIdsByName.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf("id" to "id", "name" to "name", "type" to "type")
                                    ),
                                )
                                .build()
                        )
                        .foreignTableId(0L)
                        .optionCount(0)
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option A")
                                .value("A")
                                .description("Choice number one")
                                .displayOrder(1)
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedBy(
                            SimpleUser.builder()
                                .id("id")
                                .email("email")
                                .firstName("firstName")
                                .lastName("lastName")
                                .build()
                        )
                        .updatedByUserId(0)
                        .width(0)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deleted(true)
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dynamicMetaTags(
                    HubDbTableV3.DynamicMetaTags.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .enableChildTablePages(true)
                .label("label")
                .name("name")
                .published(true)
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .rowCount(0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .useForPages(true)
                .createdBy(
                    SimpleUser.builder()
                        .id("id")
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .isOrderedManually(true)
                .updatedBy(
                    SimpleUser.builder()
                        .id("id")
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .build()

        assertThat(hubDbTableV3.id()).isEqualTo("id")
        assertThat(hubDbTableV3.allowChildTables()).isEqualTo(true)
        assertThat(hubDbTableV3.allowPublicApiAccess()).isEqualTo(true)
        assertThat(hubDbTableV3.columnCount()).isEqualTo(0)
        assertThat(hubDbTableV3.columns())
            .containsExactly(
                Column.builder()
                    .id("id")
                    .deleted(true)
                    .description("description")
                    .label("label")
                    .name("name")
                    .type(Column.Type.NULL)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdBy(
                        SimpleUser.builder()
                            .id("id")
                            .email("email")
                            .firstName("firstName")
                            .lastName("lastName")
                            .build()
                    )
                    .createdByUserId(0)
                    .foreignColumnId(0)
                    .addForeignId(ForeignId.builder().id("id").name("name").type("type").build())
                    .foreignIdsById(
                        Column.ForeignIdsById.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf("id" to "id", "name" to "name", "type" to "type")
                                ),
                            )
                            .build()
                    )
                    .foreignIdsByName(
                        Column.ForeignIdsByName.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(
                                    mapOf("id" to "id", "name" to "name", "type" to "type")
                                ),
                            )
                            .build()
                    )
                    .foreignTableId(0L)
                    .optionCount(0)
                    .addOption(
                        Option.builder()
                            .hidden(false)
                            .label("Option A")
                            .value("A")
                            .description("Choice number one")
                            .displayOrder(1)
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedBy(
                        SimpleUser.builder()
                            .id("id")
                            .email("email")
                            .firstName("firstName")
                            .lastName("lastName")
                            .build()
                    )
                    .updatedByUserId(0)
                    .width(0)
                    .build()
            )
        assertThat(hubDbTableV3.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hubDbTableV3.deleted()).isEqualTo(true)
        assertThat(hubDbTableV3.deletedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hubDbTableV3.dynamicMetaTags())
            .isEqualTo(
                HubDbTableV3.DynamicMetaTags.builder()
                    .putAdditionalProperty("foo", JsonValue.from(0))
                    .build()
            )
        assertThat(hubDbTableV3.enableChildTablePages()).isEqualTo(true)
        assertThat(hubDbTableV3.label()).isEqualTo("label")
        assertThat(hubDbTableV3.name()).isEqualTo("name")
        assertThat(hubDbTableV3.published()).isEqualTo(true)
        assertThat(hubDbTableV3.publishedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hubDbTableV3.rowCount()).isEqualTo(0)
        assertThat(hubDbTableV3.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(hubDbTableV3.useForPages()).isEqualTo(true)
        assertThat(hubDbTableV3.createdBy())
            .contains(
                SimpleUser.builder()
                    .id("id")
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
        assertThat(hubDbTableV3.isOrderedManually()).contains(true)
        assertThat(hubDbTableV3.updatedBy())
            .contains(
                SimpleUser.builder()
                    .id("id")
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hubDbTableV3 =
            HubDbTableV3.builder()
                .id("id")
                .allowChildTables(true)
                .allowPublicApiAccess(true)
                .columnCount(0)
                .addColumn(
                    Column.builder()
                        .id("id")
                        .deleted(true)
                        .description("description")
                        .label("label")
                        .name("name")
                        .type(Column.Type.NULL)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdBy(
                            SimpleUser.builder()
                                .id("id")
                                .email("email")
                                .firstName("firstName")
                                .lastName("lastName")
                                .build()
                        )
                        .createdByUserId(0)
                        .foreignColumnId(0)
                        .addForeignId(
                            ForeignId.builder().id("id").name("name").type("type").build()
                        )
                        .foreignIdsById(
                            Column.ForeignIdsById.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf("id" to "id", "name" to "name", "type" to "type")
                                    ),
                                )
                                .build()
                        )
                        .foreignIdsByName(
                            Column.ForeignIdsByName.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf("id" to "id", "name" to "name", "type" to "type")
                                    ),
                                )
                                .build()
                        )
                        .foreignTableId(0L)
                        .optionCount(0)
                        .addOption(
                            Option.builder()
                                .hidden(false)
                                .label("Option A")
                                .value("A")
                                .description("Choice number one")
                                .displayOrder(1)
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedBy(
                            SimpleUser.builder()
                                .id("id")
                                .email("email")
                                .firstName("firstName")
                                .lastName("lastName")
                                .build()
                        )
                        .updatedByUserId(0)
                        .width(0)
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .deleted(true)
                .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dynamicMetaTags(
                    HubDbTableV3.DynamicMetaTags.builder()
                        .putAdditionalProperty("foo", JsonValue.from(0))
                        .build()
                )
                .enableChildTablePages(true)
                .label("label")
                .name("name")
                .published(true)
                .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .rowCount(0)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .useForPages(true)
                .createdBy(
                    SimpleUser.builder()
                        .id("id")
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .isOrderedManually(true)
                .updatedBy(
                    SimpleUser.builder()
                        .id("id")
                        .email("email")
                        .firstName("firstName")
                        .lastName("lastName")
                        .build()
                )
                .build()

        val roundtrippedHubDbTableV3 =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hubDbTableV3),
                jacksonTypeRef<HubDbTableV3>(),
            )

        assertThat(roundtrippedHubDbTableV3).isEqualTo(hubDbTableV3)
    }
}
