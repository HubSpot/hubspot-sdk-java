// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.authors.batch

import com.hubspot.sdk.models.cms.blogs.authors.BatchInputBlogAuthor
import com.hubspot.sdk.models.cms.blogs.authors.BlogAuthor
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateParamsTest {

    @Test
    fun create() {
        BatchCreateParams.builder()
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
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            BatchCreateParams.builder()
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
                    .build()
            )
    }
}
