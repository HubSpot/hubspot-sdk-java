// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.models.cms.blogs.authors

import com.hubspot.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorUpdateParamsTest {

    @Test
    fun create() {
        AuthorUpdateParams.builder()
            .objectId("objectId")
            .archived(true)
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
    }

    @Test
    fun pathParams() {
        val params =
            AuthorUpdateParams.builder()
                .objectId("objectId")
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

        assertThat(params._pathParam(0)).isEqualTo("objectId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AuthorUpdateParams.builder()
                .objectId("objectId")
                .archived(true)
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("archived", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AuthorUpdateParams.builder()
                .objectId("objectId")
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

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }

    @Test
    fun body() {
        val params =
            AuthorUpdateParams.builder()
                .objectId("objectId")
                .archived(true)
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AuthorUpdateParams.builder()
                .objectId("objectId")
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }
}
