// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.hubdb

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import com.hubspot_sdk.api.models.Option
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalHubDbTableV3ForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalHubDbTableV3ForwardPaging =
            CollectionResponseWithTotalHubDbTableV3ForwardPaging.builder()
                .addResult(
                    HubDbTableV3.builder()
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .label("label")
                        .name("name")
                        .id("id")
                        .allowChildTables(true)
                        .allowPublicApiAccess(true)
                        .columnCount(0)
                        .addColumn(
                            Column.builder()
                                .label("label")
                                .name("name")
                                .type(Column.Type.NULL)
                                .id("id")
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
                                .deleted(true)
                                .description("description")
                                .foreignColumnId(0)
                                .addForeignId(
                                    ForeignId.builder().id("id").name("name").type("type").build()
                                )
                                .foreignIdsById(
                                    Column.ForeignIdsById.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(
                                                mapOf(
                                                    "id" to "id",
                                                    "name" to "name",
                                                    "type" to "type",
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .foreignIdsByName(
                                    Column.ForeignIdsByName.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(
                                                mapOf(
                                                    "id" to "id",
                                                    "name" to "name",
                                                    "type" to "type",
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .foreignTableId(0L)
                                .optionCount(0)
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
                        .createdBy(
                            SimpleUser.builder()
                                .id("id")
                                .email("email")
                                .firstName("firstName")
                                .lastName("lastName")
                                .build()
                        )
                        .deleted(true)
                        .dynamicMetaTags(
                            HubDbTableV3.DynamicMetaTags.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .enableChildTablePages(true)
                        .isOrderedManually(true)
                        .published(true)
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .rowCount(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedBy(
                            SimpleUser.builder()
                                .id("id")
                                .email("email")
                                .firstName("firstName")
                                .lastName("lastName")
                                .build()
                        )
                        .useForPages(true)
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalHubDbTableV3ForwardPaging.results())
            .containsExactly(
                HubDbTableV3.builder()
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .label("label")
                    .name("name")
                    .id("id")
                    .allowChildTables(true)
                    .allowPublicApiAccess(true)
                    .columnCount(0)
                    .addColumn(
                        Column.builder()
                            .label("label")
                            .name("name")
                            .type(Column.Type.NULL)
                            .id("id")
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
                            .deleted(true)
                            .description("description")
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
                                    .description("")
                                    .displayOrder(0)
                                    .doubleData(0.0)
                                    .hidden(false)
                                    .label("")
                                    .readOnly(false)
                                    .value("")
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
                    .createdBy(
                        SimpleUser.builder()
                            .id("id")
                            .email("email")
                            .firstName("firstName")
                            .lastName("lastName")
                            .build()
                    )
                    .deleted(true)
                    .dynamicMetaTags(
                        HubDbTableV3.DynamicMetaTags.builder()
                            .putAdditionalProperty("foo", JsonValue.from(0))
                            .build()
                    )
                    .enableChildTablePages(true)
                    .isOrderedManually(true)
                    .published(true)
                    .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .rowCount(0)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .updatedBy(
                        SimpleUser.builder()
                            .id("id")
                            .email("email")
                            .firstName("firstName")
                            .lastName("lastName")
                            .build()
                    )
                    .useForPages(true)
                    .build()
            )
        assertThat(collectionResponseWithTotalHubDbTableV3ForwardPaging.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalHubDbTableV3ForwardPaging.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalHubDbTableV3ForwardPaging =
            CollectionResponseWithTotalHubDbTableV3ForwardPaging.builder()
                .addResult(
                    HubDbTableV3.builder()
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .label("label")
                        .name("name")
                        .id("id")
                        .allowChildTables(true)
                        .allowPublicApiAccess(true)
                        .columnCount(0)
                        .addColumn(
                            Column.builder()
                                .label("label")
                                .name("name")
                                .type(Column.Type.NULL)
                                .id("id")
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
                                .deleted(true)
                                .description("description")
                                .foreignColumnId(0)
                                .addForeignId(
                                    ForeignId.builder().id("id").name("name").type("type").build()
                                )
                                .foreignIdsById(
                                    Column.ForeignIdsById.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(
                                                mapOf(
                                                    "id" to "id",
                                                    "name" to "name",
                                                    "type" to "type",
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .foreignIdsByName(
                                    Column.ForeignIdsByName.builder()
                                        .putAdditionalProperty(
                                            "foo",
                                            JsonValue.from(
                                                mapOf(
                                                    "id" to "id",
                                                    "name" to "name",
                                                    "type" to "type",
                                                )
                                            ),
                                        )
                                        .build()
                                )
                                .foreignTableId(0L)
                                .optionCount(0)
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
                        .createdBy(
                            SimpleUser.builder()
                                .id("id")
                                .email("email")
                                .firstName("firstName")
                                .lastName("lastName")
                                .build()
                        )
                        .deleted(true)
                        .dynamicMetaTags(
                            HubDbTableV3.DynamicMetaTags.builder()
                                .putAdditionalProperty("foo", JsonValue.from(0))
                                .build()
                        )
                        .enableChildTablePages(true)
                        .isOrderedManually(true)
                        .published(true)
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .rowCount(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .updatedBy(
                            SimpleUser.builder()
                                .id("id")
                                .email("email")
                                .firstName("firstName")
                                .lastName("lastName")
                                .build()
                        )
                        .useForPages(true)
                        .build()
                )
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalHubDbTableV3ForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalHubDbTableV3ForwardPaging),
                jacksonTypeRef<CollectionResponseWithTotalHubDbTableV3ForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalHubDbTableV3ForwardPaging)
            .isEqualTo(collectionResponseWithTotalHubDbTableV3ForwardPaging)
    }
}
