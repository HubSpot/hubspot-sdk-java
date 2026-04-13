// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.authors

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.hubspot.sdk.core.JsonValue
import com.hubspot.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchResponseBlogAuthorTest {

    @Test
    fun create() {
        val batchResponseBlogAuthor =
            BatchResponseBlogAuthor.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    BlogAuthor.builder()
                        .id("id")
                        .avatar("avatar")
                        .bio("bio")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("displayName")
                        .email("email")
                        .facebook("facebook")
                        .fullName("fullName")
                        .language(BlogAuthor.Language.AA)
                        .linkedin("linkedin")
                        .name("name")
                        .slug("slug")
                        .translatedFromId(0L)
                        .twitter("twitter")
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseBlogAuthor.Status.CANCELED)
                .links(
                    BatchResponseBlogAuthor.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(batchResponseBlogAuthor.completedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseBlogAuthor.results())
            .containsExactly(
                BlogAuthor.builder()
                    .id("id")
                    .avatar("avatar")
                    .bio("bio")
                    .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .displayName("displayName")
                    .email("email")
                    .facebook("facebook")
                    .fullName("fullName")
                    .language(BlogAuthor.Language.AA)
                    .linkedin("linkedin")
                    .name("name")
                    .slug("slug")
                    .translatedFromId(0L)
                    .twitter("twitter")
                    .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .website("website")
                    .build()
            )
        assertThat(batchResponseBlogAuthor.startedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(batchResponseBlogAuthor.status())
            .isEqualTo(BatchResponseBlogAuthor.Status.CANCELED)
        assertThat(batchResponseBlogAuthor.links())
            .contains(
                BatchResponseBlogAuthor.Links.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(batchResponseBlogAuthor.requestedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchResponseBlogAuthor =
            BatchResponseBlogAuthor.builder()
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addResult(
                    BlogAuthor.builder()
                        .id("id")
                        .avatar("avatar")
                        .bio("bio")
                        .created(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .deletedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .displayName("displayName")
                        .email("email")
                        .facebook("facebook")
                        .fullName("fullName")
                        .language(BlogAuthor.Language.AA)
                        .linkedin("linkedin")
                        .name("name")
                        .slug("slug")
                        .translatedFromId(0L)
                        .twitter("twitter")
                        .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .website("website")
                        .build()
                )
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(BatchResponseBlogAuthor.Status.CANCELED)
                .links(
                    BatchResponseBlogAuthor.Links.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .requestedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedBatchResponseBlogAuthor =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchResponseBlogAuthor),
                jacksonTypeRef<BatchResponseBlogAuthor>(),
            )

        assertThat(roundtrippedBatchResponseBlogAuthor).isEqualTo(batchResponseBlogAuthor)
    }
}
