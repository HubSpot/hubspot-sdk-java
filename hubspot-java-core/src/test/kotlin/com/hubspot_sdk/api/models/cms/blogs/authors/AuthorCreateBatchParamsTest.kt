// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.authors

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorCreateBatchParamsTest {

    @Test
    fun create() {
        AuthorCreateBatchParams.builder()
            .batchInputBlogAuthor(
                BatchInputBlogAuthor.builder()
                    .addInput(
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
                            .language(BlogAuthor.Language.AF)
                            .linkedin("linkedin")
                            .name("name")
                            .slug("slug")
                            .translatedFromId(0L)
                            .twitter("twitter")
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .website("website")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthorCreateBatchParams.builder()
                .batchInputBlogAuthor(
                    BatchInputBlogAuthor.builder()
                        .addInput(
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
                                .language(BlogAuthor.Language.AF)
                                .linkedin("linkedin")
                                .name("name")
                                .slug("slug")
                                .translatedFromId(0L)
                                .twitter("twitter")
                                .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .website("website")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BatchInputBlogAuthor.builder()
                    .addInput(
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
                            .language(BlogAuthor.Language.AF)
                            .linkedin("linkedin")
                            .name("name")
                            .slug("slug")
                            .translatedFromId(0L)
                            .twitter("twitter")
                            .updated(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .website("website")
                            .build()
                    )
                    .build()
            )
    }
}
