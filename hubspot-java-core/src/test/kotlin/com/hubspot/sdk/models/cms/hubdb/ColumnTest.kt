// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ColumnTest {

    @Test
    fun create() {
        val column =
            Column.builder()
                .id("id")
                .deleted(true)
                .description("description")
                .label("label")
                .name("name")
                .type(Column.Type.BOOLEAN)
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
                            JsonValue.from(mapOf("id" to "id", "name" to "name", "type" to "type")),
                        )
                        .build()
                )
                .foreignIdsByName(
                    Column.ForeignIdsByName.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("id" to "id", "name" to "name", "type" to "type")),
                        )
                        .build()
                )
                .foreignTableId(0L)
                .optionCount(0)
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

        assertThat(column.id()).isEqualTo("id")
        assertThat(column.deleted()).isEqualTo(true)
        assertThat(column.description()).isEqualTo("description")
        assertThat(column.label()).isEqualTo("label")
        assertThat(column.name()).isEqualTo("name")
        assertThat(column.type()).isEqualTo(Column.Type.BOOLEAN)
        assertThat(column.createdAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(column.createdBy())
            .contains(
                SimpleUser.builder()
                    .id("id")
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
        assertThat(column.createdByUserId()).contains(0)
        assertThat(column.foreignColumnId()).contains(0)
        assertThat(column.foreignIds().getOrNull())
            .containsExactly(ForeignId.builder().id("id").name("name").type("type").build())
        assertThat(column.foreignIdsById())
            .contains(
                Column.ForeignIdsById.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("id" to "id", "name" to "name", "type" to "type")),
                    )
                    .build()
            )
        assertThat(column.foreignIdsByName())
            .contains(
                Column.ForeignIdsByName.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("id" to "id", "name" to "name", "type" to "type")),
                    )
                    .build()
            )
        assertThat(column.foreignTableId()).contains(0L)
        assertThat(column.optionCount()).contains(0)
        assertThat(column.options().getOrNull())
            .containsExactly(
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
        assertThat(column.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(column.updatedBy())
            .contains(
                SimpleUser.builder()
                    .id("id")
                    .email("email")
                    .firstName("firstName")
                    .lastName("lastName")
                    .build()
            )
        assertThat(column.updatedByUserId()).contains(0)
        assertThat(column.width()).contains(0)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val column =
            Column.builder()
                .id("id")
                .deleted(true)
                .description("description")
                .label("label")
                .name("name")
                .type(Column.Type.BOOLEAN)
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
                            JsonValue.from(mapOf("id" to "id", "name" to "name", "type" to "type")),
                        )
                        .build()
                )
                .foreignIdsByName(
                    Column.ForeignIdsByName.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("id" to "id", "name" to "name", "type" to "type")),
                        )
                        .build()
                )
                .foreignTableId(0L)
                .optionCount(0)
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

        val roundtrippedColumn =
            jsonMapper.readValue(jsonMapper.writeValueAsString(column), jacksonTypeRef<Column>())

        assertThat(roundtrippedColumn).isEqualTo(column)
    }
}
