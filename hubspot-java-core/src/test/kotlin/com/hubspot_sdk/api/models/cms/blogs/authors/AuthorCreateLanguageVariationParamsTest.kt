// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.cms.blogs.authors

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorCreateLanguageVariationParamsTest {

    @Test
    fun create() {
        AuthorCreateLanguageVariationParams.builder()
            .blogAuthorCloneRequestVNext(
                BlogAuthorCloneRequestVNext.builder()
                    .id("id")
                    .blogAuthor(
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
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            AuthorCreateLanguageVariationParams.builder()
                .blogAuthorCloneRequestVNext(
                    BlogAuthorCloneRequestVNext.builder()
                        .id("id")
                        .blogAuthor(
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
                        .language("language")
                        .primaryLanguage("primaryLanguage")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                BlogAuthorCloneRequestVNext.builder()
                    .id("id")
                    .blogAuthor(
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
                    .language("language")
                    .primaryLanguage("primaryLanguage")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthorCreateLanguageVariationParams.builder()
                .blogAuthorCloneRequestVNext(
                    BlogAuthorCloneRequestVNext.builder()
                        .id("id")
                        .blogAuthor(
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
                BlogAuthorCloneRequestVNext.builder()
                    .id("id")
                    .blogAuthor(
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
