// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.JsonValue
import com.hubspot_sdk.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseTagTest {

    @Test
    fun create() {
        val batchResponseTag =
            BatchResponseTag.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    Tag.builder()
                        .id("id")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .language(Tag.Language.AF)
                        .name("name")
                        .translatedFromId(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseTag.Status.CANCELED)
                .links(
                    BatchResponseTag.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseTag.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseTag.results())
            .containsExactly(
                Tag.builder()
                    .id("id")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .language(Tag.Language.AF)
                    .name("name")
                    .translatedFromId(0L)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(batchResponseTag.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseTag.status()).isEqualTo(BatchResponseTag.Status.CANCELED)
        assertThat(batchResponseTag.links())
            .contains(
                BatchResponseTag.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseTag.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseTag =
            BatchResponseTag.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    Tag.builder()
                        .id("id")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .language(Tag.Language.AF)
                        .name("name")
                        .translatedFromId(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseTag.Status.CANCELED)
                .links(
                    BatchResponseTag.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseTag =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseTag),
                jacksonTypeRef<BatchResponseTag>(),
            )

        assertThat(roundtrippedBatchResponseTag).isEqualTo(batchResponseTag)
    }
}
