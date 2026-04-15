// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchInputTagTest {

    @Test
    fun create() {
        val batchInputTag =
            BatchInputTag.builder()
                .addInput(
                    Tag.builder()
                        .id("id")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .language(Tag.Language.AA)
                        .name("name")
                        .slug("slug")
                        .translatedFromId(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(batchInputTag.inputs())
            .containsExactly(
                Tag.builder()
                    .id("id")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .language(Tag.Language.AA)
                    .name("name")
                    .slug("slug")
                    .translatedFromId(0L)
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchInputTag =
            BatchInputTag.builder()
                .addInput(
                    Tag.builder()
                        .id("id")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .language(Tag.Language.AA)
                        .name("name")
                        .slug("slug")
                        .translatedFromId(0L)
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedBatchInputTag =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchInputTag),
                jacksonTypeRef<BatchInputTag>(),
            )

        assertThat(roundtrippedBatchInputTag).isEqualTo(batchInputTag)
    }
}
