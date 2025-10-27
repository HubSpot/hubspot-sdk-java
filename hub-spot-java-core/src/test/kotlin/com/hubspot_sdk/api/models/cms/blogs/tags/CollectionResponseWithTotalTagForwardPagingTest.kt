// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.tags

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot_sdk.api.core.jsonMapper
import com.hubspot_sdk.api.models.ForwardPaging
import com.hubspot_sdk.api.models.NextPage
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CollectionResponseWithTotalTagForwardPagingTest {

    @Test
    fun create() {
        val collectionResponseWithTotalTagForwardPaging =
            CollectionResponseWithTotalTagForwardPaging.builder()
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
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        assertThat(collectionResponseWithTotalTagForwardPaging.results())
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
        assertThat(collectionResponseWithTotalTagForwardPaging.total()).isEqualTo(0)
        assertThat(collectionResponseWithTotalTagForwardPaging.paging())
            .contains(
                ForwardPaging.builder().next(NextPage.builder().after("").link("").build()).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val collectionResponseWithTotalTagForwardPaging =
            CollectionResponseWithTotalTagForwardPaging.builder()
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
                .total(0)
                .paging(
                    ForwardPaging.builder()
                        .next(NextPage.builder().after("").link("").build())
                        .build()
                )
                .build()

        val roundtrippedCollectionResponseWithTotalTagForwardPaging =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(collectionResponseWithTotalTagForwardPaging),
                jacksonTypeRef<CollectionResponseWithTotalTagForwardPaging>(),
            )

        assertThat(roundtrippedCollectionResponseWithTotalTagForwardPaging)
            .isEqualTo(collectionResponseWithTotalTagForwardPaging)
    }
}
